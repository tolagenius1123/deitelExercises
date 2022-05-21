package PersonalProjects;

public class ZeroArray {
    public static void main(String[] args) {
        int [] array = new int[20];

        for (int i = 0; i < array.length; i++) {
            array[i] += 0;
            System.out.println(array[i]);
        }

    }
}
