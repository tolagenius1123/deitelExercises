package chapter9;

public class Person {

    private final Job aJob;

    public Person(Job aJob){
        this.aJob = new Job();
        aJob.setRole("Manager");
    }
            //aJob.setRole("Manager");


    public String getResult(){
        return aJob.getRole();
    }
}
