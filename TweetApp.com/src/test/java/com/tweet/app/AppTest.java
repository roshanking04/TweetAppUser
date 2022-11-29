package com.tweet.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.tweet.app.registaration.User;
import com.tweet.app.registaration.UserDaoImpl;

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
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
	public void getAllTweets() {
		UserDaoImpl us= new UserDaoImpl();
		User user = new User();
		user.setName("kjdls");
		//Mockito.when(imp.insertUser(user)).thenReturn(1);
		assertEquals(us.insertUser(user), user.getName());
	}
}
