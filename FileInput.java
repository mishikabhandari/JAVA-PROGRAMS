// Write a java program to read a file using FileInputStream 
import java.io.FileInputStream;
import java.io.IOException;
public class FileInput{
    public static void main(String[] args) {
        try(FileInputStream input = new FileInputStream("JAVA-PROGRAMS\\Example.txt")){
            int r;
            while((r=input.read())!=-1){
                System.out.print((char)r);
            }
        }catch(IOException a_e) {
            System.out.print("Error in reading a file");
        }
    }
}