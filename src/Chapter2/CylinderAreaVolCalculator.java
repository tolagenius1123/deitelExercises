package Chapter2;

import java.util.Scanner;

public class CylinderAreaVolCalculator {
   public static void main(String[] args) {
   
   Scanner input = new Scanner(System.in);

   System.out.print("Enter radius of a Cylinder: ");
   double radius = input.nextDouble();
    
   System.out.print("Enter the length of a Cylinder: ");
   double length = input.nextDouble();

   double areaOfCynd = radius * radius * Math.PI;
   double volumeOfCynd = areaOfCynd * length;

   System.out.println();
   
   System.out.printf("The area of the cylinder is %f%n", areaOfCynd);
   System.out.printf("The volume of the cylinder is %f%n", volumeOfCynd);

   }
}
