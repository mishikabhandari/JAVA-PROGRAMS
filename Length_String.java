// program to find the cumulative length of the array of strings.
import java.util.*;
public class Length_String {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
        System.out.println("Enter the size of an array of strings: ");
        int size=sc.nextInt();
        System.out.println("Enter the strings: ");
        String [] str=new String[size];
        for(int i=0;i<size;i++){
            str[i]=sc.next();
        }
        int tolength=0;
        for(int i=0;i<size;i++){
            tolength+=str[i].length();
        }
        System.out.println("The cumulative length of the array of strings is: "+tolength);
    }
    }
}

