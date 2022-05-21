package Chapter4;

public class TabularOutput {
    public static void main(String[] args) {

        System.out.printf("%7s%7s%7s%7s\n", "N", "N^2", "N^3", "N^4");

        for (int i = 1; i < 6; i++) {
            int N2 = i * i;
            int N3 = N2 * i;
            int N4 = N3 * i;
            System.out.printf("%7d%7d%7d%7d\n", i, N2, N3, N4);

        }
    }
}
