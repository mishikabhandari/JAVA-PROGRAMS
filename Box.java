// Write a generic class in Java called Box that can hold a value of any type,
// and demonstrate how you would create a Box to store an Integer and a Box to store a String. 
// How would you retrieve the value from each box?

public class Box<T> {
    private T value;
    public void setValue(T value){
        this.value=value;
    }
    public T getValue(){
        return value;
    }
    public static void main(String [] args){
        Box<String> rectangleBox = new Box<>();
        rectangleBox.setValue("Hello, World!");
        String stringValue = rectangleBox.getValue();
        System.out.println("String Value: " + stringValue);
        Box<Integer> integerBox = new Box<>();
        integerBox.setValue(42);
        Integer intValue = integerBox.getValue();
        System.out.println("Integer Value: " + intValue);
    }
}
