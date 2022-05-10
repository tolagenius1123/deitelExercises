package Chapter7;

import java.util.Scanner;
import java.util.ArrayList;

public class BankAccountMain {
    public static void main(String[] args) {

        ArrayList <BankAccount> accountList = new ArrayList<>();

        accountList.add(new BankAccount("Omotola", "007"));
        accountList.add(new BankAccount("Love", "069"));
        accountList.add(new BankAccount("James", "150"));

        accountList.get(0).deposit(10000);
        accountList.get(0).withdraw(5000);

        accountList.get(1).deposit(7000);
        accountList.get(1).withdraw(5000);

        for (int i = 0; i < accountList.size(); i++) {
            System.out.println("Account number: "+ accountList.get(i).getAccountNumber());
            System.out.println("Account name: "+accountList.get(i).getAccountName());
            System.out.println("Account balance: "+accountList.get(i).getBalance());
            System.out.println();

        }
            
        }
        


//        Scanner keyboard = new Scanner(System.in);
//        double amount;
//        boolean ok;
//
//        BankAccountClass account1 = new BankAccountClass("Jinadu Omotola", "2348141366380");
//
//        System.out.print("Enter amount to deposit: ");
//        amount = keyboard.nextDouble();
//        account1.deposit(amount);
//        System.out.println("Deposit was made");
//        System.out.println("Balance = "+account1.getBalance());
//
//        System.out.println();
//        System.out.print("Enter amount to withdraw: ");
//        amount = keyboard.nextDouble();
//        ok = account1.withdraw(amount);
//
//        if (ok) {
//            System.out.println("Withdrawal was made");
//        }
//        else {
//            System.out.println("Insufficient funds");
//        }
//
//        System.out.println("Balance = "+account1.getBalance());
//        System.out.println();

    }
