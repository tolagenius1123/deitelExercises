package chapter10;

public class Student {

    protected  final static int NUM_OF_TESTS = 3;

    protected String name;
    protected int [] test;
    protected String courseGrade;

    public Student(){
        this("No Name");
    }

    public Student(String studentName){
        name = studentName;
        test = new int[NUM_OF_TESTS];
        courseGrade = "****";
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public int[] getTestScore() {
        return test;
    }

    public void setTestScore(int testNumber, int testScore) {
        test[testNumber-1] = testScore;
    }

    public String getCourseGrade(){
        return courseGrade;
    }

    public void computerCourseGrade(){
        //override this method in the subclass
    }


}
