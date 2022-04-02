// Define a grammar called VBG - Very Basic grammar
grammar VBG;
soubor: (TYPE | '\n' | vyraz )+;
vyraz: (plus|krat|mocnina|porovnej);
porovnej: TYPE konecPorovnej*;
konecPorovnej: COMPARE TYPE;
vyrazPorovnej: LEFTBRACKET porovnej RIGHTBRACKET;

plus: TYPE konecPlus*;
konecPlus: SUM TYPE;
vyrazPlus: LEFTBRACKET plus RIGHTBRACKET;

krat: (TYPE|vyrazPlus) konecKrat*;
konecKrat: MULTIPLY (TYPE|vyrazPlus); 
vyrazKrat: LEFTBRACKET krat RIGHTBRACKET;

mocnina: (TYPE|vyrazPlus|vyrazKrat) konecMocnina*;
konecMocnina: POWER (TYPE|vyrazPlus|vyrazKrat);
vyrazMocnina: LEFTBRACKET mocnina RIGHTBRACKET;

type: TYPE;

SUM: '+';
MULTIPLY : '*';
POWER: '^';
LEFTBRACKET: '(';
RIGHTBRACKET : ')';
COMPARE : '<'|'>'|'=='|'<='|'>=';
TYPE : DECIMAL | HEXA | BINARY | FLOAT | BOOL | STRING;
DECIMAL: ('+'|'-')?[1-9][0-9|_]*|[+|-]?'0';
HEXA: [+|-]? 'h' [0-9a-fA-F][a-fA-F0-9|_]* ;
BINARY: 'b' ('0'|'1') ('0'|'1'|'_')*;
FLOAT: [.|,]|[1-9][0-9|_]*[.|,][0-9|_]+|'0'[.|,][0-9|_]+;
BOOL : 'Jo'|'Ne'|'JO'|'NE'|'jo'|'ne'|'jO'|'nE';
STRING: '"' (~["])* '"';

WS : [ \t\r]+ -> skip ; // skip spaces, tabs, newlines
COM : ('!*' (~[*!])* '*!') -> skip; // skip comments