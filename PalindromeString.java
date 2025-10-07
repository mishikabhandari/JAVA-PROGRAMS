// write a program to check whether a string is palindrome or not
import java.util.*;
public class PalindromeString{
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter a string:");
            String str = sc.nextLine();
            String rev="";
            String word=str.toLowerCase(); 
            for(int i=0;i<word.length();i++){
                char ch = word.charAt(i);
                rev = ch + rev;
            }
            if(word.equals(rev)){
                System.out.println("The string is a palindrome");
            }
            else  {
                System.out.println("The string is not a palindrome");
            }
        }
    }
}
