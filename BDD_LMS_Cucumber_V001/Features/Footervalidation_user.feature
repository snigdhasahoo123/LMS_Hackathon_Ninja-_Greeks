Feature: Footer Validation

Background: Admin/User/Staff Logged on to LMS website
Given Admin/staff is on Login Page
When Admin/Staff  clicks login Button after entering  Username,Password,code
Then Admin/Staff see header text as "Manage Program"


Scenario: Validating table footer
Given Admin/User/Staff table is displayed in manage user page
When Admin/User/Staff lands on Manage User page
Then Admin/User/Staffshould see the table footer as "In total there are 4 users".