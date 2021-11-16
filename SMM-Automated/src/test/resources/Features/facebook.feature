@facebook-Posting-feature-File
Feature: feature to test facebook posting

  Scenario: Verify that when user click on side bar facebook button it should open the facebook content page.
    Given user is on login page
    And user clicks on select club button and user select the club
    When user enters email and password
    And clicks on login button
    When user clicks on facebook
    Then user is redirected to facebook create content

  Scenario: Verify that  Search is working
    Given user is on login page
    And user clicks on select club button and user select the club
    When user enters email and password
    And clicks on login button
    When user clicks on facebook
    Then user is redirected to facebook create content
    When user writes facebook page in search bar
    Then its apperar the connected pages
    And user select the facebook page

  Scenario: Verify that select all selection is working fine for facebook pages.
    Given user is on login page
    And user clicks on select club button and user select the club
    When user enters email and password
    And clicks on login button
    When user select the select all button
    Then it should select all of the facebook pages
    And every facebook page is selectetd
    And posts image
    Then video/image is posted to all of the selected pages.

  Scenario: Verify that custom page selection is working fine for facebook pages.
    Given user is on login page
    And user clicks on select club button and user select the club
    When user enters email and password
    And clicks on login button
    When user select the facebook page individually
    Then it should select only chosen  facebook pages.
    And custom pages are selected.
    And posts video
    And posts image
    Then video/image is posted to  the selected pages.

  Scenario: Verify that schedule is working fine for facebook posts
    Given user is on login page
    And user clicks on select club button and user select the club
    When user enters email and password
    And clicks on login button
    When User clicks on Schedule button
    Then date and time text fields appers
    And user select the date and Time
    And post video
    When clickes on schedule button
    Then video/image is posted to the selected pages.
    
   Scenario: Verify that clear button is working fine
    Given user is on login page
    And user clicks on select club button and user select the club
    When user enters email and password
    And clicks on login button
    Then user click on create content 
    And user Add a photo and text in the field
    When user clicks on Clear button 
    Then it should clear all the text and photo/image
    
    
    
    
   
