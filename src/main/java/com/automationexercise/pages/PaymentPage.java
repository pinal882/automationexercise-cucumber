package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class PaymentPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//input[@name='name_on_card']")
    WebElement nameOnCardField;
@CacheLookup
@FindBy(xpath = "//input[@name='card_number']")
WebElement cardNumberField;
@CacheLookup
@FindBy(xpath = "//input[@placeholder='ex. 311']")
WebElement cvcField;
@CacheLookup
@FindBy(xpath = "//input[@placeholder='MM']")
WebElement expiryMonthField;
@CacheLookup
@FindBy(xpath = "//input[@placeholder='YYYY']")
WebElement expiryYearField;
@CacheLookup
@FindBy(id = "submit")
WebElement payAndConfirmOrderButton;
@CacheLookup
@FindBy(xpath = "//div[contains(text(),'Your order has been placed successfully!')]")
WebElement orderPlacedMessage;
    public void enterPaymentDetails(String name,String cardNumber,String cvc,String month,String year){
        sendTextToElement(nameOnCardField,name);
        sendTextToElement(cardNumberField,cardNumber);
        sendTextToElement(cvcField,cvc);
        sendTextToElement(expiryMonthField,month);
        sendTextToElement(expiryYearField,year);
    }
    public void clickOnPayAndConfirmOrderButton(){
        clickOnElement(payAndConfirmOrderButton);
    }
    public String verifyOrderPlacedMessage(){
        return getTextFromElement(orderPlacedMessage);
    }

}
