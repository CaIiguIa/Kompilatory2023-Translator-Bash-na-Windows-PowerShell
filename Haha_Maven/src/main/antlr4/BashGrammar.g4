grammar BashGrammar;

//TODO: nie działa
// gdy liczba jest jako jedna z wartości case
// gdy pojawia sie "if" w komendzie echo (w innych pewnie teź) to sie program wywala
// gdy w for wyliczamy input (for a in 1 2 3 4 5), to nie działa gdy mamy pliki itp - tylko cyfry
program
    :	COMMENT instruction* EOF
    ;

instruction
    :	COMMENT
    |   function
    |   if_statement
    |   for_loop
    |   while_loop // działa
    |   until_loop
    |   case_statement
    |   select
    |   coprocess
    |   white_symbol+
    |	pipeline_list
    |	splitter_end_command
//    |   TODO: ADD missing ones
    ;

case_statement
    : CASE_START white_symbol+ (variable | APOSTROPHE variable APOSTROPHE) white_symbol+ LOOP_IN (white_symbol | splitter_end_command)* single_case+ ( CASE_DEFAULT instruction* BREAK_ABSOLUTE)?
    (splitter_end_command | white_symbol)* CASE_END splitter_end_command
    ;

single_case
    :   (white_symbol | splitter_end_command)* ( ( ( ALPHANUMERIC+ | string ) (white_symbol+ PIPE white_symbol+ ( ALPHANUMERIC+ | string ) )* )  ) white_symbol* R_PARENTH_ROUND white_symbol* splitter_end_command
    instruction* BREAK_ABSOLUTE white_symbol* splitter_end_command
    ;

until_loop
    :  UNTIL_LOOP_BEGIN (variable| variable_from_command block) splitter_end_command LOOP_MIDDLE instruction* LOOP_END splitter_end_command
    ;

if_statement: IF_START white_symbol* block white_symbol* splitter_end_command white_symbol*  IF_MIDDLE instruction* (ELSE_IF white_symbol* block splitter_end_command+ white_symbol* IF_MIDDLE white_symbol* instruction* )*
(ELSE (white_symbol* | splitter_end_command) instruction* )? IF_END white_symbol* splitter_end_command
    ;

while_loop
    :  WHILE_LOOP_BEGIN white_symbol* block white_symbol* splitter_end_command white_symbol* LOOP_MIDDLE white_symbol* instruction* LOOP_END splitter_end_command
    ;

for_loop
    :    FOR_LOOP_BEGIN white_symbol* for_loop_argument white_symbol* LOOP_MIDDLE (splitter_end_command | white_symbol)+ instruction*  (splitter_end_command| white_symbol)*  LOOP_END splitter_end_command
    ;

for_loop_argument //argument pętli for znajdujący się między "for", a "do"
//    : DOUBLE_L_PARENTH_ROUND white_symbol* (ALPHANUMERIC+ white_symbol* CONDITION_EQ white_symbol* variable_or_number)? white_symbol* SINGLE_SEMICOLON white_symbol* expr_maker? white_symbol* SINGLE_SEMICOLON white_symbol* ( ALPHANUMERIC+ white_symbol* (((CONDITION_EQ | MINUS_EQ | PLUS_EQ) white_symbol* variable_or_number) | PLUS PLUS | MINUS MINUS) )? white_symbol* DOUBLE_R_PARENTH_ROUND splitter_end_command//(( i=0 ; i<10 ; i++ ))
    : ALPHANUMERIC+ white_symbol+ LOOP_IN white_symbol numbers_pipeline_list_for_loop splitter_end_command // zmienna in [{1..5} ALBO 1 2 3 4 5 ALBO 1 2 3 4 5 .. N ALBO {0..10..2}]
//    | ALPHANUMERIC+ white_symbol+ LOOP_IN  white_symbol variable_from_command splitter_end_command// $(command)
    ;

numbers_pipeline_list_for_loop // {1..5} ALBO 1 2 3 4 5 ALBO 1 2 3 4 5 .. N ALBO {0..10..2}
    : (signed_number white_symbol)+ ('..' white_symbol signed_number)?
    | '{' signed_number white_symbol '..' white_symbol signed_number (white_symbol '..' white_symbol signed_number)?  '}'
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

variable
    : VARIABLE
    | SCRIPT_ARGUMENT_NUMBER
    | SCRIPT_ARGUMENT
    ;


block
    :	L_PARENTH_ROUND (splitter_end_command|white_symbol)* pipeline_list (splitter_end_command|white_symbol)* R_PARENTH_ROUND
    |	L_PARENTH_CURLY (splitter_end_command|white_symbol)* pipeline_list (splitter_end_command|white_symbol)* R_PARENTH_CURLY
    |   DOUBLE_L_PARENTH_ROUND white_symbol* expr_maker white_symbol* DOUBLE_R_PARENTH_ROUND
    |   CONDITION_LEFT_SINGLE white_symbol* expr_maker white_symbol* CONDITION_RIGHT_SINGLE
    |   CONDITION_LEFT_SINGLE CONDITION_LEFT_SINGLE white_symbol expr_maker white_symbol CONDITION_RIGHT_SINGLE CONDITION_RIGHT_SINGLE
    |   block white_symbol* ( CONDITION_DOUBLE_AMPERSAND | CONDITION_DOUBLE_PIPE ) white_symbol* block
    ;

expr_maker
    : expr
    | expr white_symbol* (CONDITION_DOUBLE_AMPERSAND | CONDITION_DOUBLE_PIPE | PIPE | AMPERSAND) white_symbol* expr_maker
    ;

expr // single, atomic  expression returning bool
    : variable_or_number white_symbol* compare white_symbol* variable_or_number
    | math_expr white_symbol* compare white_symbol* math_expr
    | BOOL
    | variable_or_number ( PLUS PLUS | MINUS MINUS ) //id++ id-- -- teoretycznie dziala w bashu dla id, zmiennej i liczby
    | ( PLUS PLUS | MINUS MINUS ) variable_or_number //++id --id
    | string white_symbol* CONDITION_EQ CONDITION_EQ? white_symbol* string
    ;

variable_or_number /*zmienna, liczba*/
    : variable
    | id
    | signed_number
    ;


math_expr // boolowa wartość bez nawiasów / && / ||
    : math_expr white_symbol* (PLUS | MINUS | WILDCARD_OR_MULTIPLY | DIVIDE | MODULO | WILDCARD_OR_MULTIPLY WILDCARD_OR_MULTIPLY ) white_symbol* math_expr
    | L_PARENTH_ROUND white_symbol+ math_expr white_symbol+ R_PARENTH_ROUND
    | variable_or_number
    ;

compare
    : CONDITION_EQ
    | CONDITION_GT
    | CONDITION_NEQ
    | CONDITION_GE
    | CONDITION_LT
    | CONDITION_LE
    | POINTER_LEFT
    | POINTER_RIGHT
    ;

//numeric_expression_maker
//    :
//    ;

//numeric_expression
//    :	signed_number
//    ;

white_symbol
	:	SPACE
	|	TAB
	;

word
	:	~(PIPE|AMPERSAND|SINGLE_SEMICOLON|L_PARENTH_ROUND|R_PARENTH_ROUND|POINTER_LEFT|POINTER_RIGHT|SPACE|TAB|NEW_LINE|WHILE_LOOP_BEGIN|UNTIL_LOOP_BEGIN|FOR_LOOP_BEGIN|LOOP_MIDDLE|IF_START|IF_MIDDLE|IF_END|LOOP_IN|ELSE|ELSE_IF|CASE_START|CASE_END|FUNCTION_START|SELECT|COPROCESS_START|TIME|CREATE_VARABLE)+
	;

command
	:	white_symbol* word white_symbol*
    ;

pipe_symbol
	:	PIPE
	|	PIPE AMPERSAND
	;

pipeline
	:	(TIME ('-p')?)? (BOOL_NEGATION)? command ((pipe_symbol)? command)+
    ;

pipeline_list
	:   (pipeline (SINGLE_SEMICOLON|NEW_LINE))+ splitter_end_command?
    ;

function:   white_symbol* (ALPHANUMERIC)+ white_symbol* L_PARENTH_ROUND R_PARENTH_ROUND white_symbol* block /*(return_output)?*/
    |   FUNCTION_START white_symbol* (ALPHANUMERIC)+ white_symbol* (L_PARENTH_ROUND R_PARENTH_ROUND white_symbol*)? block /*(return_output)?*/
    ;

select
	:	SELECT white_symbol* ALPHANUMERIC+ white_symbol* (LOOP_IN white_symbol* word)? white_symbol* splitter_end_command white_symbol* LOOP_MIDDLE pipeline_list white_symbol* LOOP_END
    ;

coprocess
	:	COPROCESS_START (ALPHANUMERIC)* command //redirections
	;


//

//           * / %  multiplication, division, remainder
//           << >>  left and right bitwise shifts
//           <= >= < >
//                  comparison
//           == !=  equality and inequality
//           expr?expr:expr
//                  conditional operator
//           = *= /= %= += -= <<= >>= &= ^= |=
//                  assignment
//           expr1 , expr2
//                  comma
id
    : ALPHA ALPHANUMERIC*
    ;

string
    : APOSTROPHE ~(APOSTROPHE)* APOSTROPHE
    ;   //  TODO: Make sure that: " dsdadad\" " is whole string( " dsdadad\" " ) not a " dsdadad\" ????


//EPSILON                     :   ;
//WORD                        :   ~[\n|&;()<> \t];         //  word, bo character chain zajęte
CASE_END                    :   'esac';
COMMA                       :   ',';
MINUS_P                     :   '-p';
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
PLUS_EQ                     :   '+=';
MINUS_EQ                    :   '-=';
CONDITION_LEFT_SINGLE       :   '[';
CONDITION_RIGHT_SINGLE      :   ']';
CONDITION_EQ                :   ('-eq' | '==' | '=');
CONDITION_NEQ               :   ('-ne'|'!=');
CONDITION_GT                :   '-gt';
CONDITION_GE                :   ('-ge'|'>=');
CONDITION_LT                :   '-lt';
CONDITION_LE                :   ('-le'|'<=');
MODULO                      :   '%';
CONDITION_DOUBLE_AMPERSAND  :   '&&';
CONDITION_DOUBLE_PIPE       :   '||';
ELSE                        :   'else';
ELSE_IF                     :   'elif';
CASE_START                  :   'case';
CASE_DEFAULT                :   '*)';
BREAK_ABSOLUTE              :   ';;';
BRAKE_CONTINUATION          :   ';&';
BRAKE_WITH_NEXT_EXEC        :   ';;&';
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
AMPERSAND					:   '&';
DOUBLE_L_PARENTH_ROUND             :   '((';
DOUBLE_R_PARENTH_ROUND             :   '))';
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
NUMBER                      :   ([1-9][0-9]* | '0');
ALPHANUMERIC                :   [a-zA-Z0-9_];
ALPHA                       :   [A-Za-z];
DIGIT                       :   [0-9];
