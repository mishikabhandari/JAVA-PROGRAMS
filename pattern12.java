// Pattern 12
//         1 
//       2 1 2
//     3 2 1 2 3
//   4 3 2 1 2 3 4
// 5 4 3 2 1 2 3 4 5
public class pattern12 
{
    public static void main (String[] args)
    {
        for (int i=1; i <= 5; i++)
        {
            for(int space=1;space<=5-i;space++){
                System.out.print("   ");
            }
            
            for ( int j = i; j>= 1; j--){
                System.out.print(j + "  ");
            }
            for (int k = 2; k <= i; k++){
                System.out.print(k + "  ");
            }
            System.out.println();
        }
    }
}
