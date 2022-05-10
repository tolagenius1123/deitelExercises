package Chapter7;

import java.util.Scanner;

public class MultiArray {
    public static void main(String[] args) {
        Scanner  keyboard = new Scanner(System.in);
        char choice;

        double[][] temperature = new double[4][7];

        enterTemp(temperature);
        displayTemp(temperature);


//        System.out.println("""
//                [1] Enter Temperatures
//                [2] Display Temperatures
//
//                """);





    }

    public static void enterTemp(double[][] temperatureIn){
        Scanner keyboard = new Scanner(System.in);
        for (int week = 1; week <= temperatureIn.length ; week++) {
            for (int day = 1; day <= temperatureIn[0].length; day++) {
                System.out.print("Enter temperature for week "+week+" and day "+day+": ");
                temperatureIn[week-1][day-1] = keyboard.nextDouble();
            }
            
        }
    }

    public static void displayTemp(double[][] temperatureIn){
        System.out.println();
        System.out.println("***TEMPERATURES ENTERED***");
        for (int week = 1; week <= temperatureIn.length ; week++) {
            for (int day = 1; day <= temperatureIn[0].length; day++) {
                System.out.println("week "+week+ " day "+day+": "+temperatureIn[week-1][day-1]);

            }

        }
    }
}
