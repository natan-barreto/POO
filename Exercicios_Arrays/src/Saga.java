public class Saga {
    int nota;
    Livro[] livros;

    public Saga(int nota){
        this.nota = nota;
        this.livros = new Livro[10];
    }

    void listarLivros(){
        for(int i = 0; i < livros.length; i++){
            if(livros[i] != null) {
                livros[i].mostraInformacoes();
            }
        }
    }

    void adicionarLivro(Livro livro){
        for(int i = 0; i < livros.length; i++){
            if(livros[i] == null){
                livros[i] = livro;
                break;
            }
        }
    }
}
