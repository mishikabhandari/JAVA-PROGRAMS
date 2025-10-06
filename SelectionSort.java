// Write a Java program to implement selection sort algorithm.
import java.util.*;

public class SelectionSort {
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter the size :  ");
            int row = sc.nextInt();
            System.out.println("enter the elements of an array: ");
            int[] arr = new int[row];
            for (int i = 0; i < row; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println("the elements of the array before sorting: ");
            for (int i = 0; i < row; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            selectionSort(arr);
            System.out.println("the elements of the array after sorting: ");
            for (int i = 0; i < row; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}
