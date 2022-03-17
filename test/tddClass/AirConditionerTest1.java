package tddClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AirConditionerTest1 {

    @Test
    public void turnON(){
    //given
        AirConditioner cooler = new AirConditioner();
    //when
    cooler.setOn(true);
    //assert
        assertEquals(true,cooler.getOn());
    }
    @Test
    public void turnOff(){
    //given
    AirConditioner cooler = new AirConditioner();
    //when
    cooler.setOff(false);
    //assert
    assertEquals(false,cooler.getOff());
    }
    @Test
    public void increaseTemp(){
    //given
    AirConditioner cooler = new AirConditioner();
    //cooler.addTemp(22);
    //when
    cooler.addTemp(23);
    cooler.getTemperature();
    //assert
    assertEquals(23,cooler.getTemperature());

    }
    @Test
    public void decreaseTemp(){
    //given
    AirConditioner cooler = new AirConditioner();
    cooler.addTemp(25);
    //when
    cooler.reduceTemp(24);
    //assert
    assertEquals(24, cooler.getTemperature());
    }
    @Test
    public void maxTemp(){
    //given
        AirConditioner cooler = new AirConditioner();
    //when
    cooler.maxTemp();
    cooler.getTemperature();
    assertEquals(16,cooler.getTemperature());

    }
    @Test
    public void minTemp(){
    //given
        AirConditioner cooler = new AirConditioner();
    //when
    cooler.minTemp();


    }
}
