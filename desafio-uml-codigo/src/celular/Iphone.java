package celular;

import navegador.Navegador;
import reprodutor.Reprodutor;
import telefone.Telefone;

public class Iphone implements Reprodutor, Navegador, Telefone {
    @Override
    public void exibirPagina() {
        System.out.println("google.com");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("about blank");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Refresh");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando musica");
    }

    @Override
    public void pausar() {
        System.out.println("Musica pausada");
    }

    @Override
    public void selecionarMusica(String artista, String musica) {
        System.out.println("Tocando musica " + musica + " do artista " + artista);
    }

    @Override
    public void ligar(Integer numero) {
        System.out.println("Ligando para o numero " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo Ligação");
    }

    @Override
    public void inciarVoiceMail() {
        System.out.println("Deixando Recado");
    }
}
