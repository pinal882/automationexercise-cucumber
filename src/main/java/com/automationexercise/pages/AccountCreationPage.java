package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class AccountCreationPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//b[normalize-space()='Account Created!']")
    WebElement accountCreationText;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Continue']")
    WebElement continueTab;
    @CacheLookup
    @FindBy(xpath = "//b[normalize-space()='xyz']")
    WebElement loggedInAsUsernameText;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Delete Account']" )
    WebElement deleteAccountLink;
    @CacheLookup
    @FindBy(xpath = "//b[normalize-space()='Account Deleted!']")
    WebElement accountDeletedText;

    public String verifyAccountCreatedText(){
        return getTextFromElement(accountCreationText);
    }
    public void clickOnContinueTab(){
        clickOnElement(continueTab);
    }
    public String verifyLoggedInAsUsernameText(){
        return getTextFromElement(loggedInAsUsernameText);
    }
    public void clickOnDeleteAccountLink(){
        clickOnElement(deleteAccountLink);
    }
    public String verifyAccountDeletedText(){
        return getTextFromElement(accountDeletedText);
    }
}
