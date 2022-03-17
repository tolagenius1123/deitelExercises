package tddClass;

public class Kata {

    public int testDriller(int copies) {
        if (copies > 1 && copies <= 4) {
            copies = copies * 2000;
        } else if (copies > 5 && copies <= 9) {
            copies = copies * 1800;
        } else if (copies > 10 && copies <= 29) {
            copies = copies * 1600;
        } else if (copies > 30 && copies <= 49) {
            copies = copies * 1500;
        } else if (copies > 50 && copies <= 99) {
            copies = copies * 1300;
        } else if (copies > 100 && copies <= 199) {
            copies = copies * 1200;
        } else if (copies > 200 && copies <= 499) {
            copies = copies * 1100;
        } else {
            copies = copies * 1000;
        }
        return copies;
    }
}

