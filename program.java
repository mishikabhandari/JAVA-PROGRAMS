public class program {
    public static void main(String [] args){
        int x=10;
        int y=12;
        int z=23;
        if(x>y && x>z){
            System.out.println("x is greater");
        }
        else if(y>x && y>z){
            System.out.println("y is greater");
        }
        else {
            System.out.println("z is greater");
        }
    }
}
