package forgotpassword;

import base.BaseTests;
import org.example.pages.ForgotPasswordPage;
import org.example.pages.PasswordRestPage;
import org.testng.Assert.*;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class ForgotPasswordTest extends BaseTests {

    @Test
    public void testReset(){
        ForgotPasswordPage forgotPasswordPage = homepage.clickForgotPassword();
        forgotPasswordPage.inputPassword("john@example.com");
        PasswordRestPage passwordRestPage = forgotPasswordPage.clickRetrieveButton();
        assertTrue(passwordRestPage.getAlert().contains("Internal Server Error"),
                "Failed to send Reset code to Email");
    }
}
