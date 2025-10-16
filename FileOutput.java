// Write a java program to write data to a file using FileOutputStream.
import java.io.FileOutputStream;
import java.io.IOException;
public class FileOutput{
    public static void main(String [] args){
        try(FileOutputStream output =  new FileOutputStream("Example.txt")){
            String data = "Hello, World.";
            output.write(data.getBytes());
            System.out.println("Data written to file successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
}