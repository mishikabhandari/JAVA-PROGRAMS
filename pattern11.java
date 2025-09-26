// pattern 11
// 1. Write a program to print the following pattern:
//        1
//      2  2
//    3  3  3
//  4  4  4  4
// 5  5  5  5  5
public class pattern11 {
    public static void main(String [] args){
        for ( int i =1; i <= 5; i++){
            for ( int space =1; space<=5-i; space++){
                System.out.print(" ");
            }
            for ( int j =1; j <= i; j++ ){
                System.out.print( i + " ");
            }
            System.out.println();

        }
        }
    }

