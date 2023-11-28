package driverManager;

import org.openqa.selenium.WebDriver;

public class PageDriver {

    private static final ThreadLocal<WebDriver> webDriver = new ThreadLocal<>();

    public static WebDriver getDriver(){
        return webDriver.get();
    }

    public static void setWebDriver(WebDriver driver){
        webDriver.set(driver);
    }
}
