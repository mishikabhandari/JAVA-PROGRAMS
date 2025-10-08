
// Write a program to demonstrate encapsulation in Java by creating a class Student with private fields name, rollNo, and marks.
// Provide public getter and setter methods to access and update these fields.
import java.util.*;

public class StudentDetailsEncapsulation {
    private String name;
    private long rollNo;
    private Double marks;

    public void setname(String name) {
        this.name = name;
    }

    public void setrollNo(long rollNo) {
        this.rollNo = rollNo;
    }

    public void setmarks(Double marks) {
        this.marks = marks;
    }

    public String getname() {
        return name;
    }

    public long getRollNo() {
        return rollNo;
    }

    public Double getmarks() {
        return marks;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter Student Details:");
            StudentDetailsEncapsulation student = new StudentDetailsEncapsulation();
            System.out.print("Name: ");
            String name = sc.nextLine();
            student.setname(name);

            System.out.print("Roll No: ");
            long rNo = sc.nextLong();
            student.setrollNo(rNo);
            System.out.print("Marks: ");
            double m = sc.nextDouble();
            student.setmarks(m);

            System.out.println("Student name: " + student.getname());
            System.out.println("Roll Number: " + student.getRollNo());
            System.out.println("marks: " + student.getmarks());
        }
    }
}
