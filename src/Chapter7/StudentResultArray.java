package Chapter7;

import java.util.Scanner;

public class StudentResultArray {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter no of students: ");
        int students = keyboard.nextInt();

        System.out.print("Enter no of subjects: ");
        int subjects = keyboard.nextInt();

        int[][] matrix = new int[students][subjects];

        for (int num = 0; num < students; num++) {
            for (int j = 0; j < subjects; j++) {
                System.out.println("Enter student score: ");
                int studentScore = keyboard.nextInt();
                matrix[num][j] = studentScore;
            }
        }


        for (int num = 0; num < students; num++) {
            for (int j = 0; j < subjects; j++) {
                System.out.print(matrix[num][j] + " ");

            }
            System.out.println( );
        }
    }
}