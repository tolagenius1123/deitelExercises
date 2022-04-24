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
        int[][] total = new int[students][1];
        double[][] average = new double[students][1];

        for (int i = 0; i < students; i++) {
            for (int j = 0; j < subjects; j++) {
                System.out.println("Enter student score: ");
                int studentScore = keyboard.nextInt();
                matrix[i][j] = studentScore;
            }
        }
        for (int i = 0; i < students; i++) {
            int sum = 0;
            for (int j = 0; j < subjects; j++) {
                sum = sum + matrix[i][j];
                total[i][0] = sum;
                average[i][0] = sum*1.0/subjects;
            }
        }



        System.out.println();
        printShape();
        System.out.print("STUDENTS      " + "SUB1   ");

        for (int i = 1; i < subjects; i++) {
            System.out.print("SUB" + (i + 1) + "    ");
        }
        System.out.println("TOT      AVG");
        printShape();
        for (int i = 0; i < students; i++) {
            System.out.print("Student" + (i + 1) + "      ");
            for (int j = 0; j < subjects; j++) {
                System.out.print(matrix[i][j] + "      ");

            }
            for (int j = 0; j < 1; j++) {
                System.out.print(total[i][j] + "     ");

            }
            for (int j = 0; j < 1; j++) {
                System.out.printf("%.2f    ",average[i][j]);

            }
            System.out.println();
        }
        printShape();
        printShape();
    }
    public static void printShape(){
        String shape = "=";
        System.out.print(shape.repeat(55));
        System.out.println();
    }

}