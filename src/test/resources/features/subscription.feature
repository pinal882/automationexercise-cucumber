Feature: Subscription in homepage
  As a user, i want to verify user can subscribe
  Background:
    Given I am on Homepage

    Scenario: verify Subscription in homepage
      When I click on Cart Tab
    And I Scroll down to footer
    And I Verify text SUBSCRIPTION
    And I Enter email address "abc@gmail.com" in input
    And I click arrow button
    Then I should see  success message You have been successfully subscribed! is visible
@Shah1
      Scenario: verify scroll up using arrow button and scroll down functionality
      When I Scroll down page to bottom
        And I Verify text SUBSCRIPTION
      And I Click on arrow at bottom right side to move upward
      Then I should see that page is scrolled up and Full-Fledged practice website for Automation Engineers text is visible on screen
@Shah2
  Scenario: verify scroll up without arrow button and scroll down functionality
    When I Scroll down page to bottom
    And I Verify text SUBSCRIPTION
  And I Scroll up page to top
    Then I should see that page is scrolled up and Full-Fledged practice website for Automation Engineers text is visible on screen
