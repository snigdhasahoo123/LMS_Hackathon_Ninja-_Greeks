Feature: Label Text
Scenario: Label Text	Verify the presence of Label Texts

Given Admin/User/Staff is on Manage user page	
When Admin/User/Staff clicks Add new user button	
Then Admin/User/Staff should see the placeholders with Text As "First name","Middle name", Last name","Email adress","Phone no", "Address","City", "State","Postal Code"."Program","UG Program","PG Program","Skill","Experience","Admin/User/Staff Role",Visa status","Batch","Comments"