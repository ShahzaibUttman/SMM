Feature: Feature to test Create Content

  Scenario: Verify that on clicking create content button redirects to create content page and there are three club boxes
    Given user is on login page
    And user clicks on select club button and user select the club
    When user enters email and password
    And clicks on login button
    When user clicks on create content
    Then user is redirected
    And there are three club boxes

  Scenario: Verify that there is a search bar and search bar works properly
    Given user is on login page
    And user clicks on select club button and user select the club
    When user enters email and password
    And clicks on login button
    When user clicks on create content
    When user search for solis
    Then Solis appears in the search

  Scenario: Verify that by selection of instagram is working for image
    Given user is on login page
    And user clicks on select club button and user select the club
    When user enters email and password
    And clicks on login button
    When user clicks on create content
    And user selects instagram only
    And posts image
    Then image is only posted to instagram

  Scenario: Verify that by selection of facebook is working with image
    Given user is on login page
    And user clicks on select club button and user select the club
    When user enters email and password
    And clicks on login button
    When user clicks on create content
    And user selects facebook only
    And posts image
    Then image is only posted to facebook

  Scenario: Verify that by selection of club is working for image
    Given user is on login page
    And user clicks on select club button and user select the club
    When user enters email and password
    And clicks on login button
    When user clicks on create content
    And user selects club only
    And posts image
    Then image is only posted to club

  Scenario: Verify that by selection of instagram is working video
    Given user is on login page
    And user clicks on select club button and user select the club
    When user enters email and password
    And clicks on login button
    When user clicks on create content
    And user selects instagram only
    And posts video
    Then video is only posted to instagram

  Scenario: Verify that by selection of facebook is working for video
    Given user is on login page
    And user clicks on select club button and user select the club
    When user enters email and password
    And clicks on login button
    When user clicks on create content
    And user selects facebook only
    And posts video
    Then video is only posted to facebook

  Scenario: Verify that by selection of club is working for video
    Given user is on login page
    And user clicks on select club button and user select the club
    When user enters email and password
    And clicks on login button
    When user clicks on create content
    And user selects club only
    And posts video
    Then video is only posted to club
