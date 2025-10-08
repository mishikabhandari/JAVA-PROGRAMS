// Write a program to find area of rectangle using constructor overloading and display the area using a static method.

public class AreaRectangle {
    int length;
    int breadth;
    int area;
    AreaRectangle(){
        length=1;
        breadth=1;
        area=length*breadth;
    }
    AreaRectangle(int l , int b){
        length=l;
        breadth=b;
        area=length*breadth;
    
    }

    static void display(AreaRectangle ar1 , AreaRectangle ar2){
        System.out.println("Area of Rectangle is: " + ar1.area);
        System.out.println("Area of Rectangle is: " + ar2.area);
    }
    public static void main(String[] args) {
        AreaRectangle ar1=new AreaRectangle();
        AreaRectangle ar2=new AreaRectangle(5,6);
        display(ar1,ar2);
    }
}
