package Chapter5;



import java.util.Scanner;

public class StarPrinterApp {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the First Number: ");
        int firstNumber = input.nextInt();

        System.out.println("Enter the Second Number: ");
        int secondNumber = input.nextInt();

        System.out.println("Enter the Third Number: ");
        int thirdNumber = input.nextInt();

        System.out.println("Enter the Fourth Number: ");
        int fourthNumber = input.nextInt();

        System.out.println("Enter the Fifth Number: ");
        int fifthNumber = input.nextInt();

        for(int i = 0; i < firstNumber; i++){
            if (firstNumber <= 30) {
                System.out.print("* ");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println();

        for (int i =0; i < secondNumber; i++)
            {
                if (secondNumber <= 30){
                    System.out.print("* ");
                }
                else{
                    System.out.print(" ");
                }
            }
        System.out.println();

        for (int count = 0; count < thirdNumber; count++){
            if (thirdNumber <= 30){
                System.out.print("* ");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println();

        for (int count = 0; count < fourthNumber; count++){
            if (fourthNumber <= 30){
                System.out.print("* ");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println();

        for (int count = 0; count < fifthNumber; count++){
            if (fifthNumber <= 30){
                System.out.print("* ");
            }
            else{
                System.out.print(" ");
            }
        }
    }


}
