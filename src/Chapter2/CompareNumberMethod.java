package Chapter2;

import java.util.Scanner;

public class CompareNumberMethod {

    public static void compareNumbers(){

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter First Digit: ");
        int number1 = keyboard.nextInt();

        System.out.print("Enter Second Digit: ");
        int number2 = keyboard.nextInt();

        if (number1 > number2) {
            System.out.println(number1+ " is greater than "+number2);
        }
        else if (number2 > number1){
            System.out.println(number2+ " is greater than "+number1);
        }

    }
}
