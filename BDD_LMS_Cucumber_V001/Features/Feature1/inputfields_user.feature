Feature: input fields	
Scenario: Verify the presence of input fields
Given Admin/User/Staff is on Manage user page
When Admin/User/Staff clicks Add new user button
Then 		Admin/User/Staff should see the input fields for "First name","Middle name", Last name","Email adress","Phone no", "Address","City", "State","Postal Code"."Program","UG Program","PG Program","Skill","Experience","Admin/User/Staff Role",Visa status","Batch","Comments" corresponding to their labels