package com.cydeo.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Driver {

    /*
     Creating a private constructor, so we are closing access to the object of this class from outside of the class
     */
    private Driver(){}


    /*
    We make WebDriver private, because we want to close access from outside the class.
    We make it static because we will use it in a static method
     */
    private static WebDriver driver;


    /*
    Create a reusable utility method which will return same driver instance when we call it
     */
    public static WebDriver getDriver(){
        if (driver==null){
            String browserType = ConfigurationReader.getProperty("browser");//We read our browserType from configuration.properties.
                            //This way we can control which browser is opened from outside our code from configuration.properties.
            switch (browserType){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;
            }

        }
        return driver;
    }

}
