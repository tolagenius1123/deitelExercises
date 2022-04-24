package chapter8;

public class Time {

    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        validate(hour, minute, second);
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void setTime(int hour, int minute, int second) {
        validate(hour, minute, second);

        this.hour = hour;
        this.minute = minute;
        this.second = second;

    }

    private void validate(int hour, int minute, int second) {
        validateHourWith(hour);
        validateMinuteWith(minute);
        validateSecondsWith(second);


    }

    private void validateHourWith(int hour) {
        boolean hourIsInvalid = hour < 0 || hour >= 24;
        if (hourIsInvalid) throw new IllegalArgumentException("Invalid hour");
    }

    private void validateMinuteWith(int minute) {
        boolean minuteIsInvalid = minute < 0 || minute >= 60;
        if (minuteIsInvalid) throw new IllegalArgumentException("Invalid minute");
    }

    private void validateSecondsWith(int second) {
        boolean secondIsInvalid = second < 0 || second >= 60;
        if (secondIsInvalid) throw new IllegalArgumentException("Invalid seconds");
    }


}
