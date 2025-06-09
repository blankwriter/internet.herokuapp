package alert;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertPageTest extends BaseTests {

    @Test
    public void alertTest(){
        var alertPage = homepage.clickAlertPageLink();
        alertPage.clickJavaAlertButton();
        alertPage.acceptAlert();
        Assert.assertEquals(alertPage.displayResult(), "You successfully clicked an alert", "Incorrect Test");

    }

    @Test
    public void confirmTest(){
        var alertPage = homepage.clickAlertPageLink();
        alertPage.clickJavaConfirmButton();
        alertPage.cancelConfirmAlert();
        Assert.assertEquals(alertPage.displayResult(), "You clicked: Cancel", "Cancel failed, thus test failed");
    }

    @Test
    public void promptTest(){
        var alertPage = homepage.clickAlertPageLink();
        alertPage.clickJavaPromptButton();
        String text = "You Rock";
        alertPage.inputPrompt(text);
        Assert.assertEquals(alertPage.displayPrompt(), "You entered: " + text, "Prompt failed");

    }
}

