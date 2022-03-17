package chapter2;

import java.util.Scanner;

public class Zuba {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a digit: ");
        int digit = input.nextInt();

        if (digit == 0){
            System.out.println("1");}

            if (digit == 1){
                System.out.println("0");
        }
    }
}
