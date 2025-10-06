//  Write a Java program to find the transpose of a matrix
import java.util.*;
public class Transpose_Matrix {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number of rows and columns");
            int rows = sc.nextInt();
            int cols = sc.nextInt();
            System.out.println("Enter the elements of the matrix");
            int[][] matrix = new int[rows][cols];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }
            System.out.println("the given matrix is: ");
            for (int i = 0; i < rows; i++) {
                System.out.print(" [ ");
                for (int j = 0; j < cols; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.print("] ");
                System.out.println();
            }
            System.out.println("the transpose of the matrix is: ");
            for (int i = 0; i < cols; i++) {
                System.out.print(" [ ");
                for (int j = 0; j < rows; j++) {
                    System.out.print(matrix[j][i] + " ");
                }
                System.out.print("] ");
                System.out.println();
            }
        }
    }
}
