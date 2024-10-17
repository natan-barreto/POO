public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();

        try {
            Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 50.0);
            inventario.adicionarLivro(livro1);
        } catch (ExcecaoLivroInvalido e) {
            System.out.println("Erro ao adicionar o livro: " + e.getMessage());
        }

        try {
            Livro livro2 = new Livro("Diário de um Banana", "Jeff Kinney", 30.0);
            inventario.adicionarLivro(livro2);
        } catch (ExcecaoLivroInvalido e) {
            System.out.println("Erro ao adicionar o livro: " + e.getMessage());
        }

        try {
            Livro livro3 = new Livro("Livro com Preço Negativo", "Autor Desconhecido", -15.0);
            inventario.adicionarLivro(livro3);
        } catch (ExcecaoLivroInvalido e) {
            System.out.println("Erro ao adicionar o livro: " + e.getMessage());
        }

        try {
            Livro livro4 = new Livro("Memórias Póstumas de Brás Cubas", "Machado de Assis", 20.0);
            inventario.adicionarLivro(livro4);
        } catch (ExcecaoLivroInvalido e) {
            System.out.println("Erro ao adicionar o livro: " + e.getMessage());
        }

        try {
            Livro livro5 = new Livro("", "Autor Desconhecido", 20.0);
            inventario.adicionarLivro(livro5);
        } catch (ExcecaoLivroInvalido e) {
            System.out.println("Erro ao adicionar o livro: " + e.getMessage());
        }

        inventario.exibirLivros();
    }
}