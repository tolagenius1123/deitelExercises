package chapter10;

public class AnimalTest {
    public static void main(String[] args) {

          Lion lion = new Lion();
//        lion.setName("Lion");
//        System.out.println(lion.getName());
//        System.out.println(lion.speak());
//        System.out.println("I was born on "+lion.getDateOfBirth());
//        System.out.println();
//
          Elephant elephant = new Elephant();
//        elephant.setName("Elephant");
//        System.out.println(elephant.getName());
//        System.out.println(elephant.speak());
//        System.out.println("I was born on "+ elephant.getDateOfBirth());


       // Animal [] animal = {lion, elephant};
        Animal lion1 = new Lion();
        Animal elephant1 = new Elephant();
        lion1.speak();
        elephant1.speak();
        lion.speak();
        Animal animal = new Animal();
        animal.speak();

       // animal[0].speak();
        //animal[1].speak();


    }
}
