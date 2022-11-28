Feature: Drop down
 Scenario:  Drop down	Verify drop down menu for state
 Given Admin/User/Staff is on "User Details" window		
		
When Admin/User/Staff clicks the drop down icon for state
Then Admin/User/Staff should select from the drop down menu for state

Scenario: Verify drop down menu for user role 
Given Admin/User/Staff is on "User details" window
When Admin/User/Staff clicks the drop down icon for User Role
Then Admin/User/Staff should select from the drop down menu for user role


	