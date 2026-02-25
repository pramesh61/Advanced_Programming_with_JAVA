public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
    System.out.println("Dear Customer, your account has been debited by NPR"  +  amount);
    System.out.println("Dear Customer, your current account balance is NPR"  +  balance);
}

public void withdraw(double amount) throws CustomException {
    if (balance - amount < 10) {
        throw new CustomException("Cannot Withdraw"  + amount +  ".Minimum balance NPR 10 required.");
    }
    balance -= amount;
    System.out.println("Dear Customer Your Account has been withdrawn by NPR"  +  amount);
    System.out.println("Dear Customer Your Current Balance in a account is NPR"  +  balance);
}

    public double getBalance() {
        return balance;
    }
}
