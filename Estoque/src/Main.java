public class Main {
    public static void main(String[] args) {

        Estoque estoque = new Estoque();

        Item itemA = new Item(10, "A");
        Item itemB = new Item(30, "B");
        Item itemC = new Item(20, "C");
        Item itemD = new Item(50, "D");

        estoque.adicionarArray(itemA);
        estoque.adicionarArray(itemB);
        estoque.adicionarArray(itemC);
        estoque.adicionarArray(itemD);

        System.out.println("Itens antes da ordenação:");
        estoque.mostrarItens();

        estoque.ordenar();

        System.out.println("\nItens após a ordenação:");
        estoque.mostrarItens();

    }
}