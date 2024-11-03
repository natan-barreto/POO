public class Main {
    public static void main(String[] args) {


        Thread thread1 = new Thread(new UmADez());
        Thread thread2 = new Thread(new DoisASeis());
        Thread thread3 = new Thread(new UmACinco());


        thread1.start();
        thread2.start();
        thread3.start();

    }
}