package chapter2;

import java.util.Scanner;

public class Addition {
   public static void main(String[] args){
      Scanner addition = new Scanner(System.in);

      System.out.println("Enter First Digit: ");
      int number1 = addition.nextInt();

      System.out.println("Enter Second Digit: ");
      int number2 = addition.nextInt();

      int sum = number1 +number2;
      System.out.printf("%s%d", "The sum is ", sum);

   }
} 