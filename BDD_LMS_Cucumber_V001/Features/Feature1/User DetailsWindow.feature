Feature: "User Details" Window

Scenario:  Verify the heading of User Details window
Given Admin/User/Staff is on Manage user page		
When Admin/User/Staff clicks Add new user button
Then Admin/User/Staff should see User Details window with text as "User Details"