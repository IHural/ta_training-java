package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static constants.Constant.TimeoutVariable.EXPLICIT_WAIT;
import static constants.Constant.TimeoutVariable.IMPLICIT_WAIT;

public class MainPage {
    protected WebDriver driver;
    protected WebDriverWait wait;
    public MainPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, IMPLICIT_WAIT);        }

public void open(String url){
        driver.get(url);
}
public WebElement waitElementIsVisible(WebElement element){
        new WebDriverWait(driver,EXPLICIT_WAIT).until(ExpectedConditions.visibilityOf(element));
        return element;
}
}
