package com.automationexercise.steps;

import com.automationexercise.pages.CheckoutPage;
import com.automationexercise.pages.PaymentPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;


public class CheckoutTestSteps {


    @Then("I should see  Address Details and Review Your Order")
    public void iShouldSeeAddressDetailsAndReviewYourOrder() {
        Assert.assertEquals(new CheckoutPage().verifyAddressDetails(),"Address Details","Text does not match");
        Assert.assertEquals(new CheckoutPage().verifyReviewYourOrder(),"Review Your Order","Text does not match");
    }
    @And("I Enter description {string} in comment text area")
    public void iEnterDescriptionInCommentTextArea(String message) {
        new CheckoutPage().enterMessage(message);

    }

    @And("I click Place Order")
    public void iClickPlaceOrder() {
        new CheckoutPage().clickOnPlaceOrderButton();
    }


    @And("I Enter payment details: Name on Card {string}, Card Number {string}, CVC {string}, Expiration date {string}, year {string}")
    public void iEnterPaymentDetailsNameOnCardCardNumberCVCExpirationDateYear(String name, String cardNumber, String cvc, String month, String year) throws InterruptedException {
        Thread.sleep(2000);
        new PaymentPage().enterPaymentDetails(name,cardNumber,cvc,month,year);
    }

    @And("I Click Pay and Confirm Order button")
    public void iClickPayAndConfirmOrderButton() {
        new PaymentPage().clickOnPayAndConfirmOrderButton();
    }

    @Then("I should see success message Your order has been placed successfully!")
    public void iShouldSeeSuccessMessageYourOrderHasBeenPlacedSuccessfully() throws InterruptedException {
        Thread.sleep(2000);
      Assert.assertEquals(new PaymentPage().verifyOrderPlacedMessage(),"Your order has been placed successfully!");
    }

    @And("I Click Download Invoice button and verify invoice is downloaded successfully.")
    public void iClickDownloadInvoiceButtonAndVerifyInvoiceIsDownloadedSuccessfully() {
        new CheckoutPage().clickOnDownloadInvoice();
        Assert.assertTrue(new CheckoutPage().isFileDownloaded());


       // boolean isFileDownloaded = verifyDownload.isFileDownloaded("invoice", "txt", 5000);
        //Assert.assertTrue(isFileDownloaded, "Verify invoice is downloaded successfully.");
    }

    @And("I should see that the delivery address is same address filled at the time registration of account")
    public void iShouldSeeThatTheDeliveryAddressIsSameAddressFilledAtTheTimeRegistrationOfAccount() {
        new CheckoutPage().verifyDeliveryAddress();
    }

    @And("I should see that the billing address is same address filled at the time registration of account")
    public void iShouldSeeThatTheBillingAddressIsSameAddressFilledAtTheTimeRegistrationOfAccount() {
        new CheckoutPage().verifyBillingAddress();
    }
}

