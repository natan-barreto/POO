public class Autor {
    String nome;
    Saga[] sagas;

    public Autor(String nome) {
        this.nome = nome;
        this.sagas = new Saga[10];
    }

    void listarSagas(){
        for(int i = 0; i < sagas.length; i++){
            if(sagas[i] != null) {
                sagas[i].listarLivros();
            }
        }
    }

    void adicionarSaga(Saga saga){
        for(int i = 0; i < sagas.length; i++){
            if(sagas[i] == null){
                sagas[i] = saga;
                break;
            }
        }
    }
}
