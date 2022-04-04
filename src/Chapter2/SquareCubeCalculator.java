package Chapter2;

public class SquareCubeCalculator {
    public static void main(String[] args) {

        calculator();


    }


    public static void calculator() {


        int number;
        for (number = 2; number <= 6; number++) {
            int numberSquare = number * number; numberSquare++;
            int numberCube = numberSquare * number; numberCube++;


            System.out.println("Number   Square       Cube");
            System.out.println("==========================");
            System.out.printf("%d         %d           %d%n", number++, numberSquare, numberCube);
            System.out.printf("%d         %d           %d%n", number++, numberSquare, numberCube);
            System.out.printf("%d         %d           %d%n", number++, numberSquare, numberCube);
            System.out.printf("%d         %d           %d%n", number++, numberSquare, numberCube);
            System.out.printf("%d         %d           %d%n", number++, numberSquare,numberCube);

        }
    }
}


