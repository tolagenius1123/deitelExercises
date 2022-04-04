package Chapter7;

public class ArrayArithmetic {
    public static void main(String[] args) {
        int[] number = {2, 4, 6, 8, 10, 1, 3, 5, 7, 9};




            for(int i = 0; i < number.length; i++){
                System.out.print(number[i]+ " ");
             }

            System.out.println();
            int max = 0;
            for(int i = 0; i < number.length; i++){
                if (max < number[i]) {
                    max = number[i];
                }
            }
            System.out.println("The Largest no is "+max);

        double sumOfArray = number[0]+number[1]+number[2]+number[3]+number[4]+number[5]+number[6]+number[7]+number[8]+number[9];
        System.out.println("The sum of the array = "+sumOfArray);


        System.out.println("The average of the array is "+(sumOfArray/10));
    }
}
