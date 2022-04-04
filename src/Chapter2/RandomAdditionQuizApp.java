package Chapter2;

import java.security.SecureRandom;
import java.util.Scanner;

public class RandomAdditionQuizApp {
   public static void main(String[] args) {

      addition();

   }







   public static void addition() {
      Scanner keyboard = new Scanner(System.in);
      SecureRandom random = new SecureRandom();

      int score = 0;
      int fail = 0;
      int number1;
      int number2;

      int counter;
      for (counter = 1; counter <= 10; counter++) {

         number1 = random.nextInt(1, 11);
         number2 = random.nextInt(1, 11);

         int sum = number1 + number2;

         System.out.print(counter + ". " + number1 + " + " + number2 + " = ");
         int userAnswer = keyboard.nextInt();

         if (userAnswer == sum) {
            System.out.println(" >> Correct!");
            score++;
         } else {
            System.out.println(">> Wrong! ");
            fail++;
         }
      }

      System.out.println();
      System.out.println("You got " + score + " questions correctly");
      System.out.println("You failed " + fail + " questions");
      System.out.println();
      System.out.println("Your actual score is " + score + "/" +10);

   }
}




