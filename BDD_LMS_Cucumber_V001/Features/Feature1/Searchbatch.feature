Feature: Search TextBox Functionality
Scenario: Validate Search Feature
Given  Admin/User/Staff is on Manage Batch page
When Admin/User/Staff is on Manage Batch page
Then  Admin/User/Staff see the Search Text box has text as "Search".

Scenario: Search  by Batch Name
When  Admin/User/Staff enters Batch Name to be searched after logged on the LMS Website
Then Entries for the searched BatchName are shown.

Scenario: Search  by Batch Description
When  Admin/User/Staff enters Batch Description to be searched 
Then  Entries for the searched Batch Description are shown.

Scenario: Search  by Batch Status
When Admin/User/Staff enters Batch Status to be searched 
Then Entries for the searched Batch status are shown

Scenario: Search  by No Of Classes 
When Admin/User/Staff enters No Of Classes to be searched 
Then Entries for the searched No Of Classes are shown.

Scenario: Search  by Program Name
When Admin/User/Staff enters Program Name to be searched 
Then Entries for the searched Program Name are shown.
