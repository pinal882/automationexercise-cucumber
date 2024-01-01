package com.automationexercise.steps;

import com.automationexercise.pages.AddProductsToCartPage;
import com.automationexercise.pages.Homepage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class AddProductToCartTestSteps {
    @And("I Hover over first product")
    public void iHoverOverFirstProduct() throws InterruptedException {
        Thread.sleep(2000);
        new AddProductsToCartPage().mouseHoverOnFirstProduct();
    }

    @And("I click Add to cart")
    public void iClickAddToCart() throws InterruptedException {
Thread.sleep(2000);
        new AddProductsToCartPage().clickOnFirstProductAddToCartButton();

    }

    @And("I Click Continue Shopping button")
    public void iClickContinueShoppingButton() throws InterruptedException {
        Thread.sleep(2000);
        new AddProductsToCartPage().clickOnContinueShoppingButton();
    }

    @And("I Hover over second product")
    public void iHoverOverSecondProduct() {
        new AddProductsToCartPage().mouseHoverOnSecondProduct();
    }
    @And("I click second Product Add to cart")
    public void iClickSecondProductAddToCart() {
        new AddProductsToCartPage().clickOnSecondProductAddToCart();
    }

    @And("I Click View Cart button")
    public void iClickViewCartButton() {
        new AddProductsToCartPage().clickOnViewCart();
    }

    @And("I should see  both products {string} and {string} are added to Cart")
    public void iShouldSeeBothProductsAndAreAddedToCart(String firstProduct, String secondProduct) {
        Assert.assertEquals(new AddProductsToCartPage().verifyFirstProduct(),firstProduct);
        Assert.assertEquals(new AddProductsToCartPage().verifySecondProduct(),secondProduct);
    }

    @And("I Increase quantity to {string}")
    public void iIncreaseQuantityTo(String quantity) {
        new AddProductsToCartPage().enterQuantity(quantity);
    }

    @And("I click Add to cart button")
    public void iClickAddToCartButton() {
        new AddProductsToCartPage().clickOnAddToCart();
    }

    @Then("I should Verify that product name {string} is displayed in cart page with exact quantity{string}")
    public void iShouldVerifyThatProductNameIsDisplayedInCartPageWithExactQuantity(String name,String quantity) throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertEquals(new AddProductsToCartPage().verifyFirstProduct(),name);
        Assert.assertEquals(new AddProductsToCartPage().verifyProductQuantity(),quantity);
    }

    @Then("I Verify  prices {string}, quantity {string} and total price {string} for firstProduct")
    public void iVerifyPricesQuantityAndTotalPriceForFirstProduct(String price, String quantity, String total) {
        Assert.assertEquals(new AddProductsToCartPage().verifyFirstProductPrice(),price);
        Assert.assertEquals(new AddProductsToCartPage().verifyFirstProductQuantity(),quantity);
        Assert.assertEquals(new AddProductsToCartPage().verifyFirstProductTotal(),total);
    }

    @And("I Verify  prices {string}, quantity {string} and total price {string} for secondProduct")
    public void iVerifyPricesQuantityAndTotalPriceForSecondProduct(String price, String quantity, String total) {
        Assert.assertEquals(new AddProductsToCartPage().verifySecondProductPrice(),price);
        Assert.assertEquals(new AddProductsToCartPage().verifySecondProductQuantity(),quantity);
        Assert.assertEquals(new AddProductsToCartPage().verifySecondProductTotal(),total);
    }


    @When("I Scroll to bottom of page")
    public void iScrollToBottomOfPage() {
        new Homepage().scrollToElementRecommendedItems();
    }

    @And("I should see Verify RECOMMENDED ITEMS are visible")
    public void iShouldSeeVerifyRECOMMENDEDITEMSAreVisible() {
        Assert.assertTrue(new Homepage().verifyRecommendedItemsText().contains("RECOMMENDED ITEMS"));
    }

    @And("I Click on Add To Cart on Recommended product")
    public void iClickOnAddToCartOnRecommendedProduct() {
        new Homepage().clickOnAddToCartRecommendedProduct();
    }

    @And("I Click on View Cart button")
    public void iClickOnViewCartButton() {
        new Homepage().clickOnViewCart();
    }

    @Then("I should see that product is displayed in cart page")
    public void iShouldSeeThatProductIsDisplayedInCartPage() {
        new Homepage().verifyTheRecommendedProductIsDisplay();
    }


    }

