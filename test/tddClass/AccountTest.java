package tddClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {
    @Test
    public void depositTest(){
    //given
    Account tola = new Account();
    //when
    tola.deposit(5000);
    tola.deposit(5000);
    //assert
    assertEquals(10000, tola.getBalance());
    }
    @Test
    public void withdrawalTest(){
    //given
    Account tola = new Account();
    //when
    tola.deposit(10000);
    tola.withdraw(5000);
    //assert
    assertEquals(5000, tola.getBalance());

    }


}
