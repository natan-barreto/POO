public class Ciclista extends Atleta implements Equipamento{

    @Override
    public void treinar(){
        System.out.println("Pedalando...");
    }

    @Override
    public void colocarEquipamento() {
        System.out.println("Vestindo roupa para pedalar...");

    }
}
