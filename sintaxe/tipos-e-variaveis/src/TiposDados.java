public class TiposDados {
    public static void main(String[] args) {
        byte idade = 123;
        short ano = 2026;
        int cep = 36512000; // Se começar com zero, talvez trocar para o tipo String pois o tipo int não
                            // armazena o zero inicial
        long cpf = 40028922527L; // Mesmo problema do tipo int, é necessário também ser encerrado com L
        float pi = 3.14F; // O tipo float é necessário ser encerrado com F devido ao Java tentar
                          // interpretar como double
        double salario = 2092.27; // Todos os tipos fracionário a separação das casas decimais deve ser feita
                                  // utilizando "." devido ao padrão americano
        
    }
}
