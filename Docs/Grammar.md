# Gramatyka 

Symbol startowy: program
    
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

## Pętle, case, if

case_statement

    :	CASE_START VARIABLE LOOP_IN  splitter_end_command? single_case+ ( CASE_DEFAULT instruction* BRAKE_ABSOLUTE)? splitter_end_command? CASE_END splitter_end_command
    ;

single_case

    :	( ( ( ALPHANUMERIC+ | string ) ( PIPE ( ALPHANUMERIC+ | string ) )* )  ) R_PARENTH_ROUND splitter_end_command? instruction* BRAKE_ABSOLUTE splitter_end_command?
    ;

until_loop

    :	UNTIL_LOOP_BEGIN (VARIABLE| variable_from_command expr_maker) splitter_end_command LOOP_MIDDLE instruction* LOOP_END splitter_end_command
    ;

if_statement

    :	IF_START expr_maker splitter_end_command IF_MIDDLE instruction* (ELSE_IF expr_maker splitter_end_command  IF_MIDDLE  instruction* )* (ELSE instruction* )? IF_END splitter_end_command
    ;

while_loop

    :	WHILE_LOOP_BEGIN expr_maker splitter_end_command LOOP_MIDDLE instruction* LOOP_END splitter_end_command
    ;

for_loop

    :	FOR_LOOP_BEGIN for_loop_argument LOOP_MIDDLE splitter_end_command instruction*  splitter_end_command?  LOOP_END splitter_end_command
    ;

for_loop_argument

    :	ALPHANUMERIC+ LOOP_IN numbers_pipeline_list_for_loop splitter_end_word // zmienna in [{1..5} ALBO 1 2 3 4 5 ALBO 1 2 3 4 5 .. N ALBO {0..10..2}]
    ;

numbers_pipeline_list_for_loop 

    :	(signed_number)+ ('..' signed_number)?
    |   '{' signed_number '..' signed_number ('..' signed_number)?  '}'
    ;

## Zmienne i wartości

signed_number

    :	('+' | '-')? number_float
    ;

number_float

    :	NUMBER (('.'|',') (DIGIT)*)?
    ;

variable_from_word

    : DOLLAR_SIGN L_PARENTH_ROUND pipeline_list R_PARENTH_ROUND
    ;

variable

    : VARIABLE
    | SCRIPT_ARGUMENT_NUMBER
    | SCRIPT_ARGUMENT
    ;

variable_or_number /*zmienna, liczba*/

    :	variable
    |   id
    |   signed_number
    ;

id

    :	ALPHA ALPHANUMERIC*
    ;

string

    :	APOSTROPHE ~(APOSTROPHE)* APOSTROPHE
    ;   

## Wyrażenia zwracające bool

block

    :	L_PARENTH_ROUND pipeline_list R_PARENTH_ROUND
    |	L_PARENTH_CURLY pipeline_list R_PARENTH_CURLY
    |   L_PARENTH_ROUND L_PARENTH_ROUND expr R_PARENTH_ROUND R_PARENTH_ROUND
    |   CONDITION_LEFT_SINGLE  expr  CONDITION_RIGHT_SINGLE
    |   CONDITION_LEFT_SINGLE CONDITION_LEFT_SINGLE expr CONDITION_RIGHT_SINGLE CONDITION_RIGHT_SINGLE
    ;

expr_maker

    :	expr
    |   expr (CONDITION_DOUBLE_AMPERSAND | CONDITION_DOUBLE_PIPE | PIPE | AMPERSAND) expr_maker
    ;

expr 

    :	variable_or_number compare variable_or_number
    |   math_expr compare  math_expr
    |   BOOL
    |   variable_or_number ( PLUS PLUS | MINUS MINUS ) 
    |   ( PLUS PLUS | MINUS MINUS ) variable_or_number
    |   string CONDITION_EQ CONDITION_EQ?  string
    ;



math_expr 

    :	math_expr (PLUS | MINUS | WILDCARD_OR_MULTIPLY | DIVIDE | MODULO | WILDCARD_OR_MULTIPLY WILDCARD_OR_MULTIPLY ) math_expr
    |   L_PARENTH_ROUND math_expr R_PARENTH_ROUND
    |   variable_or_number
    ;

compare

    :	CONDITION_EQ
    |   CONDITION_GT
    |   CONDITION_NEQ
    |   CONDITION_GE
    |   CONDITION_LT
    |   CONDITION_LE
    |   POINTER_LEFT
    |   POINTER_RIGHT
    ;

# Komendy i pipeline'y

word

    :	~(PIPE|AMPERSAND|SINGLE_SEMICOLON|L_PARENTH_ROUND|R_PARENTH_ROUND|POINTER_LEFT|POINTER_RIGHT|SPACE|TAB|NEW_LINE|WHILE_LOOP_BEGIN|UNTIL_LOOP_BEGIN|FOR_LOOP_BEGIN|LOOP_MIDDLE|IF_START|IF_MIDDLE|IF_END|LOOP_IN|ELSE|ELSE_IF|CASE_START|CASE_END|FUNCTION_START|SELECT|COPROCESS_START|TIME|CREATE_VARABLE)+
    ;

pipe_symbol

    :	PIPE
    |	PIPE AMPERSAND
    ;

pipeline

    :	(TIME ('-p')?)? (BOOL_NEGATION)? word ((pipe_symbol)? word)+
    ;

pipeline_list

    :	(pipeline (SINGLE_SEMICOLON|NEW_LINE))+ splitter_end_word?
    ;

function

    :   (ALPHANUMERIC)+ L_PARENTH_ROUND R_PARENTH_ROUND block /*(return_output)?*/
    |   FUNCTION_START (ALPHANUMERIC)+ (L_PARENTH_ROUND R_PARENTH_ROUND)? block /*(return_output)?*/
    ;

select

    :	SELECT ALPHANUMERIC+ (LOOP_IN word)? splitter_end_word LOOP_MIDDLE pipeline_list LOOP_END
    ;

coprocess

    :	COPROCESS_START (ALPHANUMERIC)* word 
    ;

# Znaki specjalne

splitter_end_word

    : SINGLE_SEMICOLON
    | NEW_LINE
    ;
