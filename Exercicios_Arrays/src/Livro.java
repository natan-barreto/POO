public class Livro {
    String titulo;
    int paginas;

    public Livro(String titulo, int paginas) {
        this.titulo = titulo;
        this.paginas = paginas;
    }

    void mostraInformacoes(){
        System.out.println("Titulo: " + this.titulo + "Paginas: "+ this.paginas);
    }
}
