package fr.antonincorp;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class FakelibTest extends TestCase {

    public FakelibTest( String testName )
    {
        super( testName );
    }

    public static Test suite()
    {
        return new TestSuite( FakelibTest.class );
    }

    public void testApp(){
        Fakelib fakelib = new Fakelib();
        assertEquals("Fake", fakelib.getFakeString());
    }
    
}
