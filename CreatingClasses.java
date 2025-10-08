
// write a java program showing objects and classes  with final keyword.
import java.util.*;

public class CreatingClasses {
    public static class keyword {
        final double pi = 3.14; // final keyword is used to declare a variable fixed .
        // final keywword is also known as modifier.
        
    }
    static void method(){ // static method
        System.out.println("Hello World");
    }
    public void mainMethod(int number) { // public method 
        System.out.println("Hello World from main method " + number);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter the radius of a circle: ");
            int r = sc.nextInt();
            keyword myvalue = new keyword();
            System.out.println(myvalue.pi);
            double areaCircle = (myvalue.pi) * r * r; // if want to use value of pi in my code .
            System.out.println(areaCircle);
            method(); // static method is called without creating object.
            CreatingClasses obj = new CreatingClasses();
            obj.mainMethod(10);// public method is called by creating object.
        }

    }
}