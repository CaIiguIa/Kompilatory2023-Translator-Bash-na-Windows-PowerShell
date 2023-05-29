grammar BashGrammar;
// !Note: Do not change production names or order unless you also change DashToPowershell class
//TODO: (NA KOŃCU) Poprawić for, while, if ,itp żeby było jak w man bash -u
// TODO: błędy w gramatyce: word to niby command+ więc komenda: ("asdasd" echo) jest parsowalna, trzeba sprawić, że pierwszy ciąg znaków to nie string
// TODO: nie działają:
         //((counter++))
         //$((num1+num2))
         //przypisanie gdy nazwa zmiennej zawiera cyfrę

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
    |   assign
//    |	pipeline_list
    |   pipeline
    |	splitter_end_command
    ;

symbols
	:	(alphanumeric)+
//	: (ALPHANUMSPACE)+
	;

argument
	:	(MINUS|(MINUS MINUS)) symbols
	;

word
	:	command+/* (SPACE command)**/
	;

command
    :   STRING
    |   CHARACTER_CHAIN
	|	variable_from_command
	|	argument
	|	symbols
	| VARIABLE
	;

pipe_symbol
	:	PIPE
	|	PIPE AMPERSAN
	;

case_statement
    : CASE_START (VARIABLE | STRING | variable_from_command) LOOP_IN  splitter_end_command? single_case+ ( CASE_DEFAULT instruction*)? splitter_end_command? CASE_END splitter_end_command
    ;

single_case
    :    ( ( ( alphanumeric+ | STRING ) ( PIPE ( alphanumeric+ | STRING ) )* )  ) R_PARENTH_ROUND NEW_LINE?  instruction* case_break splitter_end_command
    ;

pipeline
	:	(TIME MINUSP?)? (BOOL_NEGATION)? word (pipe_symbol word)* splitter_end_command?
    ;

pipeline_list
	:   (pipeline)+
    ;

assign
    :   var EQ (pipeline|(number_float splitter_end_command))
    ;

var
//    :   DOLLAR_SIGN? ~(EQ | DOLLAR_SIGN | NEW_LINE | SINGLE_SEMICOLON | '#' | SPACE | DIGIT | CONDITION_RIGHT_SINGLE | CONDITION_LEFT_SINGLE) ~(EQ | DOLLAR_SIGN | NEW_LINE | SINGLE_SEMICOLON | '#' | SPACE | CONDITION_RIGHT_SINGLE | CONDITION_LEFT_SINGLE)*
    : DOLLAR_SIGN? ALPHA alphanumeric+
    ;

until_loop
    :  UNTIL_LOOP_BEGIN (VARIABLE| variable_from_command expr_maker) splitter_end_command LOOP_MIDDLE instruction* LOOP_END splitter_end_command
    ;

if_statement
	: IF_START expr_maker splitter_end_command IF_MIDDLE instruction* (ELSE_IF expr_maker splitter_end_command  IF_MIDDLE  instruction* )* (ELSE instruction* )? IF_END splitter_end_command
    ;

while_loop
    :  WHILE_LOOP_BEGIN expr_maker splitter_end_command LOOP_MIDDLE instruction* LOOP_END splitter_end_command
    ;

for_loop
    :    FOR_LOOP_BEGIN for_loop_argument LOOP_MIDDLE splitter_end_command instruction*  splitter_end_command?  LOOP_END splitter_end_command
    ;

for_loop_argument //argument pętli for znajdujący się między "for", a ""
    : L_PARENTH_ROUND L_PARENTH_ROUND  /*TODO: expr*/  SINGLE_SEMICOLON  expr_maker  SINGLE_SEMICOLON  /*TODO: expr*/  R_PARENTH_ROUND R_PARENTH_ROUND splitter_end_command//(( i=0 ; i<10 ; i++ ))
// TODO: (ocochodzi)    | alphanumeric+ (LOOP_IN (CHAR_CHAIN )+)* splitter_end_command // ???
    | alphanumeric+ LOOP_IN numbers_pipeline_list_for_loop splitter_end_command // {1..5} ALBO 1 2 3 4 5 ALBO 1 2 3 4 5 .. N ALBO {0..10..2}
    | alphanumeric+ LOOP_IN variable_from_command splitter_end_command// $(command)
    ;

numbers_pipeline_list_for_loop // {1..5} ALBO 1 2 3 4 5 ALBO 1 2 3 4 5 .. N ALBO {0..10..2}
    : (signed_number)+ ('..' signed_number)?
    | '{' signed_number '..' signed_number ('..' signed_number)?  '}'
    ;

signed_number
    : ('+' | '-')? number_float
    ;

number_float
    : NUMBER (('.'|',') (NUMERIC)*)?
    ;

variable_from_command
    : DOLLAR_SIGN L_PARENTH_ROUND pipeline_list R_PARENTH_ROUND
    ;

splitter_end_command
    : SINGLE_SEMICOLON
    | NEW_LINE
    ;

block
    :	L_PARENTH_ROUND pipeline_list R_PARENTH_ROUND
    |	L_PARENTH_CURLY NEW_LINE? pipeline_list R_PARENTH_CURLY
    |   L_PARENTH_ROUND L_PARENTH_ROUND  expr R_PARENTH_ROUND R_PARENTH_ROUND
    |   CONDITION_LEFT_SINGLE  expr  CONDITION_RIGHT_SINGLE
    |   CONDITION_LEFT_SINGLE CONDITION_LEFT_SINGLE expr CONDITION_RIGHT_SINGLE CONDITION_RIGHT_SINGLE
    ;

expr_maker
    : BOOL_NEGATION expr_maker   //logical negation
//    : L_PARENTH_ROUND expr_maker R_PARENTH_ROUND
    | TILDA expr  //bitwise negation
    | expr_maker (CONDITION_DOUBLE_AMPERSAND | CONDITION_DOUBLE_PIPE | PIPE | AMPERSAN) expr_maker // pipeline_list (|| albo | albo & albo &&) pipeline_list ;
    | L_PARENTH_ROUND  d_round_expr_maker  R_PARENTH_ROUND // (()) condition - && == STRING arithmetic
    | L_PARENTH_ROUND L_PARENTH_ROUND d_round_expr_maker R_PARENTH_ROUND R_PARENTH_ROUND
    | CONDITION_LEFT_SINGLE CONDITION_LEFT_SINGLE d_round_expr_maker CONDITION_RIGHT_SINGLE CONDITION_RIGHT_SINGLE
    | CONDITION_LEFT_SINGLE d_round_expr_maker CONDITION_RIGHT_SINGLE
//    | CONDITION_LEFT_SINGLE CONDITION_LEFT_SINGLE d_square_expr_maker  CONDITION_RIGHT_SINGLE CONDITION_RIGHT_SINGLE// [[]] condition
// TODO    | CONDITION_RIGHT_SINGLE CONDITION_RIGHT_SINGLE s_square_expr CONDITION_RIGHT_SINGLE CONDITION_RIGHT_SINGLE//
//    | /*TODO: pipeline_list*/
    ;


d_round_expr_maker
    : d_round_expr (CONDITION_DOUBLE_AMPERSAND | CONDITION_DOUBLE_PIPE | PIPE | AMPERSAN) d_round_expr_maker
    | L_PARENTH_ROUND d_round_expr_maker R_PARENTH_ROUND
    |d_round_expr
    ;

d_round_expr // single, atomic  epression returning bool
    : expr  (EQ EQ? /*==-porównanie, =-przypisanie*/|  POINTER_RIGHT | POINTER_RIGHT POINTER_RIGHT | POINTER_LEFT | POINTER_LEFT POINTER_LEFT | CONDITION_LE | CONDITION_EQ | CONDITION_GE | CONDITION_GT | CONDITION_LT | CONDITION_NEQ) expr
    | expr ( POINTER_LEFT EQ | POINTER_RIGHT EQ | BOOL_NEGATION EQ )  expr
    | BOOL
    | variable_or_number ( PLUS PLUS | MINUS MINUS ) //id++ id-- -- teoretycznie dziala w bashu dla id, zmiennej i liczby
    | ( PLUS PLUS | MINUS MINUS ) variable_or_number //++id --id
    | STRING EQ EQ? STRING
    | '-e' (variable_from_command | STRING | VARIABLE)
    ;

variable_or_number /*zmienna, liczba*/
    : VARIABLE
    | id
    | signed_number
    ;


expr // boolowa wartość bez nawiasów / && / ||
    : expr (PLUS | MINUS | WILDCARD_OR_MULTIPLY | DIVIDE | MODULO | WILDCARD_OR_MULTIPLY WILDCARD_OR_MULTIPLY ) expr
    | L_PARENTH_ROUND expr R_PARENTH_ROUND
    | variable_or_number
    | STRING
    ;

function:   (alphanumeric)+ L_PARENTH_ROUND R_PARENTH_ROUND block /*(return_output)?*/
    |   FUNCTION_START (alphanumeric)+ (L_PARENTH_ROUND R_PARENTH_ROUND)? block /*(return_output)?*/
    ;

select
	:	SELECT alphanumeric+ (LOOP_IN word)? splitter_end_command LOOP_MIDDLE pipeline_list LOOP_END
    ;

coprocess
	:	COPROCESS_START (alphanumeric)* word //redirections
	;

alphanumeric
    :   (ALPHA | NUMERIC)
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
    :	ALPHA alphanumeric*
    ;

case_break
    :   ';;'
    ;

STRING						:	["](~["]|' ')*["];
CHARACTER_CHAIN				:	['](~[']|' ')*['];
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
CONDITION_LE                :   ('-le'|'<=');
MODULO                      :   '%';
CONDITION_DOUBLE_AMPERSAND  :   '&&';
CONDITION_DOUBLE_PIPE       :   '||';
ELSE                        :   'else';
ELSE_IF                     :   'elif';
CASE_START                  :   'case';
CASE_DEFAULT                :   '*)';
BRAKE_CONTINUATION          :   ';&';
BRAKE_WITH_NEXT_EXEC        :   ';;&';
CASE_END                    :   'esac';
DOLLAR_SIGN                 :   '$';
VARIABLE                    :   '$'~[$#\n;0-9 ]~[$#\n; ]*;
SCRIPT_ARGUMENT_NUMBER      :   '$#';
SCRIPT_ARGUMENT             :   '$'[0-9];
BOOL                        :   ('true'|'false');
HEX_NUMBER_WITHOUT_SIGN     :   ('Ox'|'16#')[0-9A-Fa-f]+;
OCTAL_NUMBER_WITHOUT_SIGN   :   ('O'|'8#')[0-7]+;
NEW_LINE                    :   [\n];
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
ALPHA                       :   [A-Za-z];
NUMERIC                     :   [0-9];
//ALPHANUMERIC                :   [a-zA-Z0-9_];
//NEW_VARIABLE                :   ~[$#\n;0-9 =]~[$#\n; =]*;
MINUSP						:	'-p';
SPACE						:	' '->more;
TAB							:	[\t]->more;