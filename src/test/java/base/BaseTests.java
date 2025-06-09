package base;

import org.example.pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;


public class BaseTests {
    WebDriver driver;
    protected HomePage homepage;

    @BeforeClass
    public void launchBrowser(){
        System.setProperty("webdriver.chrome.driver",
                "/Users/princejohn/Downloads/chromedriver-mac-arm64/chromedriver");
        driver=new ChromeDriver();

        //driver.get("https://stock4less.com/");

//        driver.get("https://the-internet.herokuapp.com/");
        goHome();
        homepage = new HomePage(driver);

        System.out.println(driver.getTitle());
    }

    @BeforeMethod
    public void goHome(){
        driver.get("https://the-internet.herokuapp.com/");
    }

    @AfterClass
    public void tearDown(){
        driver.quit();

    }
}