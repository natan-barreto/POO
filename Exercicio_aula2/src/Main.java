public class Main {
    public static int calculaFatorial(int n) {
        if (n == 0 || n == 1){
            return 1;
        }
        else{
            return  n * calculaFatorial(n-1);
        }
    }

    public static void mostraPares(int n) {
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(calculaFatorial(5));
        mostraPares(10);
    }
}