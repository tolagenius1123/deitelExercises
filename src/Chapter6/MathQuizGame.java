package Chapter6;

import java.util.Random;
import java.util.Scanner;

public class MathQuizGame {
    public static void main(String[] args) {

        Random randomNumbers = new Random();
        Scanner keyboard = new Scanner(System.in);

        System.out.println("**MATH QUIZ GAME**");
        System.out.println("==================");

        // Variables declaration
        int num1;
        int num2;
        int userAnswer;
        int correctAnswer;
        int score = 0;
        //double percentage;
        char operatorSwitch = ' ';
        int fail = 0;

        for (int counter = 1; counter <=10; counter ++){
            num1 = randomNumbers.nextInt(1,11);
            num2 = randomNumbers.nextInt(1,11);
            int operator = randomNumbers.nextInt(1,5);


            switch (operator) {
                case 1: operatorSwitch = '+';
                    System.out.print(counter+ ". " +num1+ " "+operatorSwitch+ " " +num2+ " = ");
                    userAnswer = keyboard.nextInt();
                        correctAnswer = num1 + num2;
                    if(userAnswer == correctAnswer) {
                        System.out.println(">> Correct!");
                        score++;
                    }
                    else {
                        System.out.println(">> Wrong! Try again ");
                        fail++;
                    }
                        break;
                case 2: operatorSwitch= '-';
                    System.out.print(counter+ ". " +num1+ " "+operatorSwitch+ " " +num2+ " = ");
                    userAnswer = keyboard.nextInt();
                        correctAnswer = num1 - num2;
                    if(userAnswer == correctAnswer) {
                        System.out.println(">> Correct!");
                        score++;
                    }
                    else {
                        System.out.println(">> Wrong! Try again ");
                        fail++;
                    }
                        break;
                case 3: operatorSwitch= '*';
                    System.out.print(counter+ ". " +num1+ " "+operatorSwitch+ " " +num2+ " = ");
                    userAnswer = keyboard.nextInt();
                        correctAnswer = num1 * num2;
                    if(userAnswer == correctAnswer) {
                        System.out.println(">> Correct!");
                        score++;
                    }
                    else {
                        System.out.println(">> Wrong! Try again ");
                        fail++;
                    }
                        break;
                case 4: operatorSwitch= '/';
                    System.out.print(counter+ ". " +num1+ " "+operatorSwitch+ " " +num2+ " = ");
                    userAnswer = keyboard.nextInt();
                        correctAnswer = num1 / num2;
                    if(userAnswer == correctAnswer) {
                        System.out.println(">> Correct!");
                        score++;
                    }
                    else {
                        System.out.println(">> Wrong! Try again ");
                        fail++;
                    }
                        break;

            }

        }

            System.out.println("==================");
            System.out.println("You got "+score+ " correct answers");
            System.out.println("You answered "+fail+ " questions wrongly");


    }
}


