# Aula Estruturas Excepcionais

## Conteúdo

Try/Catch. E hieraquias das exceções e exceções customizadas.

### Conhecendo algumas exceções já mapeadas

A linguagem Java dispõe de uma vasta lista de classes que representam exceções, abaixo iremos apresentar as mais comuns:

| Nome                           | Causa                                                                |
| ------------------------------ | -------------------------------------------------------------------- |
| java.lang.NullPointerException | Quando tentamos obter alguma informação de uma variável nula.        |
| java.lang.ArithmeticException  | Quando tentamos dividir um valor por zero.                           |
| java.sql.SQLException          | Quando existe algum erro relacionado a interação com banco de dados. |
| java.io.FileNotFoundException  | Quando tentamos ler ou escrever em um arquivo que não existe.        |

### Tratamento de exceções

E quando inevitavelmente ocorrer uma exceção? Como nós desenvolvedores podemos ajustar o nosso algoritmo para amenizar o ocorrido?

A instrução **`try`** permite que você defina um bloco de código para ser testado quanto a erros enquanto está sendo executado.&#x20;

A instrução **`catch`** permite definir um bloco de código a ser executado, caso ocorra um erro no bloco try.&#x20;

A instrução **`finally`** permite definir um bloco de código a ser executado independente de ocorrer um erro ou não. As palavras-chave `try` e `catch` vêm em pares:&#x20;

Estrutura de um bloco com try e catch

```java
try {
  //  bloco de código conforme esperado
}
catch(Exception e) {// precisamos saber qual exceção
  // bloco de código que captura as exceções que podem acontecer
  // em caso de um fluxo não previsto
}
```

{% hint style="warning" %}
O bloco **`try`** / **`catch`** pode conter um conjunto de **catchs** correspondentes a cada exceção que **prevista** em uma funcionalidade do programa.
{% endhint %}

### Hierarquia das exceções

A linguagem Java dispõe de uma variedade de classes que representam exceções, e estas classes são organizadas em uma hierarquia denominadas **Checked and Unchecked Exceptions** ou _Exceções Checadas e Não Checadas_.&#x20;

{% hint style="info" %}
O que determina uma exceção ser classificado como **checada** ou **não checada** ?\
É o risco dela ser disparada logo você precisa tratá-la, exemplo:
{% endhint %}

Vamos imaginar que precisamos realizar de duas maneiras a conversão de uma String para um número, porém o texto contém Alfanuméricos.

```java
public class ExemploExcecao {
    public static void main(String[] args) {
        Number valor = Double.valueOf("a1.75");

        valor = NumberFormat.getInstance().parse("a1.75");
        
        System.out.println(valor);
       
    }
}
```

{% hint style="info" %}
As linhas 3 e 5 apresentarão uma exceção ao serem executadas, e a linha 5 contém um método que pode disparar uma exceção checada, logo nós programadores que iremos usar este método teremos que tratá-la explicitamente com **`try \ catch`**.
{% endhint %}

### Exceções customizadas

Nós podemos criar nossas próprias exceções baseadas em regras de negócio e assim melhor direcionar quem for utilizar os recursos desenvolvidos no projeto, exemplo:

* Imagina que como regra de negócio, para formatar um cep necessita sempre de ter 8 dígitos, caso contrário lançará uma exceção que denominamos de **CepInvalidoException**.
* Primeiro criamos nossa exceção:

```java
public class CepInvalidoException extends Exception {}
```

* Em seguida criamos nosso método de formatação de cep.

```java
static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8)
          throw new CepInvalidoException();
        
          //simulando um cep formatado
          return "23.765-064";
    }
```