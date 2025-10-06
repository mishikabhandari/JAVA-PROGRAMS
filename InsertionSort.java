
// write a java program to implement insertion sort algorithm.
import java.util.*;

public class InsertionSort {
    public static void insertionSort(int [] arr){
        int n=arr.length; // Get the length of the array
        for (int i=1;i<n;i++){
            int current=arr[i]; // Store the current element
            int j=i-1;
            while (j>=0 && arr[j]>current){
                arr[j+1]=arr[j]; // Shift elements to the right
                j--; // Move to the previous element
            }
            arr[j+1]=current; // Place the current element in its correct position
        }
    }

    public static void main(String [] args){
        try (Scanner sc = new Scanner(System.in)) {
            int row = sc.nextInt(); // row = size of the array
            int [] arr = new int[row]; // Create an array of size 'row'
            System.out.println("Enter the elements of the array: ");
            for (int i=0;i<row;i++){
                arr[i]=sc.nextInt(); // Read elements into the array
            }
            System.out.println(" array before sorting: ");
            for (int i=0;i<row;i++){
                System.out.print(arr[i]+" "); // Print the array before sorting
            }
            insertionSort(arr); // Call the insertion sort method
            System.out.println("\n array after sorting: ");
            for (int i =0 ; i<row ; i++){
                System.out.print(arr[i]+" "); // Print the array after sorting
            }

        }

    }
}
