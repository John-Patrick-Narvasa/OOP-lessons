package Examples;

class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread: " + i);
            try {
                Thread.sleep(500); // sleep for
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


public class ThreadExample1 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();

        for (int i = 1; i <= 5; i++) {
            System.out.println("Main: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
