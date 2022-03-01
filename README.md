# PRK - Překladače

## TASK01: Vymysli si vlastní jazyk
### Jak?
Vymyslete si rozšíření jazyka, jenž slouží k definici algebraických operací. Jazyk určitě obsahuje tyto prvky: součet, součin, závorky a jeden operand. Vy přidejte další operace, určete jejich prioritu, můžete rozšířit operandy (číselné a jiné typy), můžete přidat funkce - prostě cokoliv vás napadne. Cílem je, abyste všichni měli podobné, ale každý trochu jiné zadání.

### Datové typy
Znaménko = +|- \
Integer = znaménko + [DECIMAL|HEXA|BINARY] \
  - DECIMAL = číslo složené z čísel 0123456789 a  oddělovačem _, nesmí začínat _  Validní: (001,230,34_8,1_000_000,0_02) Nevalidní: (_1,123g4,_3b)
  - HEXA = h + číslo složené z čísel 0123456789(aAbBcCdDeEfF) a oddělovačem _, nesmí začínat _ Validní: (h001,h230,h34_8f,h1_000_000) Nevalidní: (h_1,h123g4,h_3b)
  - BINARY = b + číslo složené z čísel 01 a oddělovačem _,nesmí začínat _ Validní: (b001,b10,b34_8,b1_000_000) Nevalidní: (b_1,b123g4,_3b)

Float
  - číslo = 0123456789
  - znaménko + (Číslo a oddělovač _, nezačíná _)*.(Číslo)* Validní: (.,0.1,0008.34,0_02.3,.3) Nevalidní (_., _._3, 42.233_222)
Boolean - Jo/Ne | jo/ne | jO/nE | JO/NE

### Operace - od nejvyšší priority po nejnížší
závorky () - přednost operací\
Mocnina - (datový typ)^(integer)\
násobení * (false * true = true*false = false), lze násobit jakýkoliv typ, pro násobení float*integer se převede integer na float a pak se násobí 2 floaty\
sčítání + (u booleanů jako XOR), podobně jako u násobení\
porovnávání <,>,== porovná hodnotu stejných datových typů

### Komentáře
jednořádkové - !\
víceřádkové - !* jakýkoliv znak *!



