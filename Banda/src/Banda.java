public class Banda {
    private Musica[] musicas;
    private String nome;
    private int numeroDeIntegrantes;


    public Banda() {
        musicas = new Musica[5];
        musicas[0] = new Musica();
    }

    public void tocarMusica(int posicao){
        System.out.println("Musica: " +musicas[posicao].getNome()
                          +" Album: " +musicas[posicao].getAlbum());
    }
    public void tocarShow(){
        for(int i = 0; i < musicas.length; i++){
            System.out.println("Musica na posição " + i + ": " +musicas[i].getNome()
                              +" Album na posição " + i + ": " +musicas[i].getAlbum());
        }
    }
    public boolean adicionarMusica(Musica musica){
        for(int i = 0; i < musicas.length; i++){
            if(musicas[i] == null){
                musicas[i] = musica;
                break;
            }
        }
        return true;
    }
    public boolean deletarMusica(String nome){
        for (int i = 0; i < musicas.length; i++) {
            if (musicas[i] != null && musicas[i].getNome().equals(nome)) {
                musicas[i] = null;
                return true;
            }
        }
        return false;
    }

    public void Banda(String nome, int numeroDeIntegrantes){
        this.nome = nome;
        this.numeroDeIntegrantes = numeroDeIntegrantes;
    }
}
