package page.googleCloude;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import page.MainPage;

public class GoogleCloudPage extends MainPage {
    public GoogleCloudPage(WebDriver driver) {
        super(driver);
    }
    private final By searchIcon = By.xpath(
            "//*[@id=\"kO001e\"]/div[2]/div[1]/div/div[2]/div[2]/div[1]/div/div");
    private final By searchFieldLocator = By.cssSelector("#i4");
    private final By calculatorLink = By.xpath(
            "//a[@href='https://cloud.google.com/products/calculator-legacy']");
    public GoogleCloudPage searchingGoogleCloudCalculator(){
        driver.findElement(searchIcon).click();
        WebElement searchField = driver.findElement(searchFieldLocator);
        searchField.sendKeys("Google Cloud Platform Pricing Calculator");
        searchField.sendKeys(Keys.ENTER);
        return this;
    }
    public GoogleCloudPage navigateToPricingCalculator (){
        driver.findElement(calculatorLink).click();
        return this;
    }
}