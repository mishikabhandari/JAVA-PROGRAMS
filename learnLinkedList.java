
// Using Java's LinkedList class, write a method that adds five strings to the list,
//  removes the third element, and then prints the updated list.
// Bonus: How does the performance of remove(index) differ between ArrayList and LinkedList?
import java.util.*;
import java.util.LinkedList;

public class learnLinkedList {
    public static  void main(String [] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter the size of the linked list");
            int size = sc.nextInt();
            sc.nextLine();
            LinkedList<String> fruits = new LinkedList<>();
            System.out.println("Enter " + size + " fruit names:");
            for(int i = 0; i < size; i++){
                String fruit = sc.nextLine();
                fruits.add(fruit);
            }
            System.out.println("Original LinkedList: " + fruits);
            if(fruits.size() >= 3){
                fruits.remove(2); 
            } else {
                System.out.println("The list has less than 3 elements, cannot remove the third element.");
            }
            System.out.println("Updated LinkedList after removing the third element: ");
            for(String str : fruits){
                System.out.println(str);
            }
        }
    }
}