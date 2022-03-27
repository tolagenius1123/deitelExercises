package chapter5;

import java.util.Scanner;

public class MyStudent {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = input.nextLine();

        System.out.print("Enter Student Score: ");
        int score = input.nextInt();

        System.out.println(score >= 70 ? "Passed" : "Failed");

        /*if(score >= 75){
            System.out.println("Congratulations! " +name+ " got an A in the test");
        }

        else if (score >= 60) {
                System.out.println("Congratulations! " +name+ " got a B in the test");
        }*/
    }
}



