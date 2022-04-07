package Chapter7;

import java.security.SecureRandom;
import java.util.Scanner;

public class CrapGame {
    public static void main(String[] args) {

        System.out.println(".:WELCOME TO CRAP GAME:.");
        System.out.println("========================");
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Press Any Number to Roll a Dice: ");
        int startGame = keyboard.nextInt();

        SecureRandom random = new SecureRandom();

        int dice1 = random.nextInt(1, 7);
        int dice2 = random.nextInt(1, 7);

        int sumOfDice = dice1 + dice2;
        System.out.println(dice1 + " + " + dice2 + " = " + sumOfDice);


        if (sumOfDice == 7 || sumOfDice == 11) {
            System.out.println("You Win!");

        }
        if (sumOfDice == 2 || sumOfDice == 3 || sumOfDice == 12) {
            System.out.println("You Loose!");
        }
        if (sumOfDice == 4 || sumOfDice == 5 || sumOfDice == 6 || sumOfDice == 8 || sumOfDice == 9 || sumOfDice == 10) {
            System.out.println(sumOfDice + " is your point, roll dice again till you get "+sumOfDice);

             dice1 = random.nextInt(1, 7);
             dice2 = random.nextInt(1, 7);

            int point  = dice1 + dice2;
            System.out.println(dice1 + " + " + dice2 + " = " + point);


        if (point == 7){
            System.out.println("You Loose");
        }
        if (point == sumOfDice ){
                System.out.println("You Win!");
            }
        else {
//                int count = 1;
                while(point != sumOfDice){
                    dice1 = random.nextInt(1, 7);
                    dice2 = random.nextInt(1, 7);

                    point  = dice1 + dice2;
                    System.out.println(dice1 + " + " + dice2 + " = " + point);



            }
            System.out.println("You Win!");

        }
    }
}

}









