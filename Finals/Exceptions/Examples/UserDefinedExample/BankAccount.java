package Finals.Exceptions.Examples.UserDefinedExample;

public class BankAccount {
    private double balance;

    public BankAccount (double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            double shortage = amount - balance;
            throw new InsufficientFundsException(shortage);
        }
        balance -= amount;
        System.out.println("Withdrew: $" + amount);
        System.out.println("Remaining balance: $" + balance);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount(500.00);

        try {
            account.withdraw(600.00); // This will throw an InsufficientFundsException
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
            System.out.println("Shortage: $" + e.getAmount());
        }
    }
}
