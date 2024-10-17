import java.util.ArrayList;

public class Inventario {
    private ArrayList<Livro> Livros = new ArrayList<Livro>();

    public void adicionarLivro(Livro livro) throws ExcecaoLivroInvalido {
        if (livro.getTitulo().isEmpty()) {
            throw new ExcecaoLivroInvalido("O título do livro não pode ser vazio.");
        }
        if (livro.getPreco() < 0) {
            throw new ExcecaoLivroInvalido("O preço do livro não pode ser negativo.");
        }
        Livros.add(livro);
    }

    public void exibirLivros() {
        for (Livro livro : Livros) {
            System.out.println("Título: " + livro.getTitulo() + ", Autor: " + livro.getAutor() + ", Preço: " + livro.getPreco());
        }
    }


}
