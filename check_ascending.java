import java.util.*;
public class check_ascending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = sc.nextInt();
        System.out.println("enter the numbers: ");
        int [] number = new int[size];
        for (int i = 0; i < size; i++) {
            number[i] = sc.nextInt();
        }
        boolean inAscending = true;
        for (int i = 0; i < size - 1; i++) {
            if (number[i] > number[i + 1]) {
                      inAscending = false;
                break;
            }
        }
        if (inAscending) {
            System.out.println("The numbers are in ascending order");
        } 
        else {
            System.out.println("The numbers are not  in ascending order");
        }
        sc.close();
    }
    
}
