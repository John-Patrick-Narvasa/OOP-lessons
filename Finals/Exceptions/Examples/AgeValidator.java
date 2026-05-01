package Finals.Exceptions.Examples;

// You can manually throw an exception using the throw keyword. 
// This is useful when you want to signal that an error condition has occurred.

// Syntax: throw new ExceptionType("Error message");

// Demonstrating THROWs for Exceptions
public class AgeValidator {
    public static void validateAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or above");
        } 
        System.out.println("Age is valid: " + age);
    }
    public static void main(String[] args) {
        try {
            validateAge(15); // This will throw an exception
            validateAge(20); // This will print a valid message
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
