package chapter2;

import java.util.Scanner;

public class Ctf{
   public static void main (String [] args){
      
      Scanner input = new Scanner (System.in);
      System.out.println ("Input a Degree in Celsius");

      double degreeCelsius = input.nextDouble();
      double degreeFarenheit = ((9.0/5.0) * degreeCelsius) + 32;

      System.out.println (degreeCelsius + " degree celsius is " +degreeFarenheit+ " degree in Farenheit");
   }
} 