package tddClass;

import org.junit.jupiter.api.Test;

public class AddEvenTest {
    //loops
    @Test
    public void AddEven() {

        int number = 2;
        while (number <= 100) {
            System.out.print(number + " ");
            number += 2;

        }
    }

}
