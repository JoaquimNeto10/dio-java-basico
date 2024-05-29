package DesafioCriarIphone.src;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    public static void main(String[] args) {

        Iphone iphone = new Iphone();

        System.out.println("Reprodutor Musical");
        iphone.tocarMusica();
        iphone.pausarMusica();
        iphone.pularMusica();
        System.out.println();

        System.out.println("Aparelho Telefonico");
        iphone.discar();
        iphone.atender();
        iphone.rejeitarLigacao();
        System.out.println();

        System.out.println("Navegador de Internet");
        iphone.mostrarPagina();
        iphone.atualizarPagina();
        iphone.avancarPagina();
        iphone.voltarPagina();
        
    }

    @Override
    public void pausarMusica() {
        System.out.println("Pausando a musica");
        
    }

    @Override
    public void pularMusica() {
        System.out.println("Pulando a musica");
        
    }

    @Override
    public void tocarMusica() {
        System.out.println("Tocando a musica");
        
    }

    @Override
    public void atender() {
        System.out.println("Atendendo o telefone");
    }

    @Override
    public void discar() {
        System.out.println("Discando");
        
    }

    @Override
    public void rejeitarLigacao() {
        System.out.println("Rejeitando Ligacao");
        
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a pagina");
        
    }

    @Override
    public void avancarPagina() {
        System.out.println("Voltar para pagina anterior");
        
    }

    @Override
    public void mostrarPagina() {
        System.out.println("Exibindo a pagina");
        
    }

    @Override
    public void voltarPagina() {
        System.out.println("Voltando para pagina anterior");
        
    }    
}
