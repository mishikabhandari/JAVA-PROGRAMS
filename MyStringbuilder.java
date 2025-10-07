// Write a program to demonstrate the use of StringBuilder class
public class MyStringbuilder {
    public static void main(String [] args){
        StringBuilder sb = new StringBuilder();
        sb.append("hello");
        System.out.println(sb);
        sb.append(" ");
        System.out.println(sb);
        sb.append("world");
        System.out.println(sb);
        sb.append(" . ");
        System.out.println(sb);
        sb.delete(2, 5);
        System.out.println(sb);
        sb.insert(2,"y");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb.replace(1,3,"i");
        System.out.println(sb);
        System.out.println(sb.charAt(3)); /* yeeh method batata hai ki konse position
         pe voh string present hai */
    }
}