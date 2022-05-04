package Chapter7;

public class ArraySum {
    public static void main(String[] args) {

//        int [] array = {1, 2, 3, 4, 15, 6, 7, 8, 9, 10};
//
//
//        int sum = 0;
//        for (int j : array) {
//            sum += j;
//        }
//        int max = array[0];
//        for (int j : array) {
//            if (j > max)
//
//
//            {
//                max = j;
//
//            }
//
//        }
//        System.out.println("Max no is "+max);
//
//        System.out.println(sum);

        int[][] array = {
                {1, 2, 3},
                {1, 2, 3},
        };

        int sum = 0;
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                sum += array[row][column];

            }
            
        }
        System.out.println(sum);


    }
}
