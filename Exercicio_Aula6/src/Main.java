public class Main {
    public static void main(String[] args) {
        Produto[] produtos = new Produto[2];

        produtos[0] = new Notebook("Notebook", 2000.00, 128, "NVIDIA", "i7");
        produtos[1] = new Camiseta("Camiseta Slim", 60.00, "Rosa", "M");

        for (Produto produto : produtos) {
            System.out.println(produto.etiquetaPreco());
            System.out.println("-------------------");
        }
    }
}