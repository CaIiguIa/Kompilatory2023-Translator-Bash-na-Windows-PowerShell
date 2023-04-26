grammar TokenTemp;
//  Grammar
prog:	'#!/bin/bash' (' '|'\n') instruction EOF
    ;

instruction:    (SPLITTER_END_COMMAND instruction)+ //TODO:
    |   COMMENT
    |   SPLITTER_ID
    |   EPSILON
    |   if
    |   for
    |   while
    |   until
    |   case_statement
    |   select
    |   COPROCESS   //  TODO:::
    |   list
    |   function
    |   //  TODO: ADD missing ones
    ;

expr://  TODO:::::
    ;

//  Code block { ... } // ( ... )       //  man bash Compound command
block:  L_PARENTH_ROUND list R_PARENTH_ROUND
    |   L_PARENTH_CURLY SPLITTER_ID list SPLITTER_END_COMMAND SPLITTER_ID R_PARENTH_CURLY
    |   L_PARENTH_ROUND L_PARENTH_ROUND expr R_PARENTH_ROUND R_PARENTH_ROUND
    |   CONDITION_LEFT_SINGLE SPLITTER_ID expr SPLITTER_ID CONDITION_RIGHT_SINGLE
    |   CONDITION_LEFT_DOUBLE SPLITTER_ID expr SPLITTER_ID CONDITION_RIGHT_DOUBLE
    |   // TODO::: FINISH or check if all are listed here
    ;

return_output:
    |   //TODO: REDIRECTIONS
    ;

for:    FOR_LOOP_BEGIN SPLITTER_ID L_PARENTH_ROUND L_PARENTH_ROUND SPLITTER_ID expr SPLITTER_ID SPLITTER_END_COMMAND SPLITTER_ID expr SPLITTER_ID SPLITTER_END_COMMAND SPLITTER_ID expr SPLITTER_ID L_PARENTH_ROUND L_PARENTH_ROUND SPLITTER_ID SPLITTER_END_COMMAND LOOP_MIDDLE list SPLITTER_ID SPLITTER_END_COMMAND SPLITTER_ID LOOP_END
    |   FOR_LOOP_BEGIN SPLITTER_ID ALPHANUMERIC ((LOOP_IN (CHAR_CHAIN SPLITTER_ID)+)+ SPLITTER_END_COMMAND)* SPLITTER_ID LOOP_MIDDLE SPLITTER_ID list SPLITTER_ID SPLITTER_END_COMMAND SPLITTER_ID LOOP_END
    ;

/* done */while:  WHILE_LOOP_BEGIN list SPLITTER_END_COMMAND LOOP_MIDDLE list SPLITTER_END_COMMAND LOOP_END SPLITTER_END_COMMAND
    ;
//  TODO::: MAKE ; do list ; done ; esparate productions
until:  UNTIL_LOOP_BEGIN list SPLITTER_END_COMMAND LOOP_MIDDLE list SPLITTER_END_COMMAND LOOP_END SPLITTER_END_COMMAND
    ;

if: IF_START SPLITTER_ID list SPLITTER_END_COMMAND SPLITTER_ID IF_MIDDLE SPLITTER_ID list SPLITTER_END_COMMAND (SPLITTER_ID ELSE_IF SPLITTER_ID list SPLITTER_END_COMMAND SPLITTER_ID IF_MIDDLE SPLITTER_ID list SPLITTER_ID)* (ELSE list SPLITTER_END_COMMAND SPLITTER_ID)? IF_END
    ;

function:   ID SPLITTER_ID L_PARENTH_ROUND R_PARENTH_ROUND (return_output)?
    |   FUNCTION_START ID (L_PARENTH_ROUND R_PARENTH_ROUND)? block (return_output)?
    ;

//  same as block; see man bash Compound command
bool_condition_parenthesis : T_warunek_początek_pojedyńczy BOOL_CONDITION T_warunek_koniec_pojedyńczy  | T_warunek_początek_podwójny BOOL_CONDITION_STRING T_warunek_koniec_podwójny;
//  same as block; see man bash Compound command
bool_condition : VARIABLE BOOL_OPERATOR VARIABLE;
//  same as block; see man bash Compound command
bool_condition_string : VARIABLE (bool_operator | CONDITION_EQ_STRING) VARIABLE;

bool_operator:  CONDITION_EQ
    |   CONDITION_GT
    |   CONDITION_GE
    |   CONDITION_LT
    |   CONDITION_LE
    |   CONDITION_NEQ
    ;


numbers_list : (signed_number)+ ('..' signed_number)?
    | '{' signed_number '..' signed_number ('..' signed_number)?  '}'
    ; //git

    // {1..5} ALBO 1 2 3 4 5 ALBO 1 2 3 4 5 .. N ALBO {0..10..2}

signed_number : ('+' | '-') number
    ; //git

number : number_integer
    | number_float
    ;//git

number_float : number_integer ('.'|',') (DIGIT)*
    ;//git

number_integer : NON_ZERO_DIGIT DIGIT*
    ;//git


variable_list : ARGUMENT
    | ARGUMENT variable_list
    ;

//lista argumentów, uzyte do for

//TODO: ARGUMENT_
//plików (pliki, zmienne, katalog)

//TODO: VARIABLE_FROM_COMMAND $(Linux-Or-Unix-Command-Here)

EXPRESSION_ASSIGN_VALUE : ID '='
    ;

//  Every possible command like cat , grep , man , ls , ....
/* done */command : ID SPLITTER_ID
    ;


// zmiana wartości zmiennej

//VALUE : STR ||

// cat plik.txt | grep -e '[0-9]+'
/* done */pipeline: (TIME ('-p')?)? (BOOL_NEGATION)? command ((PIPE|PIPE_WITH_ERRORS)? (command)+)?
    ;

/* done */pipeline_separator: SPLITTER_END_COMMAND
    |   KILL_ASYNCH_COMMAND
    |   CONDITION_DOUBLE_AMPERSAND
    |   CONDITION_DOUBLE_PIPE
    ;

// cat plik.txt | grep -e '[0-9]+'; * kilka lini
/* done */list:   (pipeline pipeline_separator)+
    ;

/* done */case_statement: CASE_START VARIABLE single_case+ ( '*)' instruction ';;' )? CASE_END
   ;

/* done */single_case:    ( ( ALPHANUMERIC ( PIPE ALPHANUMERIC)* ) | STRING ) ')' instruction ';;'
    ;

select:     SELECT ALPHANUMERIC (LOOP_IN )
    ;

//SELECT_

//FUNCTIONS_;

//COPROCESSES_;



//  Tokens
//  Skips
COMMENT                     :   '#'~[\n]+'\n' -> skip;

EPSILON                     :   ;
CHARACTRE_CHAIN             :   ~[\n|&;()<> \t];         //  word
ALPHANUMERIC                :   [a-zA-Z0-9_]+;           //  name
ID                          :   [a-zA-Z][a-zA-Z0-9_]*;
WHILE_LOOP_BEGIN            :   'while';
UNTIL_LOOP_BEGIN            :   'until';
FOR_LOOP_BEGIN              :   'for';
LOOP_MIDDLE                 :   'do';
LOOP_END                    :   'done';
IF_START                    :   'if';
IF_MIDDLE                   :   'then';
IF_END                      :   'fi';
CONDITION_LEFT_SINGLE       :   '[';
CONDITION_LEFT_DOUBLE       :   '[[';
CONDITION_RIGHT_SINGLE      :   ']';
CONDITION_RIGHT_DOUBLE      :   ']]';
CONDITION_EQ                :   '-eq';
CONDITION_EQ_STRING         :   ('=='|'=');
CONDITION_NEQ               :   ('-ne'|'!=');
CONDITION_GT                :   '-gt';
CONDITION_GE                :   ('-ge'|'>=');
CONDITION_LT                :   '-lt';
CONDITION_LE                :   ('-le'|':');
CONDITION_DOUBLE_AMPERSAND  :   '&&';
CONDITION_DOUBLE_PIPE       :   '||';
ELSE                        :   'else';
ELSE_IF                     :   'elif';
CASE_START                  :   'case';
BRAKE_ABSOLUTE              :   ';;';
BRAKE_CONTINUATION          :   ';&';
BRAKE_WITH_NEXT_EXEC        :   ';;&';
CASE_END                    :   'esac';
STRING                      :   ["].*["];   //  TODO: Make sure that: " dsdadad\" " is whole string( " dsdadad\" " ) not a " dsdadad\"
CHAR_CHAIN                  :   ['].*['];
VARIABLE                    :   '$'~[$#\n;0-9]~[$#\n;]*;
SCRIPT_ARGUMENT_NUMBER      :   '$#';
SCRIPT_ARGUMENT             :   '$'[0-9];
BOOL                        :   ('true'|'false');
WHOLE_NUMBER_WITHOUT_SIGN   :   [0-9]+;
HEX_NUMBER_WITHOUT_SIGN     :   ('Ox'|'16#')[0-9A-Fa-f]+;
OCTAL_NUMBER_WITHOUT_SIGN   :   ('O'|'8#')[0-7]+;
SPLITTER_ID                 :   (' '|'\t');
SPLITTER_END_COMMAND        :   (';'|'\n');
PIPE_WITH_ERRORS            :   '|&'; // //może być wyłapywane przez ten niżej
PIPE                        :   '|';
PLUS                        :   '+';
WILDCARD_OR_MULTIPLY        :   '*';
WILDCARD                    :   '?';
MINUS                       :   '-';
DIVIDE                      :   '/';
KILL_ASYNCH_COMMAND         :   '&';
L_PARENTH_ROUND             :   '(';
R_PARENTH_ROUND             :   ')';
L_PARENTH_CURLY             :   '{';
R_PARENTH_CURLY             :   '}';
OVERWRITE_FILE_ON_THE_RIGHT :   '>';
APPEND_TO_FILE_ON_THE_RIGHT :   '>>';//może być wyłapywane przez ten wyżej Wtedy by trzeba by 2 konstruckje grmatyk, aby potem generator rozróżnił
OVERWRITE_FILE_ON_THE_LEFT  :   '<';
APPEND_TO_FILE_ON_THE_LEFT  :   '<<';//może być wyłapywane przez ten wyżej
BOOL_NEGATION               :   '!';
ASSIGN_OPERATOR             :   '=';
FUNCTION_START              :   'function';
SELECT                      :   'select';
ASYNCHRONIZATION            :   'coproc';
TIME                        :   'time';
CREATE_VARABLE              :   'declare';
HOMEFOLDER                  :   '~';
THIS_FOLDER                 :   '.';
LAST_FOLDER                 :   '..';
LOOP_IN                     :   'in';
DIGIT                       :   [0-9];
NON_ZERO_DIGIT              :   [0-9];      //  What's the difference???