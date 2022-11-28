Feature: Postal Code	
Scenario: Validating Postal Code
Given Admin/User/Staff is on Manage user page
	When Admin/User/Staff Enters more than 5 digits	
	Then Admin/User/Staff see error message "Invalid Input"
 
