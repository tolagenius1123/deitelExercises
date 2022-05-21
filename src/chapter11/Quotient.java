package chapter11;

import java.util.Scanner;

public class Quotient {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter two integers: ");
        double num1 = input.nextInt();
        double num2 = input.nextInt();

        try{
            double result = quotient(num1, num2);
            System.out.println(num1+" / "+num2+" = "+result);
        }
        catch (ArithmeticException ex){
            System.out.println("Exception: an integer "+ "cannot be divided by zero");
        }
        System.out.println("Execution continues...");
}


    public static double quotient(double num1, double num2){
        if ( num2 == 0 )
            throw new ArithmeticException("Divisor cannot be zero");

        return num1 / num2;
    }


}
