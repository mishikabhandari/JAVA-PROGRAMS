//Write a java program to read a file 
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class readFile{
    public static void  main(String [] args){
        File myfile = new File("Example.txt");
        try{
            try (Scanner sc = new Scanner(myfile)) {
                while (sc.hasNextLine()) {
                    String data = sc.nextLine();
                    System.out.println(data);
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("An error occurred while opening the file: " + e.getMessage());
        }
    }
}