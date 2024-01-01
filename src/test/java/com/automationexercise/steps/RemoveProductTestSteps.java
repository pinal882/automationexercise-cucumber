package com.automationexercise.steps;

import com.automationexercise.pages.CartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class RemoveProductTestSteps {
    @And("I Click X button corresponding to particular product")
    public void iClickXButtonCorrespondingToParticularProduct() {
        new CartPage().clickOnCrossButton();
    }

    @Then("I should see  that product is removed from the cart")
    public void iShouldSeeThatProductIsRemovedFromTheCart() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertEquals(new CartPage().verifyCartIsEmpty(),"Cart is empty!");
    }
}
