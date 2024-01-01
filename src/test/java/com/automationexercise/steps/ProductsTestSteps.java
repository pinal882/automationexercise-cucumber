package com.automationexercise.steps;

import com.automationexercise.pages.Homepage;
import com.automationexercise.pages.ProductBrandPage;
import com.automationexercise.pages.ProductReviewPage;
import com.automationexercise.pages.ProductsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class ProductsTestSteps {

    @When("I Click on Products button")
    public void iClickOnProductsButton() throws InterruptedException {
        Thread.sleep(2000);
        new Homepage().clickOnProductsTab();
    }

    @And("I should see that user is navigated to ALL PRODUCTS page successfully")
    public void iShouldSeeThatUserIsNavigatedToALLPRODUCTSPageSuccessfully() {
        Assert.assertEquals(new ProductsPage().verifyAllProductsText(),"ALL PRODUCTS","Text does not match");
    }

    @And("The products list is visible")
    public void theProductsListIsVisible() {
        new ProductsPage().verifyProductListIsVisible();

    }

    @And("I Click on View Product of first product")
    public void iClickOnViewProductOfFirstProduct() {
        new ProductsPage().clickOnViewProduct();
    }

    @And("User is landed to product detail page")
    public void userIsLandedToProductDetailPage() {

    }

    @Then("I should see detail is visible: product name, category, price, availability, condition, brand")
    public void iShouldSeeDetailIsVisibleProductNameCategoryPriceAvailabilityConditionBrand() {
        Assert.assertEquals(new ProductsPage().verifyProductName(),"Blue Top","Text does not match");
        Assert.assertEquals(new ProductsPage().verifyCategory(),"Category: Women > Tops","Text does not match");
        Assert.assertEquals(new ProductsPage().verifyPrice(),"Rs. 500","Text does not match");
        Assert.assertEquals(new ProductsPage().verifyAvailability(),"Availability:","Text does not match");
        Assert.assertEquals(new ProductsPage().verifyCondition(),"Condition:","Text does not match");
        Assert.assertEquals(new ProductsPage().verifyBrand(),"Brand:","Text does not match");
    }
    @And("I  Enter product name {string} in search input")
    public void iEnterProductNameInSearchInput(String product) {
        new ProductsPage().searchProduct(product);
    }

    @And("I click search button")
    public void iClickSearchButton() {
        new ProductsPage().clickOnSearchButton();
    }

    @And("I should see SEARCHED PRODUCTS is visible")
    public void iShouldSeeSEARCHEDPRODUCTSIsVisible() {
        Assert.assertEquals(new ProductsPage().verifySearchedProductsText(),"SEARCHED PRODUCTS","Text does not match");
    }

    @Then("I should Verify all the products related to search are visible")
    public void iShouldVerifyAllTheProductsRelatedToSearchAreVisible() {
        new ProductsPage().verifySearchedProductsAreDisplayed();
    }


    @And("I should see that Brands are visible on left side bar")
    public void iShouldSeeThatBrandsAreVisibleOnLeftSideBar() {
Assert.assertTrue(new ProductBrandPage().verifyBrandText().contains("BRANDS"));
    }

    @And("I Click on any brand name {string}")
    public void iClickOnAnyBrandName(String name) throws InterruptedException {
        Thread.sleep(2000);
        new ProductBrandPage().ClickOnPoloBrand();
    }

    @Then("I should see that user is navigated to brand page")
    public void iShouldSeeThatUserIsNavigatedToBrandPage() {
        Assert.assertTrue(new ProductBrandPage().verifyPoloProductText().contains("BRAND - POLO PRODUCTS"));
    }

    @And("I click on any other brand link On left side bar {string}")
    public void iClickOnAnyOtherBrandLinkOnLeftSideBar(String name) {
        new ProductBrandPage().clickOnBibaBrand();

    }


    @Then("I should see that user is navigated to that brand page")
    public void iShouldSeeThatUserIsNavigatedToThatBrandPage() {
        Assert.assertTrue(new ProductBrandPage().verifyBibaBrandText().contains("BRAND - BIBA PRODUCTS"));
    }

    @And("I Add those products to cart")
    public void iAddThoseProductsToCart() {
        new ProductsPage().clickOnSearchedProductsAndAddToCart();
    }
    // test 21
    @And("I Click on View Product")
    public void iClickOnViewProduct() {
        new ProductsPage().clickOnViewProductTest21();

    }

    @Then("I should Verify title  {string} is visible")
    public void iShouldVerifyTitleIsVisible(String title) throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertEquals(new ProductsPage().verifyWriteYourReviewText(),title);
    }




    @And("I  Enter name {string}, email {string} and review message {string}")
    public void iEnterNameEmailAndReviewMessage(String name, String email, String message) {
        new ProductReviewPage().enterReviewDetails(name,email,message);
    }

    @And("I Click on Submit button")
    public void iClickOnSubmitButton() {
        new ProductReviewPage().clickOnReviewButton();
    }




    @Then("I should Verify success message {string}.")
    public void iShouldVerifySuccessMessage(String message) throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertEquals(new ProductReviewPage().verifyReviewMessageText(),message);
    }

    @And("I mouse hover on dress first product")
    public void iMouseHoverOnDressFirstProduct() {
        new ProductsPage().mouseHoverOnDress();

    }

    @And("I should see that products are visible in cart")
    public void iShouldSeeThatProductsAreVisibleInCart() {
        Assert.assertEquals(new ProductsPage().verifyTheCartProducts(),1);
    }

    @And("I should see that those products are visible in cart after login as well")
    public void iShouldSeeThatThoseProductsAreVisibleInCartAfterLoginAsWell() {
        Assert.assertEquals(new ProductsPage().verifyTheCartProducts(),1);
    }
}
