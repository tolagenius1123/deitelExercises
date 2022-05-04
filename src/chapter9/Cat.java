package chapter9;

public class Cat extends Pet {
    public static void main(String[] args) {

        Cat myCat = new Cat();
        myCat.setName("Jack Sparrow");

        System.out.println(myCat.getName() + " says: ");
        System.out.println(myCat.speak());
    }
//    Method speak automatically overrides the method speak in Super class Pet and as such chooses its own behaviour despite inheriting the behaviours of the Super class.
//    public String speak() {
//
//        return "I only speak only when I want to";
//   }
}
