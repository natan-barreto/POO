public class Jogador {
    Arma arma;
    int energia;
    int vida;


    void atacar(Jogador alvo) {
        if (this.energia >= arma.custoDeEnergia) {
            alvo.vida -= arma.dano;
            this.energia -= arma.custoDeEnergia;
            System.out.println("Ataque realizado! Vida do alvo: " + alvo.vida + ", Energia do atacante: " + this.energia);
        } else {
            System.out.println("Energia insuficiente para realizar o ataque.");
        }
    }
    void Jogador(){}

    void Jogador(Arma arma, int energia, int vida){
        this.arma = arma;
        this.energia = energia;
        this.vida = vida;
    }

    @Override
    public String toString() {
        return "Vida: " + vida + ", " +
                "Energia: " + energia + ", " +
                "Arma: " + arma.nome;
    }
}
