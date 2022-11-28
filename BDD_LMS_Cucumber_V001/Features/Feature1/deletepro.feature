Feature: Delete Functionality
Background: Admin Logged on to LMS Website
Scenario: Verify Delete Functionality
Given  Admin is on Manage Program page 
When Admin Clicks on any Delete button located on the right side 
Then Admin see header text as "Delete Confirm"

#Background: Admin is on Manage Program page 
Scenario: Click on Yes button in Delete Confirm window after Admin is on Manage Program page
Given Admin Clicks on any Delete button located on the right side 
When Admin Clicks on Yes  button
Then  Admin see Success message "Program Deleted Succesfully"

Scenario: Click on No  button in Delete Confirm window
#Given Admin Clicks on any Delete button located on the right side 
When Admin Clicks on No button
Then Admin can see Program Name not deleted


#Background: Admin/User/Staff Logged on to LMS Website
Scenario: Validate Deleted Program Name after Admin/User/Staff Logged on to LMS Website
Given  Admin/User/Staff  is on Manage Program page 
When Admin/User/Staff Enters deleted  Program Name in Search
Then Admin/User/Staff finds no results


#Background: User/Staff Logged on to LMS Website
Scenario: User/Staff Validates Delete button after User/Staff Logged on to LMS Website
Given User/Staff is on Manage Program page
When  User/Staff Clicks on Delete buttton  
Then  User/Staff see a Error message "Only Admin have Access"

