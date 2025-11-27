package ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;

    By origin = By.id("origin");
    By destination = By.id("destination");
    By date = By.id("date");
    By searchBtn = By.id("searchBtn");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void open(String baseUrl) {
        driver.get(baseUrl);
    }

    public void search(String ori, String dest, String d) {
        driver.findElement(origin).sendKeys(ori);
        driver.findElement(destination).sendKeys(dest);
        driver.findElement(date).sendKeys(d);
        driver.findElement(searchBtn).click();
    }
}
