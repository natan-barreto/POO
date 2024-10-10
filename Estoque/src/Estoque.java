import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Estoque {
    private ArrayList<Item> itensArray = new ArrayList<>();

    public void adicionarArray(Item item) {
        itensArray.add(item);
    }

    public void buscar(int posicao){
        if(posicao >= 0 && posicao < itensArray.size()){
            itensArray.set(posicao, itensArray.get(posicao));
        }
    }

    public void deletar(int posicao){
        if(posicao >= 0 && posicao < itensArray.size()){
            itensArray.remove(posicao);
        }
    }

    public void deletar(Item item){
        itensArray.remove(item);
    }

    public void modificar(Item item, int posicao){
        if(posicao >= 0 && posicao < itensArray.size()){
            itensArray.set(posicao, item);
        }
    }

    public void mostrarItens() {
        for (Item item : itensArray) {
            System.out.println(item);
        }
    }

    public void ordenar() {
        Collections.sort(itensArray, new Comparator<Item>() {
            @Override
            public int compare (Item item1, Item item2){
                return Integer.compare(item2.getValor(), item1.getValor());
            }
        });
    }

}
