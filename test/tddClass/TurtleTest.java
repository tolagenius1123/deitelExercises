//package tddClass;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//public class TurtleTest {
//
//    private Turtle myTurtle;
//
//
//    @BeforeEach
//    public void setup(){
//        myTurtle = new Turtle();
//    }
//
//    @Test
//    public void turtleExistsTest(){
//        //Turtle myTurtle = new Turtle();
//        assertNotNull(myTurtle);
//
//    }
//    @Test
//    public void turtlePenIsUpByDefaultTest(){
//        boolean isPenDown = myTurtle.isPenDown();
//        assertFalse(isPenDown);
//
//    }
//
//    @Test
//    public void turtleCanMovePenDownTest(){
//        myTurtle.penDown();
//        boolean isPenDown = myTurtle.isPenDown();
//        assertTrue(isPenDown);
//
//    }
//    @Test
//    public void turtleCanMovePenUpTest(){
//        myTurtle.penDown();
//        myTurtle.penUp();
//        assertTrue(myTurtle.isPenDown());
//    }
//
//    @Test
//    public void turtleFacesEastByDefaultTest(){
//        assertEquals(Direction.EAST, myTurtle.getCurrentDirection());
//    }
//
//    @Test
//    public void turtleCanTurnRightFromEastTest(){
//        myTurtle.turnRight();
//        assertSame(Direction.SOUTH, myTurtle.getCurrentDirection());
//    }
//}
