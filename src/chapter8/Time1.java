package chapter8;

public class Time1 {
    private int hour;
    private int minutes;
    private int seconds;


    public void setTime(int hour, int minutes, int seconds){
        if (hour < 0 || hour >= 24 || minutes < 0 || minutes >= 60 || seconds < 0 || seconds >= 60){
            throw new IllegalArgumentException(" Invalid input ");
        }

        this.hour = hour;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public void toUniversalString (){
        System.out.printf("%02d:%02d:%02d", hour, minutes, seconds);

    }

//    public void toString(){
//        System.out.printf("%d:%02d:%02d %s", ((hour == 0 || hour == 12)? 12 : hour % 12), minutes, seconds, (hour < 12 ? "am" : "pm"));
//    }

}
