package com.cydeo.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CRM_Utilities {

    /*
    This method will login with helpdesk1@cybertekschool.com user when it is called
     */

    public static void crm_login(WebDriver driver) throws InterruptedException {
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
    }

}
