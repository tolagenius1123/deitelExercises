package Chapter7;

import java.util.Scanner;

public class TemperatureReadings {

    private static double[] temperature;


    public static void main(String[] args) {
        collectUserInput();
        displayTemperatures();


    }


    public static void collectUserInput() {
        temperature = new double[5];

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < temperature.length; i++) {
            System.out.print("Enter temperature for day " + (i + 1) + ": ");
            temperature[i] = input.nextDouble();
        }
    }


    public static void displayTemperatures() {
        System.out.println();
        System.out.println("***TEMPERATURES ENTERED***");
        System.out.println();

        for (int i = 0; i < temperature.length; i++) {
            System.out.println("Day " + (i + 1) + ": " + temperature[i]);

        }
    }
}