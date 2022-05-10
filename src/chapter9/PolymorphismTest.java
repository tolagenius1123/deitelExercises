package chapter9;

public class PolymorphismTest {
    public static void main(String[] args) {
        displayObject(new Circle(5));
        displayObject(new Rectangle(6, 7));
        //displayObject(new GeometricObj());

    }

    public static void displayObject(GeometricObj object){
        System.out.println("Created on "+object.getDateCreated());
        System.out.println("Color is "+object.getColor());
    }
}
