%{
#include <stdio.h>
#include <stdlib.h>
int yylex(void);
int errors_detected=0;
%}


%%
[ \t \r] {/*SKIP spaces and tabs */};
[!][*][^*]*[*]+([^*!][^*]*[*]+)*[!] {/*SKIP COMMENT */ }	
[\.|,]|[1-9][0-9|_]*[\.|,][0-9|_]+|0[\.|,][0-9|_]+|[\.|,][0-9|_]+ { printf("%s ", "FLOAT");}
[-]?[1-9][0-9|_]*|[+|-]?0 { printf ("%s ", "DECIMAL");}
[-]?b[0|1][0|1|_]* { printf ("%s ", "BINARY");}
[-]?h[a-fA-F1-9][a-fA-F0-9|_]* { printf ("%s ", "HEXA");}
"Jo"|"Ne"|"JO"|"NE"|"jo"|"ne"|"jO"|"nE" { printf ("%s ", "BOOL");}
\"(\\.|[^"\\])*\" { printf("%s ", "STRING");}
"\+" { printf("%s ", "SUM");}
"\*" { printf("%s ", "MULTIPLY");}
"\^" { printf("%s ", "POWER");}
"<"|">"|"=="|"<="|">=" { printf("%s ", "COMPARE");}
"\(" { printf("%s ", "LEFTBRACKET");}
"\)" { printf("%s ", "RIGHTBRACKET");}
.    {errors_detected++; printf("%s ",yytext);}


%%

int yywrap(void){
    return 1;
}

int main() {
    // Call the lexical analysis:
    yylex();
    printf("\n \n %d of total errors detected in input file.",errors_detected);
    return 0;
}

