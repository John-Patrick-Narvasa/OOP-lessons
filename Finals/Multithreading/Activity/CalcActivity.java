package Activity;
import java.math.BigInteger;


public class CalcActivity {
    static class SumThread extends Thread {
        public SumThread() {
            super("Thread-Sum");
        }
        @Override
        public void run() {
            System.out.println(getName() + " started");
            long sum = 0;
            for (int i = 1; i <= 1000; i++) {
                sum += i;
            }
            System.out.println(getName() + " finished: " + sum);
        }
    }
    static class SquaresThread extends Thread {
        public SquaresThread() {
            super("Thread-Squares");
        }
        @Override
        public void run() {
            System.out.println(getName() + " started");
            long sumOfSquares = 0;
            for (int i = 1; i <= 100; i++) {
                sumOfSquares += (long) i * i;
            }
            System.out.println(getName() + " finished: " + sumOfSquares);
        }
    }
    static class FactorialThread extends Thread {
        public FactorialThread() {
            super("Thread-Factorial");
        }
        @Override
        public void run() {
            System.out.println(getName() + " started");
            BigInteger factorial = BigInteger.ONE;


            for (int i = 2; i <= 10; i++) {
                factorial = factorial.multiply(BigInteger.valueOf(i));
            }
            System.out.println(getName() + " finished: " + factorial);
        }
    }
    static class PrimesThread extends Thread {
        public PrimesThread() {
            super("Thread-Primes");
        }
        private boolean isPrime(int n) {
            if (n < 2) return false;
            if (n == 2) return true;
            if (n % 2 == 0) return false;
            for (int i = 3; i <= Math.sqrt(n); i += 2) {
                if (n % i == 0) return false;
            }
            return true;
        }
        @Override
        public void run() {
            System.out.println(getName() + " started");
            int count = 0;
            for (int i = 1; i <= 100; i++) {
                if (isPrime(i)) count++;
            }
            System.out.println(getName() + " finished: " + count + " primes found");
        }
    }
    public static void main(String[] args) {
        Thread sumThread = new SumThread();
        Thread squaresThread = new SquaresThread();
        Thread factorialThread = new FactorialThread();
        Thread primesThread = new PrimesThread();
        long startTime = System.currentTimeMillis();
        sumThread.start();
        squaresThread.start();
        factorialThread.start();
        primesThread.start();
        try {
            sumThread.join();
            squaresThread.join();
            factorialThread.join();
            primesThread.join();
        } catch (InterruptedException e) {
            System.err.println("A thread was interrupted: " + e.getMessage());
            Thread.currentThread().interrupt();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Total execution time: " + (endTime - startTime) + "ms");
    }

}

