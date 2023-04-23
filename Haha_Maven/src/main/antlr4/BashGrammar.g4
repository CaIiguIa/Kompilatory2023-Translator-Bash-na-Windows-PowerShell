grammar BashGrammar;
//  Grammar
prog:	expr EOF ;
expr:	expr LPAR'*'|'/'RPAR expr
    |	expr LPAR'+'|'-'RPAR expr
    |	INT
    |	LPAR expr RPAR
    ;

//  Tokens
//  Skips
NEWLINE :   [\r\n]+ -> skip;
COMMENT :   [#][^\n]+[\n] -> skip;

//  Reserved words
FORLOOP     :   'for';
WHILELOOP   :   'while';
UNTILLOOP   :   'until';



//  Literals
INT     : [0-9]+ ;


//  Special Charactres
LPAR    : [(] ;
RPAR    : [)] ;
TOK     :  ;