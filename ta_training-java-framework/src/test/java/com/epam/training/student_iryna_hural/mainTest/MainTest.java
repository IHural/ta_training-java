package com.epam.training.student_iryna_hural.mainTest;

import driver.BrowserType;
import driver.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import page.MainPage;
import page.googleCloude.GoogleCloudCalculatorPage;
import page.googleCloude.GoogleCloudPage;

import static constants.Constant.Config.CLEAR_COOKIES_AND_STORAGE;
import static constants.Constant.Config.HOLD_BROWSER_OPEN;


public class MainTest {
    protected WebDriver driver = WebDriverManager.getDriver(BrowserType.CHROME);
    protected MainPage mainPage = new MainPage(driver);
    protected GoogleCloudCalculatorPage googleCloudCalculator = new GoogleCloudCalculatorPage(driver);
    protected GoogleCloudPage googleCloudPage = new GoogleCloudPage(driver);
    @AfterTest
    public void clearCookiesAndLocalStorage(){
        if (CLEAR_COOKIES_AND_STORAGE)
        {
            JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
            driver.manage().deleteAllCookies();
            javascriptExecutor.executeScript("window.sessionStorage.clear()");
        }
    }
    @AfterSuite(alwaysRun = true)
    public void closeDriver() {
        if (HOLD_BROWSER_OPEN) {
            driver.quit();
        }
    }
}
