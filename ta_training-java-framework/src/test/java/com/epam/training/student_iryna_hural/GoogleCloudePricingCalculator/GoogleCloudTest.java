package com.epam.training.student_iryna_hural.GoogleCloudePricingCalculator;

import com.epam.training.student_iryna_hural.mainTest.MainTest;
import com.epam.training.student_iryna_hural.util.TestListener;
import org.junit.jupiter.api.extension.ExtendWith;
import org.testng.annotations.Test;

import static constants.Constant.Urls.GOOGLE_CLOUD;
@ExtendWith(TestListener.class)
public class GoogleCloudTest extends MainTest {
        @Test
        public void checkIsRedirectPage (){
            mainPage.open(GOOGLE_CLOUD);

            googleCloudPage.searchingGoogleCloudCalculator()
            .navigateToPricingCalculator();
        }
    }

