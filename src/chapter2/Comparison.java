package chapter2;

import java.util.Scanner;

public class Comparison {
   public static void main(String[] args){

      Scanner tola = new Scanner(System.in);

      System.out.print("Enter First Digit: ");
      int number1 = tola.nextInt();

      System.out.print("Enter Second Digit: ");
      int number2 = tola.nextInt();

      if (number1 > number2) {
         System.out.println(number1+ " is greater than "+number2);
      }
      else System.out.println(number1+ " is not greater than " +number2);
   }
}   