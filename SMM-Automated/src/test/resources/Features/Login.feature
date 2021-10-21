Feature: Verify that user is able to login with valid credentials

  Scenario: Check Login is succesful with valid credentials
    Given user is on login page
    And user clicks on select club button and user select the club
    When user enters email and password
    And clicks on login button
    Then user is logged in

  Scenario: Check Login is un-successful with in-valid credentials
    Given user is on login page
    And user clicks on select club button and user select the club
    When user enters wrong email and password
    And clicks on login button
    Then user stays on Login Page

  Scenario: Check Login with when ir-relevant club is selected
    Given user is on login page
    And user clicks on select club button and user select ir-relevant the club
    When user enters email and password
    And clicks on login button
    Then user stays on Login Page
