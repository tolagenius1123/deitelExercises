package Chapter7;

import java.security.SecureRandom;

public class ArrayPasswordGenerator {
    public static void main(String[] args) {
        char[] password = new char[]
                {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n',
                'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'L', 'K', 'M', 'N',
                '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', 'o', 'p', 'q', 'r', 's', 't', 'u',
                'v', 'w', 'x', 'y', 'z', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

        SecureRandom random = new SecureRandom();

        for (int i = 0; i < 12; i++) {
            String pass = String.valueOf(password[random.nextInt(i + ' ')]);
            System.out.print(pass);
        }
    }
}

