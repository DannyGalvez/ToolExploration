package demo.src.test.java.lvc.cds;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/*
*** For the purposes of this demo, I left out the testing of the print methods ***
*/
public class RecordTest {

    /* Test for our Record() constructor:
       Sets our age to 24, name to Danny, and 
       by default the ID is set to -1. We set 
       the expected value to match these attributes
       and compare using assertion
    */
    @Test
    public void testRecord(){

        Record rec = new Record(24, "Danny");
        
        int expectedAge = 24;
        String expectedName = "Danny";
        int expectedID = -1;

        assertTrue(rec.getAge() == expectedAge);
        assertTrue(rec.getName() == expectedName);
        assertTrue(rec.getId() == expectedID);

    }

    /* Test for our setID() method:
       Set our id to 123, set the expected value
       to 123. Check to see that the id and the 
       expected value match
    */
    @Test    
    public void TestsetID()
    {
        Record rec = new Record(24, "Danny");
        rec.setId(123);

        int expected = 123;

        assertEquals(expected, rec.getId());
    }

    /* Test for our getID() method:
       Create a new Record object which defaults ID to -1. 
       Set expected value to -1, check to see if getID()
       and expected match
    */
    @Test
    public void TestgetID(){

        Record rec = new Record(24, "Danny");

        int expected = -1;

        assertEquals(expected, rec.getId());
    }


    /* Test for our getAge() method:
       Create a new Record object which initializes age to 24. 
       Set expected value to 24, check to see if getAge()
       and expected match
    */
    @Test
    public void TestgetAge(){

        Record rec = new Record(24, "Danny");

        int expected = 24;

        assertEquals(expected, rec.getAge());
    }


    /* Test for our getName() method:
       Create a new Record object which defaults Name to Danny. 
       Set expected value to "Danny", check to see if getName()
       and expected match
    */
    @Test
    public void TestgetName(){

        Record rec = new Record(24, "Danny");

        String expected = "Danny";

        assertEquals(expected, rec.getName());
    }

    @Test
    public void testSetID(){

        Record rec = new Record (24, "Danny");

        rec.setDOB("6/19/1996");

        String expectedDOB = "6/19/1996";

        assertEquals(expectedDOB, rec.getDOB());

    }

    
}
