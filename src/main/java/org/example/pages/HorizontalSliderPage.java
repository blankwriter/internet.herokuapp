package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HorizontalSliderPage {
    private WebDriver driver;
    private By sliderRange = By.tagName("input");
    private By range = By.id("range");

    public HorizontalSliderPage(WebDriver driver){
        this.driver = driver;
    }

//    public void ClickSlider(){
//        driver.findElement(sliderRange).click();
//    }

    public void setSliderTo(double value) {
        var slider = driver.findElement(sliderRange);
        slider.click();

        for (int i = 0; i < 10; i++) {  // safe max
            slider.sendKeys(Keys.ARROW_LEFT);
        }
        double step = 0.5;
        double min = 0.0;
        int steps = (int)((value - min)/ step);

        for (int i = 0; i < steps; i++) {
            slider.sendKeys(Keys.ARROW_RIGHT);
        }

//        for (int i = 0; i < steps ; i++) {
//            if(direction.equalsIgnoreCase("right")){
//                driver.findElement(sliderRange).sendKeys(Keys.ARROW_RIGHT);
//            }
//            else if(direction.equalsIgnoreCase("left")){
//                driver.findElement(sliderRange).sendKeys(Keys.ARROW_LEFT);
//
//            }
//
//        }
    }

    public String getSliderValue(){
        return driver.findElement(range).getText();
    }
}
