package Chapter7;

public class ArrayClasswork {
    public static void main(String[] args) {

        int[] arraylist = new int[300];

        for (int num1 = 0; num1 < arraylist.length; num1++) {
            arraylist[0] = 1 + num1;

            System.out.print(arraylist[0] + " ");

        }

    }
}

