package selenium.java.internetHerokuapp.testCases.landingPage;

import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.java.internetHerokuapp.configurations.BaseClass;
import selenium.java.internetHerokuapp.utilities.Data;

public class LandingPageValidation extends BaseClass {

    @Test(description = "User Able to visit Landing Page ")
    public void landingPageValidation(){

        //TC-1 HOME URL Validation
        String landingPageUrl = driver.getCurrentUrl();
        System.out.println("Given "+landingPageUrl);
        Assert.assertEquals(landingPageUrl, Data.LANDING_PAGE_URL);
        System.out.println("Home URL is validate");
        sleepTest(2000);

    }
}
