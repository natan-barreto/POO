public class DoisASeis implements Runnable{
    @Override
    public void run() {
        for (int i = 2; i <= 6; i++) {
            System.out.println("Thread 2: " + i);
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
