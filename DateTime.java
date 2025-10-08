// Write a Java program to display the current date and time using the java.time package.

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class DateTime{
    public static void main(String[] args) {
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Current Date and Time: " + currentDateTime);

        DateTimeFormatter myDT = DateTimeFormatter.ofPattern("dd/MM/yyyy  HH:mm:ss ");
        System.out.println("Formatted Date and Time: " + currentDateTime.format(myDT));
    }
}