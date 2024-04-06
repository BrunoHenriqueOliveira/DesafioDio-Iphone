public class Iphone implements AparelhoTelefonico, RepodutorMusicial, NavegadorDeInternet{
    public static void main(String[] args) throws Exception {
        System.out.println("Bem vindo ao Iphone");

        Iphone iphone10 = new Iphone();

        iphone10.atender();;
        iphone10.ligar();
        iphone10.iniciarCorreioVoz();

        iphone10.exibirPagina();
        iphone10.adicionarNovaAba();
        iphone10.atualizarPagina();

        iphone10.selecionarMusica();
        iphone10.tocar();
        iphone10.pausar();
  
    }
}
