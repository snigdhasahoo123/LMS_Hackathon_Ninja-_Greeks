Feature: Email Id	
Scenario: Validating the Email address
Given Admin/User/Staff is on "User Details"window	
When Admin/User/Staff clicks on Submit button after entering wrong email address	
Then Admin/User/Staff see error message "Invalid Email address"