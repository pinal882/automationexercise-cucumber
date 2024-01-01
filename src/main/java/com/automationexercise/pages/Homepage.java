package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;

public class Homepage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Signup / Login']")
    WebElement signupLink;
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='New User Signup!']")
    WebElement newUserSignupText;
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Name']")
    WebElement nameField;
    @CacheLookup
    @FindBy(xpath = "//input[@data-qa='signup-email']")
    WebElement emailField;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Signup']")
    WebElement signupButton;
    @CacheLookup
    @FindBy(xpath = "//p[normalize-space()='Email Address already exist!']")
    WebElement emailAddressAlreadyExistText;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Login to your account']")
    WebElement loginToYourAccountText;
    @CacheLookup
    @FindBy(xpath = "//input[@data-qa='login-email']")
    WebElement loginEmailAddress;
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Password']")
    WebElement loginPassword;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Login']")
    WebElement loginButton;
    @CacheLookup
    @FindBy(xpath = "//p[normalize-space()='Your email or password is incorrect!']")
    WebElement loginErrorText;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Contact us']")
    WebElement contactusTab;
    @CacheLookup
            @FindBy(xpath = "//div[@class='item active']//button[@type='button'][normalize-space()='Test Cases']")
    //@FindBy(xpath = "//a[contains(text(),'Test Cases')]")
    WebElement testcaseTab;
    @CacheLookup
    @FindBy(xpath = "//a[@href='/products']")
    WebElement productsTab;
    @CacheLookup
    @FindBy(xpath = "//body[1]/header[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[3]/a[1]")
    WebElement cartTab;
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Subscription']")
    WebElement subscriptionText;
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Category']")
    WebElement categoryText;
    @CacheLookup
    @FindBy(xpath = "//div[@id='recommended-item-carousel']//a[@class='btn btn-default add-to-cart']")
    List<WebElement> recommendedItemsList;
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='recommended items']")
    WebElement recommendedItems;
@CacheLookup
@FindBy(xpath = "//div[@class='item active']//div[1]//div[1]//div[1]//div[1]//a[1]")
WebElement recommendedItemsAddTocart;
@CacheLookup
@FindBy(xpath = "//u[normalize-space()='View Cart']")
WebElement viewCart;
    @CacheLookup
    @FindBy(xpath = "//tbody/tr")
    List<WebElement> addedCardProducts;
@CacheLookup
        @FindBy(xpath = "//a[@id='scrollUp']")
        //@FindBy(xpath = "//i[@class='fa fa-angle-up']")
//@FindBy(id = "scrollUp")
WebElement scrollUpArrow;
    @CacheLookup
    @FindBy(xpath = "//html")
    WebElement scrollDown;
@CacheLookup
@FindBy(xpath = "//div[@class='item active']//h2[contains(text(),'Full-Fledged practice website for Automation Engin')]")
WebElement automationEngineerText;

    public void clickOnSignupLink(){
        clickOnElement(signupLink);
    }
    public String verifyNewUserSignUpText(){
     return getTextFromElement(newUserSignupText);

    }
    public void enterName(String name){
        sendTextToElement(nameField,name);
    }
    public void enterEmail(String email){
        sendTextToElement(emailField,email);
    }
    public void clickOnSignupButton(){
        clickOnElement(signupButton);
    }
    public String verifyTheEmailAddressAlreadyExistText(){
        return getTextFromElement(emailAddressAlreadyExistText);
    }
    public String verifyLoginToYourAccountText(){
        return getTextFromElement(loginToYourAccountText);
    }
    public void enterLoginEmail(String logEmail){
        sendTextToElement(loginEmailAddress,logEmail);
    }
    public void enterLoginPassword(String logPassword){
        sendTextToElement(loginPassword,logPassword);
    }
    public void clickOnLoginButton(){
        clickOnElement(loginButton);
    }
    public String verifyLoginErrorText(){
        return getTextFromElement(loginErrorText);
    }
    public void clickOnContactusTab(){
        clickOnElement(contactusTab);
    }
    public void clickOnTestCaseTab(){
        clickOnElement(testcaseTab);
    }
    public void clickOnProductsTab(){
        clickOnElement(productsTab);
    }
    public void clickOnCartTab(){
        clickOnElement(cartTab);
    }
    public void scrollToElement(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", subscriptionText);
    }
    public String verifyTheSubscriptionText(){
        return getTextFromElement(subscriptionText);
    }
    public String verifyCategoryText(){
        return getTextFromElement(categoryText);
    }
    public void clickOnAddToCartRecommendedProduct(){
        recommendedItemsList.get(4).click();
    }
    public void scrollToElementRecommendedItems(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", recommendedItems);
    }
    public String verifyRecommendedItemsText(){
        return getTextFromElement(recommendedItems);
    }
    public void verifyTheRecommendedProductIsDisplay(){
        Assert.assertEquals(addedCardProducts.size(),1);
    }
    public void clickOnRecommendedItemsAddToCart(){
        clickOnElement(recommendedItemsAddTocart);

    }
    public void clickOnViewCart(){
        clickOnElement(viewCart);
    }
    public void scrollDownToBottom(){
        JavascriptExecutor jse6 = (JavascriptExecutor) driver;
        jse6.executeScript("window.scrollBy(0,250)", "");
    }
    public void clickOnArrowToMoveUpwards(){
        clickOnElement(scrollUpArrow);
    }
    public String verifyAutomationEngineerText(){
        return getTextFromElement(automationEngineerText);
    }
    public void scrollUpPageToTop(){
        Actions actions = new Actions(driver);
        WebElement slider = scrollDown;
        actions.dragAndDropBy(slider,0, -350);

    }
}
