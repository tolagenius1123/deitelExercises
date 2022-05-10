package chapter9;

public class Cat extends Pet {
    public static void main(String[] args) {

        Cat myCat = new Cat();
        myCat.setName("Jack Sparrow");

        System.out.println(myCat.getName() + " says: ");
        System.out.println(myCat.speak());
    }
    //Method speak automatically overrides the method speak in Super class Pet
    public String speak() {

        return "Meow Meow";
   }
}
