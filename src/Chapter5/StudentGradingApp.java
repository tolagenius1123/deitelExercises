package Chapter5;

import java.util.Scanner;

public class StudentGradingApp {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = input.nextLine();

        System.out.print("Enter Student Score: ");
        double score = input.nextInt();

        //System.out.println(score >= 70 ? "Passed" : "Failed");

        if(score >= 75.0){
            System.out.println("Congratulations! " +name+ " you got an A in the test.");
            }

        else if (score >= 60.0) {
                System.out.println("Congratulations! " +name+ " you got a B in the test.");
            }
        else if (score >= 50.0) {
            System.out.println("Congratulations! " + name + " you got a C in the test.");
            }
        else if (score >= 40.0) {
            System.out.println("Oops! " +name+ " you got a D in the test, try to put in more efforts.");
            }
        else  {
            System.out.println(name+ ", you failed the test, try again next year.");
        }

    }
}



