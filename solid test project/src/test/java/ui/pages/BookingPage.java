package ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BookingPage {
    WebDriver driver;

    By confirm = By.id("confirmBooking");
    By bookingId = By.id("bookingId");

    public BookingPage(WebDriver driver) {
        this.driver = driver;
    }

    public void confirmBooking() {
        driver.findElement(confirm).click();
    }

    public String getBookingId() {
        return driver.findElement(bookingId).getText();
    }
}
