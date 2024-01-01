package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static org.testng.AssertJUnit.assertTrue;
public class ProductsPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='All Products']")
    WebElement allProductsText;
    @CacheLookup
    @FindBy(xpath = "//div[@class='productinfo text-center']//p")
    WebElement productList;
    @CacheLookup
    @FindBy(xpath = "//div[@class='col-sm-9 padding-right']//div[2]//div[1]//div[2]//ul[1]//li[1]//a[1]")
    WebElement viewProductTab;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Blue Top']")
    WebElement productName;
    @CacheLookup
    @FindBy(xpath = "//p[normalize-space()='Category: Women > Tops']")
    WebElement category;
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Rs. 500']")
    WebElement price;
    @CacheLookup
    @FindBy(xpath = "//b[normalize-space()='Availability:']")
    WebElement availability;
    @CacheLookup
    @FindBy(xpath = "//b[normalize-space()='Condition:']")
    WebElement condition;
    @CacheLookup
    @FindBy(xpath = "//b[normalize-space()='Brand:']")
    WebElement brand;
    @CacheLookup
    @FindBy(xpath = "//input[@id='search_product']")
    WebElement searchProduct;
    @CacheLookup
    @FindBy(xpath = "//i[@class='fa fa-search']")
    WebElement searchButton;
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Searched Products']")
    WebElement searchedProductText;
    @CacheLookup
    @FindBy(xpath = "//div[@class='features_items']")
    List<WebElement>  allSearchedProducts;
    @CacheLookup
@FindBy(xpath = "(//a[@class='btn btn-default add-to-cart'][normalize-space()='Add to cart'])[2]")
    //@FindBy(xpath = "(//div[@class='col-sm-9 padding-right'])[1]")
    WebElement SearchedProducts;
    @CacheLookup
    @FindBy(xpath = "//body[1]/section[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[1]/a[1]")
    WebElement viewProduct;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Write Your Review']")
    WebElement writeYourReviewText;
    @CacheLookup
    @FindBy(xpath = "//body[1]/section[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]")
    WebElement dressFirstProduct;
    @CacheLookup
    @FindBy(xpath = "//tr[@id='product-3']")
    List<WebElement> cartProducts;

    public String verifyAllProductsText(){
        return getTextFromElement(allProductsText);
    }
    public void verifyProductListIsVisible(){
        if (productList.isDisplayed()) {
            System.out.println("Element is Present");
        }else {
            System.out.println("Element is Invisible");
        }


    }
    public void clickOnViewProduct(){
        clickOnElement(viewProductTab);
    }
    public String verifyProductName(){
        return getTextFromElement(productName);
    }
    public String verifyCategory(){
        return getTextFromElement(category);
    }
    public String verifyPrice(){
        return getTextFromElement(price);
    }
    public String verifyAvailability(){
        return getTextFromElement(availability);
    }
    public String verifyCondition(){
        return getTextFromElement(condition);
    }
    public String verifyBrand(){
        return getTextFromElement(brand);
    }
    public void searchProduct(String product){
        sendTextToElement(searchProduct,product);
    }
    public void clickOnSearchButton(){
        clickOnElement(searchButton);
    }
    public String verifySearchedProductsText(){
        return getTextFromElement(searchedProductText);
    }
    public void verifySearchedProductsAreDisplayed(){
        for (int i =0; i< allSearchedProducts.size(); i++){
            assertTrue(allSearchedProducts.get(i).getText().contains("Dress"));
        }
    }
    public void clickOnSearchedProductsAndAddToCart(){
        clickOnElement(SearchedProducts);

    }
    public void clickOnViewProductTest21(){
        clickOnElement(viewProduct);

    }
    public String verifyWriteYourReviewText(){
        return getTextFromElement(writeYourReviewText);
    }
    public void scrollToElement() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", writeYourReviewText);
    }
    public void mouseHoverOnDress(){
        mouseHoverToElement(dressFirstProduct);
    }
    public int verifyTheCartProducts(){
        return cartProducts.size();
    }
}
