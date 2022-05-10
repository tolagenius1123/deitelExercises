package tddClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DairyTest {
    @Test

    public void testThatDairyCanBeCreated() {
        Dairy myDairy = new Dairy("Tola", "1123");
        assertNotNull(myDairy);

    }

    @Test
    public void testThatDairyCanHaveAName() {
        Dairy myDairy = new Dairy("Tola", "1123");
        myDairy.setName("LOVE");
        assertEquals("LOVE", myDairy.getName());
    }
    @Test
    public void DairyCanHaveAnEntry(){
        Dairy myDairy = new Dairy("Tola", "1123");
        myDairy.createEntry("LoveSecrets", "5th May 2022", "1123");
        myDairy.createEntry("Ifoundlove", "6th May 2022", "1123");
        myDairy.createEntry("Ifoundlove", "7th May 2022", "1123");
        myDairy.createEntry("Ifoundlove", "8th May 2022", "1123");
        myDairy.createEntry("Ifoundlove", "9th May 2022", "1123");
        myDairy.createEntry("Ifoundlove", "10th May 2022", "1123");

        assertEquals(2, myDairy.getNumberOfEntry());
    }

   @Test
    public void findEntry(){
       Dairy myDairy = new Dairy("Tola", "1123");
       myDairy.createEntry("Ifoundlove", "6th May 2022", "1123");
       myDairy.createEntry("Money", "6th May 2022", "1123");
       myDairy.createEntry("Semicolon", "6th May 2022", "1123");
       myDairy.createEntry("God when", "6th May 2022", "1123");
       myDairy.createEntry("IMustBlow", "6th May 2022", "1123");
       boolean position = myDairy.findEntry("God when");
        assertTrue( position);

   }

   @Test
   public void testThatEntryCanBeDeleted(){
       Dairy myDairy = new Dairy("Tola", "1123");
       myDairy.createEntry("Ifoundlove", "6th May 2022", "1123");
       myDairy.createEntry("IfoundMoney", "6th May 2022", "1123");
       myDairy.createEntry("IfoundPussy", "6th May 2022", "1123");
       myDairy.createEntry("IfoundMaryAnn", "6th May 2022", "1123");
       boolean confirmEntryWasDeleted = myDairy.deleteEntry("IfoundPussy");
       assertTrue(confirmEntryWasDeleted);







   }

   @Test
    public void testThatDairyCanBeOpened(){
       Dairy myDairy = new Dairy("Tola", "1123");
       boolean password = myDairy.openDiary("1123");
       assertTrue(password);




   }


}
