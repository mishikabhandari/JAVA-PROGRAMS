/*  PROBLEM STATEMENT: 
Create a class hierarchy for a school.
- Base class: Person with attributes name, age, and a method displayDetails().
- Derived class: Student with an extra attribute grade.
- Derived class: Teacher with an extra attribute subject.
- In the main method, create objects of Student and Teacher and display their details using the inherited method.
*/

import java.util.*;

public class PersonInheritance {
    protected String name;
    protected int age;

    public PersonInheritance(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //STUDENT DETAILS :
    public static class Student extends PersonInheritance {
        static final String GRADE = "A";

        public Student(String name, int age) {
            super(name, age); // to access parent attributes
        }

        static void displaydetails(Student student) {
            System.out.println("Student Details:");
            System.out.println("Name: " + student.name);
            System.out.println("Age: " + student.age);
            System.out.println("Grade: " + PersonInheritance.Student.GRADE);
        }
    }

    // TEACHERS DETAILS:
    public static class Teacher extends PersonInheritance {
        static final String SUBJECT = "Mathematics";

        public Teacher(String name, int age) {
            super(name, age);
        }

        static void displaydetails(Teacher teacher) {
            System.out.println("Teacher Details:");
            System.out.println("Name: " + teacher.name);
            System.out.println("Age: " + teacher.age);
            System.out.println("Subject: " + PersonInheritance.Teacher.SUBJECT);
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter Student name:");
            String name = sc.nextLine();
            System.out.println("Enter Student age:");
            int age = sc.nextInt();
            sc.nextLine(); // Consume newline
            System.out.println("Enter Teachers' name : ");
            String teacherName = sc.nextLine();
            System.out.println("Enter Teachers' age : ");
            int teacherAge = sc.nextInt();
            Student student1 = new Student(name, age);
            Teacher teacher1 = new Teacher(teacherName, teacherAge);
            Student.displaydetails(student1);
            Teacher.displaydetails(teacher1);
        }
    }
}
