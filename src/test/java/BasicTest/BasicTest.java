package BasicTest;

import CommonActions.CommonActions;
import Pages.BasicPage.BasicPage;
import Pages.WebPages.HomePage;
import Pages.WebPages.ListingPage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import static Constants.Constants.CLEAR_COOKIES_AND_STORAGE;
import static Constants.Constants.KEEP_BROWSER_OPEN;

public class BasicTest {
    protected WebDriver driver = CommonActions.getDriver();
    protected BasicPage basePage = new BasicPage(driver);
    protected HomePage homepage = new HomePage(driver);
    protected ListingPage listingPage = new ListingPage(driver);

    @AfterTest
    public void clearStorageAndCookies() {
        if (CLEAR_COOKIES_AND_STORAGE) {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            driver.manage().deleteAllCookies();
            js.executeScript("window.sessionStorage.clear();");
        }
    }

    @AfterSuite(alwaysRun = true)
    public void closeBrowser(){
        if (KEEP_BROWSER_OPEN){
            driver.quit();
        }
    }


}
