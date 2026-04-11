import java.util.concurrent.ThreadLocalRandom;

public class Enquanto {
    public static void main(String[] args) {
        // estrutura do controle de fluxo while

        // while (expressão booleana de validação)
        // {
        // comando que será executado até que a
        // expressão de validação torne-se falsa
        // }

        double mesada = 50.0;
        while (mesada > 0) {
            Double valorDoce = valorAleatorio();
            if (valorDoce > mesada)
                valorDoce = mesada;

            System.out.printf("Doce do valor: %.2f Adicionado no carrinho", valorDoce);
            System.out.println();
            mesada = mesada - valorDoce;
        }
        System.out.printf("Mesada: %.2f", mesada);
        System.out.println();
        System.out.println("Joãozinho gastou toda a sua mesada em doces");
    }

    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }
}
