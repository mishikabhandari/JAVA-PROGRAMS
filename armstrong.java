import java.util.*;
public class armstrong {
    public static void main(String []  args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        int temp=n;
        int sum = 0;
        while(n>0){
            int d = n % 10;
            sum =(d*d*d)+sum;
            n = n / 10;

        }
        if (temp==sum){
            System.out.println("Armstrong number");
        }
        else{
            System.out.println("Not an Armstrong number");
        }
        sc.close();
    }
}
