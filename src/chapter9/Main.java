package chapter9;

public class Main {
    public static void main(String[] args) {

        Dog myDog = new Dog();
        Cat myCat = new Cat();



        Person person1 = new Person("Omotola");
        Person person2 = new Person("Jack");

        person1.setMyPet(myDog);
        person2.setMyPet(myCat);

        
    }
}
