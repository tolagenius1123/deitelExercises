package chapter8;

public class Circle {

    private double radius;


    public Circle(double radius) {
        this.radius = radius;

    }


    public void setRadius(double radius) {
        this.radius = radius;
    }


    public double getArea() {
        return radius * radius * 3.142;
        //Math.PI;
    }

    public void displayArea() {
        System.out.println("The area of circle with " + radius + " radius is " + getArea());

    }

}
