package Chapter2;

import java.util.Scanner;

public class BitFlipperApp {
    public static void main(String[]args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a digit between 1 and 0: ");
        int digit = input.nextInt();

        if (digit == 0){
            System.out.println("1");
            }
            else if (digit == 1){
                System.out.println("0");
                }
                else if (digit != 1 && digit !=0){
                    System.out.println("Invalid digit");
                    }

    }
}
