// Write a java function to print the sum of two numbers.
import java.util.*;
public class sum_Function_two_numbers {
    public static int add(int a, int b){
        return a + b;
    }
    
    public static void main(String [] args){
        try(Scanner sc= new Scanner(System.in)){
            System.out.println("enter 1st number: ");
            int a = sc.nextInt();
            System.out.println("enter the 2nd number: ");
            int b = sc.nextInt();
            int sum=add(a,b);
            System.out.println("Sum of " + a + " and " + b + " = " + sum);
        }
    }
}
