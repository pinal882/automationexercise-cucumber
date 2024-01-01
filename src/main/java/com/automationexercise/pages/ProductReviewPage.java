package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ProductReviewPage extends Utility {
    @CacheLookup
    @FindBy(id = "name")
    WebElement reviewNameField;
    @CacheLookup
    @FindBy(id = "email")
    WebElement reviewEmailField;
    @CacheLookup
    @FindBy(id = "review")
    WebElement reviewMessageBox;
    @CacheLookup
    @FindBy(id = "button-review")
    WebElement reviewButton;
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Thank you for your review.']")
    WebElement reviewMessageText;


    public void enterReviewDetails(String name,String email,String message){
        sendTextToElement(reviewNameField,name);
        sendTextToElement(reviewEmailField,email);
        sendTextToElement(reviewMessageBox,message);
    }
    public void clickOnReviewButton(){
        clickOnElement(reviewButton);
    }
    public String verifyReviewMessageText(){
        return getTextFromElement(reviewMessageText);
    }
}
