grammar BashGrammar;
program
    :	COMMENT instruction* EOF
    ;

instruction
    : COMMENT
    | splitter_end_command
//    |   EPSILON
//    |(splitter_end_command instruction)+ //TODO:
    |   if_statement
    |   for_loop
    |   while_loop
    |   until_loop
    |   case_statement
//    |   select
//    |   COPROCESS   //  TODO:::
//    |   list
//    |   function
//    |   //  TODO: ADD missing ones
    ;

case_statement
    : CASE_START VARIABLE LOOP_IN  splitter_end_command? single_case+ ( CASE_DEFAULT instruction* BRAKE_ABSOLUTE)? splitter_end_command? CASE_END splitter_end_command
    ;

single_case
    :    ( ( ( ALPHANUMERIC | STRING ) ( PIPE ( ALPHANUMERIC | STRING ) )* )  ) R_PARENTH_ROUND splitter_end_command? instruction* BRAKE_ABSOLUTE splitter_end_command?
    ;

until_loop
    :  UNTIL_LOOP_BEGIN (VARIABLE| variable_from_command /*| TODO: [boolean condition]*/ |) splitter_end_command LOOP_MIDDLE instruction* LOOP_END splitter_end_command
    ;

if_statement: IF_START /*TODO: boolean_condition*/ splitter_end_command IF_MIDDLE instruction* (ELSE_IF /*TODO: boolean_condition*/ splitter_end_command  IF_MIDDLE  instruction* )* (ELSE instruction* )? IF_END splitter_end_command
    ;

while_loop
    :  WHILE_LOOP_BEGIN /*TODO ( list | bool_condition )*/ splitter_end_command LOOP_MIDDLE instruction* LOOP_END splitter_end_command
    ;

for_loop
    :    FOR_LOOP_BEGIN for_loop_argument LOOP_MIDDLE splitter_end_command instruction*  splitter_end_command?  LOOP_END splitter_end_command
    ;

for_loop_argument //argument pętli for znajdujący się między "for", a ""
    : L_PARENTH_ROUND L_PARENTH_ROUND  /*TODO: expr*/  SINGLE_SEMICOLON  /*TODO: bool_condition*/  SINGLE_SEMICOLON  /*TODO: expr*/  R_PARENTH_ROUND R_PARENTH_ROUND splitter_end_command//(( i=0 ; i<10 ; i++ ))
// TODO: (ocochodzi)    | ALPHANUMERIC (LOOP_IN (CHAR_CHAIN )+)* splitter_end_command // ???
    | ALPHANUMERIC LOOP_IN numbers_list_for_loop splitter_end_command // {1..5} ALBO 1 2 3 4 5 ALBO 1 2 3 4 5 .. N ALBO {0..10..2}
    | ALPHANUMERIC LOOP_IN variable_from_command splitter_end_command// $(command)
    ;

numbers_list_for_loop // {1..5} ALBO 1 2 3 4 5 ALBO 1 2 3 4 5 .. N ALBO {0..10..2}
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
    : DOLLAR_SIGN L_PARENTH_ROUND /*TODO:list*/ R_PARENTH_ROUND
    ;

splitter_end_command        
    : SINGLE_SEMICOLON
    | NEW_LINE
    ;

COMMENT                     :   '#'~[\n]+'\n';
//EPSILON                     :   ;
//WORD                        :   ~[\n|&;()<> \t];         //  word, bo character chain zajęte

//ID                          :   [a-zA-Z][a-zA-Z0-9_]*;
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
CASE_DEFAULT                :   '*)';
BRAKE_ABSOLUTE              :   ';;';
BRAKE_CONTINUATION          :   ';&';
BRAKE_WITH_NEXT_EXEC        :   ';;&';
CASE_END                    :   'esac';
STRING                      :   ["][A-Za-z0-9_ ]*["];   //  TODO: Make sure that: " dsdadad\" " is whole string( " dsdadad\" " ) not a " dsdadad\"
//CHAR_CHAIN                  :   ['].*['];
DOLLAR_SIGN                 :   '$';
VARIABLE                    :   '$'~[$#\n;0-9 ]~[$#\n; ]*;
SCRIPT_ARGUMENT_NUMBER      :   '$#';
SCRIPT_ARGUMENT             :   '$'[0-9];
BOOL                        :   ('true'|'false');
NUMBER                      :   [1-9][0-9]*;
HEX_NUMBER_WITHOUT_SIGN     :   ('Ox'|'16#')[0-9A-Fa-f]+;
OCTAL_NUMBER_WITHOUT_SIGN   :   ('O'|'8#')[0-7]+;
SPLITTER_ID                 :   (' '|'\t')->skip;

NEW_LINE                    :   '\n';
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
LAST_FOLDER                 :   '..';
THIS_FOLDER                 :   '.';
ALPHANUMERIC                :   [a-zA-Z0-9_]+;           //  name          //  name
DIGIT : [0-9];