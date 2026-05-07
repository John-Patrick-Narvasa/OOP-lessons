package Examples;

class Task implements Runnable {
    private String name;

    public Task(String name) {
        this.name = name;
    }

    public void run() {
        System.out.println(name + " started");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {

        }
        System.out.println(name + " finished");
    }
}

public class JoinExample {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Task ("Task-1"));
        Thread t2 = new Thread(new Task("Task-2"));

        t1.start();

        try {
            t1.join();
        } catch (InterruptedException e) {

        }

        t2.start();
        System.out.println("Main thread continues");
    }
}
