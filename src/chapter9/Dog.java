package chapter9;

public class Dog extends Pet {
    public static void main(String[] args) {

        Dog myDog = new Dog();
        myDog.setName("Jack Sparrow");

        System.out.println("Your dog's name is " + myDog.getName());
        System.out.println(myDog.speak());

        myDog.fetch();

    }

    public void fetch() {
        System.out.println("Yes Master, I'll fetch");
    }


}
