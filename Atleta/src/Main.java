public class Main {
    public static void main(String[] args) {

        Nadador nadador = new Nadador();
        Corredor corredor = new Corredor();
        Ciclista ciclista = new Ciclista();


        nadador.treinar();
        System.out.println(" ");

        corredor.colocarEquipamento();
        corredor.treinar();
        System.out.println(" ");

        ciclista.colocarEquipamento();
        ciclista.treinar();
    }
}
