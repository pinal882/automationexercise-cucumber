package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class CartPage extends Utility {
    @CacheLookup
    @FindBy(id = "susbscribe_email")
    WebElement subscribeEmail;
    @CacheLookup
    @FindBy(id = "subscribe")
    WebElement arrowButton;
    @CacheLookup
    @FindBy(xpath = "//div[@class='alert-success alert']")
    WebElement successAlertText;
    @CacheLookup
    @FindBy(xpath = "//li[text()='Shopping Cart']")
    WebElement shoppingCartText;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Proceed To Checkout']")
    WebElement proceedToCheckout;
    @CacheLookup
    @FindBy(xpath = "//u[normalize-space()='Register / Login']")
    WebElement registerLoginButton;
    @CacheLookup
    @FindBy(xpath = "//a[@class='cart_quantity_delete']")
    WebElement crossButton;
    @CacheLookup
    @FindBy(xpath = "//b[normalize-space()='Cart is empty!']")
    WebElement cartEmptyText;

    public void enterEmailInSubscriptionField(String email){
        sendTextToElement(subscribeEmail,email);
    }
    public void clickOnArrowButton(){
        clickOnElement(arrowButton);
    }
    public String verifyTheSuccessAlertText(){
        return getTextFromElement(successAlertText);
    }
    public String verifyShoppingCartText(){
        return getTextFromElement(shoppingCartText);
    }
    public void clickOnProceedToCheckout() throws InterruptedException {

        clickOnElement(proceedToCheckout);
    }
    public void clickOnRegisterLoginButton(){
        clickOnElement(registerLoginButton);
    }
    public void clickOnCrossButton(){
        clickOnElement(crossButton);
    }
    public String verifyCartIsEmpty(){
        return getTextFromElement(cartEmptyText);
    }
}
