Feature: Submit button	
Scenario: Verify the presence of Submit button in User Details window
Given Admin/User/Staff is on Manage user page		
When Admin/User/Staff clicks Add new user button
Then Admin/User/Staff should see a button with text as Submit in user details window