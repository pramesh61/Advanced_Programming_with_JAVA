
public class App{
    public static void main(String[] args) {
        // Create accounts
        SavingsAccount savings = new SavingsAccount("S123", 5000, 5); // 5% interest
        CheckingAccount checking = new CheckingAccount("C456", 2000, 1000); // overdraft 1000

        // Perform operations
        savings.deposit(1000);
        savings.withdraw(200);
        savings.addInterest();
        savings.displayBalance();

        checking.deposit(500);
        checking.withdraw(3000); // within overdraft
        checking.withdraw(100);  // exceeds overdraft
        checking.displayBalance();
    }
}
