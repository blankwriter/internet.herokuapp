package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage {
    private WebDriver driver;
    private By box = By.id("hot-spot");
    private By alert = By.xpath("//*[@oncontextmenu='displayMessage()']");

    public ContextMenuPage(WebDriver driver){
        this.driver = driver;
    }

    public void rightClickBox() {
        Actions actions = new Actions(driver);
        actions.contextClick(driver.findElement(box)).perform();
    }

    public String displayMessage(){
        return driver.switchTo().alert().getText();
    }

    public void pressOk() {
        driver.switchTo().alert().accept();
    }
}
