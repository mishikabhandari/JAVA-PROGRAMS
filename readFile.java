//Write a java program to read a file 
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class readFile{
    public static void  main(String [] args){
        if (args.length < 1) {
            System.err.println("Please provide the file path or URI as a command-line argument.");
            return;
        }
        File myfile = new File(args[0]);
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