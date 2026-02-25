
public class CheckingAccount extends BankAccount {
    private final double overdraftLimit;

    public CheckingAccount(String accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited to Checking Account.");
    }

    @Override
    public void withdraw(double amount) {
        if(amount <= balance + overdraftLimit) {
            balance -= amount;
            System.out.println(amount + " withdrawn from Checking Account.");
        } else {
            System.out.println("Exceeds overdraft limit in Checking Account.");
        }
    }

    @Override
    public void displayBalance() {
        System.out.println("Checking Account " + accountNumber + " Balance: " + balance);
    }
}
