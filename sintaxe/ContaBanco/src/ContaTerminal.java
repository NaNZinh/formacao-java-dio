import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) {

        String Numero = "";
        int Agencia = 0;
        String NomeCliente = "";
        double Saldo = 0;

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US); // força uso do ponto decimal

        System.out.println("Por favor, digite o número da Agência!");
        Agencia = sc.nextInt();

        System.out.println("Por favor, digite o número da Conta!");
        Numero = sc.next();

        sc.nextLine(); // consome o ENTER pendente

        System.out.println("Por favor, digite o seu Nome!");
        NomeCliente = sc.nextLine(); // permite nome completo

        System.out.println("Por favor, digite o valor a ser depositado!");
        Saldo = sc.nextDouble();

        System.out.printf(
                "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %d, conta %s e seu saldo %.2f já está disponível para saque",
                NomeCliente, Agencia, Numero, Saldo);

        sc.close();
    }
}
