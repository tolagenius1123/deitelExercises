package Chapter2;

import java.util.Scanner;

public class EnergyCalculatorApp {
   public static void main(String[] args){

         Scanner input = new Scanner(System.in);
         
         System.out.print("Enter the amount of water in Kilograms: ");
         double water = input.nextDouble();
         
         System.out.print("Enter the initial temperature: ");
         double temperature1 = input.nextDouble();

         System.out.print("Enter the final temperature: ");
         double temperature2 = input.nextDouble();                                                                                                                                                                                                                                                                                  
         
         double energy = water * (temperature2 - temperature1) * 4184;
         System.out.println("The energy needed is "+ energy);
   }
}
     