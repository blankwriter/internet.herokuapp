package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage {
    private WebDriver driver;

    public ForgotPasswordPage(WebDriver driver){
        this.driver = driver;
    }

    public void inputPassword(String input){
      driver.findElement(By.id("email")).sendKeys(input);

    }

    public PasswordRestPage clickRetrieveButton(){
        driver.findElement(By.id("form_submit")).click();
        return new PasswordRestPage(driver);
    }
}
