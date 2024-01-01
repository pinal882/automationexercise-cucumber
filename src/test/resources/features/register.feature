Feature: Register User
  As a user, I want to Register my account
  Background:
    Given I am on Homepage

  Scenario: Register account
    When I Click on Signup or Login Button
    And I should see  New User Signup! is visible
    And I Enter "xyz" and "xab@gmail.com" address
    And I Click Signup button
    And I should  that ENTER ACCOUNT INFORMATION is visible
    And I select title
    And I enter password "abc123"
  And I select date of birth "23", "January", "2015"
    And I Select checkbox Sign up for our newsletter!
    And I Select checkbox Receive special offers from our partners!
    And I Fill details: "xyz", "ch","b2b","101 geetanjali", "near chakli circle","India","Gujarat","Baroda","391240","00913456767543"
    And I Click Create Account button
    And I should see that ACCOUNT CREATED! is visible
    And I Click Continue button
    And I should see that Logged in as username is visible
    And I Click Delete Account button
    Then I should see  that ACCOUNT DELETED! is visible
And I Click Continue button

  Scenario: Register User with existing email
    When I Click on Signup or Login Button
    And I should see  New User Signup! is visible
    And I Enter "xyz" and "xab@gmail.com" address
    And I Click Signup button
    Then I should see that Email Address already exist! is visible

