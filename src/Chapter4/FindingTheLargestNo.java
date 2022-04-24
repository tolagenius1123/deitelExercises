package Chapter4;

import java.util.Scanner;

public class FindingTheLargestNo {
    public static void main(String[] args) {

        int[] studentScores = new int[10];
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter Student 1 score:");
         studentScores[0] = keyboard.nextInt();
        int max = studentScores[0];
        int min = studentScores[0];
        int total = studentScores[0];
        int average;


        for (int i = 1; i < 10; i++) {
            System.out.print("Enter Student " + (i + 1) + " score:");
            int scores = keyboard.nextInt();
            studentScores[i] = scores;
            total += scores;

            if (studentScores[i] > max) {
                max = studentScores[i];
            }
            if (studentScores[i] < min){
                min = studentScores[i];
            }


        }
        average = total / studentScores.length;
        System.out.println();

        //System.out.println(Arrays.toString(studentScores));
        System.out.println("The highest score is " + max);
        System.out.println("The lowest score is " + min);
        System.out.println("The sum of all the Student's score is " + total);
        System.out.println("The average of all the Student's score is " + average);


    }
}