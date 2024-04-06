public interface RepodutorMusicial {

    public default void selecionarMusica(){
        System.out.println("selecionando uma musica!!!");
    }

    public default void tocar() {
        System.out.println("tocando uma musica!!");
    }

    public default void pausar() {
        System.out.println("pausando a musica!!");
    }
}
