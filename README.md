# PRK - Překladače

## TASK01: Vymysli si vlastní jazyk
### Jak?
Vymyslete si rozšíření jazyka, jenž slouží k definici algebraických operací. Jazyk určitě obsahuje tyto prvky: součet, součin, závorky a jeden operand. Vy přidejte další operace, určete jejich prioritu, můžete rozšířit operandy (číselné a jiné typy), můžete přidat funkce - prostě cokoliv vás napadne. Cílem je, abyste všichni měli podobné, ale každý trochu jiné zadání.

### Datové typy
Znaménko = - \
Integer = znaménko + [DECIMAL|HEXA|BINARY] 
  - DECIMAL = číslo složené z čísel 0123456789 a  oddělovačem _, nesmí začínat _ a 0
  - HEXA = h + číslo složené z čísel 0123456789(aAbBcCdDeEfF) a oddělovačem _, nesmí začínat _  a 0 
  - BINARY = b + číslo složené z čísel 01 a oddělovačem _,nesmí začínat _ 

Float
  - ČÍSLO = 0123456789
  - znaménko + (ČÍSLO a oddělovač _, nezačíná _ a 0)* .(ČÍSLO a oddělovač nezačíná _)* 

Boolean 
  - Jo/Ne | jo/ne | jO/nE | JO/NE

String
  - ZNAK = Libovolný znak kromě ""
  - "ZNAK"


### Operace - od nejvyšší priority po nejnížší
Závorky () - přednost operací\
Mocnina - (datový typ)^(integer)\
Násobení * (false * true = true * false = false), lze násobit jakýkoliv typ, pro násobení float * integer se převede integer na float a pak se násobí 2 floaty\
Sčítání + (u booleanů jako XOR), podobně jako u násobení\
Porovnávání <,>,== porovná hodnotu stejných datových typů

### Komentáře
 - !* jakýkoliv znak *!