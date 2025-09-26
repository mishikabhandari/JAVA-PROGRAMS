// DSApattern1
// 1. Write a program to print the following pattern:
// *             *
// * *         * *  
// * * *     * * *
// * * * * * * * * 
// * * * * * * * *
// * * *     * * *   
// * *         * *
// *             *      
public class DSApattern1 {
    public static void main (String[] args) {
        for ( int i = 1; i <= 4; i++){
            for (int j = 1; j<= i;j++){
                System.out.print("* ");
            }
            
            for (int space = 1; space<=4-i;space++){
                System.out.print("    ");
            }
            for (int k=1;k<=i;k++){
               System.out.print(" *");
            } 
            
            System.out.println();
        }  
        for (int i =1;i<=4;i++){
            for (int l =4;l>=i;l--){
                System.out.print("* ");
            }
            for (int space = 1; space<=i-1;space++){
                System.out.print("    ");
            }
            for (int k=4;k>=i;k--){
                System.out.print(" *");
            }
            System.out.println();
        } 
    }    
}   
