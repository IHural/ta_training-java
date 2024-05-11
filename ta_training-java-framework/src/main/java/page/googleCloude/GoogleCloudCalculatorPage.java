package page.googleCloude;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import page.MainPage;

import static constants.Constant.InstancesVariable.NUMBER_OF_INSTANCES;
import static constants.Constant.InstancesVariable.DATACENTER_LOCATION;

public class GoogleCloudCalculatorPage extends MainPage {

    public GoogleCloudCalculatorPage(WebDriver driver) {
        super(driver);
    }
    private final By numberOfInstancesInput = By.id("input_100");
    private final By seriesDropdown = By.id("select_value_label_95");
    private final By series = By.id("select_option_224");
    private final By machineTypeDropdown = By.id("select_value_label_96");
    private final By machineType = By.id("select_option_474");
    private final By addGPULink = By.xpath(
            "//md-checkbox[@aria-label='Add GPUs']");
    private final By gpuTypeDropdown = By.id("select_510");
    private final By gpuType = By.id("select_option_518");
    private final By numberOfGPUsInput = By.id("select_value_label_509");
    private final By numberOfGPUs = By.id("select_option_521");
    private final By localSSD = By.id("select_value_label_468");
    private final By ssdSize = By.id("select_option_495");
    private final By datacenterLocation = By.id("select_value_label_98");
    private final By searchRegion = By.id("input_132");
    private final By location = By.id("select_option_268");
    private final By commitUsage = By.id("select_value_label_99");
    private final By usage = By.id("select_option_138");

    private final By addToEstimateButton = By.xpath(
            "//button[contains(text(), 'Add to Estimate')]");

    public GoogleCloudCalculatorPage switchToCalculatorFrame() {
        WebElement frame = driver.findElement(By.tagName("iframe"));
        driver.switchTo().frame(frame);

        WebElement iFrame = driver.findElement(By.id("myFrame"));
        driver.switchTo().frame(iFrame);
        return this;
    }

    public GoogleCloudCalculatorPage enterNumberOfInstances() {
        driver.findElement(numberOfInstancesInput).click();
        WebElement numberOfInstances= driver.findElement(numberOfInstancesInput);
        numberOfInstances.sendKeys(NUMBER_OF_INSTANCES);
        return this;
    }
    public GoogleCloudCalculatorPage selectSeries() {
        WebElement seriesDropdownField = wait.until(ExpectedConditions.elementToBeClickable(seriesDropdown));
        seriesDropdownField.click();
        WebElement seriesOption = wait.until(ExpectedConditions.elementToBeClickable(series));
        seriesOption.click();

        return this;
    }

    public GoogleCloudCalculatorPage selectMachineType() {
        WebElement machineTypeDropdownField = wait.until(ExpectedConditions.elementToBeClickable(machineTypeDropdown));
        machineTypeDropdownField.click();
        WebElement machineTypeOption = wait.until(ExpectedConditions.elementToBeClickable(machineType));
        machineTypeOption.click();
        return this;
    }

    public GoogleCloudCalculatorPage addGPUs() {
        driver.findElement(addGPULink).click();
        return this;
    }

    public GoogleCloudCalculatorPage selectGPUType() {
        WebElement gpuTypeDropdownField = wait.until(ExpectedConditions.elementToBeClickable(gpuTypeDropdown));
        gpuTypeDropdownField.click();
        WebElement gpuTypeOption = wait.until(ExpectedConditions.elementToBeClickable(gpuType));
        gpuTypeOption.click();

        return this;
    }

    public GoogleCloudCalculatorPage selectNumberOfGPUs() {
        WebElement numberOfGPUsField = wait.until(ExpectedConditions.elementToBeClickable(numberOfGPUsInput));
        numberOfGPUsField.click();
        WebElement numberOfGPUsOption = wait.until(ExpectedConditions.elementToBeClickable(numberOfGPUs));
        numberOfGPUsOption.click();

        return this;
    }

    public GoogleCloudCalculatorPage selectLocalSSD() {
        WebElement localSSDField = wait.until(ExpectedConditions.elementToBeClickable(localSSD));
        localSSDField.click();
        WebElement ssdSizeOption = wait.until(ExpectedConditions.elementToBeClickable(ssdSize));
        ssdSizeOption.click();

        return this;
    }

    public GoogleCloudCalculatorPage selectDatacenterLocation() {
        WebElement datacenterLocationField = wait.until(ExpectedConditions.elementToBeClickable(datacenterLocation));
        datacenterLocationField.click();
        WebElement searchRegionField = wait.until(ExpectedConditions.elementToBeClickable(searchRegion));
        searchRegionField.click();
        searchRegionField.sendKeys(DATACENTER_LOCATION);
        WebElement locationOption = wait.until(ExpectedConditions.elementToBeClickable(location));
        locationOption.click();
        return this;
    }

    public GoogleCloudCalculatorPage selectCommitmentUsage() {
        WebElement commitUsageField = wait.until(ExpectedConditions.elementToBeClickable(commitUsage));
        commitUsageField.click();
        WebElement usageOption = wait.until(ExpectedConditions.elementToBeClickable(usage));
        usageOption.click();

        return this;
    }

    public GoogleCloudCalculatorPage clickAddToEstimateButton() {
        WebElement buttonAddToEstimate = driver.findElement(addToEstimateButton);
        waitElementIsVisible(buttonAddToEstimate).click();
        return this;
    }

}
