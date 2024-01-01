package com.automationexercise.steps;

import com.automationexercise.pages.CartPage;
import io.cucumber.java.en.And;
import org.testng.Assert;

public class PlaceOrderRegisterWhileCheckoutTestSteps {
    @And("I Verify that cart page is displayed")
    public void iVerifyThatCartPageIsDisplayed() {
        Assert.assertEquals(new CartPage().verifyShoppingCartText(),"Shopping Cart");
    }

    @And("I Click Proceed To Checkout")
    public void iClickProceedToCheckout() throws InterruptedException {
        Thread.sleep(3000);
        new CartPage().clickOnProceedToCheckout();
    }

    @And("I Click Register Login button")
    public void iClickRegisterLoginButton() {
        new CartPage().clickOnRegisterLoginButton();
    }
}
