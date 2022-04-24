package Chapter3;

import java.util.Scanner;

public class CarApp {
    public static void main(String[] args) {

        /*Scanner keyboard = new Scanner(System.in);

        Car myCar = new Car("Null", " ", 0.0);
        System.out.println("Initial model of your car is: " +myCar.getModel());

        System.out.println("Enter a model: ");
        String theModel = keyboard.nextLine();

        myCar.setModel(theModel);
        System.out.println("The model of your car is: "+myCar.getModel());*/

        Car myCar1 = new Car("","",0);
        Car myCar2 = new Car("","",0);

        myCar1.setPrice(1500000);
        myCar2.setPrice2(5000000);

        System.out.println("The price of your first car is: "+myCar1.getPrice());
        System.out.println("The price of your second car is: "+myCar2.getPrice());





    }
}
