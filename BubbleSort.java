// write a program to implement bubble sort algorithm
import java.util.*;
public class BubbleSort {
    public static void bubbleSort(int [] arr){
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) { 
                    int swap = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = swap;
                }
            }
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter the size of the array: ");
            int row = sc.nextInt();
            System.out.println("enter the elements of an array: ");
            int[] arr = new int[row];
            for (int i = 0; i < row; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println("the elements of the array before sorting: ");
            System.out.print(" [ ");
            for (int i = 0; i < row; i++) {
                System.out.print(arr[i] + " , ");
            }
            System.out.println("]");

            bubbleSort(arr);
            System.out.print("the elements of the array after sorting: [ ");
            for (int i = 0; i < row; i++) {
                System.out.print(arr[i] + " , ");
            }
            System.out.println("]");
        }
    }
}

