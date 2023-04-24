grammar BashGrammar;
program
    :	COMMENT instruction* EOF
    ;

instruction
    : COMMENT
    | SPLITTER_END_COMMAND
//    |   EPSILON
//    |(SPLITTER_END_COMMAND instruction)+ //TODO:
//    |   if
//    |   for
    |   while_loop
//    |   until
    |   case_statement
//    |   select
//    |   COPROCESS   //  TODO:::
//    |   list
//    |   function
//    |   //  TODO: ADD missing ones
    ;

case_statement
    : CASE_START VARIABLE LOOP_IN single_case+ ( CASE_DEFAULT instruction* BRAKE_ABSOLUTE)? CASE_END SPLITTER_END_COMMAND
    ;

single_case
    :    ( ( ALPHANUMERIC ( PIPE ALPHANUMERIC)* ) | STRING ) R_PARENTH_ROUND instruction* BRAKE_ABSOLUTE
    ;

while_loop
    :  WHILE_LOOP_BEGIN /*TODO ( list |  )*/ SPLITTER_END_COMMAND LOOP_MIDDLE instruction* LOOP_END SPLITTER_END_COMMAND
    ;

for_loop
    :    FOR_LOOP_BEGIN for_loop_argument LOOP_MIDDLE instruction*  SPLITTER_END_COMMAND  LOOP_END SPLITTER_END_COMMAND
    ;

for_loop_argument //argument pętli for znajdujący się między "for", a ""
    : L_PARENTH_ROUND L_PARENTH_ROUND  /*TODO: expr*/  SINGLE_SEMICOLON  /*TODO: bool_condition*/  SINGLE_SEMICOLON  /*TODO: expr*/  L_PARENTH_ROUND L_PARENTH_ROUND SPLITTER_END_COMMAND//(( i=0 ; i<10 ; i++ ))
    | ALPHANUMERIC (LOOP_IN (CHAR_CHAIN )+)* SPLITTER_END_COMMAND // ???
    | VARIABLE LOOP_IN numbers_list // {1..5} ALBO 1 2 3 4 5 ALBO 1 2 3 4 5 .. N ALBO {0..10..2}
    | // TODO: $(command)
    ;

numbers_list // {1..5} ALBO 1 2 3 4 5 ALBO 1 2 3 4 5 .. N ALBO {0..10..2}
    : (signed_number)+ ('..' signed_number)?
    | '{' signed_number '..' signed_number ('..' signed_number)?  '}'
    ;

signed_number
    : ('+' | '-') number
    ;

number
    : number_integer
    | number_float
    ;

number_float
    : number_integer ('.'|',') (DIGIT)*
    ;

number_integer
    : NON_ZERO_DIGIT DIGIT*
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
VARIABLE                    :   '$'~[$#\n;0-9 ]~[$#\n; ]*;
SCRIPT_ARGUMENT_NUMBER      :   '$#';
SCRIPT_ARGUMENT             :   '$'[0-9];
BOOL                        :   ('true'|'false');
WHOLE_NUMBER_WITHOUT_SIGN   :   [0-9]+;
HEX_NUMBER_WITHOUT_SIGN     :   ('Ox'|'16#')[0-9A-Fa-f]+;
OCTAL_NUMBER_WITHOUT_SIGN   :   ('O'|'8#')[0-7]+;
SPLITTER_ID                 :   (' '|'\t')->skip;

SPLITTER_END_COMMAND        :   (';'|'\n');
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
THIS_FOLDER                 :   '.';
LAST_FOLDER                 :   '..';
NON_ZERO_DIGIT              :   [1-9];
DIGIT                       :   [0-9];
ALPHANUMERIC                :   [a-zA-Z0-9_]+;           //  name          //  name