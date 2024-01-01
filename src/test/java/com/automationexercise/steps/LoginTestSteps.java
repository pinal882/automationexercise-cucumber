package com.automationexercise.steps;

import com.automationexercise.pages.AccountCreationPage;
import com.automationexercise.pages.Homepage;
import com.automationexercise.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class LoginTestSteps {
    @And("I should see Login to your account is visible")
    public void iShouldSeeLoginToYourAccountIsVisible() throws InterruptedException{
        Thread.sleep(2000);
        Assert.assertEquals(new Homepage().verifyLoginToYourAccountText(), "Login to your account", "Text does not match");
    }
    @And("I Enter correct {string}")
    public void iEnterCorrect(String logEmail) {
        new Homepage().enterLoginEmail(logEmail);
    }

    @And("I Enter correct password {string}")
    public void iEnterCorrectPassword(String logPassword) {
        new Homepage().enterLoginPassword(logPassword);

    }
    @And("I Click login button")
    public void iClickLoginButton() {
        new Homepage().clickOnLoginButton();
    }
    @And("I should see  that Logged in as username is visible")
    public void iShouldSeeThatLoggedInAsUsernameIsVisible() {
        Assert.assertEquals(new LoginPage().verifyLoggedInText(),"abc","Text does not match");
    }


    @Then("I should see that ACCOUNT DELETED! is visible")
    public void iShouldSeeThatACCOUNTDELETEDIsVisible() {
        new AccountCreationPage().verifyAccountDeletedText();
    }


    @And("I Enter incorrect {string}")
    public void iEnterIncorrect(String invalidEmail) {
        new Homepage().enterLoginEmail(invalidEmail);
    }

    @And("I Enter incorrect password {string}")
    public void iEnterIncorrectPassword(String invalidPassword) {
        new Homepage().enterLoginPassword(invalidPassword);
    }

    @Then("I should see error Your email or password is incorrect! is visible")
    public void iShouldSeeErrorYourEmailOrPasswordIsIncorrectIsVisible() {
        Assert.assertEquals(new Homepage().verifyLoginErrorText(),"Your email or password is incorrect!","Text does not match");
    }

    @And("I Click Logout button")
    public void iClickLogoutButton() {
        new LoginPage().clickOnLogoutButton();
    }

    @Then("I should see that user is navigated to login page")
    public void iShouldSeeThatUserIsNavigatedToLoginPage() {
    }
}

