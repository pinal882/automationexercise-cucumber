Feature: Login functionality

  As a user,i want to check login functionality
  Background:
    Given I am on Homepage

  Scenario: user should login successfully with valid credentials
    When I Click on Signup or Login Button
 And I should see Login to your account is visible
  And I Enter correct "ab2@gmail.com"
  And I Enter correct password "abc123"
  And I Click login button
  And I should see  that Logged in as username is visible
  And I Click Delete Account button
  Then I should see that ACCOUNT DELETED! is visible

  Scenario: user should not login with invalid credentials
    When I Click on Signup or Login Button
    And I should see Login to your account is visible
    And I Enter incorrect "abc@gmail.com"
    And I Enter incorrect password "ab123"
  And I Click login button
  Then I should see error Your email or password is incorrect! is visible


