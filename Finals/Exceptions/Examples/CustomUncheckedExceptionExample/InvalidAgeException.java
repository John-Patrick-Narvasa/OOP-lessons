package Finals.Exceptions.Examples.CustomUncheckedExceptionExample;

public class InvalidAgeException extends RuntimeException {
    public InvalidAgeException(String message) {
        super(message);
    }
}
