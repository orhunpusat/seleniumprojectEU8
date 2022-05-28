package com.cydeo.tests.day7_webTables_utilities_javaFaker;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
    //TC #3: Login scenario
    @Test
    public void crm_login_test() throws InterruptedException {

        //1. Create new test and make set ups
        //2. Go to : https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

        //3. Enter valid username
        Thread.sleep(2000);
        WebElement inputUsername = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        inputUsername.sendKeys("helpdesk1@cybertekschool.com");

        //helpdesk1@cybertekschool.com UserUser
        //helpdesk2@cybertekschool.com UserUser

        //4. Enter valid password
        Thread.sleep(2000);
        WebElement inputPassword = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        inputPassword.sendKeys("UserUser");

        //5. Click to `Log In` button
        WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log In']"));
        loginButton.click();

        //6. Verify title is as expected:
        //Expected: Portal
        BrowserUtils.verifyTitle(driver,"Portal");
    }

    @Test
    public void crm_login_test_2() throws InterruptedException {

        //1. Create new test and make set ups
        //2. Go to : https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");



        //6. Verify title is as expected:
        //Expected: Portal
        BrowserUtils.verifyTitle(driver,"Portal");
    }
}
