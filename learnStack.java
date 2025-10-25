
// Implement a Java program using the Stack class to check whether
//a given string containing multiple types of brackets — (), {}, and [] —
//is balanced. The program should correctly identify nested and interleaved
//brackets. Additionally, explain how the stack operations push(), pop(), and peek() 
//contribute to validating the balance of brackets.
import java.util.*;
import java.util.Stack;

public class learnStack {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a string containing brackets: ");
            String input = sc.nextLine();
            Stack<Character> brackets = new Stack<>();
            for (char ch : input.toCharArray()) {
                if (ch == '(' || ch == '{' || ch == '[') {
                    brackets.push(ch);
                } else if ((ch == ')' || ch == '}' || ch == ']') && (brackets.isEmpty() ||
                        (ch == ')' && brackets.pop() != '(') ||
                        (ch == '}' && brackets.pop() != '{') ||
                        (ch == ']' && brackets.pop() != '['))) {
                    System.out.println("The brackets are not balanced.");
                    return;
                }

            }
            System.out.println(brackets.isEmpty() ? "The brackets are balanced." : "The brackets are not balanced.");
        }
    }
}
