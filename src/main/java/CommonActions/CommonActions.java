package CommonActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import static Config.Config.PLATFORMS_AND_BROWSERS;
import static Constants.Constants.INPLICIT_WAIT;

public class CommonActions {


    public static WebDriver getDriver(){
        WebDriver driver = null;
        switch (PLATFORMS_AND_BROWSERS){
            case ("win_chrome"):
                System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
                driver = new ChromeDriver();
                break;
            case("win_firefox"):
                System.setProperty("webdriver.gecko.driver", "/home/user/bin");
                driver = new FirefoxDriver();
                break;
            default:
                Assert.fail(PLATFORMS_AND_BROWSERS+" failed initialize parameters...");
        }

        driver.manage().timeouts().implicitlyWait(INPLICIT_WAIT, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        return driver;
    }

}
