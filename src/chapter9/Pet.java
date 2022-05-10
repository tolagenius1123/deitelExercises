package chapter9;

public class Pet {
    private String name;

//    public Pet(String name){
//        this.name = name;
//    }

    public void setName(String petName) {
        name = petName;
    }


    public String getName() {
        return name;
    }

    public String speak() {
        return "I'm your cuddly pet, " + name;
    }
}
