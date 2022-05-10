package Chapter7;

import java.util.Scanner;

public class ArrayMethods {
    public static void main(String[] args) {
        int choice;
        int size;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("How many elements to store?: ");
        size = keyboard.nextInt();

        int[] someArray = new int[size];

        fillArray(someArray);

        System.out.println();
        System.out.println("""
                [1] Find maximum
                [2] Calculate sum
                [3] Display values
                [4] Exit
                """);


        System.out.print("Enter choice [1 - 4]: ");
        choice = keyboard.nextInt();
        System.out.println();

        switch (choice) {
            case 1:
                int max = max(someArray);
                System.out.println("Maximum array value = " + max);
                break;
            case 2:
                int total = sum(someArray);
                System.out.println("Sum of array values = " + total);
                break;
            case 3:
                System.out.println("Array values");
                displayArray(someArray);
                break;
            case 4:
                System.out.println("Goodbye!");
        }
//        while (choice == 4) {
//            System.out.println("Goodbye");
//        }
    }


    public static void fillArray(int[] arrayIn) {
        Scanner input = new Scanner(System.in);
        System.out.println();

        for (int i = 0; i < arrayIn.length; i++) {
            System.out.print("Enter value "+(i+1)+ ": ");
            arrayIn[i] = input.nextInt();


        }
    }

    public static int sum(int[] arrayIn) {
        int total = 0;
        for (int currentElement : arrayIn) {
            total += currentElement;

        }
        return total;
    }

    public static int max(int[] arrayIn) {
        int result = arrayIn[0];
        for (int i = 0; i < arrayIn.length; i++) {
            if (arrayIn[i] > result) {
                result = arrayIn[i];
            }

        }
        return result;
    }

    public static void displayArray(int[] arrayIn) {
        for (int i = 0; i < arrayIn.length; i++) {
            System.out.println("array[" + i + "]= " + arrayIn[i]);

        }
    }


}
