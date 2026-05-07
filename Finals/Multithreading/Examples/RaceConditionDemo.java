package Examples;

class Counter {
    private int count = 0;

    public void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

class SynchronizedCounter {
    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public synchronized int getCount() {
        return count;
    }
}

public class RaceConditionDemo {
    public static void main(String[] args) throws InterruptedException {
//        Counter counter = new Counter();
        SynchronizedCounter syncCounter = new SynchronizedCounter();

        Thread t1 = new Thread(() -> {
           for (int i = 0; i <1000; i++) {
//               counter.increment();
               syncCounter.increment();
           }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i <1000; i++) {
//                counter.increment();
                syncCounter.increment();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

//        System.out.println("Final count: " + counter.getCount());
        System.out.println("Final count: " + syncCounter.getCount());
        System.out.println("Expected: 2000");

    }
}
