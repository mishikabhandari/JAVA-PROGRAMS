// Write a Java program to write data to a file.
import java.io.FileWriter;
import java.io.IOException;
public class WriteToFile {
    public static void main(String [] args){
        try{
            try (FileWriter writer = new FileWriter("Example.txt")) {
                writer.write("Hello, this is a sample text written to the file.");
            }
            System.out.println("Data written in the file successfully.");       
        }
        catch(IOException e){
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
    
}
