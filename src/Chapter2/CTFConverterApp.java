package Chapter2;

import java.util.Scanner;

public class CTFConverterApp {
   public static void main (String [] args){
      
      Scanner input = new Scanner (System.in);

      System.out.print("Input a Degree in Celsius: ");
      double degreeCelsius = input.nextDouble();

      double degreeFarenheit = ((9.0/5.0) * degreeCelsius) + 32;

      System.out.println (degreeCelsius + " degree celsius is " +degreeFarenheit+ " degree in Farenheit");
   }
} 