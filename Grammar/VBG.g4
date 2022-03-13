// Define a grammar called VBG - Very Basic grammar
grammar VBG;
soubor: (vyraz | '\n' | type)+;
vyraz: (plus|krat|mocnina|porovnej);
porovnej: type konecPorovnej*;
konecPorovnej: ('<'|'>'|'=='|'<='|'>=') type;
vyrazPorovnej: '(' porovnej ')';

plus: type konecPlus*;
konecPlus: '+' type;
vyrazPlus: '(' plus ')';

krat: (type|vyrazPlus) konecKrat*;
konecKrat: '*' (type|vyrazPlus); 
vyrazKrat: '(' krat ')';

mocnina: (type|vyrazPlus|vyrazKrat) konecMocnina*;
konecMocnina: '^' (type|vyrazPlus|vyrazKrat);
vyrazMocnina: '(' mocnina ')';

type: number | bool | string;
number:integer|flt; 
integer:signed|unsigned;
signed:('+'|'-') unsigned;
unsigned: decimal|hexa|binary; 
decimal: nonz digit*;
hexa: 'h' hexnz hexdigit*;
binary: 'b' ('0'|'1') ('0'|'1'|'_')+;
nonz: '1'|'2'|'3'|'4'|'5'|'6'|'7'|'8'|'9';
digit: '0' | nonz | '_';
hexnz: nonz|'a'|'b'|'c'|'d'|'e'|'f'|'A'|'B'|'C'|'D'|'E'|'F';
hexdigit: '0'|hexnz|'_';
flt: ('0'|decimal*) ('.'|',') digit* ;
bool : BOOL;
BOOL : 'Jo'|'Ne'|'JO'|'NE'|'jo'|'ne'|'jO'|'nE';
string : STRING;
STRING: '"' (~["])* '"';
WS : [ \t\r]+ -> skip ; // skip spaces, tabs, newlines
COM : ('!*' (~[*!])* '*!') -> skip;