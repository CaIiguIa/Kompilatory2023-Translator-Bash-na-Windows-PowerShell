grammar BashGrammar;
prog:	expr EOF ;
expr:	expr LPAR'*'|'/'RPAR expr
    |	expr LPAR'+'|'-'RPAR expr
    |	INT
    |	LPAR expr RPAR
    ;
NEWLINE : [\r\n]+ -> skip;
INT     : [0-9]+ ;
LPAR    : [(] ;
RPAR    : [)] ;