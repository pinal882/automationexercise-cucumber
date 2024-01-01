package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ProductCategoryPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Women']")
    WebElement womenCategory;
    @CacheLookup
    @FindBy(xpath = "//div[@id='Women']//a[contains(text(),'Dress')]")
    WebElement womenDress;
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Women - Dress Products']")
    WebElement womenDressProductsText;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Men']")
    WebElement menCategory;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Jeans']")
    WebElement menJeans;
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Men - Jeans Products']")
    WebElement menJeansProductsText;
    public void clickOnWomenCategory(){
        clickOnElement(womenCategory);
    }
    public void clickOnDress(){
        clickOnElement(womenDress);
    }
    public String verifyWomenDressProductsText(){
        return getTextFromElement(womenDressProductsText);
    }
    public void clickOnMenCategory(){
        clickOnElement(menCategory);
    }
    public void clickOnMenJeans(){
        clickOnElement(menJeans);
    }
    public String verifyMenJeansProductsText(){
        return getTextFromElement(menJeansProductsText);
    }
}
