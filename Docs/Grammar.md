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
    |   assign
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

    :	ALPHANUMERIC+ LOOP_IN numbers_pipeline_list_for_loop splitter_end_command
    |   ALPHANUMERIC+ LOOP_IN variable_from_command splitter_end_command
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

splitter_end_command


    : SINGLE_SEMICOLON
    | NEW_LINE
    ;   

variable


    : VARIABLE
    | SCRIPT_ARGUMENT_NUMBER
    | SCRIPT_ARGUMENT
    ;

variable_from_command


    : DOLLAR_SIGN L_PARENTH_ROUND pipeline_list R_PARENTH_ROUND
    ;

splitter_end_command


    : SINGLE_SEMICOLON
    | NEW_LINE
    ;

id

    :	ALPHA ALPHANUMERIC*
    ;

string

    :	APOSTROPHE ~(APOSTROPHE)* APOSTROPHE
    ;

character_chain

    :	SINGLE_APOSTROPHE ~(SINGLE_APOSTROPHE)* SINGLE_APOSTROPHE
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

    :	expr (PLUS | MINUS | WILDCARD_OR_MULTIPLY | DIVIDE | MODULO | WILDCARD_OR_MULTIPLY WILDCARD_OR_MULTIPLY ) expr
    | L_PARENTH_ROUND expr R_PARENTH_ROUND
    | variable_or_number
    ;

d_round_expr_maker

    :	d_round_expr (CONDITION_DOUBLE_AMPERSAND | CONDITION_DOUBLE_PIPE | PIPE | AMPERSAN) d_round_expr_maker
    | L_PARENTH_ROUND d_round_expr_maker R_PARENTH_ROUND
    |d_round_expr
    ;

variable_or_number

    :VARIABLE
    | id
    | signed_number
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


symbols
    
    :	ALPHANUMERIC+
    ;

argument

    :	(MINUS|(MINUS MINUS)) ALPHANUMERIC+
    ;


word

    :	(command)+
	;

command

    :	symbols
	|	string
	|	character_chain
	|	variable_from_command
	|	argument
	;


pipe_symbol

    :	PIPE
    |	PIPE AMPERSAND
    ;

pipeline

    :	(TIME MINUSP?)? (BOOL_NEGATION)? word (pipe_symbol word)* (SINGLE_SEMICOLON|NEW_LINE)
    ;

pipeline_list

    :	(pipeline)+
    ;

function

    :	(ALPHANUMERIC)+ L_PARENTH_ROUND R_PARENTH_ROUND block /*(return_output)?*/
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

    :	SINGLE_SEMICOLON
    |   NEW_LINE
    ;
