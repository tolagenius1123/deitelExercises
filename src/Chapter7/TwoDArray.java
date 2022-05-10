package Chapter7;

public class TwoDArray {
    public static void main(String[] args) {
        int[][] matrix = {
                {25, 56, 90},
                {70, 38, 40},
                {67, 78, 92}
        };

        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix.length; column++) {
                if (matrix[row][column] == 92){
                    System.out.println("I found it");
                }
                else{
                    System.out.println("not found");
                }
            }
            
        }
    }
}
