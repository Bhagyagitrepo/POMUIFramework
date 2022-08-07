#Author 
Feature: Feature to test login funvctionality


@smoketest
  Scenario Outline: Verify the login is successful with valid credentials
    Given user is on login page
    When user enters the username "<username>" 
    And click on the usenamenext button
    When user enters password "<password>"
    And click on the passnext button
    Then user navigated to home page

    Examples: 
      | username | password |
      | bdtestautomationt@gmail.com| Happy123# |
    

      
    