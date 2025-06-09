package login;

import base.BaseTests;
import org.example.pages.LoginPage;
import org.example.pages.SecurePage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

public class LoginTests extends BaseTests {

    @Test
    public void testSuccessfulTest(){
        LoginPage loginPage = homepage.clickFormAuthentication();
        loginPage.setUsername("tomsmith");
        loginPage.setPassword("SuperSecretPassword!");
        SecurePage securePage = loginPage.clickLoginButton();
        assertTrue(securePage.getAlertText().contains("You logged into a secure area!"),
                "Fail to connect");
    }
}
