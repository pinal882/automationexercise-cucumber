Feature: adding products in cart
  As a user, I want to verify products are successfully added to the cart
  Background:
    Given I am on Homepage
@search
    Scenario: add products in cart
  When I Click on Products button
  And I Hover over first product
  And I click Add to cart
  And I Click Continue Shopping button
  And I Hover over second product
  And I click second Product Add to cart
  And I Click View Cart button
  And I should see  both products "Blue Top" and "Men Tshirt" are added to Cart
  Then I Verify  prices "Rs. 500", quantity "1" and total price "Rs. 500" for firstProduct
  And I Verify  prices "Rs. 400", quantity "1" and total price "Rs. 400" for secondProduct

  Scenario: Add products to cart from Recommended items
  When I Scroll to bottom of page
  And I should see Verify RECOMMENDED ITEMS are visible
  And I Click on Add To Cart on Recommended product
  And I Click on View Cart button
  Then I should see that product is displayed in cart page