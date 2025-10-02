// Write a program to take  an array of  fruits as input from the user  and print them.
import java.util.*;
public class Array_Name {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int size = sc.nextInt();
        System.out.println("Enter the names of fruits : ");
        String [] fruits = new String[size];
        for (int i=0;i<size;i++){
            fruits[i]=sc.next();
        }
        System.out.println("The names of fruits are : " );
        for (int i=0;i<size;i++){
            System.out.println(fruits[i]);
        }
        sc.close();
    }
}
