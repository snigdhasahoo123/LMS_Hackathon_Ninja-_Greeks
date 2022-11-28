Feature: Delete Multiple Records Functionality

Background: Admin/User/Staff is on Manage Program page After login
Scenario: Verify the state of Delete button on left hand side
Given Admin/User/Staff Logged on to LMS Website
When Admin/User/Staff is on Manage Program page
Then Admin/User/Staff see the Delete button on the top left hand side as Disabled 

Scenario: Validates Multiple Program Selection
#Background: Admin/User/Staff Logged on to LMS Website
Given Admin/User/Staff is on Manage Program page
When  Admin/User/Staff selects more than one Program Name using checkbox
Then  Admin/User/Staff see the Delete button on the top left hand side as Enabled

Scenario: Verifies Deletion of Multiple Records
#Background: Admin/User/Staff is on Manage Program page
Given Admin selects more than one Program Name using checkbox
When Admin Clicks on Enabled Delete button on the top left hand side
Then Admin see header text as "Delete Confirm"

Scenario: Click on No button in Delete Confirm window
Given Admin Clicks on Enabled Delete button after selecting  more than one Program Name
When Admin Clicks on Yes  button
Then  Admin see Success message "Program Deleted Succesfully"

Scenario: Verify Deleted Program Names
#Background: Admin/User/Staff Logged on to LMS Website
#Given Admin/User/Staff  is on Manage Program page 
When Admin/User/Staff Enters deleted  Program Names in Search
Then  Admin/User/Staff finds no results

Scenario: Deletion of Multiple Records
#Background: User/Staff/ Logged on to LMS Website
Given User/Staff selects more than one Program Name using checkbox after User/Staff/ Logged on to LMS Website
When User/Staff Clicks on Enabled Delete button on the top left hand side
Then User/Staff see a Error message "Only Admin have Access"
