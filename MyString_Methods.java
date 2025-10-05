//Java string methods:
public class MyString_Methods {
     public static void main(String [] args) {
         String str = "Hello, World!";
         String str2 = "hello, world!";
         
         // Length of the string
         System.out.println("Length: " + str.length());
         
         // charAt
         System.out.println("charAt(1): " + str.charAt(1));
         
         // substring
         System.out.println("substring(7): " + str.substring(7));
         
         // toUpperCase and toLowerCase
         System.out.println("toUpperCase: " + str.toUpperCase());
         System.out.println("toLowerCase: " + str.toLowerCase());
         
         // equals and equalsIgnoreCase
         System.out.println("equals: " + str.equals(str2));
         System.out.println("equalsIgnoreCase: " + str.equalsIgnoreCase(str2));
         
         // compareTo and compareToIgnoreCase
         System.out.println("compareTo: " + str.compareTo(str2));
         System.out.println("compareToIgnoreCase: " + str.compareToIgnoreCase(str2));
         
         // contains
         System.out.println("contains 'World': " + str.contains("World"));
         
         // startsWith and endsWith
         System.out.println("startsWith 'Hello': " + str.startsWith("Hello"));
         System.out.println("endsWith '!': " + str.endsWith("!"));
         
         // indexOf and lastIndexOf
         System.out.println("indexOf 'o': " + str.indexOf('o'));
         System.out.println("lastIndexOf 'o': " + str.lastIndexOf('o'));
         
         // replace
         System.out.println("replace 'l' with 'x': " + str.replace('l', 'x'));
         
         // trim
         String str3 = "   padded   ";
         System.out.println("trim: '" + str3.trim() + "'");
         
         // split
         String[] parts = str.split(", ");
         System.out.println("split: " + parts[0] + " | " + parts[1]);
         
         // isEmpty and isBlank (Java 11+)
         System.out.println("isEmpty: " + "".isEmpty());
         // System.out.println("isBlank: " + "   ".isBlank()); // Uncomment if using Java 11+
         
         // valueOf
         int num = 123;
         System.out.println("valueOf: " + num);
     }
    }
