package tddClass;


public class AirConditioner {

    private int temp = 16;
    private boolean on;
    private boolean off;


    public void setOn(boolean on) {
        this.on = on;

    }

    public boolean getOn() {

        return true;
    }

    public void setOff(boolean off) {

        this.off = off;
    }

    public boolean getOff() {

        return off;
    }


    public void addTemp(int temperature) {

        if (temp >= 16 && temp < 30) {
            temp += temperature;
        }

    }

    public int getTemperature() {

        return temp;
    }


    public void reduceTemp(int temperature) {
        if (temp < 30) {
            temp = temp - temperature;


        }
    }

    public int maxTemp() {
        if (temp >= 30) {
            System.out.println("Max");
        }

        return 0;
    }

    public int minTemp() {
        if (temp <= 16) {
            System.out.println("Min");
        }
        return 0;
    }
}
