Feature: view and cart brand products
  Background:
    Given I am on Homepage

 Scenario: view and cart brand products
 When I Click on Products button
 And I should see that Brands are visible on left side bar
 And I Click on any brand name "Polo"
 Then I should see that user is navigated to brand page
   And I click on any other brand link On left side bar "Biba"
 Then I should see that user is navigated to that brand page
