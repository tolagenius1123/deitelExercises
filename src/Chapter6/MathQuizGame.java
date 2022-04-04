package Chapter6;

import java.util.Random;
import java.util.Scanner;

public class MathQuizGame {
    public static int userAnswer;
    public static int correctAnswer;
    public static int score = 0;
    public static int fail = 0;

    public static void main(String[] args) {

        Random randomNumbers = new Random();

        System.out.println("**MATH QUIZ GAME**");
        System.out.println("==================");

        int num1;
        int num2;

        for (int counter = 1; counter <=10; counter ++){
            num1 = randomNumbers.nextInt(1,11);
            num2 = randomNumbers.nextInt(1,11);
            int operator = randomNumbers.nextInt(1,5);


            switch (operator) {
                case 1: operatorSwitch(num1,num2,'+',counter);
                        break;
                case 2:
                    operatorSwitch(num1,num2,'-',counter);
                        break;
                case 3:
                    operatorSwitch(num1,num2,'*',counter);
                        break;
                case 4:
                    operatorSwitch(num1,num2,'/',counter);
                        break;
            }
        }
        showResult();

    }



    public static void showResult(){
        System.out.println("==================");
        System.out.println("You got "+score+ " correct answers");
        System.out.println("You answered "+fail+ " questions wrongly");
    }



    public static void operatorSwitch(int num1, int num2, char operatorSwitch,int counter){
        System.out.print(counter+ ". " +num1+ " "+operatorSwitch+ " " +num2+ " = ");
        Scanner keyboard = new Scanner(System.in);
        userAnswer = keyboard.nextInt();
        {if (operatorSwitch == '+'){
        correctAnswer = num1 + num2;}
        else if (operatorSwitch == '*'){
            correctAnswer = num1 * num2;}
        else if (operatorSwitch == '/'){
            correctAnswer = num1 / num2;}
        else if (operatorSwitch == '-'){
            correctAnswer = num1 - num2;}}
        if(userAnswer == correctAnswer) {
            System.out.println(">> Correct!");
            score++;
        }
        else {
            System.out.println(">> Wrong! Try again ");
            fail++;

        }
    }
}


