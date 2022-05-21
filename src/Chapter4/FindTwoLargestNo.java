package Chapter4;

import java.util.Scanner;

public class FindTwoLargestNo {
    public static void main(String[] args) {

        int largestNo = 1;
        int secondLargestNo = 1;



        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {

            System.out.print("Enter a number: ");
            int number = input.nextInt();
            if (number > largestNo){
                largestNo = number;
            }
            if (number < largestNo){
                secondLargestNo = number;
            }
        }
        System.out.println("The largest is "+largestNo);
        System.out.println("The second largest number is "+secondLargestNo);

    }
}
