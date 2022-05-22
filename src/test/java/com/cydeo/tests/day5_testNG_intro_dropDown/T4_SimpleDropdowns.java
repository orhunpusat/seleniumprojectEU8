package com.cydeo.tests.day5_testNG_intro_dropDown;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T4_SimpleDropdowns {

    @BeforeMethod
    public void setuğMethod(){

        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2. Go to https://practice.cydeo.com/dropdown
        driver.get("https://practice.cydeo.com/dropdown");
    }

    @Test
    public void simpleDropdownTest(){

        //3. Verify “Simple dropdown” default selected value is correct
        //Expected: “Please select an option”
        //4. Verify “State selection” default selected value is correct
        //Expected: “Select a State”
    }
}
