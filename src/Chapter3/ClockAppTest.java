package Chapter3;

import java.util.Scanner;

public class ClockAppTest {
    public static void main(String[] args) {

        ClockApp myClock = new ClockApp(0, 0, 0);

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter hour in digits: ");
        int hour = keyboard.nextInt();
        myClock.setHour(hour);

        System.out.println("Enter minutes in digits: ");
        int minutes = keyboard.nextInt();
        myClock.setMinutes(minutes);

        System.out.println("Enter seconds in digits: ");
        int seconds = keyboard.nextInt();
        myClock.setSeconds(seconds);

        System.out.println();
        myClock.displayTime() ;






    }
}
