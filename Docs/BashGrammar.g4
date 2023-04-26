grammar BashGrammar;

program
    :	COMMENT instruction* EOF
    ;

instruction
    :	COMMENT
    |   function
    |   if_statement
    |   for_loop
    |   while_loop
    |   until_loop
    |   case_statement
    |   select
    |   coprocess
    |	pipeline_list
    |	splitter_end_command
    ;

case_statement
    : CASE_START VARIABLE LOOP_IN  splitter_end_command? single_case+ ( CASE_DEFAULT instruction* BRAKE_ABSOLUTE)? splitter_end_command? CASE_END splitter_end_command
    ;

single_case
    :    ( ( ( ALPHANUMERIC+ | string ) ( PIPE ( ALPHANUMERIC+ | string ) )* )  ) R_PARENTH_ROUND splitter_end_command? instruction* BRAKE_ABSOLUTE splitter_end_command?
    ;

until_loop
    :  UNTIL_LOOP_BEGIN (VARIABLE| variable_from_command expr_maker) splitter_end_command LOOP_MIDDLE instruction* LOOP_END splitter_end_command
    ;

if_statement: IF_START expr_maker splitter_end_command IF_MIDDLE instruction* (ELSE_IF expr_maker splitter_end_command  IF_MIDDLE  instruction* )* (ELSE instruction* )? IF_END splitter_end_command
    ;

while_loop
    :  WHILE_LOOP_BEGIN expr_maker splitter_end_command LOOP_MIDDLE instruction* LOOP_END splitter_end_command
    ;

for_loop
    :    FOR_LOOP_BEGIN for_loop_argument LOOP_MIDDLE splitter_end_command instruction*  splitter_end_command?  LOOP_END splitter_end_command
    ;

for_loop_argument
    : L_PARENTH_ROUND L_PARENTH_ROUND  expr  SINGLE_SEMICOLON  expr_maker  SINGLE_SEMICOLON  expr  R_PARENTH_ROUND R_PARENTH_ROUND splitter_end_command
    | ALPHANUMERIC+ LOOP_IN numbers_pipeline_list_for_loop splitter_end_command
    | ALPHANUMERIC+ LOOP_IN variable_from_command splitter_end_command
    ;

numbers_pipeline_list_for_loop // {1..5} ALBO 1 2 3 4 5 ALBO 1 2 3 4 5 .. N ALBO {0..10..2}
    : (signed_number)+ ('..' signed_number)?
    | '{' signed_number '..' signed_number ('..' signed_number)?  '}'
    ;

signed_number
    : ('+' | '-')? number_float
    ;

number_float
    : NUMBER (('.'|',') (DIGIT)*)?
    ;

variable_from_command
    : DOLLAR_SIGN L_PARENTH_ROUND pipeline_list R_PARENTH_ROUND
    ;

splitter_end_command        
    : SINGLE_SEMICOLON
    | NEW_LINE
    ;

block
    :	L_PARENTH_ROUND (splitter_end_command|white_symbol)* pipeline_list (splitter_end_command|white_symbol)* R_PARENTH_ROUND
    |	L_PARENTH_CURLY (splitter_end_command|white_symbol)* pipeline_list (splitter_end_command|white_symbol)* R_PARENTH_CURLY
    |   L_PARENTH_ROUND L_PARENTH_ROUND expr R_PARENTH_ROUND R_PARENTH_ROUND
    |   CONDITION_LEFT_SINGLE  expr  CONDITION_RIGHT_SINGLE
    |   CONDITION_LEFT_SINGLE CONDITION_LEFT_SINGLE white_symbol expr white_symbol CONDITION_RIGHT_SINGLE CONDITION_RIGHT_SINGLE
    ;

expr_maker
    : BOOL_NEGATION expr_maker
    | TILDA expr
    | expr_maker (CONDITION_DOUBLE_AMPERSAND | CONDITION_DOUBLE_PIPE | PIPE | AMPERSAN) expr_maker
    | L_PARENTH_ROUND L_PARENTH_ROUND d_round_expr_maker R_PARENTH_ROUND R_PARENTH_ROUND
    ;

d_round_expr_maker
    : d_round_expr (CONDITION_DOUBLE_AMPERSAND | CONDITION_DOUBLE_PIPE | PIPE | AMPERSAN) d_round_expr_maker
    | L_PARENTH_ROUND d_round_expr_maker R_PARENTH_ROUND
    |d_round_expr
    ;

d_round_expr
    : expr  (EQ EQ? |  POINTER_RIGHT | POINTER_RIGHT POINTER_RIGHT | POINTER_LEFT | POINTER_LEFT POINTER_LEFT) expr
    | expr ( POINTER_LEFT EQ | POINTER_RIGHT EQ | BOOL_NEGATION EQ )  expr
    | BOOL
    | variable_or_number ( PLUS PLUS | MINUS MINUS )
    | ( PLUS PLUS | MINUS MINUS ) variable_or_number
    | string EQ EQ? string
    ;

variable_or_number
    : VARIABLE
    | id
    | signed_number
    ;


expr
    : expr (PLUS | MINUS | WILDCARD_OR_MULTIPLY | DIVIDE | MODULO | WILDCARD_OR_MULTIPLY WILDCARD_OR_MULTIPLY ) expr
    | L_PARENTH_ROUND expr R_PARENTH_ROUND
    | variable_or_number
    ;

white_symbol
	:	SPACE
	|	TAB
	;

word
	:	~(PIPE|AMPERSAN|SINGLE_SEMICOLON|L_PARENTH_ROUND|R_PARENTH_ROUND|POINTER_LEFT|POINTER_RIGHT|SPACE|TAB|NEW_LINE|WHILE_LOOP_BEGIN|UNTIL_LOOP_BEGIN|FOR_LOOP_BEGIN|LOOP_MIDDLE|IF_START|IF_MIDDLE|IF_END|LOOP_IN|ELSE|ELSE_IF|CASE_START|CASE_END|FUNCTION_START|SELECT|ASYNCHRONIZATION|TIME|CREATE_VARABLE)+
	;

command
	:	white_symbol* word white_symbol*
    ;

pipe_symbol
	:	PIPE
	|	PIPE AMPERSAN
	;

pipeline
	:	(TIME ('-p')?)? (BOOL_NEGATION)? command ((pipe_symbol)? command)+
    ;

pipeline_list
	:   (pipeline (SINGLE_SEMICOLON|NEW_LINE))+
    ;

function:   white_symbol* (ALPHANUMERIC)+ white_symbol* L_PARENTH_ROUND R_PARENTH_ROUND white_symbol* block
    |   FUNCTION_START white_symbol+ (ALPHANUMERIC)+ white_symbol* (L_PARENTH_ROUND R_PARENTH_ROUND white_symbol*)? block
    ;

select
	:	SELECT white_symbol* ALPHANUMERIC+ white_symbol* (LOOP_IN white_symbol* word)? white_symbol* splitter_end_command white_symbol* LOOP_MIDDLE pipeline_list white_symbol* LOOP_END
    ;

coprocess
	:	COPROCESS_START (ALPHANUMERIC)* command
	;

id
    : ALPHA ALPHANUMERIC*
    ;

string
    : APOSTROPHE ~(APOSTROPHE|APOSTROPHE)* APOSTROPHE
    ;

SPACE						:	' ';
TAB							:	[\t];
COMMENT                     :   '#'~[\n]+'\n';
SINGLE_APOSTROPHE			:	['];
APOSTROPHE                  :   '"';
SINGLE_SEMICOLON            :   ';';
WHILE_LOOP_BEGIN            :   'while';
UNTIL_LOOP_BEGIN            :   'until';
FOR_LOOP_BEGIN              :   'for';
LOOP_MIDDLE                 :   'do';
LOOP_END                    :   'done';
IF_START                    :   'if';
IF_MIDDLE                   :   'then';
IF_END                      :   'fi';
LOOP_IN                     :   'in';
CONDITION_LEFT_SINGLE       :   '[';
CONDITION_RIGHT_SINGLE      :   ']';
CONDITION_EQ                :   '-eq';
EQ                          :   '=';
CONDITION_NEQ               :   ('-ne'|'!=');
CONDITION_GT                :   '-gt';
CONDITION_GE                :   ('-ge'|'>=');
CONDITION_LT                :   '-lt';
CONDITION_LE                :   ('-le'|':');
MODULO                      :   '%';
CONDITION_DOUBLE_AMPERSAND  :   '&&';
CONDITION_DOUBLE_PIPE       :   '||';
ELSE                        :   'else';
ELSE_IF                     :   'elif';
CASE_START                  :   'case';
CASE_DEFAULT                :   '*)';
BRAKE_ABSOLUTE              :   ';;';
BRAKE_CONTINUATION          :   ';&';
BRAKE_WITH_NEXT_EXEC        :   ';;&';
CASE_END                    :   'esac';
//CHAR_CHAIN                  :   ['].*['];
DOLLAR_SIGN                 :   '$';
VARIABLE                    :   '$'~[$#\n;0-9 ]~[$#\n; ]*;
SCRIPT_ARGUMENT_NUMBER      :   '$#';
SCRIPT_ARGUMENT             :   '$'[0-9];
BOOL                        :   ('true'|'false');
HEX_NUMBER_WITHOUT_SIGN     :   ('Ox'|'16#')[0-9A-Fa-f]+;
OCTAL_NUMBER_WITHOUT_SIGN   :   ('O'|'8#')[0-7]+;
NEW_LINE                    :   '\n';
PIPE                        :   '|';
PLUS                        :   '+';
WILDCARD_OR_MULTIPLY        :   '*';
WILDCARD                    :   '?';
MINUS                       :   '-';
DIVIDE                      :   '/';
LEFT_SLASH					:	'\\';
AMPERSAN					:   '&';
L_PARENTH_ROUND             :   '(';
R_PARENTH_ROUND             :   ')';
L_PARENTH_CURLY             :   '{';
R_PARENTH_CURLY             :   '}';
POINTER_RIGHT				:   '>';
POINTER_LEFT				:   '<';
BOOL_NEGATION               :   '!';
FUNCTION_START              :   'function';
SELECT                      :   'select';
COPROCESS_START				:   'coproc';
TIME                        :   'time';
CREATE_VARABLE              :   'declare';
TILDA                       :   '~';
LAST_FOLDER                 :   '..';
THIS_FOLDER                 :   '.';
NUMBER                      :   [1-9][0-9]*;
ALPHANUMERIC                :   [a-zA-Z0-9_];
ALPHA                       :   [A-Za-z];
DIGIT                       :   [0-9];
