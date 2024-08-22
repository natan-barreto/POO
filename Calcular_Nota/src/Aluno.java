public class Aluno {
    int matricula;
    int np1;
    int np2;
    int periodo;
    String nome;

   public int calculaMedia(){
        int media;
        media = (this.np1 + this.np2) / 2;
        return media;
    }


   public int calculaNP3(){
        int media = this.calculaMedia();
        int np3;
        np3 = 100 - media;

        return np3;
    }

    @Override
    public String toString(){
        return "Nome do Aluno: " + this.nome + "\n" +
                "Matricula do Aluno: " + this.matricula + "\n" +
                "Periodo do Aluno: " + this.periodo + "\n" +
                "Media: " + calculaMedia();
    }
}
