import java.util.Random;

public class FacaEnquanto {
    public static void main(String[] args) {
        // estrutura do controle de fluxo do while

        // do
        // {
        // comando que será executado até que a
        // expressão de validação torne-se falsa
        // }
        // while (expressão booleana de validação);

        System.out.println("Discando...");

        do {
            // excutando repetidas vezes até alguém atender
            System.out.println("Telefone tocando");

        } while (tocando());

        System.out.println("Alô !!!");
    }

    private static boolean tocando() {
        boolean atendeu = new Random().nextInt(3) == 1;
        System.out.println("Atendeu? " + atendeu);
        // negando o ato de continuar tocando
        return !atendeu;
    }
}
