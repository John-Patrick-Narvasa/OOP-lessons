package Finals.Exceptions.Examples.CustomUncheckedExceptionExample;

public class VoterRegistration {
    public static void registerVoter(String name, int age) {
        if (age < 18) {
            throw new InvalidAgeException("Must be 18+ to vote. Age: " + age);
        }
        System.out.println(name + " registered successfully!");
    }
    
    public static void main(String[] args) {
        try {
            registerVoter("John", 16); 
        } catch (InvalidAgeException e) {
            System.out.println("Registration failed: " + e.getMessage());
        }
    }
}
