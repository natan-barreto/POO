public class Main {
    public static void main(String[] args) {

        Autor autor1 = new Autor("Autor 1");
        Autor autor2 = new Autor("Autor 2");

        Saga saga1 = new Saga(5);
        Saga saga2 = new Saga(8);

        Livro livro1 = new Livro("Livro 1 ", 200);
        Livro livro2 = new Livro("Livro 2 ", 300);

        saga1.adicionarLivro(livro1);
        saga2.adicionarLivro(livro2);

        autor1.adicionarSaga(saga1);
        autor2.adicionarSaga(saga2);

        autor1.listarSagas();
        autor2.listarSagas();
    }
}








