# Aula Tipos e Variáveis da Formação de Java Developer da DIO - Digital Innovation One

Pasta contendo todos os conteúdo realizados na Aula de Tipos e Variáveis.

### IDEs e Extensões Utilizadas

Foi utlizado o Visual Studio Code com a extension pack for Java

## Tipos

byte, short, *int*, long - sendo tipos numéricos inteiros, tendo como boa prática/sempre utilizado o tipo *int*

float, *double* - sendo tipos numéricos fracionários, tendo como boa prática/sempre utilizado o tipo *double*

### Possíveis conflitos

Pelo Java ser uma linguagem fortemente tipada, não é possível realizar a seguinte operação.
~~~~Java
short numeroCurto = 1;
int numeroNormal = numeroCurto;
short numeroCurto2 = numero normal;
~~~~
Ao declarar que a variável numeroCurto2 do tipo short, receba o valor atribuído a variável numeroNormal do tipo int que no caso seria 1, irá retornar um erro devido ao tipo int comportar um numero maior que 30mil que o tipo short comporta, por isso podemos ou alternar o tipo, ou se for necessário utilizar o *cast* para realizarmos essa atribuição, como o exemplo a baixo:
~~~~Java
short numeroCurto = 1;
int numeroNormal = numeroCurto;
short numeroCurto2 = (short) numero normal;
~~~~

## Variáveis e Constantes

Para declarar uma variável deve sempre ser iniciada com o tipo, seguido do nome da variável utilizando o padrão camelCase, e se terá um valor pré-definido utilizando o símbolo de atribuição "=" seguido do valor, exemplo de uma variável com valor e outra sem:
~~~~Java
int numeroInteiro;
int numeroInteiroDefinido = 15;
~~~~
Para declarar uma constante(variável que é não pode ser mudado), iniciamos com a palavra reservada *final* seguido do tipo, nome da variável sendo escrita em "CAIXA ALTA", símbolo de atribuição e o valor da variável, exemplo:
~~~~Java
final double VALOR_DE_PI = 3.14;
~~~~
