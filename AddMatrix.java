
// Write a Java program to add two matrices of size m*n
import java.util.*;

public class AddMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of row and columns of the first matrix: ");
        int row1 = sc.nextInt();
        int col1 = sc.nextInt();
        System.out.println("enter the row and columns of the second matrix: ");
        int row2 = sc.nextInt();
        int col2 = sc.nextInt();
        if (row1 == row2 && col1 == col2) {
            System.out.println("Enter the first matrix:");
            int[][] matrix1 = new int[row1][col1];
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < col1; j++) {
                    matrix1[i][j] = sc.nextInt();
                }
            }
            System.out.println("the first matrix is : ");
            for (int i = 0; i < row1; i++) {
                System.out.print(" [ ");
                for (int j = 0; j < col1; j++) {
                    System.out.print(matrix1[i][j] + " ");
                }
                System.out.print("] ");
                System.out.println();
            }
            System.out.println("Enter the second matrix:");
            int[][] matrix2 = new int[row2][col2];
            for (int i = 0; i < row2; i++) {
                for (int j = 0; j < col2; j++) {
                    matrix2[i][j] = sc.nextInt();
                }
            }
            System.out.println("the second matrix is : ");
            for (int i = 0; i < row2; i++) {
                System.out.print(" [ ");
                for (int j = 0; j < col2; j++) {
                    System.out.print(matrix2[i][j] + " ");
                }
                System.out.print("] ");
                System.out.println();
            }
            System.out.println("the sum of the two matrix is : ");
                int[][] sum = new int[row1][col1];
                for (int i = 0; i < row1; i++) {
                    System.out.print(" [");
                    for (int j = 0; j < col1; j++) {
                        sum[i][j] = matrix1[i][j] + matrix2[i][j];
                        System.out.print(sum[i][j] + " ");
                    }
                    System.out.print("] ");
                    System.out.println();
                }
        } else {
            System.out.println("the two matrix are not of the same size and cannot be added.Enter the same size of the two matrix");
        }
        sc.close();
    }
}
