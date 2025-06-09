package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage {
    private WebDriver driver;
    private By chooseFile = By.id("file-upload");
    private By upload = By.id("file-submit");
    private By display = By.id("uploaded-files");

    public FileUploadPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickUploadButton(){
        driver.findElement(upload).click();
    }

    public void uploadFile(String path){
        driver.findElement(chooseFile).sendKeys(path);
        clickUploadButton();
    }

    public String displayUpload(){
        return driver.findElement(display).getText();
    }
}
