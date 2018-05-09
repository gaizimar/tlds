package com.gaiziweb.tlds;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

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
        File chromeDriver = new File("/usr/share/applications/chromium-browser");
        System.setProperty("webdriver.chrome.driver", chromeDriver.getAbsolutePath());
    	WebDriver driver = new ChromeDriver();
    	
    	driver.get("https://www.google.com");

        assertTrue( true );
    }
}
