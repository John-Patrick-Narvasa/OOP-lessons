package Finals.Exceptions.Examples;


public class PropagationExample {

    public static void method3() {
        int result = 10 / 0; // This will throw an ArithmeticException
    }

    public static void method2() {
        method3(); // Exception propagates to method2
    }

    public static void method1() {
        try {
            method2(); // Exception propagates to method1
        } catch (ArithmeticException e) {
            System.out.println("Caught in method1: " + e.getMessage());
        } finally {
            System.out.println("Finally block in method1");
        }
    }

    public static void main(String[] args) {
        method1();
        System.out.println("Program continues..."); //
    }
}
