package chapter9;

public class Tuna {
    private String name;
    private Potpie birthday;

    public Tuna(String theName, Potpie theDate){
        name = theName;
        birthday = theDate;
    }

    public String toString(){
        return String.format("My name is %s, my birthday %s", name, birthday );
    }
}
