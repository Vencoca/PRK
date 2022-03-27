%{
#include <stdio.h>
#include <stdlib.h>
int yylex(void);
%}


%%

[ \t];
[/][*][^*]*[*]+([^*/][^*]*[*]+)*[/] { /* DO NOTHING */ }
[\.|,]|[1-9][0-9|_]*[\.|,][0-9|_]+|0[\.|,][0-9|_]+ { printf("%s ", "FLOAT"); return FLOAT;}
[-]?[1-9][0-9|_]*|[+|-]?0 { printf ("%s ", "DECIMAL"); return DECIMAL;}
[-]?b[0|1][0|1|_]* { printf ("%s ", "BINARY"); return BINARY; }
[-]?h[a-fA-F1-9][a-fA-F0-9|_]* { printf ("%s ", "HEXA"); return HEX;}
"Jo"|"Ne"|"JO"|"NE"|"jo"|"ne"|"jO"|"nE" { printf ("%s ", "BOOL"); return BOOL; }
[a-zA-Z0-9]+ { printf("%s ", "STRING"); return STRING;}
"\+" { printf("%s ", "SUM"); return SUM;}
"\*" { printf("%s ", "MULTIPLY"); return MULTIPLY;}
"\^" { printf("%s ", "POWER"); return POWER;}
"<"|">"|"=="|"<="|">=" { printf("%s ", "COMPARE"); return COMPARE;}
"\(" { printf("%s ", "LEFTBRACKET"); return LEFTBRACKET;}
"\)" { printf("%s ", "RIGHTBRACKET"); return RIGHTBRACKET;}
"\*!" { printf("%s ", "RIGHTBRACKET"); return RIGHTBRACKET;}


%%

int yywrap(void){
    return 1;
}

int main() {
    // Call the lexical analysis:
    yylex();
    return 0;
}
