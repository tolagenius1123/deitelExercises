package Chapter4;

import java.util.Scanner;

public class StudentGrade {

    public static double studentScore;
    public static  String studentName;


    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter Student name: ");
        studentName = keyboard.nextLine();

        System.out.println("Enter Student score: ");
        studentScore = keyboard.nextInt();

        graderApp();




    }


    public static void graderApp(){

        //System.out.println(studentScore >= 75.0 ? "Congratulations! "+studentName+" you got an A in the test." : "Oops! you failed the test");


        if(studentScore >= 75.0){
            System.out.println("Congratulations! " +studentName+ " you got an A in the test.");
        }

        else if (studentScore >= 60.0) {
            System.out.println("Congratulations! " +studentName+ " you got a B in the test.");
        }
        else if (studentScore >= 50.0) {
            System.out.println("Congratulations! " + studentName + " you got a C in the test.");
        }
        else if (studentScore >= 40.0) {
            System.out.println("Oops! " +studentName+ " you got a D in the test, try to put in more efforts.");
        }
        else  {
            System.out.println(studentName+ ", you failed the test, try again next year.");
        }




    }
}
