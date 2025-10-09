//Write a program to create a file

import java.io.File;
import java.io.IOException;
public class createFile {
    public static void main(String[] args) {
        try{
            File myFile =  new File("Example.txt");
            if(myFile.createNewFile()){
                System.out.println("File created: " + myFile.getName());
            }
            else{
                System.out.println("File already exists.");
            }
        }
        catch(IOException _){
            System.out.println("An error occurred.");
        }
    }
    
}
