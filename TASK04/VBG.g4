//Very Basic grammar
grammar VBG;
//Syntaktická část
root: (expr NLINE)+;
expr: expr POWER expr
    | expr MULTIPLY expr
    | expr SUM expr
    | expr COMPARE expr
    | LEFTBRACKET expr RIGHTBRACKET
    | TYPE
    ;
//Lexikální část
TYPE : DECIMAL | HEXA | BINARY | FLOAT | BOOL | STRING;
//Operace
SUM: '+';
MULTIPLY : '*';
POWER: '^';
LEFTBRACKET: '(';
RIGHTBRACKET : ')';
COMPARE : '<'|'>'|'=='|'<='|'>=';
//Datové typy
DECIMAL: ('-')?[1-9][0-9|_]*|[+|-]?'0';
HEXA: ('-')? 'h' [0-9a-fA-F][a-fA-F0-9|_]* ;
BINARY: ('-')? 'b' ('0'|'1') ('0'|'1'|'_')*;
FLOAT: [.|,]|[1-9][0-9|_]*[.|,][0-9|_]+|'0'[.|,][0-9|_]+;
BOOL : 'Jo'|'Ne'|'JO'|'NE'|'jo'|'ne'|'jO'|'nE';
STRING: '"' (~["])* '"';
NLINE : [\r|\n]+;
//Vynechávané znaky
WS : [ \t]+ -> skip ;
COM : ('!*' (~[*!])* '*!') -> skip; 