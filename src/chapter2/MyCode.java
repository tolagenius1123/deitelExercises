package chapter2;

import java.util.Scanner;

public class MyCode {
    public static void main(String[] args){

        Scanner yourName = new Scanner(System.in);

        System.out.println("Hello! What is your name: ");
        String name =  yourName.nextLine();

        System.out.println(name+ " you are welcome!");



    }
}
