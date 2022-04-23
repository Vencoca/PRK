# PRK - úkol číslo 5
## Zadání 
### Proč?
Abyste se naučili dál pracovat se strukturou překladače. Nebudeme generovat výsledný kód, naučíte se ale vyhodnotit výrazy a ověříte tak, že vaše gramatika správně reprezentuje prioritu operací.
### Jak?
Používáte-li lex/yacc, přidáte do zdrojového kódu syntaktického analyzátoru části pro vyhodnocení výrazu. Analogicky postupujete v ANTLR.
###Co odevzdávám?
Znovu zdrojové kódy a testovací data v git.


## Řešení
Vyhodnocování výrazu vychází z gramatiky. Nejprve je řádek procházen lexerem a poté parserem. Visitor pak pracuje s vytvořeným stromem.
Visitor převede všechny datové typy na double a poté je podle příslušných operací sčítá, násobí a mocní nebo porovnává.

### Gramatika
    //Very Basic grammar
    grammar VBG;
    //Syntaktická část
    root: ex=expr EOF;
    
    expr: LEFTBRACKET ex=expr RIGHTBRACKET
    | left=expr operator=POWER right=expr
    | left=expr operator=MULTIPLY right=expr
    | left=expr operator=SUM right=expr
    | left=expr operator=COMPARE right=expr
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
    DECIMAL: ('-')?[1-9][0-9|_]*|[-]?'0';
    HEXA: ('-')? 'h' [0-9a-fA-F][a-fA-F0-9|_]* ;
    BINARY: ('-')? 'b' ('0'|'1') ('0'|'1'|'_')*;
    FLOAT: [.|,]|[1-9][0-9|_]*[.|,][0-9|_]+|'0'[.|,][0-9|_]+;
    BOOL : 'Jo'|'Ne'|'JO'|'NE'|'jo'|'ne'|'jO'|'nE';
    STRING: '"' (~["])* '"';
    NLINE : [\r|\n]+;
    //Vynechávané znaky
    WS : [ \t]+ -> skip ;
    COM : ('!*' (~[*!])* '*!') -> skip;


## Spouštění
Řešení obsahuje dva .jar soubory, jeden bez ANTLERU a druhý s ANTLEREM, který jde přímo spustit příkazy níže. Třída Calculator přijímá na vstupu soubor (cestu k souboru) jehož každý řádek spočítá. 
Výstup je pak ve tvaru výraz = výsledek. Pokud je výsledek null, tak nastala chyba a je vypsán také error.

Spustí test validních vstupů - ve složce testFiles je soubor expectedOutValid.txt který obsahuje předpokládaný výstup pro validní testy

    java -cp .\TASK05-1.0-SNAPSHOT-jar-with-dependencies.jar prk.calculator.Calculator ../testFiles/valid.txt  

Spustí test nevalidních vstupů, každý řádek vypíše chybu.

    java -cp .\TASK05-1.0-SNAPSHOT-jar-with-dependencies.jar prk.calculator.Calculator ../testFiles/invalid.txt  
