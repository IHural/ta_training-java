package com.epam.training.student_iryna_hural.util;

import driver.WebDriverManager;
import io.qameta.allure.Allure;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestWatcher;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.logging.LogType;

import java.util.Optional;

public class TestListener implements TestWatcher {

    @Override
    public void testFailed(ExtensionContext context, Throwable cause) {
        Allure.getLifecycle().addAttachment(
                "Screenshot captured after test FAILED","image/png","png",
                ((TakesScreenshot) WebDriverManager.driver).getScreenshotAs(OutputType.BYTES)
        );
        Allure.addAttachment("Test logs after FAIL: ", String.valueOf(WebDriverManager.driver.manage().logs().get(LogType.BROWSER).getAll()));
        WebDriverManager.driver.quit();
    }
}
