Feature: Remove products from cart
  As a user, i want to verify removing products from cart
  Background:
    Given I am on Homepage
@pinal1
Scenario: Remove products from cart
When I Click on Products button
  And I Hover over first product
  And I click Add to cart
  And I Click View Cart button
  And I Verify that cart page is displayed
And I Click X button corresponding to particular product
Then I should see  that product is removed from the cart