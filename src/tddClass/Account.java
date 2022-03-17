package tddClass;

public class Account {
    private int balance;

    public void deposit(int amount) {
        balance = balance + amount;
    }
    public int getBalance(){
        return balance;
    }
    public void withdraw(int amount) {
        balance = balance - amount;
    }
}
