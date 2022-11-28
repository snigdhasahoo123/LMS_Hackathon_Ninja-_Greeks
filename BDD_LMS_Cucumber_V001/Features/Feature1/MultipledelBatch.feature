Feature: Delete Multiple Records Functionality
Scenario: Verify the state of Delete button on left hand side
Given Admin/User/Staff Logged on to LMS Website
When Admin/User/Staff is on Manage batch page
Then Admin/User/Staff see the Delete button on the top left hand side as Disabled 

Scenario: Validates Multiple Program Selection
Given Admin/User/Staff is on Manage Batch page
When Admin/User/Staff selects more than one Batch Name using checkbox
Then Admin/User/Staff see the Delete button on the top left hand side as Enabled

Scenario: Verify Deletion of Multiple Records
Given Admin selects more than one Batch Name using checkbox after entered in to ManageBatch Page
When Admin Clicks on Enabled Delete button on the top left hand side
Then  Admin see header text as "Delete Confirm"

Scenario: Click on Yes button in Delete Confirm window
Given Admin Clicks on Enabled Delete button after selecting  more than one Batch Name
When Admin Clicks on Yes  button
Then Admin see Success message "Program Deleted Succesfully" 

Scenario: Click on No button in Delete Confirm window
When Admin Clicks on No button
Then Admin can see Program Names not deleted 

Scenario: Verify Deleted Batch Names
Given Admin/User/Staff  is on Manage Batch page 
When dmin/User/Staff Enters deleted  Program Names in Search
Then Admin/User/Staff finds no results

Scenario: User/Staff Verifys Deletion of Multiple Records
Given User/Staff selects more than one Batch  Name using checkbox after they entered in to ManageBatch page
When User/Staff Cicks on Enabled Delete button on the top left hand side
Then User/Staff see a Error message "Only Admin have Access"