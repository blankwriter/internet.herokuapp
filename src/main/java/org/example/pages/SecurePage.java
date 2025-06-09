package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SecurePage {
    private WebDriver driver;
    private By statusAlert = By.id("flash");
    public SecurePage(WebDriver driver) {
        this.driver = driver;
    }
    public String getAlertText () {
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement webElement = webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(statusAlert));
        return webElement.getText().trim();
    }

}
