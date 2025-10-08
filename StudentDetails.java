//Write a program to create a class StudentDetails with two data members name and rollNo.
//Initialize these data members through a parameterized constructor. Create a method display() to display the details.

import java.util.*;

public class StudentDetails {
    String name;
    String rollNo;

    StudentDetails(String name, String rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    static void display(StudentDetails student1) {
        System.out.println("Name: " + student1.name);
        System.out.println("Roll No: " + student1.rollNo);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter name: ");
            String name = sc.nextLine();
            System.out.print("Enter roll number: ");
            String rollNo = sc.nextLine();
            StudentDetails student1 = new StudentDetails(name, rollNo);
            display(student1);
        }
    }
}