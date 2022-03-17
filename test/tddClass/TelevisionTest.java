package tddClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TelevisionTest {
    @Test
    public void turnOnTelevisionTest() {
        Television samsung = new Television("samsung");
        assertFalse(samsung.isOn());
        samsung.setOn();
        assertTrue(samsung.isOn());

    }

    @Test
    public void turnOffTelevisionTest() {
        Television samsung = new Television("samsung");
        assertFalse(samsung.isOn());
        samsung.setOn();
        assertTrue(samsung.isOn());
        samsung.setOff();
        assertFalse(samsung.isOn());
    }

    @Test
    public void televisionCanIncreaseVolume(){
        Television samsung = new Television("samsung");
        samsung.setOn();
        assertTrue(samsung.isOn());
        samsung.increaseVolume();
        samsung.increaseVolume();
        assertEquals(2,samsung.getVolume());

    }
    @Test
    public void televisionCanBeDecreaseVolume() {
        Television samsung = new Television("samsung");
        samsung.setOn();
        assertTrue(samsung.isOn());
        samsung.increaseVolume();
        samsung.increaseVolume();
        samsung.increaseVolume();
        samsung.increaseVolume();
        samsung.decreaseVolume();
        assertEquals(3, samsung.getVolume());
    }
    @Test
    public void setChannel(){
        Television samsung = new Television("samsung");
        samsung.setOn();
        samsung.setChannel(119);
        assertEquals(119, samsung.getChannel());
    }
    @Test
    public void increaseChannel(){
        Television samsung = new Television("samsung");
        samsung.setOn();
        samsung.setChannel(199);
        samsung.increaseChannel();
        samsung.increaseChannel();
        assertEquals(201, samsung.getChannel());


    }
    @Test
    public void changeChannel(){
        Television samsung = new Television("samsung");
        samsung.setOn();
        samsung.setChannel(199);
        samsung.changeChannel(256);
        assertEquals(256, samsung.getChannel());}
}

