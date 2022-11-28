
Feature: Paginator Validation
Background:  Admin/User/Staff Logged on to LMS Website 
Scenario:  Validating the Manage Program Paginator
Given      Admin/User/Staff Logged on to LMS Website
When       Admin/User/Staff is on Manage Program page
Then      Admin/User/Staff  see the text as "Showing 1 to 5 of 9 entries" 


Scenario: Verify paginator -prevoius button on the Program page
When Admin/User/Staff Clicks on Enabled paginator -prev button
Then Admin/User/Staff see Paginator text as"Showing 1 to 5 of 9 entries"


Scenario: Verify paginator -next button  on the Program page
Given      Admin/User/Staff is on Manage Program page
When       Admin/User/Staff Clicks on Enabled paginator-next button
Then       Admin/User/Staff see Paginator text as "Showing 6 to 9 of 9 entries"


Scenario: Verify  paginator -last button  on the Program page
Given      Admin/User/Staff is on Manage Program page
When       Admin/User/Staff Clicks on Enabled paginator-last button
Then       Admin/User/Staff see Page number navigated to '2'


Scenario: Verify  paginator -first button  on the Program page
Given     Admin/User/Staff is on Manage Program page
When      Admin/User/Staff Clicks on Enabled paginator -first button
Then      Admin/User/Staff see Page number navigated to '1'
