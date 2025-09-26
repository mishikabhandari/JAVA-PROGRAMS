// DSApattern2
// 1. Create a pattern using nested loops.
// 2. The pattern should be a diamond shape with stars.
// 3. The pattern should be symmetric and centered.
// 4.             *
// 5.           * * *
// 6.         * * * * *
// 7.       * * * * * * *
// 8.         * * * * *
// 9.           * * *
// 10.            *
public class DSApattern2 {
    public static void main ( String [] args){
        for ( int i = 1; i<=4; i++){ 
            for ( int space =1;space<=4-i;space++){
                System.out.print("  ");
            }
            for ( int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            for ( int k= 2;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for ( int i = 1;i<=3;i++){
            for (int space = 1;space<=i;space++){
                System.out.print("  ");
            }
            for ( int j = 3; j>=i;j--){
                System.out.print("* ");
            }
            for ( int k=2;k>=i;k--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
