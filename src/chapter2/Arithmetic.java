package chapter2;

import java.util.Scanner;

public class Arithmetic{
   public static void main(String[] args){

      Scanner input = new Scanner(System.in);

      System.out.print("Enter first digit ");
      int number1 = input.nextInt();

      System.out.print("Enter second digit ");
      int number2 = input.nextInt();
    
      int squareRoot1 = number1 * number1;
      int squareRoot2 = number2 * number2;

      System.out.println("Square root is " +squareRoot1+ " and " +squareRoot2);
      
      int sum = squareRoot1 + squareRoot2;
      System.out.printf("The sum of both squares is %d%n", sum);

      int subtraction = squareRoot1 - squareRoot2;
      System.out.printf("The difference of both squares is %d%n", subtraction);
      
      
      
   }
}



   