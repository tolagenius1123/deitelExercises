package Chapter5;

import java.security.SecureRandom;
import java.util.Scanner;

public class InfiniteLoopsApp {
    public static void main(String[] args) {

        //SecureRandom random = new SecureRandom();
        Scanner input = new Scanner(System.in);

        for(int count = 0; count < 4; count++){
            System.out.println("INFINITE LOOPS");
            System.out.println("Count is " +count);
        }
    }
}
