package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class DropDownPage {
    private WebDriver driver;
    private By dropDown = By.id("dropdown");

    public DropDownPage(WebDriver driver){
        this.driver = driver;
    }

    public void selectDropDown(String options) {
        findDropDownElement().selectByVisibleText(options);
    }

    public List<String> getSelectedOptions(){
        List<WebElement>  selectedElements =
                findDropDownElement().getAllSelectedOptions();
        return selectedElements.stream().map(e->e.getText()).collect(Collectors.toList());
    }

    private Select findDropDownElement(){
            return new Select(driver.findElement(dropDown));
    }

}
