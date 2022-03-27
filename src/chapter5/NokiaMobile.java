package chapter5;

import java.util.Scanner;

public class NokiaMobile {
    public static void main(String[] args) {

        Scanner nokiaKeypad = new Scanner(System.in);

        System.out.println("""
                List of Menu Functions:
                1.  Phone book
                2.  Messages
                3.  Chat
                4.  Call register
                5.  Tones
                6.  Settings
                7.  Call divert
                8.  Games
                9.  Calculator
                10. Reminders
                11. Clock
                12. Profiles
                13. SIM services
                         """);

        System.out.println("Enter a number: ");
        int nokiaMobile = nokiaKeypad.nextInt();
        switch (nokiaMobile) {
            case 1:
                System.out.println("""
                        Phone book:
                        1.  Search
                        2.  Service Nos
                        3.  Add name
                        4.  Erase
                        5.  Edit
                        6.  Assign tone
                        7.  Send b' card
                        8.  Options
                        9.  Speed dials
                        10. Voice tags""");

                int options = nokiaKeypad.nextInt();
                switch (options) {
                    case 8:
                        System.out.println("""
                                1. Type of view
                                2. Memory status
                                """);
                        break;

                }
        }
        switch (nokiaMobile) {
            case 2:
                System.out.println("""
                        Messages:
                        1.  Write messages
                        2.  Inbox
                        3.  Outbox
                        4.  Picture messages
                        5.  Templates
                        6.  Smileys
                        7.  Messages settings
                        8.  Info service
                        9.  Voice mailbox number
                        10. Service command editor
                        """);

                int messageSettings = nokiaKeypad.nextInt();
                switch (messageSettings) {
                    case 7:
                        System.out.println("""
                                1. Set
                                2. Common
                                """);
                        int set = nokiaKeypad.nextInt();
                        switch (set) {
                            case 1:
                                System.out.println("""
                                        1. Message center number
                                        2. Message sent as
                                        3. Message validity
                                        """);
                                break;
                        }
                        break;
                }
                int common = nokiaKeypad.nextInt();
                switch (common) {
                    case 2:
                        System.out.println("""
                                1. Delivery reports
                                2. Reply via same centre
                                3. Character support
                                """);
                        break;
                }
        }
    }
}