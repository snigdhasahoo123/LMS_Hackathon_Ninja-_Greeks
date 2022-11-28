Feature: Submit button functionality	 
Scenario: Validating the User Details window with all fields empty
Given Admin/User/Staff is on "User Details"window		
		
When Admin/User/Staff clicks submit button with all details empty
Then Admin/User/Staff should see a Error message "Mandatory Fields cannot be empty"

	Scenario: Adding new User
	Given Admin/User/Staff is on "User Details"window
When Admin/User/Staff clicks Submit button by entering all valid values in required fields
Then Admin/User/Staff  see Success message  "New User Created"  is  Should be Saved.