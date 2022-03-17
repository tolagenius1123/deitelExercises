package tddClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AutomaticBikeTest {
    @Test
    public void startBikeTest(){
        //given
        AutomaticBike bike = new AutomaticBike();
        //when
        bike.startBike(true);
        //assert
        assertTrue(bike.getPower());
    }
    @Test
    public void offBikeTest(){
        AutomaticBike bike = new AutomaticBike();
        bike.startBike(false);
        assertFalse(bike.getPower());
    }
    @Test
    public void GearTwoTest(){
        AutomaticBike bike = new AutomaticBike();
       /* bike.increaseSpeed();
        bike.increaseSpeed();
        bike.increaseSpeed();
        bike.increaseSpeed();
        bike.increaseSpeed();//5
        bike.increaseSpeed();
        bike.increaseSpeed();
        bike.increaseSpeed();
        bike.increaseSpeed();
        bike.increaseSpeed();//10
        bike.increaseSpeed();
        bike.increaseSpeed();
        bike.increaseSpeed();
        bike.increaseSpeed();
        bike.increaseSpeed();//15
        bike.increaseSpeed();
        bike.increaseSpeed();
        bike.increaseSpeed();
        bike.increaseSpeed();
        bike.increaseSpeed();//20
        bike.increaseSpeed();
        bike.increaseSpeed();
        bike.increaseSpeed();
        bike.increaseSpeed();
        bike.increaseSpeed();//29*/
        int speed =0;
        while (speed<= 30)
            System.out.println(speed=speed + 2);
            //assertEquals(30, increaseSpeed);
        speed=speed +2;

    }

    @Test
    public void GearThreeTest(){

        AutomaticBike bike = new AutomaticBike();

        bike.increaseSpeed();
        bike.increaseSpeed();
        bike.increaseSpeed();
        bike.increaseSpeed();
        bike.increaseSpeed();//5
        bike.increaseSpeed();
        bike.increaseSpeed();
        bike.increaseSpeed();
        bike.increaseSpeed();
        bike.increaseSpeed();//10
        bike.increaseSpeed();
        bike.increaseSpeed();
        bike.increaseSpeed();
        bike.increaseSpeed();
        bike.increaseSpeed();//15
        bike.increaseSpeed();
        bike.increaseSpeed();
        bike.increaseSpeed();
        bike.increaseSpeed();
        bike.increaseSpeed();//20
        bike.increaseSpeed();
        bike.increaseSpeed();
        bike.increaseSpeed();
        bike.increaseSpeed();
        bike.increaseSpeed();//29
        bike.increaseSpeed();//31
        bike.increaseSpeed();
        bike.increaseSpeed();
        bike.increaseSpeed();


        assertEquals(40, bike.getSpeed());


    }

    @Test
    public void decreaseSpeed(){
        AutomaticBike bike = new AutomaticBike();

        bike.increaseSpeed();
        bike.increaseSpeed();
        bike.increaseSpeed();
        bike.increaseSpeed();
        bike.increaseSpeed();//5
        bike.increaseSpeed();
        bike.increaseSpeed();
        bike.increaseSpeed();
        bike.increaseSpeed();
        bike.increaseSpeed();//10
        bike.increaseSpeed();
        bike.increaseSpeed();
        bike.increaseSpeed();
        bike.increaseSpeed();
        bike.increaseSpeed();//15
        bike.increaseSpeed();
        bike.increaseSpeed();
        bike.increaseSpeed();
        bike.increaseSpeed();
        bike.increaseSpeed();//20
        bike.increaseSpeed();
        bike.increaseSpeed();
        bike.increaseSpeed();//25
        bike.decreaseSpeed();//23

        assertEquals(23, bike.getSpeed());

    }
}




