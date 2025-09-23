// Write a simple calculator program in Java that takes two numbers and an operator (+, -, *, /) as input and outputs the result of the operation.

import java.util.*;

public class Calculator {
    private static final String RESULT_PREFIX = "Result: ";

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
        
            System.out.print("Enter first number: ");
            double num1 = sc.nextDouble();

            System.out.print("Enter an operator (+, -, *, /): ");
            char symbol = sc.next().charAt(0);

            System.out.print("Enter second number: ");
            double num2 = sc.nextDouble();

            switch (symbol) {
                case '+' -> System.out.println(RESULT_PREFIX + (num1 + num2));
                case '-' -> System.out.println(RESULT_PREFIX + (num1 - num2));
                case '*' -> System.out.println(RESULT_PREFIX + (num1 * num2));
                case '/' -> {
                    if (num2 != 0) {
                        System.out.println(RESULT_PREFIX + (num1 / num2));
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                }
                default -> System.out.println("Error: Invalid operator.");
            }
        }
    }
}