package com.pixalione.quiz;

import com.pixalione.quiz.Models.Client;
import com.pixalione.quiz.Models.ClientTest;
import com.pixalione.quiz.Models.Compte;
import com.pixalione.quiz.Models.CompteTest;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        System.out.println( "Quiz-1" );

        System.out.println("Run tests");
        TestSuite test = new TestSuite( AppTest.class );
        test.addTestSuite(ClientTest.class);
        test.addTestSuite(CompteTest.class);
        return test;
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}
