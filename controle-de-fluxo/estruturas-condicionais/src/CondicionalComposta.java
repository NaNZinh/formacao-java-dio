public class CondicionalComposta {
    public static void main(String[] args) {
        int nota = 6;

        if (nota >= 7) // se for feito mais de uma operação no if, é necessário inserir em um bloco, {}
            System.out.println("Aprovado");
        else
            System.out.println("Reprovado");
    }
}
