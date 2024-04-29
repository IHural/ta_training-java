package com.epam.training.student_iryna_hural.ta_trainingjava;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class Task1Test {
    private static WebDriver driver;
    private static WebDriverWait wait;

    @BeforeAll
    public static void setUp() {
        // Set up WebDriver
        System.setProperty("webdriver.chrome.driver", "/Users/dh/Downloads/chromedriver-mac-x64/chromedriver");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(3));
    }

    @Test
    public void createNewPaste() {
        // Open the website
        driver.get("https://pastebin.com/");

        // Find and click on New Paste button
        WebElement newPasteButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("postform-text")));
        newPasteButton.sendKeys("Hello from WebDriver");

        // Set paste expiration
        WebElement pasteExpirationDropdown = driver.findElement(By.id("select2-postform-expiration-container"));
        pasteExpirationDropdown.click();

        WebElement tenMinutesOption = driver.findElement(By.xpath("//li[text()='10 Minutes']"));
        tenMinutesOption.click();

        // Set paste name/title
        WebElement pasteNameField = driver.findElement(By.id("postform-name"));
        pasteNameField.sendKeys("helloweb");

        // Submit the form
        WebElement submitButton = driver.findElement(By.cssSelector("button.btn.-big"));
        submitButton.click();

        // Wait for the page to load
        wait.until(ExpectedConditions.titleContains("Pastebin"));

        // Assert the success of paste creation
        assert driver.getTitle().contains("helloweb");
    }

    @AfterAll
    public static void tearDown() {
        // Close the browser
        if (driver != null) {
            driver.quit();
        }
    }
}

