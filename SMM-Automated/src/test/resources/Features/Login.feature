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

  Scenario: Check logo of SMM
   Given user is on login page
   When there is logo sign in text select button
   Then UI testing done
   
   Scenario: Check Club selection has search bar and works properly
   Given user is on login page
   When user clicks on select club button
   And there is a search bar
   And user searches for Solis
   Then solis is displayed and search bar is working properly
   
   Scenario: If password length and email is not validated pop up is shown
   Given user is on login page
   When user enters invalid email and short password
   Then pop up is displayed