package ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchResultsPage {
    WebDriver driver;

    By firstVehicle = By.cssSelector(".vehicle-card .select-btn");

    public SearchResultsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectFirstVehicle() {
        driver.findElement(firstVehicle).click();
    }
}
