package Chapter7;

public class ArrayArithmetic {
    public static int[] number = {2, 4, 6, 8, 10, 1, 3, 5, 7, 9};
    public static double sumOfArray = 0;




    public static void main(String[] args) {
        displayArray();
        maxNumInArray();
        sumOfArray();
        averageNoOfArray();

    }


    public static void displayArray(){

        for (int j : number) {
            System.out.print(j + " ");
        }
    }

    public static void maxNumInArray(){

        System.out.println();
        int max = 0;
        for (int j : number) {
            if (max < j) {
                max = j;
            }

        }
        System.out.println("The Largest no is "+max);

    }

    public static void sumOfArray(){

        for (int j : number) {
            sumOfArray += j;

        }

        System.out.println("The sum of the array = "+sumOfArray);

    }

    public static void averageNoOfArray(){
        System.out.println("The average of the array is "+(sumOfArray/ number.length));
    }
}
