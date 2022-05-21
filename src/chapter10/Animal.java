package chapter10;

import java.util.Date;

public class Animal {

    private String name;
    private final java.util.Date dateOfBirth = new java.util.Date();


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return "My name is " + name;
    }

    public void speak() {
        System.out.println("I am an animal who likes to live in the forest ");
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }
}
