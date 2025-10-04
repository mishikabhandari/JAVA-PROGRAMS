
// Write a linear search of a 2 D array
import java.util.*;

public class LinearSearch_2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns:");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        System.out.println("Enter the elements of the 2D array:");
        int[][] numbers = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the number to search:");
        int search = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (numbers[i][j] == search) {
                    System.out.println("Element found at: " + " [ " + i + " ] " + " " + " [ " + j + " ] ");
                    found = true;
                    break;
                }
            }
        }
        if (!found) {
            System.out.println("Element not found");
        }
        sc.close();
    }
}
