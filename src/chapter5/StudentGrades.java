package chapter5;


import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int aCounter = 0;
        int bCounter = 0;
        int cCounter = 0;
        int dCounter = 0;

        for (int i = 0; i <= 4; i++) {
            System.out.print("Enter student name: ");
            String name = input.nextLine();

            System.out.print("Enter student grade: ");
            String grade = input.nextLine();     //toUpperCase();


            switch (grade){
                case "A":
                    aCounter++;
                    break;

                case "B":
                    bCounter++;
                    break;

                case "C":
                    cCounter++;
                    break;

                case "D":
                    dCounter++;
                    break;

            }



        }


        System.out.println ("We have "+aCounter+ " grade A");
        System.out.println ("We have "+bCounter+ " grade B");
        System.out.println ("We have "+cCounter+ " grade C");
        System.out.println ("We have "+dCounter+ " grade D");

        }
    }
