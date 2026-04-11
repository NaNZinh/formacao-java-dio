public class Interrupcao {
    public static void main(String[] args) {

        // Break significa quebrar, parar, frear, interromper. E é isso que se faz
        // quando o Java encontra esse comando pela frente. Continue, como o nome diz,
        // ele 'continua' o laço. O comando break interrompe o laço, já o continue
        // interrompe somente a iteração atual.

        for (int numero = 1; numero <= 5; numero++) {
            if (numero == 3)
                break; // teste com o break ou continue

            System.out.println(numero);
        }
    }
}
