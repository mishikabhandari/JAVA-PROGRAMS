// DSApattern3
/*This program prints a butterfly pattern with stars and spaces.
*               *
* *           * *
*   *       *   *
*     *   *     *
*       *       *
*       *       *
*     *   *     *
*   *       *   *
* *           * *
*               *

*/
public class DSApattern3 {
    public static void main(String[] args) {
        // Upper half of the butterfly
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            for (int space = 1; space <= 2*(5-i); space++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        // Lower half of the butterfly
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            for (int space = 1; space <= 2 * (5 - i); space++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
