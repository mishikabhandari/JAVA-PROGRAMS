import java.util.*;
public class powerBit {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter a number:");
            int n = sc.nextInt();
            if(n>0 && (n & (n - 1)) == 0) // the condition (n & (n-1))  esliye use hua hai kyuki n and n -1 sirf 0 
            // ke liye hi true hoga, aur 1 ke liye false hoga
            {
                System.out.println("The number is a power of 2");
            } else {
                System.out.println("The number is not a power of 2");
            }

        }
        
    }
}
