import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.print("Nome do Aluno: ");
        aluno.nome = entrada.nextLine();

        System.out.print("Matricula do Aluno: ");
        aluno.matricula = entrada.nextInt();

        System.out.print("Periodo do Aluno: ");
        aluno.periodo = entrada.nextInt();

        System.out.print("NP1: ");
        aluno.np1 = entrada.nextInt();

        System.out.print("NP2: ");
        aluno.np2 = entrada.nextInt();

        int media = aluno.calculaMedia();
        System.out.println("Media: " + media);

        if (media < 60 && media >= 30) {
            int np3 = aluno.calculaNP3();
            System.out.println("Nota necessária na NP3: " + np3);
        }

        System.out.println(aluno);
    }
}