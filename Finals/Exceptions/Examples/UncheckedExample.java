package Finals.Exceptions.Examples;

public class UncheckedExample {
    public static void main(String[] args) {
        try {
            int [] numbers = {1, 2, 3};

            System.out.println(numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index error: " + e.getMessage());
        }

        try {
            String text = null;
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Null pointer error: " + e.getMessage());
        }
    }
}
