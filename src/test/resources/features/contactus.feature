Feature: Contact Us Form

  As a user, i should fill details in contact us form

  Background:
    Given I am on Homepage

  Scenario: user should fill details in contact us form
  When I Click on Contact Us button
  And I should see GET IN TOUCH is visible
  And I Enter name "xyz",email "abc@gmail.com",subject "order enquiry" and message "Where is my order"
  #And I Upload file
  And I Click Submit button
  And I Click OK button
  And I should see success message Success! Your details have been submitted successfully.
  Then I Click Home button
  And I am landed to home page successfully