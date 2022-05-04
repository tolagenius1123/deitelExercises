package chapter9;

public class Person {
    String name;
    Pet myPet;

    public String getName() {
        return name;
    }

    public Pet getMyPet() {
        return myPet;
    }

    public void setMyPet(Pet myPet) {
        this.myPet = myPet;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(String name){
        this.name = name;

    }
}
