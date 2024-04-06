public interface AparelhoTelefonico {
    public default void ligar() {
        System.out.println("ligando para alguem!");
    }

    public default void atender() {
        System.out.println("atender alguem!");
    }

    public default void iniciarCorreioVoz() {
        System.out.println("inciando correio de voz!!!");
    }
}
