Feature: Validating the Attendance Page
Background: User/Staff Logged on to LMS Website
Scenario: Validating the Attendance Header
Given Admin/User/Staff Logged on to LMS Website	
When Admin/User/Staff Clicks on Attendance button
Then Admin/User/Staff see header text as "Manage Attendance"
#Feature:  Footer Validation
Scenario: Validating the Attendance Footer
When Admin/User/Staff is on Manage Attandance page
Then Admin/User/Staff see Footer text as In total there are 5 entries.
	
	#Feature:  Paginator Validation
Scenario: Validating the Attendance Paginator
When Admin/User/Staff is on Manage Attendance page
Then Admin/User/Staff see the text as Showing 1 to 5 of 5 entries.
	
Scenario: Verify All paginator button on the Attendance page
When Admin/User/Staff is on Manage Attendance page	
Then Admin/User/Staff see all paginator buttons are Disabled
#Feature:  Edit Functionality
Scenario: Verify the Edit Button
When User/Staff Clicks on Edit Button
Then 	Admin see header text as Attendance Details
Scenario: Edit ProgramName in Attendance Details window
When 	User/Staff clicks on Save button after changing Program Name
Then 	User/Staff see the success message Updated Successfully
Scenario: Edit User Name Attendance Details window
When 	User/Staff clicks on Save button after changing
Then User name	User/Staff see the success message Updated Successfully
Scenario: Edit Present in Attendance Details window
When User/Staff clicks on Save button after disabling Present details
Then  	User/Staff see the success message Updated Successfully
Scenario: Edit Absent in Attendance Details window
When User/Staff clicks on Save button after enabling Absent details	
Then User/Staff see the success message Updated Successfully
Scenario: Click on Cancel button in Attendance Details window
When 	User/Staff clicks on Cancel button after entering details
Then User/Staff see a Attendance Details window getting closed
Scenario: Admin Verify the Edit Button
Given Admin is on Manage Attendance page
When 	Admin Clicks on Edit Button	
Then  Admin see Error Message Admin Has View Only Permission
	
# Delete  Functionality
Scenario: Verify the Delete Functionality
When 	User/Staff Clicks on Delete Button
Then  	Admin see header text as Delete Confirm
Scenario: Click on Yes button in Delete Confirm window
When 	User/Staff  Clicks on Yes button
Then 	User/Staff  see Success message Program Deleted Succesfully
Scenario: Click on No button in Delete Confirm window
When User/Staff  Clicks on No button	
Then 	User/Staff can see Program Name not deleted
Scenario: Admin Verify the Delete Functionality	
When Admin Clicks on Delete Button
Then 	Admin see Error Message Admin Has View Only Permission
#Feature: Check Box Functionality
Scenario: Verifying the Functionality of a Present button
When Admin/User/Staff Clicks on Checkbox
Then  Admin/User/Staff  see list of Users in that Program
#Feature: Present Functionality
Scenario: Verifying the Functionality of a Present button
When  page	Admin/User/Staff  Clicks on Present
Then 	Admin/User/Staff  see the list of  User Name who are Present
#Feature: Absent Functionality
Scenario: Verifying the Functionality of a Absent button
When Admin/User/Staff  Clicks on Absent
Then 	Admin/User/Staff  see the list of  User Name who are Absent