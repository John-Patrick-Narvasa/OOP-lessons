package Examples;

class SharedResource {
    private int data;
    private boolean hasData = false;

    public synchronized void produce(int value) {
        while (hasData) {
            try {
                wait();
            } catch (InterruptedException e) {}
        }
        data = value;
        hasData = true;
        System.out.println("Produced: " + value);
        notify();
    }

    public synchronized  int consume() {
        while (!hasData) {
            try {
                wait();
            } catch (InterruptedException e) {}
        }
        hasData = false;
        System.out.println("Consumed: " + data);
        notify();
        return  data;
    }
}

public class ProducerConsumerDemo {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        Thread producer = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                resource.produce(i);
                try{ Thread.sleep(1000); } catch (Exception e) {}
            }
        });

        Thread consumer = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                resource.consume();
                try{ Thread.sleep(1500); } catch (Exception e) {}
            }
        });

        producer.start();
        consumer.start();
    }
}