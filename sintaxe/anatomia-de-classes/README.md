# Aula Anatomia das Classes da Formação de Java Developer da DIO - Digital Innovation One

Pasta contendo todos os conteúdo realizados na Aula de Anatomia das Classes.

## IDEs e Extensões Utilizadas

Foi utlizado o Visual Studio Code com a extension pack for Java

## As Progressões Estão em Commits

A cada conteúdo realizado foi feito um commit para salvar o progresso, todos os commits estão descritos de acordo com cada parte

### O Que Foi Aprendido

~~~~java
final String BR = "Brasil"; // Fazendo a declaração do final antes de qualquer variável, transforma ela em uma variável imutável
int ano = 2005; // Toda declaração de variável deve ser declarada: Tipo, nome da variável, = (atribuição), e o valor

// Para criar um método com retorno deve-se adicionar após a declarção static, como o exemplo a baixo
public static String nomeCompleto(primeiroNome, segundoNome){
    return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);   
}
// Para chamar o método deve ser realizado da seguinte forma.
String primerioNome = "Luan"; // Declarar a variável, não precisa necessariamente receber o mesmo nome dos parâmetros
String segundoNome = "Rodrigues";

String nomeCompleto = nomeCompleto(primeiroNome, segundoNome); // Para chamar o método deve-se criar a variável que irá receber o resultado do método, e adicionar as variáveis do parâmetro

// Para realizar a organização dos arquivos no Java, é utlizado o método de pacotes(packages)
// Para criar um pacote no Visual Studio Code deve-se criar pastas com sub-pastas, exemplo
// Na pasta src: edu; lycanns; model == edu.lycanns.model - package
// Após criar o pacote pode ser arrastado o arquivo para a pasta model, ou criar um arquivo na pasta model, fazendo assim ele estar no pacote edu.lycanns.model
package edu.lycanns.primeirasemana;
~~~~