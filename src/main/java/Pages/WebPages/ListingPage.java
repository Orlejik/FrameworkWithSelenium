package Pages.WebPages;

import Pages.BasicPage.BasicPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import static Constants.Constants.FINDING_CARDS_FROM_LISTING;

public class ListingPage extends BasicPage {
    public ListingPage(WebDriver driver) {
        super(driver);
    }

    private final By card = By.xpath(FINDING_CARDS_FROM_LISTING);

    public ListingPage getQuantityOfCards(){
        int quantity = driver.findElements(card).size();
        Assert.assertEquals(30, quantity);

        return this;
    }


}
