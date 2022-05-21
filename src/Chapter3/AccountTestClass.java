package Chapter3;

import java.util.Scanner;

public class AccountTestClass {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        AccountClass myAccount = new AccountClass("Null");

        System.out.println("Initial name is: " +myAccount.getName());

        System.out.print("Please enter name: ");
        String theName = input.nextLine();

        myAccount.setName(theName);
        System.out.println("Name in object myAccount is: " +myAccount.getName());


    }
}
