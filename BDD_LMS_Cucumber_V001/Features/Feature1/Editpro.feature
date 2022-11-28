Feature: Edit Functionality
Background: Admin Logged on to LMS Website

Scenario: Validates Edit button in Program Details window
Given  Admin is on Manage Program page
When  Admin Clicks on Edit buttton  
Then Admin see header text as "Program Details"

Scenario: Edit Program Name in Program Details window
Given  Admin Clicks on "Edit" button
When  Admin Clicks on Save Button after updating Name 
Then  Admin see Success message "Updated Program Name"

Scenario: Edit Program Description in Program Details window
#Given Admin Clicks on "Edit" button
When Admin  Clicks on Save Button after updating  Description
Then Admin see Success message"Updated Description"

Scenario: Edit Program Status in Program Details window
#Given Admin Clicks on "Edit" button
When Admin  Clicks on Save Button after Changing  status 
Then Admin see Success message "Updated Status"

Scenario: Click on Cancel button in Program Details window
#Given Admin Clicks on "Edit" button
When  Admin Clicks on Cancel button
Then  Admin see a Program Details window getting closed


#Background: Admin/User/Staff Logged on to LMS Website
Scenario: Verifiess Edited Program Name/Program Description after Admin/User/Staff Logged on to LMS Website
Given Admin/User/Staff is on Manage Program page 
When Admin/User/Staff Enters edited Program Name in Search
Then Entry for the edited  Program Name is shown

#Background: User/Staff Logged on to LMS Website
Scenario: User/Staff Validate Edit button after User/Staff Logged on to LMS Website
Given User/Staff is on Manage Program page
When  User/Staff Clicks on Edit buttton  
Then  User/Staff see a Error message  "Only Admin have Access"

