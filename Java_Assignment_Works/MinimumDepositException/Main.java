import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            BankAccount account = new BankAccount(1000.0); // Set initial balance, e.g., 1000.0
            
            System.out.println("Welcome to Nabil Bank Ltd.!");
            System.out.println("Please enter the required amount to withdraw: ");
            double amount = scanner.nextDouble();
            
            try {
                account.withdraw(amount);
            } catch (CustomException e) {
                System.out.println("Error: "+ e.getMessage());
                System.out.println("Thank you for banking with us, Namaste!");
            } 
            
        }
    }
}

                 
               