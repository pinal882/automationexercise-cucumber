package com.automationexercise.steps;

import com.automationexercise.pages.AccountCreationPage;
import com.automationexercise.pages.AccountPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class AccountTestSteps {
    @And("I should  that ENTER ACCOUNT INFORMATION is visible")
    public void iShouldThatENTERACCOUNTINFORMATIONIsVisible() {
        Assert.assertEquals(new AccountPage().verifyAccountInformationText(),"ENTER ACCOUNT INFORMATION","Text does not match");
    }
    @And("I select title")
    public void iSelectTitle() {
        new AccountPage().selectTitle();
    }



    @And("I select date of birth {string}, {string}, {string}")
    public void iSelectDateOfBirth(String date, String Month, String year) {
        new AccountPage().selectDateOfBirth(date, Month, year);
    }

    @And("I Fill details: {string}, {string},{string},{string}, {string},{string},{string},{string},{string},{string}")
    public void iFillDetails(String fName,String lName,String company, String address,String address2,String country,String state,String city,String zipcode,String mobile) {
        new AccountPage().fillAddressDetails(fName,lName,company,address,address2,country,state,city,zipcode,mobile);
    }

    @And("I Select checkbox Sign up for our newsletter!")
    public void iSelectCheckboxSignUpForOurNewsletter() {
        new AccountPage().selectNewsletterCheckbox();
    }

    @And("I Select checkbox Receive special offers from our partners!")
    public void iSelectCheckboxReceiveSpecialOffersFromOurPartners() {
        new AccountPage().selectSpecialOfferCheckbox();
    }



    @And("I Click Create Account button")
    public void iClickCreateAccountButton() {
        new AccountPage().clickOnCreateAccountTab();
    }

    @And("I should see that ACCOUNT CREATED! is visible")
    public void iShouldSeeThatACCOUNTCREATEDIsVisible() {
        Assert.assertEquals(new AccountCreationPage().verifyAccountCreatedText(),"ACCOUNT CREATED!","Text does not match");
    }

    @And("I Click Continue button")
    public void iClickContinueButton() {
        new AccountCreationPage().clickOnContinueTab();
    }

    @And("I should see that Logged in as username is visible")
    public void iShouldSeeThatLoggedInAsUsernameIsVisible() {
        Assert.assertEquals(new AccountCreationPage().verifyLoggedInAsUsernameText(),"xyz","Text does not match");
    }

    @And("I Click Delete Account button")
    public void iClickDeleteAccountButton() {
        new AccountCreationPage().clickOnDeleteAccountLink();
    }

    @Then("I should see  that ACCOUNT DELETED! is visible")
    public void iShouldSeeThatACCOUNTDELETEDIsVisible() {
        Assert.assertEquals(new AccountCreationPage().verifyAccountDeletedText(),"ACCOUNT DELETED!","Text does not match");
    }

    @And("I enter password {string}")
    public void iEnterPassword(String password) {
        new AccountPage().enterPassword(password);
    }



}
