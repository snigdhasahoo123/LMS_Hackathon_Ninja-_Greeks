Feature: Search TextBox Functionality
Scenario: Validate Search Feature
Given  Admin/User/Staff Logged on to LMS Website
When   Admin/User/Staff is on Manage Program page
Then   Admin/User/Staff see the Search Text box has text as "Search".

#Background: Admin/User/Staff Logged on to LMS Website
Scenario: Search by  Program Name
Given    Admin/User/Staff is on Manage Program page
When     Admin/User/Staff enters Program Name to be searched   
Then     Entries for the searched Program Name are shown.


Scenario: Search by Program Description
Given     Admin/User/Staff is on Manage Program page
When  Admin/User/Staff enters Program Description to be searched 
Then  Entries for the searched Program Description are shown.


Scenario: Search by  Program Status
Given  Admin/User/Staff is on Manage Program page
When   Admin/User/Staff enters Program Status to be searched 
Then   Entries for the searched Program Status are shown.
