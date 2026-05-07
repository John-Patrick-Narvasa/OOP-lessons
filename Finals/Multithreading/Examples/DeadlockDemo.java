package Examples;

public class DeadlockDemo {
    private static Object lock1 = new Object();
    private static Object lock2 = new Object();

    public static void main(String[] args) {

        //DEADLOCK PROBLEM (PROGRAM KEEPS RUNNING
//        Thread t1 = new Thread(() -> {
//           synchronized(lock1) {
//               System.out.println("Thread 1: Holding lock1...");
//               try { Thread.sleep(100);} catch (Exception e) {}
//
//               System.out.println(("Thread 1: Waiting for lock2..."));
//
//               synchronized(lock2) {
//                   System.out.println("Thread 1: Holding lock1 & lock2");
//               }
//           }
//        });
//
//        Thread t2 = new Thread(() -> {
//            synchronized(lock2) {
//                System.out.println("Thread 2: Holding lock2...");
//                try { Thread.sleep(100);} catch (Exception e) {}
//
//                System.out.println(("Thread 2: Waiting for lock1..."));
//
//                synchronized(lock1) {
//                    System.out.println("Thread 2: Holding lock1 & lock2");
//                }
//            }
//        });


        // SOLUTION FOR DEADLOCK
        Thread t1 = new Thread(() -> {
            synchronized(lock1) {
                synchronized(lock2) {
                    System.out.println("Thread 1 executed");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized(lock1) {
                synchronized(lock2) {
                    System.out.println("Thread 2 executed");
                }
            }
        });

        t1.start();
        t2.start();
    }
}