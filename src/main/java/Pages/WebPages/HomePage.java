package Pages.WebPages;

import Pages.BasicPage.BasicPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static Constants.Constants.FIND_BTN_OF_FINDING_APPARTMENTS;
import static Constants.Constants.FIND_OPTIONS_WITH_NUMBER_OF_ROOMS;

public class HomePage extends BasicPage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    public static final By select = By.id("rooms");
    public static final By twoRoomsOption = By.xpath(FIND_OPTIONS_WITH_NUMBER_OF_ROOMS);
    public static final By findBtn = By.xpath(FIND_BTN_OF_FINDING_APPARTMENTS);

    public HomePage selectTwoRooms(){
        driver.findElement(select).click();
        driver.findElement(twoRoomsOption).click();

        return this;

    }

    public HomePage btnClickTofind(){
        WebElement btn = driver.findElement(findBtn);
        visibisityOfElem(btn).click();

        return this;
    }

}
