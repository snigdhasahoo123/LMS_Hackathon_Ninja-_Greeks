Feature: Page Validation

Background: Admin/User/Staff Logged on to LMS website
Given Admin/staff is on Login Page
When Admin/Staff  clicks login Button after entering  Username,Password,code
Then Admin/Staff see header text as "Manage Program"

Scenario:  Validate landing in Manage page
Given Admin/User/Staff is on any page after Login
When Admin/User/Staff clicks the Tab "User"
Then Admin/User/Staff should see the Manage user page
