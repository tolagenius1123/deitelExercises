package chapter5;

public class TriangleLoop {
    public static void main(String[] args) {

        int x = 5;
        for (int row = 1; row <= x; row++) {
            for (int column = 1; column <= row; column++) {
                System.out.print(column);
            }
            System.out.println(" ");

        }
        System.out.println();

        for (int row1 = 1; row1 <= x; row1++) {
            for(int column1 = 5; column1 >= row1; column1 --){
                System.out.print(column1);
            }
            System.out.println(" ");
        }
        System.out.println();

        for(int row2 = 1; row2 < x; row2++){
            int y = 1;
            for(int j = 1; j <= row2; j++) {
                System.out.print(" ");
            }
            for(int j = row2; j <= row2; j++) {
                System.out.print(y++ + " ");
            }
            System.out.println();
            }
        }

    }





