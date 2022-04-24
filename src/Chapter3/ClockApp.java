package Chapter3;

public class ClockApp {


    private int hour;
    private int minutes;
    private int seconds;


    public ClockApp(int hour, int minutes, int seconds) {
        this.hour = hour;
        this.minutes = minutes;
        this.seconds = seconds;

    }

    public void setHour(int hour) {
        this.hour = hour;
        if (hour > 23) {
            this.hour = 0;

        }
    }

    public int getHour() {
        return hour;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;

        if (minutes > 59) {
            this.minutes = 0;
        }
    }

    public int getMinutes() {
        return minutes;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;

        if (seconds > 59) {
            this.seconds = 0;
        }
    }

    public int getSeconds() {
        return seconds;
    }

    public void displayTime() {
        System.out.println("The time is " + getHour() + ":" + getMinutes() + ":" + getSeconds());

    }
}

















