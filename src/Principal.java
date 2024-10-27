public class Principal {
    public static void main(String[] args) {
        BuracoRedondo buraco = new BuracoRedondo(6);

        PinoRedondo pinoRedondo = new PinoRedondoConcreto(5);
        System.out.println(buraco.encaixa(pinoRedondo));

        PinoQuadrado pinoQuadrado = new PinoQuadrado(7);
        AdaptadorPinoQuadrado adaptador = new AdaptadorPinoQuadrado(pinoQuadrado);

        System.out.println(buraco.encaixa(adaptador));
    }
}
