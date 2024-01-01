package com.automationexercise.steps;

import com.automationexercise.pages.CartPage;
import com.automationexercise.pages.Homepage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class SubscriptionTestSteps {
    @When("I click on Cart Tab")
    public void iClickOnCartTab() {
        new Homepage().clickOnCartTab();
    }

    @And("I Scroll down to footer")
    public void iScrollDownToFooter() {
        new Homepage().scrollToElement();
    }

    @And("I Verify text SUBSCRIPTION")
    public void iVerifyTextSUBSCRIPTION() {
        Assert.assertEquals(new Homepage().verifyTheSubscriptionText(),"SUBSCRIPTION");
    }

    @And("I Enter email address {string} in input")
    public void iEnterEmailAddressInInput(String email) {
        new CartPage().enterEmailInSubscriptionField(email);
    }

    @And("I click arrow button")
    public void iClickArrowButton() {
        new CartPage().clickOnArrowButton();
    }

    @Then("I should see  success message You have been successfully subscribed! is visible")
    public void iShouldSeeSuccessMessageYouHaveBeenSuccessfullySubscribedIsVisible() {
        Assert.assertEquals(new CartPage().verifyTheSuccessAlertText(),"You have been successfully subscribed!","Text does not match");
    }

    @When("I Scroll down page to bottom")
    public void iScrollDownPageToBottom() {
        new Homepage().scrollDownToBottom();
    }

    @And("I Click on arrow at bottom right side to move upward")
    public void iClickOnArrowAtBottomRightSideToMoveUpward() throws InterruptedException {
        Thread.sleep(2000);
        new Homepage().clickOnArrowToMoveUpwards();
    }

    @Then("I should see that page is scrolled up and Full-Fledged practice website for Automation Engineers text is visible on screen")
    public void iShouldSeeThatPageIsScrolledUpAndFullFledgedPracticeWebsiteForAutomationEngineersTextIsVisibleOnScreen() {
        Assert.assertTrue(new Homepage().verifyAutomationEngineerText().contains("Full-Fledged practice website for Automation Engineers"));
    }

    @And("I Scroll up page to top")
    public void iScrollUpPageToTop() throws InterruptedException {
        Thread.sleep(2000);
        new Homepage().scrollUpPageToTop();
    }
}
