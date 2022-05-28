package com.cydeo.tests.day7_webTables_utilities_javaFaker;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T3_CRM_LOGIN {
    WebDriver driver;
    @BeforeMethod
    public void setupMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void crm_login_test(){
        //TC #3: Login scenario
        //1. Create new test and make set ups
        //2. Go to : http://login1.nextbasecrm.com/
        //3. Enter valid username
        //4. Enter valid password
        //5. Click to `Log In` button
        //6. Verify title is as expected:
        //Expected: Portal
    }
}
