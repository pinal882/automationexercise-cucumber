package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class AddProductsToCartPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//div[@class='col-sm-9 padding-right']//div[2]//div[1]//div[1]//div[2]")
    WebElement firstProduct;
    @CacheLookup
    //@FindBy(xpath = "(//a[@class='btn btn-default add-to-cart'][normalize-space()='Add to cart'])[2]")
    @FindBy(xpath = "//body[1]/section[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/a[1]")
    WebElement firstProductAddToCart;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue Shopping']")
    WebElement continueShoppingButton;
    @CacheLookup
    @FindBy(xpath = "//div[3]//div[1]//div[1]//div[2]")
    WebElement secondProduct;
    @CacheLookup
    @FindBy(xpath = "//body[1]/section[2]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/a[1]")
    //@FindBy(xpath = "//body[1]/section[2]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[2]/ul[1]")
    WebElement secondProductAddToCart;
    @CacheLookup
    //@FindBy(xpath = "(//u[normalize-space()='View Cart'])[1]")
    @FindBy(xpath = "//u[normalize-space()='View Cart']")
    WebElement viewCartButton;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Blue Top']")
    WebElement firstProductText;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Men Tshirt']")
    WebElement secondProductText;
    @CacheLookup
    @FindBy(xpath = "//td[@class='cart_price']//p[contains(text(),'Rs. 500')]")
    WebElement firstProductPrice;
    @CacheLookup
    @FindBy(xpath = "//td[@class='cart_price']//p[contains(text(),'Rs. 400')]")
    WebElement secondProductPrice;
    @CacheLookup
    @FindBy(xpath = "//tr[@id='product-1']//button[@class='disabled'][normalize-space()='1']")
    WebElement firstProductQuantity;
    @CacheLookup
    @FindBy(xpath = "//tr[@id='product-2']//button[@class='disabled'][normalize-space()='1']")
    WebElement secondProductQuantity;
    @CacheLookup
    @FindBy(xpath = "//p[@class='cart_total_price'][normalize-space()='Rs. 500']")
    WebElement firstProductTotal;
    @CacheLookup
    @FindBy(xpath = "//p[@class='cart_total_price'][normalize-space()='Rs. 400']")
    WebElement secondProductTotal;
    @CacheLookup
    @FindBy(id = "quantity")
    WebElement quantityField;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Add to cart']")
    WebElement addToCart;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='4']")
    WebElement quantityText;
    public void mouseHoverOnFirstProduct(){
        mouseHoverToElement(firstProduct);
    }
    public void clickOnFirstProductAddToCartButton(){
        try {
        clickOnElement(firstProductAddToCart);
    }  catch (Exception e){
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].scrollIntoView(true)",firstProductAddToCart);
        firstProductAddToCart.click();
    }
    }
    public void clickOnContinueShoppingButton(){
        clickOnElement(continueShoppingButton);
    }
    public void mouseHoverOnSecondProduct(){
        mouseHoverToElement(secondProduct);
    }
    public void clickOnSecondProductAddToCart(){
        clickOnElement(secondProductAddToCart);
    }
    public void clickOnViewCart(){
        clickOnElement(viewCartButton);
    }

    public String verifyFirstProduct(){
        return getTextFromElement(firstProductText);
    }
    public String verifySecondProduct(){
        return getTextFromElement(secondProductText);
    }
    public String verifyFirstProductPrice(){
        return getTextFromElement(firstProductPrice);
    }
    public String verifySecondProductPrice(){
        return getTextFromElement(secondProductPrice);
    }
    public void enterQuantity(String quantity){
clearTextOnElement(quantityField);
        sendTextToElement(quantityField,quantity);
    }
    public void clickOnAddToCart(){
        clickOnElement(addToCart);
    }
    public String verifyProductQuantity(){
        return getTextFromElement(quantityText);
    }
    public String verifyFirstProductQuantity(){
        return getTextFromElement(firstProductQuantity);
    }
    public String verifySecondProductQuantity(){
        return getTextFromElement(secondProductQuantity);
    }
    public String verifyFirstProductTotal(){
        return getTextFromElement(firstProductTotal);
    }
    public String verifySecondProductTotal(){
        return getTextFromElement(secondProductTotal);
    }
}
