Feature: Google search functionality

  Scenario: Validate google search is working successfully
    Given browser is open on device
    And user is on google search page
    When user enters a text in serach box
    And hits enter
    Then user is navigated to the search results
