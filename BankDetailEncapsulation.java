 //Write a Java program to demonstrate encapsulation by creating a class BankDetailEncapsulation with private fields for account number and balance.
 //Provide public getter and setter methods for these fields.
//Implement methods to deposit and withdraw money, ensuring that deposits are positive and withdrawals do not exceed the current balance.
//In the main method, prompt the user to enter account details, perform a deposit and a withdrawal, and display the updated balance after each operation.

import java.util.*;

public class BankDetailEncapsulation {
    private String accountNumber;
    private Double balance;

    BankDetailEncapsulation(String accountNumber, Double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void setaccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getaccountNumber() {
        return accountNumber;
    }

    public void setbalance(Double balance) {
        this.balance = balance;
    }

    public Double getbalance() {
        return balance;
    }

    public void deposit(Double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(Double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter account number: ");
            String accNum = sc.nextLine();
            System.out.print("Enter initial balance: ");
            Double bal = sc.nextDouble();
            BankDetailEncapsulation bankDetail = new BankDetailEncapsulation(accNum, bal);
            System.out.println("Account Number: " + bankDetail.getaccountNumber());
            System.out.println("balance: " + bankDetail.getbalance());
            System.out.println("Enter your deposit amount: ");
            bankDetail.deposit(sc.nextDouble());
            System.out.println("balance after deposit: " + bankDetail.getbalance());
            System.out.println("Enter your withdrawal amount: ");
            bankDetail.withdraw(sc.nextDouble());
            System.out.println("balance after withdrawal: " + bankDetail.getbalance());
        }
    }
}