package tddClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GradeBookTest{
    @Test
    public void displayMessage() {
        Gradebook myGradeBook = new Gradebook();
        myGradeBook.setDisplayMessage("welcome to Gradebook");
        assertEquals("welcome to Gradebook",myGradeBook.getDisplayMessage());

    }

        }


