package Pages.BasicPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static Constants.Constants.EXPLICIT_WAIT;

public class BasicPage {

    protected WebDriver driver;

    public BasicPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openPage(String url){
        driver.get(url);
    }

    public WebElement visibisityOfElem(WebElement elem){
        new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT)).until(ExpectedConditions.visibilityOf(elem));
        return elem;
    }

    
}
