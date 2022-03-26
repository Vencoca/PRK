%{
#include <stdio.h>
#include <stdlib.h>
int yylex(void);
%}

%token FLOAT DECIMAL BINARY HEX BOOL STRING

%%

[\t] ;
[\.|,]|[1-9][0-9|_]*[\.|,][0-9|_]+|0[\.|,][0-9|_]+ { printf("%s\n", "Found float"); return FLOAT;}
[+|-]?[1-9][0-9|_]*|[+|-]?0 { printf ("%s\n", "Found decimal"); return DECIMAL;}
[+|-]?b[0|1][0|1|_]* { printf ("%s\n", "Found binary"); return BINARY; }
[+|-]?h[a-fA-F1-9][a-fA-F0-9|_]* { printf ("%s\n", "Found hexadecimal"); return HEX;}
"Jo"|"Ne"|"JO"|"NE"|"jo"|"ne"|"jO"|"nE" { printf ("%s\n", "Found boolean"); return BOOL; }
[a-zA-Z0-9]+ { printf("%s\n", "Found string"); return STRING;}


%%

int yywrap(void){
    return 1;
}

int main() {
    // Call the lexical analysis:
    yylex();
    return 0;
}
