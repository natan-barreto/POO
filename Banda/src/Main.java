public class Main {
    public static void main(String[] args) {

        Banda banda1 = new Banda();
        Musica evidencias = new Musica();
        Musica galopeira = new Musica();

        banda1.adicionarMusica(evidencias);
        banda1.adicionarMusica(galopeira);
        banda1.Banda("Chitaozinho e Xororo", 2);
        evidencias.setNome("Evidencias");
        evidencias.setAlbum("Chitaozinho e Xororo");
        galopeira.setNome("Galopeira");
        galopeira.setAlbum("Chitaozinho e Xororo");

        banda1.tocarShow();

        banda1.deletarMusica("Evidencias");

        banda1.tocarMusica(2);
    }
}