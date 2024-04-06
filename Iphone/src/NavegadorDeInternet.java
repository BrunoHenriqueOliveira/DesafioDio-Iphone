public interface NavegadorDeInternet {

    public default void exibirPagina() {
        System.out.println("mostrar pagina web");
    }

    public default void adicionarNovaAba() {
        System.out.println("abrindo nova aba no navegador");
    }

    public default void atualizarPagina() {
        System.out.println("atualizando a pagina do navegador");
    }
}