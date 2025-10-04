import java.util.*;
public class Max_Min {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int n = sc.nextInt();
        System.out.print("Enter the elements: ");
        int[] arr = new int[n];

        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("The maximum element is: " + max);
        System.out.println("The minimum element is: " + min);
        sc.close();
        }
    }


