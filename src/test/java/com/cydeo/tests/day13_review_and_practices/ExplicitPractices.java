package com.cydeo.tests.day13_review_and_practices;

import com.cydeo.pages.DynamicControlsPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ExplicitPractices {

    DynamicControlsPage dynamicControlsPage;

    @BeforeMethod
    public void setupMethod() {
        //TC #2: Explicit wait practice
        //1- Open a chrome browser
        //2- Go to: https://practice.cydeo.com/dynamic_controls
        Driver.getDriver().get("https://practice.cydeo.com/dynamic_controls");

        dynamicControlsPage = new DynamicControlsPage();
    }

    @Test
    public void remove_button_test() {
        //3- Click to “Remove” button
        dynamicControlsPage.removeButton.click();

        //4- Wait until “loading bar disappears”
        //Driver.getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        //WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        //wait.until(ExpectedConditions.invisibilityOf(dynamicControlsPage.loadingBar));
        BrowserUtils.waitForInvisibilityOf(dynamicControlsPage.loadingBar);


        //5- Verify:
        //a. Checkbox is not displayed
        try {
            Assert.assertTrue(!dynamicControlsPage.checkBox.isDisplayed());
            //assertfalse method will pass the test if the boolean value returned is: false
            Assert.assertFalse(dynamicControlsPage.checkBox.isDisplayed());
        } catch (NoSuchElementException n) {
           Assert.assertTrue(true);
        }

        //b. “It’s gone!” message is displayed.
        Assert.assertTrue(dynamicControlsPage.message.isDisplayed());
        Assert.assertTrue(dynamicControlsPage.message.getText().equals("It's gone!"));
    }

    @Test
    public void enable_button_test(){
        //3- Click to “Enable” button
        //System.out.println("dynamicControlsPage.inputBox.isEnabled() = " + dynamicControlsPage.inputBox.isEnabled());
        dynamicControlsPage.enableButton.click();
        System.out.println("dynamicControlsPage.inputBox.isEnabled() = " + dynamicControlsPage.inputBox.isEnabled());

        //4- Wait until “loading bar disappears”
        //calling our ExplicitWait utility method to wait loadingBar to disappear
        BrowserUtils.waitForInvisibilityOf(dynamicControlsPage.loadingBar);

        System.out.println("dynamicControlsPage.enableButton.isEnabled() = " + dynamicControlsPage.enableButton.isEnabled());

        //5- Verify:
        //a. Input box is enabled.
        Assert.assertTrue(dynamicControlsPage.inputBox.isDisplayed());

        //b. “It’s enabled!” message is displayed
        Assert.assertTrue(dynamicControlsPage.message.isDisplayed());

        //Check the String value is matching as expected: "It's enabled"
        Assert.assertTrue(dynamicControlsPage.message.getText().equals("It's enabled"));
    }

}
