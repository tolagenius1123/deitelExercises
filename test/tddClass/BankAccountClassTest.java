package tddClass;

import Chapter7.BankAccount;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class BankAccountClassTest {

    @Test
    public void testThatAccountCanBeCreated(){
        BankAccount account1 = new BankAccount("Omotola", "2086216595");
        assertNotNull(account1);
    }

    @Test
    public void testThatWeCanDeposit(){
        BankAccount account1 = new BankAccount("Omotola", "2086216595");
        account1.deposit(7000);
        assertEquals(7000, account1.getBalance());
    }

    @Test
    public void testThatWeCanWithdraw(){
        BankAccount account1 = new BankAccount("Omotola", "2086216595");
        account1.deposit(7000);
        account1.withdraw(5000);
        assertEquals(2000, account1.getBalance());

    }

    @Test
    public void testThatICanWithdraw(){
        ArrayList <BankAccount> accountList = new ArrayList<>();
        accountList.add( new BankAccount("Omotola", "150906022"));
        accountList.get(0).deposit(7000);
        accountList.get(0).withdraw(5000);
        assertEquals(2000, accountList.get(0).getBalance());
    }
}
