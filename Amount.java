// write a program to print the amount of notes that the user inputs.
import java.util.*;
class Amount {
    public static void main(String[] args) {
        // Declare variables for note counts
        int n500 ;
        int n200 ;
        int  n50 ;
        int n20 ;
        int n10 ;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an amount: Rs");
        int amount = sc.nextInt(); // Use int for currency calculations

        // Calculate the number of 500 notes
        if (amount >= 500) {
            n500 = amount / 500;
            amount = amount % 500;
            System.out.println("Number of 500 notes: " + n500);
        }

        // Calculate the number of 200 notes
        if (amount >= 200) {
            n200 = amount / 200;
            amount = amount % 200;
            System.out.println("Number of 200 notes: " + n200);
        }

        // Calculate the number of 100 notes
        if (amount >= 100) {
            int n100 = amount / 100;
            amount = amount % 100;
            System.out.println("Number of 100 notes: " + n100);
        }

        // Calculate the number of 50 notes
        if (amount >= 50) {
            n50 = amount / 50;
            amount = amount % 50;
            System.out.println("Number of 50 notes: " + n50);
        }

        // Calculate the number of 20 notes
        if (amount >= 20) {
            n20 = amount / 20;
            amount = amount % 20;
            System.out.println("Number of 20 notes: " + n20);
        }

        // Calculate the number of 10 notes
        if (amount >= 10) {
            n10 = amount / 10;
            System.out.println("Number of 10 notes: " + n10);
        }

        sc.close();
    }
}
