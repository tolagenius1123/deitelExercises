package tddClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayTest {
    @Test
    public void maxNumInArrayTest(){
    int [] scores = {5, 10, 25, 15, 20};
    assertEquals(25, Array.findMax(scores));

    }

    @Test
    public void minNumInArrayTest(){
        int [] scores = {5, 10, 25, 15, 20};
        assertEquals(5, Array.findMin(scores));

    }

    @Test
    public void averageNumInArrayTest(){
    double [] scores = {5.0, 10.0, 25.0, 15.0, 20.0};
    assertEquals(15.0, Array.findAverage(scores));
    }
}
