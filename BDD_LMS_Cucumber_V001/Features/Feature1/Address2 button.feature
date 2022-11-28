Feature: Address2 button
Scenario: Validating the presence of Address2 button
Given Admin/User/Staff is on Manage user page	
When Admin/User/Staff clicks Add new user button	
Then Admin/User/Staff should see the button with text "+ Add C/O, Apt, Suite, Unit"