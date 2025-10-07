// This program replaces all occurrences of a specified character in a string with another character.
import java.util.*;
public class ReplaceCharacter {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){ // try with  scanner is used for resource management and to avoid memory leaks
        System.out.println("Enter a string : ");
        String str=sc.nextLine();
        System.out.println("Enter the character to be replaced : ");
        char replaced = sc.next().charAt(0); //charAT(0) returns the first character of the string
        System.out.println("Enter the character to replace with : ");
        char replaceWith = sc.next().charAt(0);
        String replacedStr = str.replace(replaced, replaceWith);//replacedStr is the new string with the replaced character
        System.out.println("Resulting string: " + replacedStr);
        }
    }
}

