package keypress;

import base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class KeyPressTest extends BaseTests {

    @Test
    public void KeyTest(){
        var keyPage = homepage.clickKeyPresses();
        keyPage.enterText("A" + Keys.BACK_SPACE);
        Assert.assertEquals(keyPage.getResult(), "You entered: BACK_SPACE", "Incorrect result");
    }

    @Test
    public void PiTest(){
        var keyPage = homepage.clickKeyPresses();
        keyPage.enterPi();
    }
}
