// print the fibbonacci series
import java.util.*;
public class fibbonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms in the Fibonacci series: ");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int c;
        System.out.print("Fibonacci Series: " + a + " " + b);
        for (int i = 2; i < n; i++) {
            c = a + b;
            System.out.print(" \n "+ c);
            a = b;
            b = c;
        }
        sc.close();
    }
}