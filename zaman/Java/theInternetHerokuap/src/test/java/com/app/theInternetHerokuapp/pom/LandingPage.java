package com.app.theInternetHerokuapp.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage extends BasePage {

    public LandingPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "li:nth-of-type(1) > a")
    public  WebElement abTestingPage;
    public WebElement getAbTestingPage() {
        return abTestingPage;
    }

    @FindBy(css = "li:nth-child(2) > a")
    public WebElement addRemoveElementsPage;
    public WebElement getAddRemoveElementsPage() {
        return addRemoveElementsPage;
    }

    @FindBy(css = "li:nth-of-type(4) > a")
    public WebElement brokenImages;
    public WebElement getBrokenImages() {
        return brokenImages;
    }

    @FindBy(css = "li:nth-of-type(6) > a")
    public WebElement checkBoxes;
    public WebElement getCheckBoxes() {
        return checkBoxes;
    }

    @FindBy(css = "li:nth-of-type(7) > a")
    public WebElement contextMenu;
    public WebElement getContextMenu() {
        return contextMenu;
    }

    @FindBy(css = "li:nth-of-type(8) > a")
    public WebElement digestAuthentication;
    public WebElement getDigestAuthentication() {
        return digestAuthentication;
    }

    @FindBy(css = "li:nth-of-type(21) > a")
    public WebElement formAuthentication;
    public WebElement getFormAuthentication() {
        return formAuthentication;
    }

    @FindBy(css = "li:nth-of-type(20) > a")
    public WebElement forgotPassword;
    public WebElement getForgotPassword() {
        return forgotPassword;
    }


}