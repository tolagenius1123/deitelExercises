package Chapter5;

import java.util.Scanner;

public class ChristmasSongApp {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number from 1 to 12: ");

        for(int days = 1; days <= 12; days ++) {
             days = input.nextInt();
             switch (days) {
                case 1 -> {
                    System.out.println();
                    System.out.println("On the first day of christmas");
                    System.out.println("my true love sent to me");
                }
                case 2 -> {
                    System.out.println("On the second day of christmas");
                    System.out.println("my true love sent to me");
                }
                case 3 -> {
                    System.out.println("On the third day of christmas");
                    System.out.println("my true love sent to me");
                }
                case 4 -> {
                    System.out.println("On the fourth day of christmas");
                    System.out.println("my true love sent to me");
                }
                case 5 -> {
                    System.out.println("On the fifth day of christmas");
                    System.out.println("my true love sent to me");
                }
                case 6 -> {
                    System.out.println("On the sixth day of christmas");
                    System.out.println("my true love sent to me");
                }
                case 7 -> {
                    System.out.println("On the seventh day of christmas");
                    System.out.println("my true love sent to me");
                }
                case 8 -> {
                    System.out.println("On the eight day of christmas");
                    System.out.println("my true love sent to me");
                }
                case 9 -> {
                    System.out.println("On the ninth day of christmas");
                    System.out.println("my true love sent to me");
                }
                case 10 -> {
                    System.out.println("On the tenth day of christmas");
                    System.out.println("my true love sent to me");
                }
                case 11 -> {
                    System.out.println("On the eleventh day of christmas");
                    System.out.println("my true love sent to me");
                }
                case 12 -> {
                    System.out.println("On the twelfth day of christmas");
                    System.out.println("my true love sent to me");
                }
                default -> System.out.println("input only number from 1 - 12");
            }


            switch (days) {
                case 12:
                    System.out.println("Twelve drummers drumming");

                case 11:
                    System.out.println("Eleven pipers piping");

                case 10:
                    System.out.println("Ten lords a leaping");

                case 9:
                    System.out.println("Nine ladies dancing");

                case 8:
                    System.out.println("Eight maids a milking");

                case 7:
                    System.out.println("seven swans a swimming");

                case 6:
                    System.out.println("six geese a laying");

                case 5:
                    System.out.println("Five golden rings");

                case 4:
                    System.out.println("four calling birds");

                case 3:
                    System.out.println("Three french hen");

                case 2:
                    System.out.println("Two turtle doves");

                case 1:
                    System.out.println("A partridge in a pear tree");
            }
            System.out.println();


        }
    }
}