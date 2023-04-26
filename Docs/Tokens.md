## Lista tokenów

| Token                      | Regex                                 |
|----------------------------|---------------------------------------|
| CASE_END                   | 'esac'                                |
| COMMA                      | ','                                   |
| MINUS_P                    | '-p'                                  |
| SPACE                      | ' '                                   |
| TAB                        | [\t]                                  |
| COMMENT                    | '#'~[\n]+'\n'                         |
| SINGLE_APOSTROPHE          | [']                                   |
| APOSTROPHE                 | '"'                                   |
| SINGLE_SEMICOLON           | ';'                                   |
| WHILE_LOOP_BEGIN           | 'while'                               |
| UNTIL_LOOP_BEGIN           | 'until'                               |
| FOR_LOOP_BEGIN             | 'for'                                 |
| LOOP_MIDDLE                | 'do'                                  |
| LOOP_END                   | 'done'                                |
| IF_START                   | 'if'                                  |
| IF_MIDDLE                  | 'then'                                |
| IF_END                     | 'fi'                                  |
| LOOP_IN                    | 'in'                                  |
| PLUS_EQ                    | '+='                                  |
| MINUS_EQ                   | '-='                                  |
| CONDITION_LEFT_SINGLE      | '['                                   |
| CONDITION_RIGHT_SINGLE     | ']'                                   |
| CONDITION_EQ               | ('-eq' &#124; '==' &#124; '=')        |
| CONDITION_NEQ              | ('-ne' &#124; '!=')                   |
| CONDITION_GT               | '-gt'                                 |
| CONDITION_GE               | ('-ge' &#124; '>=')                   |
| CONDITION_LT               | '-lt'                                 |
| CONDITION_LE               | ('-le' &#124; '<=')                   |
| MODULO                     | '%'                                   |
| CONDITION_DOUBLE_AMPERSAND | '&&'                                  |
| CONDITION_DOUBLE_PIPE      | '&#124;&#124;'                        |
| ELSE                       | 'else'                                |
| ELSE_IF                    | 'elif'                                |
| CASE_START                 | 'case'                                |
| CASE_DEFAULT               | '*)'                                  |
| BREAK_ABSOLUTE             | ';;'                                  |
| BRAKE_CONTINUATION         | ';&'                                  |
| BRAKE_WITH_NEXT_EXEC       | ';;&'                                 |
| DOLLAR_SIGN                | '$'                                   |
| VARIABLE                   | '$'~[$#\n;0-9 ]~[$#\n; ]*             |
| SCRIPT_ARGUMENT_NUMBER     | '$#'                                  |
| SCRIPT_ARGUMENT            | '$'[0-9]                              |
| BOOL                       | ('true' &#124; 'false')               |
| HEX_NUMBER_WITHOUT_SIGN    | ('Ox' &#124; '16#')[0-9A-Fa-f]+       |
| OCTAL_NUMBER_WITHOUT_SIGN  | ('O' &#124; '8#')[0-7]+               |
| NEW_LINE                   | '\n'                                  |
| PIPE                       | '&#124;'                              |
| PLUS                       | '+'                                   |
| WILDCARD_OR_MULTIPLY       | '*'                                   |
| WILDCARD                   | '?'                                   |
| MINUS                      | '-'                                   |
| DIVIDE                     | '/'                                   |
| LEFT_SLASH                 | '\\'                                  |
| AMPERSAND                  | '&'                                   |
| DOUBLE_L_PARENTH_ROUND     | '(('                                  |
| DOUBLE_R_PARENTH_ROUND     | '))'                                  |
| L_PARENTH_ROUND            | '('                                   |
| R_PARENTH_ROUND            | ')'                                   |
| L_PARENTH_CURLY            | '{'                                   |
| R_PARENTH_CURLY            | '}'                                   |
| POINTER_RIGHT              | '>'                                   |
| POINTER_LEFT               | '<'                                   |
| BOOL_NEGATION              | '!'                                   |
| FUNCTION_START             | 'function'                            |
| SELECT                     | 'select'                              |
| COPROCESS_START            | 'coproc'                              |
| TIME                       | 'time'                                |
| CREATE_VARABLE             | 'declare'                             |
| TILDA                      | '~'                                   |
| LAST_FOLDER                | '..'                                  |
| THIS_FOLDER                | '.'                                   |
| NUMBER                     | ([1-9][0-9]*              &#124; '0') |
| ALPHANUMERIC               | [a-zA-Z0-9_]                          |
| ALPHA                      | [A-Za-z]                              |
| DIGIT                      | [0-9]                                 |
