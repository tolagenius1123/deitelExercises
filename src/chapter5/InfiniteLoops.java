package chapter5;

import java.security.SecureRandom;
import java.util.Scanner;

public class InfiniteLoops {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        Scanner input = new Scanner(System.in);
        int count = 0;
        for(;count <= 4;){
            System.out.println("AsherFlo");
            count = random.nextInt(5);
            System.out.println("Count is" +count);
        }
    }
}
