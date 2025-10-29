// Problem Statement: Write a Java program that verifies if an email ID is valid based on the following criteria:
import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class emailVerification {
    public static void main(String [] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter an email ID to verify: ");
            String email = sc.nextLine();
            Pattern pattern = Pattern.compile(email,Pattern.CASE_INSENSITIVE);
            String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
            Matcher matcher = pattern.matcher(emailRegex);
            if(matcher.matches()){
                System.out.println("The email ID is valid.");
            } else {
                System.out.println("The email ID is invalid.");
            }
        }
    }
}
