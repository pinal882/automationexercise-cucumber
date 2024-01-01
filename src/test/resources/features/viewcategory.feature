Feature: view products category
  As a user, i want to view products category
  Background:
    Given I am on Homepage

 Scenario: view products category
 When I Verify that categories are visible on left side bar
 And I Click on Women category
 And I Click on any category link under Women category, for example: Dress
   And I confirm text WOMEN - Dress PRODUCTS
 And I click on any sub-category link of Men category On left side bar
   And I Click on any category link under Men category, for example: Jeans
 And I should see that user is navigated to that category page