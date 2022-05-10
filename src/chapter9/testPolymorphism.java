package chapter9;

public class testPolymorphism {
    public static void main(String[] args) {

        Pet petOne;
        Pet petTwo;

        petOne = new Dog();
        petOne.setName("Jack Sparrow");
        System.out.println(petOne.speak()+" It is "+petOne.getName());
        System.out.println( ((Dog)petOne).fetch() );
        System.out.println();

        petTwo = new Cat();
        petTwo.setName("Whisker");
        System.out.println(petTwo.speak()+" It is "+petTwo.getName());
    }
}
