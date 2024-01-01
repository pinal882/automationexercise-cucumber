Feature: place order and login before checkout
  As a user,i want to login before checkout
  Background:
    Given I am on Homepage
@PINAL
 Scenario: place order and login before checkout
   When I Click on Signup or Login Button
   And I should see Login to your account is visible
   And I Enter correct "zab@gmail.com"
   And I Enter correct password "abc123"
   And I Click login button
   And I should see  that Logged in as username is visible
 And I Click on Products button
   And I Hover over first product
   And I click Add to cart
And I click on Cart Tab
   And I Verify that cart page is displayed
   And I Click Proceed To Checkout
   Then I should see  Address Details and Review Your Order
   And I Enter description "Awaiting order" in comment text area
   And I click Place Order
   And I Enter payment details: Name on Card "xyz", Card Number "5586 7896 6743 3241", CVC "656", Expiration date "07", year "2027"
   And I Click Pay and Confirm Order button
  # Then I should see success message Your order has been placed successfully!
   And I Click Delete Account button
   Then I should see  that ACCOUNT DELETED! is visible
   And I Click Continue button