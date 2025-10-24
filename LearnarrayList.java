// Create an ArrayList of integers and write a method to add the numbers 1 to 5 into it. Then print the list.
// Bonus: What is the time complexity of adding an element to an ArrayList?

import java.util.ArrayList;
public class LearnarrayList{
    public static void main(String [] args){
        ArrayList<Integer> numbers = new ArrayList <Integer>();
        for(int i=1;i<=5;i++){
            numbers.add(i);
        }
        System.out.println("The given array list is : " + numbers);
    }
}
