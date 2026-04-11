public class CondicionalEncadeada {
    public static void main(String[] args) {
        int nota = 6;

        if (nota >= 7) // Para entrar no bloco do if, a condição deve ser true
            System.out.println("Aprovado");

        else if (nota >= 5 && nota < 7)
            System.out.println("Prova Recuperação");

        else
            System.out.println("Reprovado");
    }
}