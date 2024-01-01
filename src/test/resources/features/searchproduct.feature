Feature: Product Search
  As a user i want to verify product search functionality
  Background:
    Given I am on Homepage

    Scenario: search product
      When I Click on Products button
      And I should see that user is navigated to ALL PRODUCTS page successfully
    And I  Enter product name "Dress" in search input
    And I click search button
    And I should see SEARCHED PRODUCTS is visible
    Then I should Verify all the products related to search are visible
@Test
Scenario: search Products and verify cart after login
  When I Click on Products button
  And I should see that user is navigated to ALL PRODUCTS page successfully
  And I  Enter product name "Dress" in search input
  And I click search button
  And I should see SEARCHED PRODUCTS is visible
And I should Verify all the products related to search are visible
  And I mouse hover on dress first product
  And I click Add to cart
  And I Click View Cart button
And I should see that products are visible in cart
And I Click on Signup or Login Button
  And I Enter correct "ab3@gmail.com"
  And I Enter correct password "abc123"
  And I Click login button
Then I click on Cart Tab
And I should see that those products are visible in cart after login as well