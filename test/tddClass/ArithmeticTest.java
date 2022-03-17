package tddClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArithmeticTest {
    @Test
    public void multiplication(){
      Multiplication multiply = new Multiplication();
      multiply.setMultiply(9,3);
      assertEquals(27,multiply.getMultiply());


    }
}