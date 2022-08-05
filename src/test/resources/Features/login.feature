#Author 
Feature: Feature to test login funvctionality

@smoketest
  Scenario: Verify the login is successful with valid credentials
    Given user is on login page
    When user enters username and password
    And click on the login button
    Then user navigated to home page
@smoketest
  Scenario Outline: Verify the login is successful with valid credentials
    Given user is on login page
    When user enters <username> and <password>
    And click on the login button
    Then user navigated to home page

    Examples: 
      | username | password |
      | user1    | pass1    |
      | user2    | pass2    |
