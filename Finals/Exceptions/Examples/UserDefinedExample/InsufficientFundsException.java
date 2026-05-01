package Finals.Exceptions.Examples.UserDefinedExample;

// User defined exception
public class InsufficientFundsException extends Exception {
    private double amount;

    public InsufficientFundsException(double amount) {
        super("Insufficient funds. You need $" + amount + " more.");
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}
