## Lista tokenów

| Token                            | Regex                                                                                                                            |
|----------------------------------|----------------------------------------------------------------------------------------------------------------------------------|
| STRING                           | `["](~["]' ')*["];`                                                                                                              |
| CHARACTER_CHAIN                  | `['](~['] \|' ')*['];`                                                                                                           |
| COMMENT                          | `#~[\n]+\n;`                                                                                                                     |
| SINGLE_APOSTROPHE                | `['];`                                                                                                                           |
| APOSTROPHE                       | `'"';`                                                                                                                           |
| SINGLE_SEMICOLON                 | `';';`                                                                                                                           |
| WHILE_LOOP_BEGIN                 | `'while';`                                                                                                                       |
| UNTIL_LOOP_BEGIN                 | `'until';`                                                                                                                       |
| FOR_LOOP_BEGIN                   | `'for';`                                                                                                                         |
| LOOP_MIDDLE                      | `'do';`                                                                                                                          |
| LOOP_END                         | `'done';`                                                                                                                        |
| IF_START                         | `'if';`                                                                                                                          |
| IF_MIDDLE                        | `'then';`                                                                                                                        |
| IF_END                           | `'fi';`                                                                                                                          |
| LOOP_IN                          | `'in';`                                                                                                                          |
| CONDITION_LEFT_SINGLE            | `[';`                                                                                                                            |
| CONDITION_RIGHT_SINGLE           | `']';`                                                                                                                           |
| CONDITION_EQ                     | `'-eq';`                                                                                                                         |
| EQ                               | `';';`                                                                                                                           |
| CONDITION_NEQ                    | `('-ne'\|'!=');`                                                                                                                 |
| CONDITION_GT                     | `'-gt';`                                                                                                                         |
| CONDITION_GE                     | `('-ge'                                   \|'>=');`                                                                              |
| CONDITION_LT                     | `'-lt';`                                                                                                                         |
| CONDITION_LE                     | `('-le'                                             \|'<=');`                                                                    |
| MODULO                           | `'%';`                                                                                                                           |
| CONDITION_DOUBLE_AMPERSAND       | `'&&';`                                                                                                                          |
| CONDITION_DOUBLE_PIPE            | `'                                                            \| \|';`                                                           |
| ELSE                             | `'else';`                                                                                                                        |
| ELSE_IF                          | `'elif';`                                                                                                                        |
| CASE_START                       | `'case';`                                                                                                                        |
| CASE_DEFAULT                     | `'*';`                                                                                                                           |
| BRAKE_CONTINUATION               | `';&';`                                                                                                                          |
| BRAKE_WITH_NEXT_EXEC             | `';;&';`                                                                                                                         |
| CASE_END                         | `'esac';`                                                                                                                        |
| DOLLAR_SIGN                      | `'$';`                                                                                                                           |
| SCRIPT_ARGUMENT_NUMBER           | `'$#';`                                                                                                                          |
| SCRIPT_ARGUMENT                  | `'$'[0-9];`                                                                                                                      |
| BOOL                             | `('true'                                                               \|'false');`                                              |
| HEX_NUMBER_WITHOUT_SIGN          | `('Ox'                                                                              \|'16#')[0-9A-Fa-f]+;`                       |
| OCTAL_NUMBER_WITHOUT_SIGN        | `('O'                                                                                                      \|'8#')[0-7]+;`       |
| NEW_LINE                         | `[\n];`                                                                                                                          |
| PIPE                             | `'                                                                                                                         \|';` |
| PLUS                             | `'+';`                                                                                                                           |
| WILDCARD_OR_MULTIPLY             | `'*';`                                                                                                                           |
| WILDCARD                         | `'?'`                                                                                                                            |
| MINUS                            | `'-';`                                                                                                                           |
| DIVIDE                           | `'/';`                                                                                                                           |
| LEFT_SLASH                       | `'\\';`                                                                                                                          |
| AMPERSAND                        | `'&';`                                                                                                                           |
| L_PARENTH_ROUND                  | `'(';`                                                                                                                           |
| R_PARENTH_ROUND                  | `')';`                                                                                                                           |
| L_PARENTH_CURLY                  | `'{'`                                                                                                                            |
| R_PARENTH_CURLY                  | `'}';`                                                                                                                           |
| POINTER_RIGHT                    | `'>';`                                                                                                                           |
| POINTER_LEFT                     | `'<';`                                                                                                                           |
| BOOL_NEGATION                    | `'!';`                                                                                                                           |
| FUNCTION_START                   | `'function';`                                                                                                                    |
| SELECT                           | `'select';`                                                                                                                      |
| COPROCESS_START                  | `'coproc';`                                                                                                                      |
| TIME                             | `'time';`                                                                                                                        |
| CREATE_VARABLE                   | `'declare';`                                                                                                                     |
| TILDA                            | `'~';`                                                                                                                           |
| LAST_FOLDER                      | `'..';`                                                                                                                          |
| THIS_FOLDER                      | `'.';`                                                                                                                           |
| NUMBER                           | `[1-9][0-9]*;`                                                                                                                   |
| ALPHA                            | `[A-Za-z];`                                                                                                                      |
| MINUSP                           | `'-p';`                                                                                                                          |
| UNDERSCORE                       | `'_';`                                                                                                                           |
| SPACE                            | `' '->more;`                                                                                                                     |
| TAB                              | `[\t]->more;`                                                                                                                    |