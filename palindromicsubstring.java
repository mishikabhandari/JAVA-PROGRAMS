// Write a java program to print the palindromic substring 
import java.util.*;
public class palindromicsubstring {
    public static void palindromicstring(String str){
        int n = str.length();
        for (int i = 0 ; i < n-1 ; i++){
            for ( int j = i +1 ; j < n; j++){
                String sub = str.substring(i,j+1);
                String rev = new StringBuilder(sub).reverse().toString();
                if (sub.equals(rev)){
                    System.out.println(sub);
                }

            }
        }

    }
    public static void main(String [] args){
        try (Scanner sc = new Scanner(System.in)) {
            String str = sc.nextLine();
            palindromicstring(str);
        }
    }
}