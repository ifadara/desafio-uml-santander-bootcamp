import celular.Iphone;

public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        iphone.ligar(123456789);
        iphone.atender();
        iphone.inciarVoiceMail();

        iphone.adicionarNovaAba();
        iphone.exibirPagina();
        iphone.atualizarPagina();

        iphone.selecionarMusica("Sandrão RZO", "Lado negro da força");
        iphone.tocar();
        iphone.pausar();

    }
}