// This program converts a decimal number to binary. with the help of string builder .
// It reads a decimal number from the user, converts it to binary, and prints the result.
import java.util.*;
public class DecimalBinary {
    public static void main(String... args){
        try (Scanner sc = new Scanner (System.in)) {
            System.out.print("Enter a decimal number: ");
            int decimal = sc.nextInt();
            if (decimal ==0){
                System.out.println("0");
                return;
            }
            StringBuilder binary = new StringBuilder ();
            while (decimal > 0 ){
                binary.append(decimal % 2 );
                decimal = decimal/2;
            }
            System.out.println("Binary: " + binary.reverse());

        }
    }
}