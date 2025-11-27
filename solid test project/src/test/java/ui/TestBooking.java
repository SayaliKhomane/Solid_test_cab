package ui;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import ui.pages.BookingPage;
import ui.pages.HomePage;
import ui.pages.SearchResultsPage;

public class TestBooking extends BaseTest 
{

    @Test
    public void testBookingFlow() {
        WebDriver driver = null;
		HomePage hp = new HomePage(driver);
        String baseUrl = null;
		hp.open(baseUrl);
        hp.search("Pune", "Lonavala", "2025-12-01");

        SearchResultsPage sr = new SearchResultsPage(driver);
        sr.selectFirstVehicle();

        BookingPage bp = new BookingPage(driver);
        bp.confirmBooking();

        String bookingId = bp.getBookingId();

        Assert.assertTrue(bookingId.startsWith("BK"));
    }
}
