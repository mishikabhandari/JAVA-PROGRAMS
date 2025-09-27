// This program calculates the sum of all odd numbers from 1 to a given number.
import java.util.*;
public class function_sum {
    public static int number(int num){
        int sum=0;
        for( int i =1;i<=num;i++){
            if (i%2 !=0) {
                sum=sum+i;
            }
            
        }
        return sum;
    }
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("enter  a number : ");
        int num=sc.nextInt();
        int sum=number(num);
        System.out.println("Sum = " + sum );

        sc.close();
    }
}
