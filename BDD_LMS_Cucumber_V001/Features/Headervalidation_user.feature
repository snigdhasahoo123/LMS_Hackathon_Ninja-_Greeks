
Feature:Header Validation


Background: Admin/User/Staff Logged on to LMS website
Given Admin/staff is on Login Page
When Admin/Staff  clicks login Button after entering  Username,Password,code
Then Admin/Staff see header text as "Manage Program"

Scenario: Validate the Manage page heading
Given Admin/User/Staff is on any page after Login
When Admin/User/Staff is on the Manage user page after clicking User Tab
Then Admin/User/Staff should see the page heading as "Manage User"