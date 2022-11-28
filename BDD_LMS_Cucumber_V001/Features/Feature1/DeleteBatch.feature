Feature: Delete Functionality
Scenario: Verify Delete Functionality
Given Admin is on Manage Batch page after Looged ono the LMs website
When Admin Clicks on any Delete button located on the right side 
Then Admin see header text as "Delete Confirm"

Scenario: Click on Yes button in Delete Confirm window
Given Admin Clicks on any Delete button located on the right side after entering in to the ManageBatch Page
When Admin Clicks on Yes  button
Then  Admin see Success message "Program Deleted Succesfully"

Scenario: Clicks on No button in Delete Confirm window
When Admin Clicks on No button
Then Admin can see Program Name not deleted

Scenario: Validate Deleted Program Name
Given Admin/User/Staff  is on Manage Batch page 
When Admin/User/Staff Enters deleted  Program Name in Search
Then Admin/User/Staff finds no results 

Scenario: User/Staff Validates Delete button
Given User/Staff is on Manage Batch page afte logged on the LMS Webpage
When User/Staff Clicks on Delete buttton  
Then User/Staff see a Error message "Only Admin have Access"
 
