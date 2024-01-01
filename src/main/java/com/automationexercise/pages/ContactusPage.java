package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ContactusPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Get In Touch']")
    WebElement getInTouchText;
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Name']")
    WebElement nameField;
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Email']")
    WebElement emailField;
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Subject']")
    WebElement subjectField;
    @CacheLookup
    @FindBy(id = "message")
    WebElement messageField;
    @CacheLookup
    @FindBy(xpath = "//input[@name='upload_file']")
    WebElement chooseFile;
    @CacheLookup
    @FindBy(xpath = "//input[@name='submit']")
    WebElement submitButton;
    @CacheLookup
    @FindBy(xpath = "//div[@class='status alert alert-success']")
    WebElement successMessage;
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Home']")
    WebElement homeButton;
    public String verifyGetInTouchText(){
        return getTextFromElement(getInTouchText);
    }
    public void enterName(String name){
        sendTextToElement(nameField,name);
    }
    public void enterEmail(String email){
        sendTextToElement(emailField,email);
    }
    public void enterSubject(String subject){
        sendTextToElement(subjectField,subject);
    }
    public void enterMessage(String message){
        sendTextToElement(messageField,message);
    }
    public void clickOnChooseFile(){
        clickOnElement(chooseFile);
    }
    public void clickOnSubmitButton(){
        clickOnElement(submitButton);
    }
    public void confirmationDialog(){
        acceptAlert();
    }
    public String verifySuccessMessage(){
        return getTextFromElement(successMessage);
    }
    public void clickOnHomeButton(){
        clickOnElement(homeButton);
    }
}
