package com.epam.training.student_iryna_hural.GoogleCloudePricingCalculator;

import com.epam.training.student_iryna_hural.mainTest.MainTest;
import com.epam.training.student_iryna_hural.util.TestListener;
import org.junit.jupiter.api.extension.ExtendWith;
import org.testng.annotations.Test;

import static constants.Constant.Urls.GOOGLE_CLOUD_PRICING_CALCULATOR;

@ExtendWith(TestListener.class)
public class PricingCalculatorTest extends MainTest {
    @Test
    public void checkIsRedirectPage (){
        mainPage.open(GOOGLE_CLOUD_PRICING_CALCULATOR);

        googleCloudCalculator.switchToCalculatorFrame()
                .enterNumberOfInstances()
                .selectSeries()
                .selectMachineType()
                .addGPUs()
                .selectGPUType()
                .selectNumberOfGPUs()
                .selectLocalSSD()
                .selectDatacenterLocation()
                .selectCommitmentUsage()
                .clickAddToEstimateButton();
    }
}
