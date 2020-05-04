Feature: create test for registation - Demowebshop


Scenario: Registration test
Given user should navigates to demowebshop on chrome browser
When user clicks on register link
And user selects gender
And user enters with first name
And user enters with last name
And user enters with email
And user enters with paasword
And user enters with confirm password
Then user clicks on register button

