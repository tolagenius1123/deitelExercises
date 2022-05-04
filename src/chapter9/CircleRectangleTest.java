package chapter9;

public class CircleRectangleTest {
    public static void main(String[] args) {

        Circle myCircle = new Circle(5);
        myCircle.setColor("White");
        myCircle.setFilled(true);
        System.out.println("This circle was created on "+myCircle.getDateCreated());
        System.out.println("The color of this circle is "+myCircle.getColor());
        System.out.println("Circle Status(Filled): "+myCircle.isFilled());
        System.out.println(myCircle.printCircleResults());
        //System.out.println("This circle was "+ myCircle.toString());

        System.out.println();
        Rectangle myRectangle = new Rectangle(5,7);
        System.out.println("Area of Rectangle: "+ myRectangle.getArea());
        System.out.println("This Rectangle was created on "+myRectangle.getDateCreated());







    }
}










































//    Circle myCircle =  new Circle(1);
//
//        System.out.println("A circle " + myCircle.toString());
//                System.out.println("The color is " + myCircle.getColor());
//                System.out.println("The radius is " + myCircle.getRadius());
//                System.out.println("The area is " + myCircle.getArea());
//                System.out.println("The diameter is " + myCircle.getDiameter());
//
//                Rectangle myRectangle = new Rectangle(2, 4);
//
//                System.out.println("\nA Rectangle " + myRectangle.toString());
//                System.out.println("The area is " + myRectangle.getArea());
//                System.out.println("The perimeter is " + myRectangle.getPerimeter());
