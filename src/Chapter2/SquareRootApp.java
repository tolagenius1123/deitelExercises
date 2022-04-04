package Chapter2;

import java.util.Scanner;

public class SquareRootApp {
   public static void main(String[] args){

      Scanner keyboard = new Scanner(System.in);

      System.out.print("Enter first digit: ");
      int number1 = keyboard.nextInt();

      System.out.print("Enter second digit: ");
      int number2 = keyboard.nextInt();
    
      int squareRoot1 = number1 * number1;
      int squareRoot2 = number2 * number2;

      System.out.println();
      System.out.println("Square root of " +number1+ " is "+squareRoot1+ "\nSquare root of " +number2+ " is " +squareRoot2);
      System.out.println();

      int sum = squareRoot1 + squareRoot2;
      System.out.printf("The sum of both squares is %d%n", sum);

      int subtraction = squareRoot1 - squareRoot2;
      System.out.printf("The difference of both squares is %d%n", subtraction);
      
      
      
   }
}



   