// Write a java program to find the first and last occurence of a character in a string using recursion
import java.util.*;
public class elementOccurence {
    public static void firstOccurence(String word,char letter,int idx){
        if(idx==word.length()){
            return;
        }
        if(word.charAt(idx)==letter){
            System.out.println ("First occurence of " + letter + " is at index " + idx);
            return;
        }
        firstOccurence(word,letter,idx+1);
    }
    public static void lastOccurence(String word,char letter,int idx){
        if(idx==word.length()){
            return;
        }
        if(word.charAt(idx)==letter){
            System.out.println ("Last occurence of " + letter + " is at index " + idx);
            return;
        }
        lastOccurence(word,letter,idx-1);
    }
    public static void main(String [ ] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a string:");
            String word = sc.nextLine();
            System.out.println("Enter a character to find its occurrence:");
            char letter = sc.nextLine().charAt(0);
            firstOccurence(word, letter, 0);
            lastOccurence(word,letter,word.length()-1);
        }
    }
}

