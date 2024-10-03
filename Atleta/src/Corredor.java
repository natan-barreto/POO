public class Corredor extends Atleta implements Equipamento{

    @Override
    public void treinar(){
        System.out.println("Correndo...");
    }

    @Override
    public void colocarEquipamento() {
        System.out.println("Vestindo Roupa de Corrida...");

    }
}
