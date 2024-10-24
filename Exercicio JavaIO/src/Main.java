

public class Main {
    public static void main(String[] args) {
        Jogo fifa23 = new Jogo(23, "FIFA", 150);

        Arquivo arquivo = new Arquivo();

        fifa23.mostrarInfos();

        arquivo.escrever(fifa23);

        arquivo.lerJogos();

        arquivo.lerJogo(150);

    }
}