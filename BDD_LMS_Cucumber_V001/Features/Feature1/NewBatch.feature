Feature: Validate Add A New Batch Functionality
Scenario: Validate Add A New Batch button
Given  Admin is on Manage Batch page after Logged on to the LMS Website
When Admin Clicks on  " + A New Batch" button
Then Admin see header text as "Batch Details"

Scenario: No details Entered in Batch Details window
Given Admin Clicks on  " + A New Batch" button
When Admin Clicks on Save Button with out entering  details 
Then Admin see Error message "Name is required"

Scenario: Enters Only Name in Batch Details window
When Admin Clicks on Save Button after entering Name alone
Then Admin see Error message "Description is required"

Scenario: Enters Only Description in Batch Details window
When Admin Clicks on Save Button after entering Description alone
Then Admin see Error message "Name is required"

Scenario: Verify Program Name Dropdown in Batch Details window
When Admin Clicks on DropDown Menu 
Then Admin see list of all Program Names 

Scenario: Selects only a Program name from Dropdown in Batch Details window  
Given Admin Clicks on  " + A New Batch" button And  Clicks on DropDown Menu in Batch Details window
When Admin Clicks on Save button after selecting a Program Name only from the dropdown
Then Admin see Error message "Name is required"

Scenario: Enters Only Status in Batch Details window
Given Admin Clicks on  " + A New Batch" button
When Admin Clicks on Save Button after selecting Status alone 
Then Admin see Error message "Name is required"

Scenario: Enters Only Number Of Classes in Batch Details window
When Admin Clicks on Save Button after entering only Number Of Classes
Then Admin see Error message "Name is required"

Scenario: Enter All details in Batch Details window
When Admin Clicks on Save Button after entering all details
Then Admin see Success message "New Batch Created"

Scenario: Click on Cancel button in Batch Details window
When Admin Clicks on Cancel button
Then Admin see a Batch Details window getting closed

Scenario: Admin/User/Staff Verify Added New Batch Name
Given Admin/User/Staff is on Manage Program page after they logged on the LMS Website
When Admin/User/Staff Enters newly added  Batch Name in Search
Then Entry for the newly added Batch Name is shown

Scenario: User/Staff Validate Add A New Batch button
Given User/Staff is on Manage Batch page after logged on to LMs WebSite
When User/Staff/Staff Clicks on  " + A New Program" button
Then User/Staff see a Error message "Only Admin have Access"








