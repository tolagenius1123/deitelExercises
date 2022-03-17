package chapter2;

import java.util.Scanner;

public class Cylinder {
   public static void main(String[] args) {
   
   Scanner input = new Scanner(System.in);
   System.out.println("Enter radius of a Cylinder ");
   double radius = input.nextDouble();
    
   System.out.println("Enter the length of a Cylinder");
   double length = input.nextDouble();

   double areaOfCynd = radius * radius * Math.PI;
   double volumeOfCynd = areaOfCynd * length;
   
   System.out.printf("The area is %f%n", areaOfCynd);
   System.out.printf("The volume is %f%n", volumeOfCynd);
   }
}
