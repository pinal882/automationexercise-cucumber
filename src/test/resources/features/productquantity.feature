Feature: Product quantity

  As a user,I want to verify product qty in cart
  Background:
    Given I am on Homepage
@pinal3
 Scenario: verify product quantity in cart
   When I Click on Products button
   And I should see that user is navigated to ALL PRODUCTS page successfully
   And The products list is visible
   And I Click on View Product of first product
   And I should see detail is visible: product name, category, price, availability, condition, brand
 And I Increase quantity to "4"
 And I click Add to cart button
 And I Click View Cart button
 Then I should Verify that product name "Blue Top" is displayed in cart page with exact quantity"4"
