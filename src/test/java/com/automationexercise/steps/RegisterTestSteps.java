package com.automationexercise.steps;

import com.automationexercise.pages.Homepage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class RegisterTestSteps {
    @Given("I am on Homepage")
    public void iAmOnHomepage() {
        
    }
    @When("I Click on Signup or Login Button")
    public void iClickOnSignupOrLoginButton() {
        new Homepage().clickOnSignupLink();
    }

    @And("I should see  New User Signup! is visible")
    public void iShouldSeeNewUserSignupIsVisible() {
        Assert.assertEquals(new Homepage().verifyNewUserSignUpText(),"New User Signup!","Text does not match");
    }
    @And("I Enter {string} and {string} address")
    public void iEnterAndAddress(String name, String email) {
        new Homepage().enterName(name);
        new Homepage().enterEmail(email);

    }

    @And("I Click Signup button")
    public void iClickSignupButton() {
        new Homepage().clickOnSignupButton();
    }


    @Then("I should see that Email Address already exist! is visible")
    public void iShouldSeeThatEmailAddressAlreadyExistIsVisible() {
        Assert.assertEquals(new Homepage().verifyTheEmailAddressAlreadyExistText(),"Email Address already exist!","Text does not match");

    }
}
