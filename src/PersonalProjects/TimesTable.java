package PersonalProjects;

import java.util.Scanner;

public class TimesTable {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = keyboard.nextInt();

        for (int counter = 1; counter <= 12 ; counter++) {
            int result;
            result = number * counter;
            System.out.println(number +" x "+counter+" = "+result);

        }
    }
}
