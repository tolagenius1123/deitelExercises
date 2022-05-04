package Chapter5;

import java.util.Scanner;

public class NokiaMobile{

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
            case 1 -> {
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
                if (options == 8) {
                    System.out.println("""
                            1. Type of view
                            2. Memory status
                            """);
                }
            }
        }
        switch (nokiaMobile) {
            case 2 -> {
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
                if (messageSettings == 7) {
                    System.out.println("""
                            1. Set
                            2. Common
                            """);
                    int set = nokiaKeypad.nextInt();
                    switch (set) {
                        case 1 -> System.out.println("""
                                1. Message center number
                                2. Message sent as
                                3. Message validity
                                """);
                        case 2 -> System.out.println("""
                                1. Delivery reports
                                2. Reply via same centre
                                3. Character support
                                """);
                    }
                }
            }
        }


        switch (nokiaMobile) {
            case 4 -> {
                System.out.println("""
                        1. Missed calls
                        2. Received calls
                        3. Dialled numbers
                        4. Erase recent call lists
                        5. Show call duration 
                        6. Show call costs
                        7. Call cost settings
                        8. Prepaid credit""");
                int showCallDuration = nokiaKeypad.nextInt();
                switch (showCallDuration) {
                    case 5:
                        System.out.println("""
                                1. Last call duration
                                2. All calls' duration
                                3. Received calls' duration
                                4. Dialled calls' duration
                                5. Clear timers""");
                        break;


                    case 6:
                        System.out.println("""
                                1. Last call cost
                                2. All calls' cost
                                3. Clear counters
                                """);
                        break;


                    case 7:
                        System.out.println("""
                                1. Call cost limit
                                2. Show cost in
                                """);
                        break;
                }
            }
        }

                switch(nokiaMobile) {
                    case 5:
                        System.out.println("""
                                1. Ringing tone
                                2. Ringing volume
                                3. Incoming call alert
                                4. Composer
                                5. Message alert tone
                                6. Keypad tones
                                7. Warning and game tones
                                8. Vibrating alert
                                9. Screen saver
                                """);
                }

                switch(nokiaMobile){
                    case 6:
                        System.out.println("""
                                1. Call settings
                                2. Phone settings
                                3. Security settings
                                4. Restore factory settings
                                
                                """);

                        int callSettings = nokiaKeypad.nextInt();
                        switch (callSettings){
                            case 1:
                            System.out.println("""
                                    1. Automatic redial
                                    2. Speed dialing
                                    3. Call waiting options
                                    4. Own number sending
                                    5. Phone line in use
                                    6. Automatic answer
                                    """);
                            break;

                            case 2:
                                System.out.println("""
                                        1. Language
                                        2. Cell info display
                                        3. Welcome note
                                        4. Network selection
                                        5. Lights
                                            """);
                                break;

                            case 3:
                                System.out.println("""
                                        1. PIN code request 
                                        2. Call barring service
                                        3. Fixed dialling
                                        4. Closed user group
                                        5. Phone security
                                        6. Change access codes""");
                                break;
                        }
                    }

                    switch(nokiaMobile){
                        case 11:
                            System.out.println("""
                                    1. Alarm clock
                                    2. Clock settings
                                    3. Date settings
                                    4. Stop watch
                                    5. Countdown timer
                                    6. Auto update of date and time 
                                    """);
                    }
    }
}
