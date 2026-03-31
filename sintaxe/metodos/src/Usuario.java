public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada: " + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status -> TV ligada: " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo status -> TV ligada: " + smartTv.ligada);

        smartTv.aumentarVolume();
        System.out.println("Volume Atual: " + smartTv.volume);

        smartTv.diminuirVolume();
        System.out.println("Volume Atual: " + smartTv.volume);

        smartTv.proximoCanal();
        System.out.println("Canal Atual: " + smartTv.canal);

        smartTv.anteriorCanal();
        System.out.println("Canal Atual: " + smartTv.canal);

        smartTv.mudarCanal(25);
        System.out.println("Canal Atual: " + smartTv.canal);
    }
}
