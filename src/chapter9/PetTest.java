package chapter9;

import java.util.Scanner;

public class PetTest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Pet myPet = new Pet();

        System.out.print("Enter the name of your pet: ");
        String petName = input.nextLine();
        myPet.setName(petName);

        System.out.println("Your pet's name is " + myPet.getName());
        System.out.println(myPet.speak());
    }
}
