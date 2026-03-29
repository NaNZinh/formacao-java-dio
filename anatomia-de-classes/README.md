# Aula Anatomia das Classes da Formação de Java Developer da DIO - Digital Innovation One

Pasta contendo todos os conteúdo realizados na Aula de Anatomia das Classes.

## As progressões estão em commits

A cada conteúdo realizado foi feito um commit para salvar o progresso, todos os commits estão descritos de acordo com cada parte

### O que foi aprendido

~~~~java
final String BR = "Brasil"; // Fazendo a declaração do final antes de qualquer variável, transforma ela em uma variável imutável
int ano = 2005; // Toda declaração de variável deve ser declarada: Tipo, nome da variável, = (atribuição), e o valor

// Para criar um método com retorno deve-se adicionar após a declarção static, como o exemplo a baixo
public static String nomeCompleto(primeiroNome, segundoNome){
    return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);   
}
// Para chamar o método deve ser realizado da seguinte forma.
String primerioNome = "Luan"; // Declarar a variável, não precisa necessariamente receber o mesmo nome dos parâmetros
String segundoNome = "Rodrgues";

String nomeCompleto = nomeCompleto(primeiroNome, segundoNome); // Para chamar o método deve-se criar a variável que irá receber o resultado do método, e adicionar as variáveis do parâmetro


~~~~