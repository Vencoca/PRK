# TASK03: Navrhni lexikální analyzátor 
## Jak?
Záleží na volbě nástroje pro tvorbu překladače, buď vytvoříte zdrojový kód pro lex, nebo definujete lexemy pro ANTLR. Součástí odevzdání je také sada testovacích výrazů (správných i chybných), jež jste použili k testování analyzátoru.

## Použití
- make 
  - přeloží lexikální analyzátor do složky /bin
- make clean
  - vyčistí obsah /bin
- make test
  - spustí testy, nutno nejprve přeložit pomocí make
  - testovací data jsou ve složce /tests
  - výsledky testu jsou ve složce /tests/results
    - obsahují přeložené tokeny na lexemy
    - na konci souboru je počet nalezených chyb (znaků které nebyly rozpoznány)
