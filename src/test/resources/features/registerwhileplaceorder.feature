Feature: Place order
  Background:
    Given I am on Homepage
 @SANITY
  Scenario: place order and register while checkout
    When I Click on Products button
    And I Hover over first product
    And I click Add to cart
    And I Click Continue Shopping button
    And I click on Cart Tab
  And I Verify that cart page is displayed
  And I Click Proceed To Checkout
  And I Click Register Login button
   And I Enter "xyz" and "BXC@gmail.com" address
    And I Click Signup button
    And I should  that ENTER ACCOUNT INFORMATION is visible
    And I select title
    And I enter password "abc123"
    And I select date of birth "23", "January", "2015"
    And I Select checkbox Sign up for our newsletter!
    And I Select checkbox Receive special offers from our partners!
    And I Fill details: "xyz", "ch","b2b","101 geetanjali", "near chakli circle","India","Gujarat","Baroda","391240","00913456767543"
    And I Click Create Account button
    And I should see that ACCOUNT CREATED! is visible
    And I Click Continue button
    And I should see that Logged in as username is visible
  And I click on Cart Tab
  And I Click Proceed To Checkout
  Then I should see  Address Details and Review Your Order
  And I Enter description "Awaiting order" in comment text area
  And I click Place Order
  And I Enter payment details: Name on Card "xyz", Card Number "5586 7896 6743 3241", CVC "656", Expiration date "07", year "2027"
  And I Click Pay and Confirm Order button
  #Then I should see success message Your order has been placed successfully!
  And I Click Delete Account button
    Then I should see  that ACCOUNT DELETED! is visible
    And I Click Continue button
@pinal4
  Scenario: Download invoice after purchase order
    When I Click on Products button
    And I Hover over first product
    And I click Add to cart
    And I Click Continue Shopping button
    And I click on Cart Tab
    And I Verify that cart page is displayed
    And I Click Proceed To Checkout
    And I Click Register Login button
    And I Enter "xyz" and "BC2@gmail.com" address
    And I Click Signup button
    And I should  that ENTER ACCOUNT INFORMATION is visible
    And I select title
    And I enter password "abc123"
    And I select date of birth "23", "January", "2015"
    And I Select checkbox Sign up for our newsletter!
    And I Select checkbox Receive special offers from our partners!
    And I Fill details: "xyz", "ch","b2b","101 geetanjali", "near chakli circle","India","Gujarat","Baroda","391240","00913456767543"
    And I Click Create Account button
    And I should see that ACCOUNT CREATED! is visible
    And I Click Continue button
    And I should see that Logged in as username is visible
    And I click on Cart Tab
    And I Click Proceed To Checkout
    Then I should see  Address Details and Review Your Order
    And I Enter description "Awaiting order" in comment text area
    And I click Place Order
    And I Enter payment details: Name on Card "xyz", Card Number "5586 7896 6743 3241", CVC "656", Expiration date "07", year "2027"
    And I Click Pay and Confirm Order button
    #Then I should see success message Your order has been placed successfully!
  And I Click Download Invoice button and verify invoice is downloaded successfully.
  And I Click Continue button
    And I Click Delete Account button
    Then I should see  that ACCOUNT DELETED! is visible
    And I Click Continue button