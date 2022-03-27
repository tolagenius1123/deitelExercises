package tddClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class KataTest {
    @Test
    public void testDriller(){
        Kata driller = new Kata();
        int copies = driller.testDriller(11);
        assertEquals(17600,copies);
    }

    @Test
    public void isEvenOrIsOdd(){
        //given
        Kata isEvenOrIsOddDetector = new Kata();
        //when
        boolean result = isEvenOrIsOddDetector.isEven(11);
        //assert
        assertFalse(result);
    }
    @Test
    public void isOnOrOff(){
    //given
    Kata isOnOrOffDetector = new Kata();
    //when
    boolean result = isOnOrOffDetector.isOn(1);
    //assert
    assertTrue(result);
    }
    @Test
    public void biggestNumber(){
    //given
    Kata biggestNumberDetector = new Kata();
    //when
    int result = biggestNumberDetector.biggestNumber(2, 5, 10, 15, 7);
    assertEquals(15,result);
    }
    @Test
    //loops
    public void noOfFactors(){
        //given
        Kata findNoOfFactors = new Kata();
        //when
        int result = findNoOfFactors.findFactors(10);
        //assert
        assertEquals(4, result);
    }
    @Test
    public void primeNumbers(){
        //given
        Kata findPrimeNumbers = new Kata();
        //when
        boolean result = findPrimeNumbers.findPrime(5);
        //assert
        assertTrue(result);
    }


}

