public class SmartTv {

    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar() {
        ligada = true;
        System.out.println("Ligando a TV");
    }

    public void desligar() {
        ligada = false;
        System.out.println("Desligando a TV");
    }

    public void aumentarVolume() {
        // volume++ == volume + 1
        volume++;
        System.out.println("Aumentando o volume para: " + volume);
    }

    public void diminuirVolume() {
        // volume-- == volume - 1
        volume--;
        System.out.println("Diminuindo o volume para: " + volume);
    }

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
        System.out.println("Trocando o canal para: " + canal);
    }

    public void proximoCanal() {
        canal++;
        System.out.println("Trocando o canal para: " + canal);
    }

    public void anteriorCanal() {
        canal--;
        System.out.println("Trocando o canal para: " + canal);
    }
}
