package Chapter7;

public class BankAccount {

    private String accountName;
    private String accountNumber;
    private double accountBalance;

    public BankAccount(String accountName, String accountNumber){
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        accountBalance = 0;
    }

    public String getAccountName(){
        return accountName;
    }

    public String getAccountNumber(){
        return accountNumber;
    }

    public void deposit(double amountIn){
        accountBalance += amountIn;
    }

    public boolean withdraw(double amountIn){
        if (amountIn > accountBalance){
            return false;
        }
        else {
            accountBalance -= amountIn;
            return true;
        }
    }

    public double getBalance() {
        return accountBalance;
    }
}
