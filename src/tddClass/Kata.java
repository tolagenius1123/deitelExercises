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

    public boolean isEven(int number) {
        if (number % 2 == 0)
            return true;
        else return false;
    }

    public boolean isOn(int number) {
        if (number == 1)
            return true;
        else return false;

    }

    public int biggestNumber(int number1, int number2, int number3, int number4, int number5) {
        boolean biggestNo;


        if (number1 > number2 && number1 > number3 && number1 > number4 && number1 > number5)
            return number1;
        else if (number2 > number1 && number2 > number3 && number2 > number4 && number2 > number5)
            return number2;
        else if (number3 > number1 && number3 > number2 && number3 > number4 && number3 > number5)
            return number3;
        else if (number4 > number1 && number4 > number2 && number4 > number3 && number4 > number5)
            return number4;
        else return number5;

    }


    public int findFactors(int number) {
        int integer = 1;
        int counter = 1;

        while (integer < number){
            if (number % integer == 0){
                counter++;
            }
            integer++;
        }

        return counter;
    }

    public boolean findPrime(int number) {
        int factors = 1;
        if (factors <= 2)

            return true;
        return false;

    }


}



