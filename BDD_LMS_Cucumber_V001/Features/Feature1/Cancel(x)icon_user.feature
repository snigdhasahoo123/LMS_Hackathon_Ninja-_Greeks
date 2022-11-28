Feature: Cancel(x) icon

Scenario:  Verify the presence of Cancel(x) icon in user detais window

Given Admin/User/Staff is on Manage user page		
When Admin/User/Staff clicks Add new user button
Then Admin/User/Staff should see a cancel(x) icon

Scenario: Functionality of Cancel(x) icon 
Given Admin/User/Staff is on User Details details window
When Admin/User/Staff clicks cancel(X) icon
Then User Details window should be closed