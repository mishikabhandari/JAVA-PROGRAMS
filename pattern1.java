// pattern.java
// 1. Write a program to print the following pattern:
// * * * * *
// * * * * *
// * * * * *
// * * * * *
public class pattern1 {
    public static void main(String []  args){
        for(int i=1;i<=4;i++){
            for (int j=1;j<=5;j++){
            System.out.print("* ");
            }
            System.out.println();
        }
    }
}
