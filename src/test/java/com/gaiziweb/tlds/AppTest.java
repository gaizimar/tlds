package com.gaiziweb.tlds;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
	  public static RemoteWebDriver driver;

	
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
        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
        System.setProperty("webdriver.gecko.driver", "/usr/local/bin/geckodriver");
        capabilities.setCapability("marionette", false);
        capabilities.setPlatform(Platform.LINUX);
        capabilities.setBrowserName("firefox");
        try {
          driver = new RemoteWebDriver(capabilities);
          driver.get("https://www.google.com");
          driver.findElement(By.id("lst-ib")).sendKeys("Selenium Pi");
          driver.findElement(By.name("btnG")).click();
          Thread.sleep(5000);
          WebElement resultsec = (new WebDriverWait(driver, 15))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("resultStats")));
          String resultStats = resultsec.getText();
          System.out.println("Browser title: " + driver.getTitle());
          System.out.println("Google result stats: " + resultStats);
        } catch (Exception e) {
          System.out.println(e.getMessage());
        } finally {
          driver.quit();
        }

        assertTrue( true );
    }
}
