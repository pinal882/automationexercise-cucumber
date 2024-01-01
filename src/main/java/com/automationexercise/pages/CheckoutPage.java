package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class CheckoutPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Address Details']")
    WebElement addressDetailsText;
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Review Your Order']")
    WebElement reviewYourOrderText;
    @CacheLookup
    @FindBy(xpath = "//textarea[@name='message']")
    WebElement messageBox;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Place Order']")
    WebElement placeOrderButton;
    @CacheLookup
    @FindBy(id = "address_delivery")
    List<WebElement> deliveryAddress;
    @CacheLookup
    @FindBy(id = "address_invoice")
    List<WebElement> billingAddress;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Download Invoice']")
    WebElement downloadInvoice;

    public String verifyAddressDetails() {
        return getTextFromElement(addressDetailsText);
    }

    public String verifyReviewYourOrder() {
        return getTextFromElement(reviewYourOrderText);
    }

    public void enterMessage(String message) {
        sendTextToElement(messageBox, message);
    }

    public void clickOnPlaceOrderButton() {
        clickOnElement(placeOrderButton);
    }

    public void clickOnDownloadInvoice() {
        clickOnElement(downloadInvoice);
    }

    public boolean isFileDownloaded() {
        String homePath = System.getProperty("user.home");
        File f = new File(homePath + "/Downloads/invoice.txt");
        return f.exists();
    }
    public String verifyDownloadInvoiceText() {
        return getTextFromElement(downloadInvoice);
    }

    //public boolean isFileDownloaded() {
       // Map<String, Object> fileMap = new HashMap<>();
       // fileMap.put("fileName", "...the file name...");
       // ((JavascriptExecutor) driver).executeScript("tb:fileExists", fileMap);
      //  return true;
   // }

    public void verifyDeliveryAddress() {
        List<WebElement> delivery = deliveryAddress;
        ArrayList<String> e = new ArrayList<>();
        e.add("Mr. xyz ch");
        e.add("b2b");
        e.add("101 geetanjali");
        e.add("near chakli circle");
        e.add("Baroda Gujarat 391240");
        e.add("India");
        e.add("00913456767543");
        for (int i = 0; i > delivery.size(); i++) {
            Assert.assertTrue(delivery.get(i).getText().contains(e.get(i)));
        }

    }

    public void  verifyBillingAddress() {

        List<WebElement> billing = billingAddress;
        ArrayList<String> e = new ArrayList<>();
        e.add("Mr. xyz ch");
        e.add("b2b");
        e.add("101 geetanjali");
        e.add("near chakli circle");
        e.add("Baroda Gujarat 391240");
        e.add("India");
        e.add("00913456767543");

        for (int i = 0; i > billing.size(); i++) {
            Assert.assertTrue(billing.get(i).getText().contains(e.get(i)));
        }


    }
}
