# Gramatyka 

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
    |   white_symbol+
    |	pipeline_list
    |	splitter_end_command
    ;

## Pętle, case, if

case_statement

    :	CASE_START white_symbol+ (variable | APOSTROPHE variable APOSTROPHE) white_symbol+ LOOP_IN (white_symbol | splitter_end_command)* single_case+ ( CASE_DEFAULT instruction* BREAK_ABSOLUTE)? (splitter_end_command | white_symbol)* CASE_END splitter_end_command
    ;

single_case

    :	(white_symbol | splitter_end_command)* ( ( ( ALPHANUMERIC+ | string ) (white_symbol+ PIPE white_symbol+ ( ALPHANUMERIC+ | string ) )* )  ) white_symbol* R_PARENTH_ROUND white_symbol* splitter_end_command instruction* BREAK_ABSOLUTE white_symbol* splitter_end_command
    ;

until_loop

    :	UNTIL_LOOP_BEGIN (variable| variable_from_command block) splitter_end_command LOOP_MIDDLE instruction* LOOP_END splitter_end_command
    ;

if_statement

    :	IF_START white_symbol* block white_symbol* splitter_end_command white_symbol*  IF_MIDDLE instruction* (ELSE_IF white_symbol* block splitter_end_command+ white_symbol* IF_MIDDLE white_symbol* instruction* )* (ELSE (white_symbol* | splitter_end_command) instruction* )? IF_END white_symbol* splitter_end_command
    ;

while_loop

    :	WHILE_LOOP_BEGIN white_symbol* block white_symbol* splitter_end_command white_symbol* LOOP_MIDDLE white_symbol* instruction* LOOP_END splitter_end_command
    ;

for_loop

    :	FOR_LOOP_BEGIN white_symbol* for_loop_argument white_symbol* LOOP_MIDDLE (splitter_end_command | white_symbol)+ instruction*  (splitter_end_command| white_symbol)*  LOOP_END splitter_end_command
    ;

for_loop_argument

    :	ALPHANUMERIC+ white_symbol+ LOOP_IN white_symbol numbers_pipeline_list_for_loop splitter_end_command // zmienna in [{1..5} ALBO 1 2 3 4 5 ALBO 1 2 3 4 5 .. N ALBO {0..10..2}]
    ;

numbers_pipeline_list_for_loop 

    :	(signed_number white_symbol)+ ('..' white_symbol signed_number)?
    |   '{' signed_number white_symbol '..' white_symbol signed_number (white_symbol '..' white_symbol signed_number)?  '}'
    ;

## Zmienne i wartości

signed_number

    :	('+' | '-')? number_float
    ;

number_float

    :	NUMBER (('.'|',') (DIGIT)*)?
    ;

variable_from_command

    :	COMMENT instruction* EOF
    ;
    : DOLLAR_SIGN L_PARENTH_ROUND pipeline_list R_PARENTH_ROUND
    ;

variable

    :	COMMENT instruction* EOF
    ;
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

    :	COMMENT instruction* EOF
    ;
    :	L_PARENTH_ROUND (splitter_end_command|white_symbol)* pipeline_list (splitter_end_command|white_symbol)* R_PARENTH_ROUND
    |	L_PARENTH_CURLY (splitter_end_command|white_symbol)* pipeline_list (splitter_end_command|white_symbol)* R_PARENTH_CURLY
    |   DOUBLE_L_PARENTH_ROUND white_symbol* expr_maker white_symbol* DOUBLE_R_PARENTH_ROUND
    |   CONDITION_LEFT_SINGLE white_symbol* expr_maker white_symbol* CONDITION_RIGHT_SINGLE
    |   CONDITION_LEFT_SINGLE CONDITION_LEFT_SINGLE white_symbol expr_maker white_symbol CONDITION_RIGHT_SINGLE CONDITION_RIGHT_SINGLE
    |   block white_symbol* ( CONDITION_DOUBLE_AMPERSAND | CONDITION_DOUBLE_PIPE ) white_symbol* block
    ;

expr_maker

    :	expr
    |   expr white_symbol* (CONDITION_DOUBLE_AMPERSAND | CONDITION_DOUBLE_PIPE | PIPE | AMPERSAND) white_symbol* expr_maker
    ;

expr 

    :	variable_or_number white_symbol* compare white_symbol* variable_or_number
    |   math_expr white_symbol* compare white_symbol* math_expr
    |   BOOL
    |   variable_or_number ( PLUS PLUS | MINUS MINUS ) 
    |   ( PLUS PLUS | MINUS MINUS ) variable_or_number 
    |   string white_symbol* CONDITION_EQ CONDITION_EQ? white_symbol* string
    ;



math_expr // boolowa wartość bez nawiasów / && / ||

    :	math_expr white_symbol* (PLUS | MINUS | WILDCARD_OR_MULTIPLY | DIVIDE | MODULO | WILDCARD_OR_MULTIPLY WILDCARD_OR_MULTIPLY ) white_symbol* math_expr
    |   L_PARENTH_ROUND white_symbol+ math_expr white_symbol+ R_PARENTH_ROUND
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

    :	(pipeline (SINGLE_SEMICOLON|NEW_LINE))+ splitter_end_command?
    ;

function

    :	white_symbol* (ALPHANUMERIC)+ white_symbol* L_PARENTH_ROUND R_PARENTH_ROUND white_symbol* block /*(return_output)?*/
    |   FUNCTION_START white_symbol* (ALPHANUMERIC)+ white_symbol* (L_PARENTH_ROUND R_PARENTH_ROUND white_symbol*)? block /*(return_output)?*/
    ;

select

    :	SELECT white_symbol* ALPHANUMERIC+ white_symbol* (LOOP_IN white_symbol* word)? white_symbol* splitter_end_command white_symbol* LOOP_MIDDLE pipeline_list white_symbol* LOOP_END
    ;

coprocess

    :	COPROCESS_START (ALPHANUMERIC)* command 
    ;

# Znaki specjalne

splitter_end_command

    :	COMMENT instruction* EOF
    ;
    : SINGLE_SEMICOLON
    | NEW_LINE
    ;

white_symbol

    :	SPACE
    |	TAB
    ;
 