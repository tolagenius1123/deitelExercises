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

        /*AccountClass accountClass1 = new AccountClass("Jane Green");
        AccountClass accountClass2 = new AccountClass("Omotola");

        System.out.println("AccountClass1 name is "+accountClass1.getName());
        System.out.println("AccountClass2 name is "+accountClass2.getName());*/
    }
}
