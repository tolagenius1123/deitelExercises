package Chapter4;

import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {

        int[] noOfTrips;
        int milesDriven;
        int gallonsUsed;
        double milesPerGallon;
        double totalMilesPerGallon = 0;

        Scanner input = new Scanner(System.in);

        System.out.println(".:MPG CALCULATOR:.");
        System.out.println("==================");
        System.out.println();



        int userInput = 0;

        while (userInput != -1) {
            System.out.println("do you wish to proceed? 1 to continue, -1 to terminate");
            userInput = input.nextInt();
            for (int i = 0; i < userInput; i++) {
                System.out.print("Enter miles driven for trip " + (i + 1) + ": ");
                milesDriven = input.nextInt();
                System.out.print("Enter gallons used for trip " + (i + 1) + ": ");
                gallonsUsed = input.nextInt();
                milesPerGallon = (double) milesDriven / gallonsUsed;
                System.out.print("Miles per gallon for trip " + (i + 1) + ": " + milesPerGallon);
                System.out.println();
                System.out.println();
                totalMilesPerGallon += milesPerGallon;
            }
        }
            System.out.println("The total Miles per Gallon(MPG) for all the trips = " + totalMilesPerGallon);

    }
}
