package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;
public class ProductBrandPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Brands']")
    WebElement brandsText;
    @CacheLookup
    @FindBy(xpath = "//a[@href='/brand_products/Polo']")
    WebElement poloBrand;
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Brand - Polo Products']")
    WebElement poloProductText;
    @CacheLookup
    @FindBy(xpath = "//div[@class='features_items']")
    List<WebElement> allPoloBrandProduct;
@CacheLookup
@FindBy(xpath = "//a[@href='/brand_products/Biba']")
WebElement bibaBrand;
@CacheLookup
@FindBy(xpath = "//h2[normalize-space()='Brand - Biba Products']")
WebElement bibaBrandText;
    public String verifyBrandText() {
        return getTextFromElement(brandsText);
    }

    public void ClickOnPoloBrand() {
        clickOnElement(poloBrand);
    }

    public String verifyPoloProductText() {
        return getTextFromElement(poloProductText);
    }

    //public String verifyAllPoloBrandProduct() {
        //for (int i=0; i<allPoloBrandProduct; i++) {
         //   assertTrue(allPoloBrandProduct.get(i).getText().contains("Polo"));
       // }

    //}
    public void clickOnBibaBrand(){
        clickOnElement(bibaBrand);
    }
    public String verifyBibaBrandText(){
        return getTextFromElement(bibaBrandText);
    }
}

