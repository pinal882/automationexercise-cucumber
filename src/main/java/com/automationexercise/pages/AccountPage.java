package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//b[normalize-space()='Enter Account Information']")
    WebElement accountInformationText;
    @CacheLookup
    @FindBy(id = "id_gender1")
    WebElement title;
    @CacheLookup
    @FindBy(id = "name")
    WebElement nameField;
    @CacheLookup
    @FindBy(id = "email")
    WebElement emailField;
    @CacheLookup
    @FindBy(id = "password")
    WebElement passwordField;
    @CacheLookup
    @FindBy(id = "days")
    WebElement day;
    @CacheLookup
    @FindBy(id = "months")
    WebElement month;
    @CacheLookup
    @FindBy(id = "years")
    WebElement years;
    @CacheLookup
    @FindBy(id = "newsletter")
    WebElement newsletterCheckbox;
    @CacheLookup
    @FindBy(id = "optin")
    WebElement specialOfferCheckbox;
    @CacheLookup
    @FindBy(id = "first_name")
    WebElement firstName;
    @CacheLookup
    @FindBy(id = "last_name")
    WebElement lastname;
    @CacheLookup
    @FindBy(id = "company")
    WebElement companyField;
    @CacheLookup
    @FindBy(id = "address1")
    WebElement addressField;
    @CacheLookup
    @FindBy(id = "address2")
    WebElement addressField2;
    @CacheLookup
    @FindBy(id = "country")
    WebElement countryDropDown;
    @CacheLookup
    @FindBy(id = "state")
    WebElement stateField;
    @CacheLookup
    @FindBy(id = "city")
    WebElement cityField;
    @CacheLookup
    @FindBy(id = "zipcode")
    WebElement zipcodeField;
    @CacheLookup
    @FindBy(id = "mobile_number")
    WebElement mobileNumber;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Create Account']")
    WebElement createAccountTab;

    public String verifyAccountInformationText() {
        return getTextFromElement(accountInformationText);
    }

    public void selectTitle() {
        clickOnElement(title);
    }

    public void enterPassword(String  password) {
        sendTextToElement(passwordField, password);
    }
    public void selectDateOfBirth(String date,String Month,String year){
        selectByVisibleTextFromDropDown(day, date);
        selectByVisibleTextFromDropDown(month, Month);
        selectByVisibleTextFromDropDown(years, year);

    }

    public void selectNewsletterCheckbox() {
        clickOnElement(newsletterCheckbox);
    }

    public void selectSpecialOfferCheckbox() {
        clickOnElement(specialOfferCheckbox);
    }

    public void fillAddressDetails(String fName, String lName, String company, String address, String address2, String country, String state, String city, String zipcode, String mobile) {
        sendTextToElement(firstName, fName);
        sendTextToElement(lastname, lName);
        sendTextToElement(companyField, company);
        sendTextToElement(addressField, address);
        sendTextToElement(addressField2, address2);
        selectByValueFromDropDown(countryDropDown, country);
        sendTextToElement(stateField, state);
        sendTextToElement(cityField, city);
        sendTextToElement(zipcodeField, zipcode);
        sendTextToElement(mobileNumber, mobile);


    }
    public void clickOnCreateAccountTab(){
        clickOnElement(createAccountTab);
    }
}
