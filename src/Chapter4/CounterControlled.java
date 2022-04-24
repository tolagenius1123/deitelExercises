package Chapter4;

import java.util.Scanner;

public class CounterControlled {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int total = 0;
        int counter = 1;

        while (counter <= 10) {
            System.out.print("Enter student"+counter+" score: ");
            int grade = keyboard.nextInt();
            total += grade;
            counter++;

        }
        int average = total / 10;
        System.out.println("Total of all grades is " + total);
        System.out.println("Average of all grades is " + average);
    }
}
