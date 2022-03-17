package tddClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KataTest {
    @Test
    public void testDriller(){
        Kata driller = new Kata();
        int copies = driller.testDriller(11);
        assertEquals(17600,copies);





    }
}
