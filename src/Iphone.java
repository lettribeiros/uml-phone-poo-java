import interfaces.AparelhoTelefonico;
import interfaces.NavegadorInternet;
import interfaces.ReprodutorMusical;


public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    @Override
    public void ligar(String numero) {
        System.out.println("LIGANDO PELO IPHONE PARA " + numero);
    }

    @Override
    public void atender() {
        System.out.println("ATENDENDO CHAMADA PELO IPHONE");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("INICIANDO CORREIO DE VOZ PELO IPHONE");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("EXIBINDO PÁGINA " + url + " PELO NAVEGADOR DO IPHONE");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("ADICIONANDO NOVA ABA PELO NAVEGADOR DO IPHONE");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("ATUALIZANDO PÁGINA DO NAVEGADOR DO IPHONE");
    }

    @Override
    public void tocar() {
        System.out.println("TOCANDO MÚSICA PELO IPHONE");
    }

    @Override
    public void pausar() {
        System.out.println("PAUSANDO MÚSICA PELO IPHONE");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("ESCOLHENDO A MÚSICA " + musica + " PELO IPHONE");
    }

}
