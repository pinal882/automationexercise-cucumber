Feature: Logout function
  As a user i want to verify logout functionality
  Background:
    Given I am on Homepage
  Scenario: user should logout successfully
    When I Click on Signup or Login Button
  And I should see Login to your account is visible
  And I Enter correct "ab2@gmail.com"
    And I Enter correct password "abc123"
  And I Click login button
  And I should see that Logged in as username is visible
  And I Click Logout button
  Then I should see that user is navigated to login page