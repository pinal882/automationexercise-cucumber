package com.automationexercise.steps;

import com.automationexercise.pages.ContactusPage;
import com.automationexercise.pages.Homepage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class ContactusTestSteps {
    @When("I Click on Contact Us button")
    public void iClickOnContactUsButton() {
        new Homepage().clickOnContactusTab();
    }

    @And("I should see GET IN TOUCH is visible")
    public void iShouldSeeGETINTOUCHIsVisible() {
        Assert.assertEquals(new ContactusPage().verifyGetInTouchText(),"GET IN TOUCH","Text does not match");
    }
    @And("I Enter name {string},email {string},subject {string} and message {string}")
    public void iEnterNameEmailSubjectAndMessage(String name, String email, String subject, String message) throws InterruptedException {
        Thread.sleep(2000);
        new ContactusPage().enterName(name);
        new ContactusPage().enterEmail(email);
        new ContactusPage().enterSubject(subject);
        new ContactusPage().enterMessage(message);

    }

    @And("I Upload file")
    public void iUploadFile() {
        new ContactusPage().clickOnChooseFile();
    }

    @And("I Click Submit button")
    public void iClickSubmitButton() {
        new ContactusPage().clickOnSubmitButton();
    }

    @And("I Click OK button")
    public void iClickOKButton() {
        new ContactusPage().confirmationDialog();
        
    }

    @And("I should see success message Success! Your details have been submitted successfully.")
    public void iShouldSeeSuccessMessageSuccessYourDetailsHaveBeenSubmittedSuccessfully() {
        Assert.assertTrue(new  ContactusPage().verifySuccessMessage().contains("Success! Your details have been submitted successfully."));
     // Assert.assertEquals(new ContactusPage().verifySuccessMessage(),"Success! Your details have been submitted successfully.","Text does not match");
    }

    @Then("I Click Home button")
    public void iClickHomeButton() {
        new ContactusPage().clickOnHomeButton();
    }

    @And("I am landed to home page successfully")
    public void iAmLandedToHomePageSuccessfully() {

    }


    }

