// Write a java function to print the average of three numbers.
import java.util.*;
public class average_Function {
    public static int numbers( int a, int b, int c){
        int average = (a + b + c) / 3;
        return average;
    }
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter three numbers: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int average=numbers(a,b,c);
        System.out.println("average = " + average);
        sc.close();
    }
}
