package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertPage {
    private WebDriver driver;
    private By triggerConfirmButton = By.xpath("//button[text()='Click for JS Confirm']");
    private By triggerAlertButton = By.xpath("//button[text()='Click for JS Alert']");
    private By triggerPromptButton = By.xpath("//button[text()='Click for JS Prompt']");
    private By result = By.id("result");
    public AlertPage(WebDriver driver){
        this.driver = driver;
    }
    public void clickJavaAlertButton(){
        driver.findElement(triggerAlertButton).click();
    }


    public void acceptAlert(){
        driver.switchTo().alert().accept();

    }

    public String displayResult(){
        return driver.findElement(result).getText();
    }

    public void clickJavaConfirmButton(){
        driver.findElement(triggerConfirmButton).click();
    }

    public void cancelConfirmAlert(){
        driver.switchTo().alert().dismiss();
    }

    public String displayCancelResult(){
        return driver.findElement(result).getText();
    }

    public void clickJavaPromptButton(){
        driver.findElement(triggerPromptButton).click();
    }
    public void inputPrompt(String name){
        driver.switchTo().alert().sendKeys(name);
        driver.switchTo().alert().accept();
    }

    public String displayPrompt(){
        return driver.findElement(result).getText();
    }

}
