// Write a java function to print the product of two numbers.
import java.util.*;
public class product_Function {
   public static int multiply ( int a, int b){
    return a * b;
   } 
   public static void main(String [] args){
    try(Scanner sc = new Scanner(System.in)) {
    System.out.print("enter the first number: ");
    int  a=sc.nextInt();
    System.out.print("Enter the 2nd number: ");
    int b=sc.nextInt();
    int product=multiply(a,b);
    System.out.println("product of " + a + " and " + b + " =" + product);
    }
   }
}
