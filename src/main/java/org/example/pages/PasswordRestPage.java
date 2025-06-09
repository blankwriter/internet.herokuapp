package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PasswordRestPage {
    private WebDriver driver;
    private By alertInfo = By.linkText("Internal Server Error");
    public PasswordRestPage(WebDriver driver){
        this.driver = driver;
    }

    public String getAlert(){
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement webElement = webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(alertInfo));
        return webElement.getText().trim();
    }
}
