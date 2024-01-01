package com.automationexercise.steps;

import com.automationexercise.pages.Homepage;
import com.automationexercise.pages.ProductCategoryPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class CategoryTestSteps {
    @When("I Verify that categories are visible on left side bar")
    public void iVerifyThatCategoriesAreVisibleOnLeftSideBar() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertEquals(new Homepage().verifyCategoryText(),"CATEGORY");
    }

    @And("I Click on Women category")
    public void iClickOnWomenCategory() {
        new ProductCategoryPage().clickOnWomenCategory();
    }

    @And("I Click on any category link under Women category, for example: Dress")
    public void iClickOnAnyCategoryLinkUnderWomenCategoryForExampleDress() {
        new ProductCategoryPage().clickOnDress();
    }

    @And("I confirm text WOMEN - Dress PRODUCTS")
    public void iConfirmTextWOMENDressPRODUCTS() {
        Assert.assertTrue(new ProductCategoryPage().verifyWomenDressProductsText().contains("WOMEN - DRESS PRODUCTS"));
    }

    @And("I click on any sub-category link of Men category On left side bar")
    public void iClickOnAnySubCategoryLinkOfMenCategoryOnLeftSideBar() {
        new ProductCategoryPage().clickOnMenCategory();
    }
    @And("I Click on any category link under Men category, for example: Jeans")
    public void iClickOnAnyCategoryLinkUnderMenCategoryForExampleJeans() {
        new ProductCategoryPage().clickOnMenJeans();
    }

    @And("I should see that user is navigated to that category page")
    public void iShouldSeeThatUserIsNavigatedToThatCategoryPage() {
        Assert.assertEquals(new ProductCategoryPage().verifyMenJeansProductsText(),"MEN - JEANS PRODUCTS");

    }


}
