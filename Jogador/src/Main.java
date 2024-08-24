public class Main {

    public static void main(String[] args) {

        Arma espada = new Arma();
        Jogador jogador1 = new Jogador();
        Jogador jogador2 = new Jogador();

        espada.Arma(20,35, "Espada");

        jogador1.Jogador(espada, 50, 100);
        jogador2.Jogador(espada, 100, 50);

        System.out.println("Jogador 1: " + jogador1);
        System.out.println("Jogador 2: " + jogador2);

        jogador1.atacar(jogador2);

        System.out.println("Jogador 1 após o ataque: " + jogador1);
        System.out.println("Jogador 2 após o ataque: " + jogador2);
    }
}