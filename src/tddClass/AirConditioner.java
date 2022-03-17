package tddClass;

public class AirConditioner {

    private int temperature = 16;
    private String cooler;
    private boolean On;
    private boolean Off;

    public void setName(String panasonic) {
        this.cooler = panasonic;
    }

    public String getName() {
        return cooler;
    }


    public void setOn(boolean on) {
        this.On = on;

    }

    public boolean getOn() {
        return true;
    }

    public void setOff(boolean off) {
        this.Off = off;
    }

    public boolean getOff() {
        return Off;
    }

    public void setTemperature(int temperature2){
        this.temperature = temperature2;
    }

    public void addTemp(int temperature2 ) {
        if (temperature2 > temperature && temperature < 30) {
            temperature = temperature2;
        }

    }

    public int getTemperature() {
        return temperature;
    }


    public void reduceTemp(int temperature2) {
        if (temperature2 > 16 && temperature2 < 30) {
            temperature = temperature - 1;


        }
    }

    public int maxTemp() {
        if (temperature > 16) { temperature = 16;}
        return temperature;
    }

    public int minTemp() {
        if (temperature < 16)
            temperature = 16;
        return temperature;
    }
}
