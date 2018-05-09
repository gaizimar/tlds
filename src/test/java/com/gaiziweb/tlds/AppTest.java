package com.gaiziweb.tlds;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

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
    	//String geckoDriverPath = "/usr/local/bin/geckodriver";
    	
    	DesiredCapabilities capabilities = new DesiredCapabilities();
    	
    	capabilities.setCapability(ChromeDriver, "");
    	WebDriver driver = new ChromeDriver();
    	
    	driver.get("https://www.google.com");

        assertTrue( true );
    }
}
