package driverManager;

import constants.StringConstants;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DriverFactory {

        WebDriver driver = null;
        WebDriverWait wait;
        @BeforeClass
        public void setUp(){
            String browser =System.getProperty("browser","msedge");

            if (browser.contains("firefox")){
                driver = new FirefoxDriver();
            }else if (browser.contains("msedge")){
                    driver = new EdgeDriver();
                }
            PageDriver.setWebDriver(driver);
        }
        @AfterClass
        public void tearDown(){
            PageDriver.getDriver().quit();
        }

    }

