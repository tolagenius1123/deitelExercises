package Chapter6;

import java.security.SecureRandom;
import java.util.Scanner;


public class MathQuiz {
    public static int result;
    public static int userAnswer;
    public static int score;
    public static int fail;
    public static int operator;
    public static int operatorSwitch;
    public static int x;
    public static int y;


    public static void main(String[] args) {

        welcomeToMathQuiz();
        administerQuestions();
        showResult();
        operatorSwitcher();



    }


    public static void welcomeToMathQuiz() {

        System.out.println(" **Math Quiz**\n     2022 ");
        System.out.println(" ============= ");
    }


    public static void administerQuestions() {

        SecureRandom random = new SecureRandom();

        for (int counter = 1; counter <= 10; counter++) {
             x = random.nextInt(1, 11);
             y = random.nextInt(1, 11);
            result = x * y;
            System.out.print(counter + ". " + x + operator+  y + " = ");
            Scanner keyboard = new Scanner(System.in);
            userAnswer = keyboard.nextInt();
            operator = random.nextInt(1,6);

//            switch (operator) {
//                case 1 -> operatorSwitch(+);
//                case 2 -> operatorSwitch(-);
//                case 3 -> operatorSwitch(*);
//                case 4 -> operatorSwitch('/');
            }

            if (result == userAnswer) {
                score ++;

            }
            else
                fail++;



            }




    public static void showResult(){
            System.out.println();
            System.out.println("================");
            System.out.println("You got "+score+ " correct answers");
            System.out.println("You answered "+fail+ " questions wrongly");
            System.out.println("Your total score is "+score+ "/" +10);
    }

    public static void operatorSwitcher(){
        if (operatorSwitch == '+'){
            result = x + y;
            }
        else if (operatorSwitch == '*'){
            result = x * y;
            }
        else if (operatorSwitch == '/'){
            result = x / y;
            }
        else if (operatorSwitch == '-'){
            result = x - y;
            }


    }

}





