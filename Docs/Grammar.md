# Gramatyka 

- Przedstawiona gramatyka wykorzystuje tokeny umieszczone w pliku `./Tokens.md`.
- Całość bez naleciałości z markdowna znajduje się w `./BashGrammar.g4` 

Symbol startowy: `program`

```antlrv4
program
    :   COMMENT instruction* EOF
    ;
```

`instruction`

```antlrv4
instruction
    :    COMMENT
    |   function
    |   if_statement
    |   for_loop
    |   while_loop
    |   until_loop
    |   case_statement
    |   select
    |   coprocess
    |   assign
    |    pipeline_list
    |    splitter_end_command
    |   expr_maker
    ;
```
    

## Pętle, case, if

`case_statement`
```antlrv4
case_statement
    :    CASE_START (var | STRING | variable_from_command) LOOP_IN  splitter_end_command? single_case+ ( CASE_DEFAULT instruction*)? splitter_end_command? CASE_END splitter_end_command
    ;
```
    

`single_case`
```antlrv4
single_case
    :    ( ( ( alphanumeric+ | STRING ) ( PIPE ( alphanumeric+ | STRING ) )* )  ) R_PARENTH_ROUND NEW_LINE?  instruction* case_break splitter_end_command
    ;
``` 

`case_break`
```antlrv4
case_break
    :   ';;'
    ;
```

`until_loop`
```antlrv4
until_loop
    :    UNTIL_LOOP_BEGIN expr_maker splitter_end_command LOOP_MIDDLE instruction* LOOP_END splitter_end_command
    ;
```

`if_statement`
```antlrv4
if_statement
	: IF_START expr_maker splitter_end_command IF_MIDDLE instruction* (if_elsif)* (if_else)? IF_END splitter_end_command
    ;
```

`if_elsif`
```antlrv4
if_elsif
    : ELSE_IF expr_maker splitter_end_command  IF_MIDDLE  instruction*
    ;
```

`if_else`
```antlrv4
if_else
    : ELSE instruction*
    ;
```

`while_loop`
```antlrv4
while_loop
    :  WHILE_LOOP_BEGIN expr_maker splitter_end_command LOOP_MIDDLE instruction* LOOP_END splitter_end_command
    ;
```

`for_loop`
```antlrv4
for_loop
    :    FOR_LOOP_BEGIN for_loop_argument LOOP_MIDDLE splitter_end_command instruction*  splitter_end_command?  LOOP_END splitter_end_command
    ;
```

`for_loop_argument`
```antlrv4
for_loop_argument
    : L_PARENTH_ROUND L_PARENTH_ROUND  expr  SINGLE_SEMICOLON  expr_maker  SINGLE_SEMICOLON  (expr|assign|d_round_expr)  R_PARENTH_ROUND R_PARENTH_ROUND splitter_end_command
    | alphanumeric+ LOOP_IN numbers_pipeline_list_for_loop splitter_end_command
    | alphanumeric+ LOOP_IN variable_from_command splitter_end_command
    ;
```

`numbers_pipeline_list_for_loop`
```antlrv4
numbers_pipeline_list_for_loop
    : '{' signed_number '..' signed_number '}'
    ;
```

## Zmienne i wartości

`signed_number`
```antlrv4
signed_number
    : ('+' | '-')? number_float
    ;
```

`number_float`
```antlrv4
number_float
    : NUMBER (('.'|',') NUMBER)?
    ;
```

`variable_from_command`
```antlrv4
variable_from_command
    : DOLLAR_SIGN L_PARENTH_ROUND pipeline_list R_PARENTH_ROUND
    ;
```

`splitter_end_command`
```antlrv4
splitter_end_command
    : SINGLE_SEMICOLON
    | NEW_LINE
    ;
```

`id`
```antlrv4
id
    :	ALPHA alphanumeric*
    ;
```

`assign`
```antlrv4
assign
    :   var EQ (expr_maker|number_float|pipeline) splitter_end_command
    ;
```

`var`
```antlrv4
var
    : DOLLAR_SIGN? ALPHA (alphanumeric)*
    ;
```

## Wyrażenia zwracające bool

`block`
```antlrv4
block
    :	L_PARENTH_ROUND instruction* R_PARENTH_ROUND
    |	L_PARENTH_CURLY NEW_LINE? instruction* R_PARENTH_CURLY
    ;
```

`expr_maker`
```antlrv4
expr_maker
    : BOOL_NEGATION expr_maker
    | TILDA expr
    | expr_maker (CONDITION_DOUBLE_AMPERSAND | CONDITION_DOUBLE_PIPE | PIPE | AMPERSAN) expr_maker
    | DOLLAR_SIGN? L_PARENTH_ROUND  d_round_expr_maker  R_PARENTH_ROUND
    | DOLLAR_SIGN? L_PARENTH_ROUND L_PARENTH_ROUND d_round_expr_maker R_PARENTH_ROUND R_PARENTH_ROUND
    | CONDITION_LEFT_SINGLE CONDITION_LEFT_SINGLE d_round_expr_maker CONDITION_RIGHT_SINGLE CONDITION_RIGHT_SINGLE
    | CONDITION_LEFT_SINGLE d_round_expr_maker CONDITION_RIGHT_SINGLE
    ;
```
`expr`
```antlrv4
expr
    : expr (PLUS | MINUS | WILDCARD_OR_MULTIPLY | DIVIDE | MODULO | WILDCARD_OR_MULTIPLY WILDCARD_OR_MULTIPLY ) expr
    | L_PARENTH_ROUND expr R_PARENTH_ROUND
    | variable_or_number
    | STRING
    ;
```

`d_round_expr_maker`
```antlrv4
d_round_expr_maker
    : d_round_expr (CONDITION_DOUBLE_AMPERSAND | CONDITION_DOUBLE_PIPE | PIPE | AMPERSAN) d_round_expr_maker
    | L_PARENTH_ROUND (d_round_expr_maker | expr) R_PARENTH_ROUND
    |d_round_expr
    ;
```

`d_round_expr`
```antlrv4
d_round_expr
    : expr  (EQ EQ? |  POINTER_RIGHT | POINTER_RIGHT POINTER_RIGHT | POINTER_LEFT | POINTER_LEFT POINTER_LEFT | CONDITION_LE | CONDITION_EQ | CONDITION_GE | CONDITION_GT | CONDITION_LT | CONDITION_NEQ) expr
    | expr ( POINTER_LEFT EQ | POINTER_RIGHT EQ | BOOL_NEGATION EQ )  expr
    | BOOL
    | variable_or_number ( PLUS PLUS | MINUS MINUS )
    | ( PLUS PLUS | MINUS MINUS ) variable_or_number
    | STRING EQ EQ? STRING
    | '-e' (variable_from_command | STRING | var)
    ;
```

`variable_or_number`
```antlrv4
variable_or_number
    : var
    | id
    | signed_number
    ;
```

# Komendy i pipeline'y

`symbols`
```antlrv4
symbols
    :    (alphanumeric)+
    ;
```

`argument`
```antlrv4
argument
    :    (MINUS|(MINUS MINUS)) symbols
    ;
```

`word`
```antlrv4
word
    :    command+
    ;
```

`command`
```antlrv4
command
    :   STRING
    |   CHARACTER_CHAIN
    |	variable_from_command
    |	argument
    |	symbols
    |   var
    ;
```

`pipe_symbol`
```antlrv4
pipe_symbol
    :    PIPE
    |    PIPE AMPERSAND
    ;
```

`pipeline`
```antlrv4
pipeline
    :	(TIME MINUSP?)? (BOOL_NEGATION)? word (pipe_symbol word)* splitter_end_command?
    ;
```

`pipeline_list`
```antlrv4
pipeline_list
    :   (pipeline)+
    ;
```

`function`
```antlrv4
function
    :   (alphanumeric)+ L_PARENTH_ROUND R_PARENTH_ROUND block
    |   FUNCTION_START (alphanumeric)+ (L_PARENTH_ROUND R_PARENTH_ROUND)? block
    ;
```

`select`
```antlrv4
select
    :	SELECT alphanumeric+ (LOOP_IN word)? splitter_end_command LOOP_MIDDLE instruction* LOOP_END
    ;
```

`coprocess`
```antlrv4
coprocess
	:	COPROCESS_START (alphanumeric)* word //redirections
	;
```

`alphanumeric`
```antlrv4
alphanumeric
    :   ALPHA
    |   NUMBER
    |   UNDERSCORE
    ;
```