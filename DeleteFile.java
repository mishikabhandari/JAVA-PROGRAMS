// Write a Java program to delete a file.
import java.io.File;
public class DeleteFile {
    public static void main(String [] args){
        File myFile = new File("Example.txt");
        if(myFile.delete()){
            System.out.println("File deleted successfully: " + myFile.getName());
        } 
        else {
            System.out.println("Failed to delete the file.");
        }
    }
    
}
