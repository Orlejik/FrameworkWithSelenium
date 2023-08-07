package Tests;

import BasicTest.BasicTest;
import org.testng.annotations.Test;


import static Constants.Constants.REALT_HOME_PAGE;

public class SearchApprtTest extends BasicTest {

    @Test
    public void checkIsRedirectToListing() {

        basePage.openPage(REALT_HOME_PAGE);

        homepage
                .selectTwoRooms()
                .btnClickTofind();

        listingPage.getQuantityOfCards();

    }
}
