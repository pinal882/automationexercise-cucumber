package com.automationexercise.steps;

import com.automationexercise.pages.Homepage;
import com.automationexercise.pages.TestcasePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class TestcaseTestSteps {
    @When("I Click on Test Cases button")
    public void iClickOnTestCasesButton() throws InterruptedException {
Thread.sleep(20000);
        new Homepage().clickOnTestCaseTab();
    }

    @Then("I should navigated to test cases page successfully")
    public void iShouldNavigatedToTestCasesPageSuccessfully() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertEquals(new TestcasePage().verifyTestCaseText(),"TEST CASES","Text does not match");
    }
}
