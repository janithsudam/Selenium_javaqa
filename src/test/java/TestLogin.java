import constants.StringConstants;
import driverManager.DriverFactory;
import driverManager.PageDriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TestLogin extends DriverFactory {

    @Test
    public void VerifyOpeningTheWebPage()throws InterruptedException{
        WebDriver driver = PageDriver.getDriver();
        //driver.get("https://tubewashuatadmin.azurewebsites.net/account/login");
        driver.get(StringConstants.url);
    }
}
