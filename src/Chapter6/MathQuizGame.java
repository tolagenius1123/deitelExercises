package Chapter6;

import java.security.SecureRandom;
import java.util.Scanner;

public class MathQuizGame {
    public static void main(String[] args) {

        SecureRandom randomNumbers = new SecureRandom();
        Scanner keyboard = new Scanner(System.in);

        System.out.println("**MATH QUIZ GAME**");
        System.out.println("==================");

        // Variables declaration
        int num1;
        int num2;
        int userAnswer;
        int correctAnswer;
        int maxloop =10;
        int score = 0;
        double percentage;


        for (int counter = 1; counter <= maxloop; counter ++){
            num1 = randomNumbers.nextInt(10);
            num2 = randomNumbers.nextInt(10);

            System.out.print(counter+ ". " +num1+ " x " +num2+ " = ");
            userAnswer = keyboard.nextInt();
            correctAnswer = num1 * num2;

            if(userAnswer == correctAnswer) {
                System.out.println(">> Correct!");
                score++;
                }
                else {
                    System.out.println(">> Wrong! Try again ");
                }

        } //End of loop

            System.out.println("==================");
            System.out.print("You scored " +score+ "/" +maxloop+ " = ");

            percentage = (double)score / (double)maxloop * 100;
            System.out.println(percentage+ " %");





    }
}


