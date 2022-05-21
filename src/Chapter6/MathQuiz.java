package Chapter6;

import java.security.SecureRandom;
import java.util.Scanner;


public class MathQuiz {

    public static double result;
    public static double userAnswer;
    public static int pass;
    public static int fail;
    public static int x;
    public static int y;
    static SecureRandom random = new SecureRandom();


    public static void main(String[] args) {

        welcomeToMathQuiz();


    }





    public static void welcomeToMathQuiz() {

        System.out.println(" **Math Quiz**\n     2022 ");
        System.out.println(" ============= ");

        renderQuizQuestions();
        showResult();
    }



    public static void renderQuizQuestions() {
        for (int i = 1; i <= 10; i++) {
            int questions = 1 + random.nextInt(4);
            switch (questions) {
                case 1 -> {
                    System.out.print(i + ". ");
                    addition();
                }
                case 2 -> {
                    System.out.print(i + ". ");

                    subtraction();
                }

                case 3 -> {
                    System.out.print(i + ". ");
                    multiplication();
                }
                case 4 -> {
                    System.out.print(i + ". ");

                    division();
                }
            }
        }
        System.out.println("you failed " + fail);
        System.out.println("you passed " + pass);
    }

    public static void addition() {


        randomNumberGenerator();

        result = x + y;

        System.out.print(x + " + " + y + " = ");

        collectUserInput();


    }

    private static void collectUserInput() {
        Scanner keyboard = new Scanner(System.in);
        userAnswer = keyboard.nextDouble();

        checkUserInput();
    }

    private static void checkUserInput() {
        if (userAnswer == result) {
            System.out.println(">>>Correct!");
            pass++;
        } else {
            System.out.println(">>>Wrong!");
            fail++;
        }
    }

    private static void randomNumberGenerator() {
        x = random.nextInt(1, 11);
        y = random.nextInt(1, 11);
    }

    public static void subtraction() {


        randomNumberGenerator();

        result = x - y;

        System.out.print(x + " - " + y + " = ");

        collectUserInput();


    }

    public static void multiplication() {

        random = new SecureRandom();


        randomNumberGenerator();

        result = x * y;

        System.out.print(x + " * " + y + " = ");

        collectUserInput();


    }

    public static void division() {

        randomNumberGenerator();

        result = x * 1.0 / y;

        System.out.print(x + " / " + y + " = ");

        collectUserInput();

    }

    public static void showResult() {
        System.out.println("Your total score is " + pass + "/" + 10);
    }

}






