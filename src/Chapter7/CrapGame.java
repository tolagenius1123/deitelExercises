package Chapter7;

import java.security.SecureRandom;
import java.util.Scanner;

public class CrapGame {
    public static int sumOfDice;
    public static int point;


    public static void main(String[] args) {
        playGame();
        showResult();
    }


    public static void playGame() {

        System.out.println(".:WELCOME TO CRAP GAME:.");
        System.out.println("========================");

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Press Any Number to Roll a Dice: ");
        int startGame = keyboard.nextInt();

        rollDice();


    }

    public static void rollDice() {
        SecureRandom random = new SecureRandom();

        int dice1 = random.nextInt(1, 7);
        int dice2 = random.nextInt(1, 7);

        sumOfDice = dice1 + dice2;
//        if(sumOfDice== 7) System.out.println("you loose");
        System.out.println(dice1 + " + " + dice2 + " = " + sumOfDice);


    }

    public static void showResult() {

        if (sumOfDice == 7 || sumOfDice == 11) {
            System.out.println("You Win!");
        }

        if (sumOfDice == 2 || sumOfDice == 3 || sumOfDice == 12) {
            System.out.println("You Loose!");
        }

        if (sumOfDice == 4 || sumOfDice == 5 || sumOfDice == 6 || sumOfDice == 8 || sumOfDice == 9 || sumOfDice == 10) {
            System.out.println(sumOfDice + " is your point, roll dice again till you get " + sumOfDice);
            point = sumOfDice;
            rollDice();
            checkResultOfSecondThrow();

        }
    }

    public static void checkResultOfSecondThrow(){

//    if (point == sumOfDice) {
//        System.out.println("You Win!");
//    }
//    else if (point == 7) {
//        System.out.println("You Loose!");
//    }
     while(point != sumOfDice) {
         rollDice();

         if (sumOfDice == 7) {
             System.out.println("You Loose!");
             break;
         }
        else if (point == sumOfDice) {
             System.out.println("You Win!");
         }

        }
//
//        else {
//              rollDice();
//            }
//            System.out.println("You Win!");




        }
    }

