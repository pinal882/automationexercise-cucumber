Feature: Products details verification
  As a user I want to verify products and its details

  Background:
    Given I am on Homepage

    Scenario: verify all products and product details page
    When I Click on Products button
    And I should see that user is navigated to ALL PRODUCTS page successfully
    And The products list is visible
    And I Click on View Product of first product
    And User is landed to product detail page
    Then I should see detail is visible: product name, category, price, availability, condition, brand
@Pinal
  Scenario: add review on product
    When I Click on Products button
    And I should see that user is navigated to ALL PRODUCTS page successfully
    And I Click on View Product
  Then I should Verify title  "WRITE YOUR REVIEW" is visible
  And I  Enter name "abc", email "abc@gmail.com" and review message "happy with purchase"
  And I Click on Submit button
 # Then I should Verify success message "Thank you for your review".
