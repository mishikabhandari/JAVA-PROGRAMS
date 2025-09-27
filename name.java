// write a program to print hello with your name using function.
import java.util.*;
public class name {
    public static void printname(String name){
        System.out.println("HEY " + name + "!");
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name= sc.nextLine();
        printname(name);
        sc.close();
    }
}
