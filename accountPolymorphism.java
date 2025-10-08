/* Problem Statement:
You are building a banking system with a base class AccountPolymorphism and a subclass SavingsAccount.
- Account has a method deposit(double amount) that prints the deposited amount.
- SavingsAccount overrides deposit(double amount) to add interest and prints the new balance.
- Additionally, SavingsAccount overloads deposit() to accept both double amount and String currency.
Tasks:
- Implement both classes with proper method overriding and overloading.
- In the main() method, create an Account reference pointing to a SavingsAccount object and call deposit() in different ways.
- Explain the output and how polymorphism is working here.
*/

import java.util.*;
public class accountPolymorphism {
    public void deposit(double amount) {
        System.out.println("Deposited amount: " + amount);
    }

    // Overloaded method 
    public void deposit(double amount, String currency) {
        System.out.println("Deposited amount: " + amount + " " + currency);
    }

    static class SavingsAccount extends accountPolymorphism {
        double balance = 0.0;

        // Overriding deposit(double amount)
        @Override
        public void deposit(double amount) {
            // Default interest for demonstration
            double interest = 0.05;
            balance = balance + amount + amount * interest;
            System.out.println("Deposited amount with interest: " + balance);
        }

        // Overloaded deposit(double amount, double interest)
        public void deposit(double amount, double interest) {
            balance = balance + amount + amount * interest;
            System.out.println("Deposited amount with custom interest: " + balance);
        }

        // Overloaded deposit(double amount, String currency)
        @Override
        public void deposit(double amount, String currency) {
            double interest = 0.05;
            balance = balance + amount + amount * interest;
            System.out.println("Deposited amount with interest in " + currency + ": " + balance);
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the amount to deposit:");
            double amount = sc.nextDouble();
            sc.nextLine();
            
            System.out.println("Enter the currency type:");
            String currency = sc.nextLine();

            accountPolymorphism acc = new SavingsAccount();
            acc.deposit(amount); // Calls overridden method in SavingsAccount
            acc.deposit(amount, currency); // Calls overridden method in SavingsAccount
        }
    }
}