// Write a java program to implement linear search
import java.util.*;
public class LinearSearch {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the size of an array: ");
        int size = sc.nextInt();
        System.out.println("enter the elements of an array: ");
        int[]  arr = new int[size];
        for (int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the element to be searched: ");
        int x = sc.nextInt();
        boolean found=false;
        for (int i=0;i<size+1;i++){
            if(arr[i]==x){
                System.out.println("element found at index: "+ i );
                found=true;
                break;
            }
        }
        if (! found){
            System.out.println("element not found");
        }
        sc.close();
    }
}

