package com.gits.internetherokuapp.TestCases;
import com.gits.internetherokuapp.TestPages.FormAuthentication;
import com.gits.internetherokuapp.configuration.LandingPage;
import com.gits.internetherokuapp.Utilities.Data;
import com.gits.internetherokuapp.configuration.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FormAuthenticationValidation extends BaseTest {
    @Test
    public void formAuthentication(){

        LandingPage lp = new LandingPage(driver);
        FormAuthentication fap = new FormAuthentication(driver);

        lp.getFormAuthentication().click();
        sleepTime(2000);

        //Home URL Validation
        String link = driver.getCurrentUrl();
        System.out.println("Given"+link);
        Assert.assertEquals(link, Data.BASE_URL+Data.FORM_AUTHENTICATION_LINK);
        System.out.println("Link is Valid");
        sleepTime(2000);

        //Header Validation
        if (fap.getFormAuthenticationHeader().isDisplayed()){
            String header1 = fap.getFormAuthenticationHeader().getText();
            Assert.assertEquals(header1,Data.FORM_AUTHENTICATION_HEADER1);
            System.out.println("Header1 Text is Valid");
        } else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }

        //Paragraph Validation
        if (fap.getFormAuthenticationPara().isDisplayed()){
            String header2 = fap.getFormAuthenticationPara().getText();
            Assert.assertEquals(header2,Data.FORM_AUTHENTICATION_HEADER2);
            System.out.println("Paragraph Text Is Valid");
        } else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }

        //Sending Values
        fap.getUsernameField().sendKeys(Data.FORM_AUTHENTICATION_USER_NAME);
        sleepTime(2000);

        fap.getPasswordInputField().sendKeys(Data.FORM_AUTHENTICATION_PASSWORD);
        sleepTime(2000);

        fap.getLoginButton().click();
         sleepTime(2000);

        //Alert Text Validation
        String text = fap.getAlert().getText();
        System.out.println(text);
        sleepTime(2000);

        //Driver Close
        driver.close();
        sleepTime(2000);

        //Driver Quit
        driver.quit();
        sleepTime(2000);

    }

}


