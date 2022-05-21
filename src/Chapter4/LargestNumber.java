package Chapter4;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {

        int LENGTH = 10;
        int largest = 0;



        Scanner input = new Scanner(System.in);

        for (int i = 0; i < LENGTH; i++) {

            System.out.print("Input no of units sold by salesman "+(i+1)+": ");
            int number = input.nextInt();
            if (number > largest){
                largest = number;
            }
        }
            System.out.println("The largest number of units sold is "+largest);
        }
    }

