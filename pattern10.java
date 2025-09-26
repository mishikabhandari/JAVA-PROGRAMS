// Pattern 10
// 1. Write a program to print the following pattern:
//     * * * * *
//    * * * * *
//   * * * * *
//  * * * * *
// * * * * *
public class pattern10 {
    public static void main(String [] args){
        for ( int i =1; i<=5;i++){
            for (int s=1;s<=5-i;s++){
                System.out.print(" ");
            }
            for (int j =1;j <= i;j++){
                System.out.print(" * ");
            }
            for(int k=4;k>=i;k--){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
