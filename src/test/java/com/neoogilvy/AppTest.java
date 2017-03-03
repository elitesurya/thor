package com.neoogilvy;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class AppTest {

    private WebDriver driver;

    @Test
    public void OpenFacebook() throws InterruptedException
    {
        driver.get("https://www.facebook.com");
        System.out.println("Successfully Opened");
        Thread.sleep(1000);
    }

    @BeforeTest
    public void beforeTest()
    {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
    }

    @AfterTest
    public void afterTest()
    {
        driver.quit();
    }
}
