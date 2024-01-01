package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//b[normalize-space()='abc']")
    WebElement loginText;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Logout']")
    WebElement logoutButton;
    public String  verifyLoggedInText(){
        return getTextFromElement(loginText);
    }
    public void clickOnLogoutButton(){
        clickOnElement(logoutButton);
    }
}
