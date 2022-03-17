package tddClass;

public class AutomaticBike {
    private boolean turnOn;
    private int speed ;


    public void startBike(boolean powerOn ) {
        turnOn = powerOn;

    }

    public boolean getPower() {
        return turnOn;
    }

    public void increaseSpeed() {
        if (speed >30 && speed <= 40)
        {speed = speed + 3;}

        if (speed >20 && speed <= 30)
        {speed = speed + 2;}

        if (speed <= 20)
    {speed = speed + 1;}

    }


    public int getSpeed(){
     return speed;
    }


    public void decreaseSpeed() {
        if (speed > 40) {speed = speed - 4;}
        if (speed >30 && speed <= 40) {speed = speed - 3;}
        if (speed > 20 &&  speed <= 30 ) {speed = speed - 2;}
        if (speed <= 20) {speed = speed - 1;}

    }
}
