Feature: Verify that user is able to login with valid credentials

 Scenario: Check Login is succesful with valid credentials
    Given browser is opened
    And user is on login page
    And user clicks on select club button
    And user select a club
    When user enters email and password
    And clicks on login button
    Then user is logged in
    
  Scenario: Check Login is un-successful with in-valid credentials
    Given browser is opened
    And user is on login page
    And user clicks on select club button
    And user select the club
    When user enters email and password
    And clicks on login button
    Then user stays on Login Page
    
    Scenario: Check Login with when ir-relivant club is selected
    Given browser is opened
    And user is on login page
    And user clicks on select club button
    And user select the club
    When user enter email and password
    And clicks on login button
    Then user stays on Login Page
    
    Scenario: Check Login with when ir-relivant club,email and club is selected
    Given browser is opened
    And user is on login page
    And user clicks on login button
    And user select wrong club
    When user user enter wrong email and password
    And clicks on login button
    Then user stays on Login Page