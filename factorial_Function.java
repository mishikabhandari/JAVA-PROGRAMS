// Factorial of a number using function in java
import java.util.*;
public class factorial_Function {
    public static int fac(int n){
        int fac=1;
        for(int i=1;i<=n;i++){
            fac=fac*i;
        }
        return fac;

    }
    public static void main (String [] args){
        try(Scanner sc= new Scanner(System.in)){
        System.out.print("enter a number: ");
        int n=sc.nextInt();
        int fac=fac(n);
        System.out.println(fac);
        }
    }
}
