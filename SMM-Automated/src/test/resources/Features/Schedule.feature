Feature: To Test Schedule Tab

  Scenario: User is on schedule tab and there are three club boxes
    Given user is on login page
    And user clicks on select club button and user select the club
    When user enters email and password
    And clicks on login button
    When user clicks on Schedule
    Then user is redirected to Schedule
    And there are three club boxes

  Scenario: Verify that there are Queue, Published and Unpublshed and they are working properly
    Given user is on login page
    And user clicks on select club button and user select the club
    When user enters email and password
    And clicks on login button
		When user clicks on Schedule
		Then there are queue, published and unpublished
		When user clicks on queue
		Then only queued schedules are displayed
		When user clicks on published
		Then 	
	Scenario	