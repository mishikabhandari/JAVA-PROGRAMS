// Program to find the last index of each character in a string
import java.util.*;
public class indexOf {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
        System.out.println("Enter the sentence: ");
        String sentence = sc.nextLine();
        for (char ch = 'a'; ch <= 'z'; ch++) {
            System.out.println(ch + ": " + sentence.lastIndexOf(ch)); /* last index of -last occurence batata hai 
            ki last time character kaha pe tha  eg- banana  lastIndexOf= 5 */
        }
    }
}
}
