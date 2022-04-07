package tddClass;

public class Array {


    public static int findMax(int[]scores){
        int max = 0;
        for(int i = 0; i < scores.length; i++){
            if (max < scores[i]) {
                max = scores[i];
            }

    }
        return max;
    }

    public static int findMin (int[] scores){
        int min = 5;
        for(int i = 0; i < scores.length; i++){
            if (min >= scores[i])
                min =scores[i];

        }
        return min;
    }

    public static double findAverage (double[] scores) {
        double sumOfArray = scores[0] + scores[1] + scores[2] + scores[3] + scores[4];
        double averageNum = sumOfArray/ scores.length;

        return averageNum;
    }





}
