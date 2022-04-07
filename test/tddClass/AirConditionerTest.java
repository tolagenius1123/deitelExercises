package tddClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class AirConditionerTest {

    @Test
    public void turnON(){
    //given
        AirConditioner cooler = new AirConditioner();
    //when
    cooler.setOn(true);
    //assert
        assertTrue(cooler.getOn());
    }

    @Test
    public void turnOff(){
    //given
    AirConditioner cooler = new AirConditioner();

    //when
    cooler.setOff(false);

    //assert
        assertFalse(cooler.getOff());

    }

    @Test
    public void increaseTemp(){
    //given
    AirConditioner cooler = new AirConditioner();

    //when
    cooler.addTemp(1);

    //assert
    assertEquals(17,cooler.getTemperature());

    }
    @Test
    public void decreaseTemp(){
    //given
    AirConditioner cooler = new AirConditioner();
    cooler.addTemp(2);

    //when
    cooler.reduceTemp(1);

    //assert
    assertEquals(17, cooler.getTemperature());

    }

    @Test
    public void maxTemp(){

    //given
    AirConditioner cooler = new AirConditioner();

    //when
    cooler.addTemp(14);
    cooler.maxTemp();

    //assert
    assertEquals(30,cooler.getTemperature());

    }

    @Test
    public void minTemp(){

    //GIVEN
    AirConditioner cooler = new AirConditioner();

    //WHEN
    cooler.minTemp();

    //ASSERT
    assertEquals(16, cooler.getTemperature());


    }
}
