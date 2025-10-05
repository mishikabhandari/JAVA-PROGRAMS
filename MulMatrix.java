// write a program to multiply two matrices
import java.util.*;
public class MulMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns of first matrix: ");
        int row1 = sc.nextInt();
        int col1 = sc.nextInt();
        System.out.print("Enter the number of rows and columns of second matrix: ");
        int row2 = sc.nextInt();
        int col2 = sc.nextInt();
        if(col1==row2){
            System.out.println("Enter the elements of first matrix: ");
            int [][] matrix1 =  new int [row1][col1];
            for(int i=0;i<row1;i++){ 
                for(int j=0;j<col1;j++){
                    matrix1[i][j] = sc.nextInt();
                }
            }
            System.out.println("the first matrix is : ");
            for(int i=0;i<row1;i++){
                System.out.print( " [ ");
                for(int j=0;j<col1;j++){
                    System.out.print(matrix1[i][j] + " ");
                }
                System.out.print("] ");
                System.out.println();
            }
            System.out.println("Enter the elements of second matrix: ");
            int [][]  matrix2 = new int [row2][col2];
            for (int i=0;i<row2;i++){
                for(int j=0;j<col2;j++){
                    matrix2[i][j] = sc.nextInt();
                }
            }
            System.out.println("the second matrix is : ");
            for(int i=0;i<row2;i++){
                System.out.print( " [ ");
                for(int j=0;j<col2;j++){
                    System.out.print(matrix2[i][j] + " ");
                }
                System.out.print("] ");
                System.out.println();
            }
            System.out.println(" the multiplication of two matrix is : ");
            int [] [] multiply = new int [row1][col2];
            for(int i=0;i<row1;i++){
                System.out.print( " [ ");
                for(int j=0;j<col2;j++){
                    multiply[i][j] = 0;
                    for(int k=0;k<col1;k++){
                        multiply[i][j] += matrix1[i][k] * matrix2[k][j];
                    }
                    System.out.print(multiply[i][j] + " ");
                }
                System.out.print("] ");
                System.out.println();
            }
        }
        else{
            System.out.println("Matrix multiplication is not possible");
        }
        sc.close();
    }
}