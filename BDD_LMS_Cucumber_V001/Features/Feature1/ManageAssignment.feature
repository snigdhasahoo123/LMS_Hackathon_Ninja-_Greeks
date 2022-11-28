@tag
Feature: Manage Assignment

  Background: Admin/User/Staff Logged on to LMS website

  @tag1
  Scenario: Validating Assignment Heading
    Given Admin/User/Staff Logged on to LMS Website
    When Admin/User/Staff Clicks on Admin/User/Staff clicks on Assignment Page
    Then Admin/User/Staff Should see a Header "Manage Assignment"

  @tag2
  Scenario: Validating Assignment Footer
    Given Admin/User/Staff Logged on to LMS website
    When Admin/User/Staff clicks on Assignment Page
    Then Admin/User/Staff Should see a Footer text "In Total there are 3 assignments"

  @tag3
  Scenario: Validating Assignment Paginator
    Given Admin/User/Staff Logged on to LMS website
    When Admin/User/Staff clicks on Assignment Page
    Then Admin/User/Staff Should see a Paginator text "Showing 1 to 3 of 3 entries"

  @tag4
  Scenario: Verify  paginator -next button  on the Assignment page
    Given Admin/User/Staff is on Assignment Page
    When Admin/User/Staff Clicks on Enabled paginator-next button
    Then Admin/User/Staff Should be navigated to next page

  @tag5
  Scenario: Verify paginator -previous button on the Assignment page
    Given Admin/User/Staff is on Assignment Page
    When Admin/User/Staff Clicks on Enabled paginator-next button
    Then Admin/User/Staff Should be navigated to previous page

  @tag6
  Scenario: Verify paginator -last button on the Assignment page
    Given Admin/User/Staff is on Assignment Page
    When Admin/User/Staff Clicks on Enabled paginator-next button
    Then Admin/User/Staff Should be navigated to Last page

  @tag7
  Scenario: Verify paginator -first button on the Program page
    Given Admin/User/Staff is on Assignment Page
    When Admin/User/Staff Clicks on Enabled paginator-next button
    Then Admin/User/Staff Should be navigated to First  page

  @tag8
  Scenario: Validate Search Feature
    Given Admin/User/Staff Logged on to LMS website
    When Admin/User/Staff clicks Search bar after entering Assignment name
    Then The requested assignment details should be displayed

  @tag9
  Scenario: Verify Assignment Name are displayed in Ascending order
    Given Admin/User/Staff is on Assignment Page
    When Admin/User/Staff Clicks on Assignment Name Ascending Arrow
    Then Admin/User/Staff should see the Assignment Name displayed in Ascending order

  @tag10
  Scenario: Verify Assignment Description are displayed in Ascending order
    Given Admin/User/Staff is on Assignment Page
    When Admin/User/Staff Clicks on Assignment Description Ascending Arrow
    Then Admin/User/Staff should see the Assignment Description displayed in Ascending order

  @tag11
  Scenario: Verify Assignment Duedate are displayed in Ascending order
    Given Admin/User/Staff is on Assignment Page
    When Admin/User/Staff Clicks on Assignment Due Date Ascending Arrow
    Then Admin/User/Staff should see the Assignment Due Date displayed in Ascending order

  @tag12
  Scenario: Verify Assignment Grade  are displayed in Ascending order
    Given Admin/User/Staff is on Assignment Page
    When Admin/User/Staff Clicks on Assignment Grade Ascending Arrow
    Then Admin/User/Staff should see the Assignment Grade displayed in Ascending order

  @tag13
  Scenario: Verify Assignment Name are displayed in Descending order
    Given Admin/User/Staff is on Assignment Page
    When Admin/User/Staff Clicks on Assignment Name Descending Arrow
    Then Admin/User/Staff should see the Assignment Name displayed in Descending order

  @tag14
  Scenario: Verify Assignment Description are displayed in Descending order
    Given Admin/User/Staff is on Assignment Page
    When Admin/User/Staff Clicks on Assignment Description Descending Arrow
    Then Admin/User/Staff should see the Assignment Description displayed in Descending order

  @tag15
  Scenario: Verify Assignment Duedate are displayed in Descending order
    Given Admin/User/Staff is on Assignment Page
    When Admin/User/Staff Clicks on Assignment Due Date Descending Arrow
    Then Admin/User/Staff should see the Assignment Due Date displayed in Descending order

  @tag16
  Scenario: Verify Assignment Grade are displayed in Descending order
    Given Admin/User/Staff is on Assignment Page
    When Admin/User/Staff Clicks on Assignment Grade Descending Arrow
    Then Admin/User/Staff should see the Assignment Grade displayed in Descending order

  @tag17
  Scenario: Validate Add New Assignment Button
    Given Staff is on Manage Assignment page
    When Staff clicks a Add new assignment button
    Then Staff should see Assignment details window
    Given Admin/User/Staff is on Manage Assignment page
    When Admin/User/Staff clicks a Add New Assignment button
    Then Admin/User/Staff should see a message "Staff only have access to add New Assignment"

  @tag18
  Scenario: No details Entered in  Assignment Details window
    Given Staff is on  Assignment Details page
    When Staff  clicks on Save after leaving all the fields empty
    Then Staff should see an error message "Name is required"

  @tag19
  Scenario: Staff Validate Assignment Details window with entering all fields
    Given Staff is on Assignment Details page
    When Staff clicks  Save button after entering assignment name,assignment description,assignment Grade and Duedate
    Then Staff should see a message "New Assignment successfully added"

  @tag20
  Scenario: Staff Click Cancel in Assignment Details window
    Given Staff is on Assignment Details page
    When Staff clicks cancel button with entering all fields
    Then Staff should see a Assignment details window is closed

  @tag21
  Scenario: validate New assignment
    Given Admin/User/Staff is on Assignments page
    When Admin/User/Staff clicks on Assignment
    Then Admin/User/Staff should see a newly added Assignment

  @tag22
  Scenario: Validate  Manage button in Assignment Grade
    Given Staff is on Assignment  page
    When Staff clicks manage button under Assignment Grade
    Then Staff should be navigated to Grade Window

  @tag23
  Scenario: Staff Validates Edit button
    Given Staff is on Manage Assignment page
    When Staff clicks an edit Assignment button
    Then Staff should see a Assignment details window

  @tag24
  Scenario: Staff Edit Assignment Name in Assignment Details window
    Given Staff is on Assignment Details page
    When Staff clicks Save button  after edits Assignment Name
    Then Staff should see a message "Assignment Name Updated"

  @tag25
  Scenario: Staff Edit Assignment Description in Assignment Details window
    Given Staff is on Assignment Details page
    When Staff clicks Save button  after edits Assignment Description
    Then Staff should see a message "Assignment Description Updated"

  @tag26
  Scenario: Staff Edit Assignment Grade in Assignment Details window
    Given Staff is on Assignment Details page
    When Staff clicks Save button After edits Assignment Grade
    Then Staff should see a message "Assignment Grade Updated"

  @tag27
  Scenario: Staff Edit Assignment DueDate in Assignment Details window
    Given Staff is on Assignment Details page
    When Staff clicks Save button After edits Assignment DueDate
    Then Staff should see a message "Assignment Due Date Updated"

  @tag28
  Scenario: Staff Click Cancel in  Assignment Details window
    Given Staff is on Assignment Details page
    When Staff clicks cancel button
    Then Staff Should see a Assignment Details Page is closed

  @tag29
  Scenario: Admin/User/Staff Validate Edit Button
    Given Admin/User/Staff is on Manage Assignment page
    When Admin/User/Staff clicks Edit button
    Then Admin/User/Staff should see a message "Staff only have access to Edit Assignment"

  @tag30
  Scenario: Admin/User/Staff clicks Assignment Name
    Given Admin/User/Staff is on Assignment page
    When Admin/User/Staff clicks on Assignment Name
    Then Admin/User/Staff should be navigated to Assignment Google form page

  @tag31
  Scenario: Admin clicks Assignment Name
    Given Admin is on Assignment page
    When Admin clicks on Assignment Name
    Then Admin should see a warning message "you dont have access"

  @tag32
  Scenario: Admin/User/Staff validate assignment Google form with entering all fields
    Given Admin/User/Staff is on Assignment  Google form page
    When Admin/User/Staff clicks on submit button after entering all questions and mail id
    Then Admin/User/Staff entered google forms successfully

  @tag33
  Scenario: Admin/User/Staff validate assignment Google form leaving empty
    Given Admin/User/Staff is on Assignment  Google form page
    When Admin/User/Staff clicks on submit button after leaving all questions and mail id
    Then Admin/User/Staff should get a warning message "Must enter the mandatory fields"

  @tag34
  Scenario: Admin/User/Staff Validate Assignment google form after cliclking clear button
    Given Admin/User/Staff is on Assignment  Google form page
    When Admin/User/Staff clicks clear form button after entering all questions and mail id
    Then The Assignment Google form cleared successfully

  @tag35
  Scenario: Admin/User/Staff clicks Switch account
    Given Admin/User/Staff is on Assignment  Google form page
    When Admin/User/Staff clicks Switch account link
    Then Admin/User/Staff should be switched over the account Successfully

  @tag36
  Scenario: Staff clicks delete button
    Given Staff is on Manage Assignment page
    When Staff clicks on delete button on the righr side
    Then Staff should see a Delete Confirmation window

  @tag37
  Scenario: Staff click Yes in Delete confirmation window
    Given Staff is on Delete Confirmation window
    When Staff clicks Yes
    Then Staff Should see "Assignment Deleted Successfully

  @tag38
  Scenario: Staff clicks No button in Delete confirmation window
    Given Staff is on Delete Confirmation window
    When Staff clicks No
    Then Confirmation delete window should be closed successfully

  @tag39
  Scenario: Admin clicks delete button
    Given Admin is on Manage Assignment page
    When Admin clicks on delete button
    Then Admin should see a message "Staff only have access"

  @tag40
  Scenario: Admin/User/Staff clicks delete button
    Given Admin/User/Staff is on Manage Assignment page
    When Admin/User/Staff clicks on delete button
    Then Admin/User/Staff should see a message"Staff only have access"

  @tag41
  Scenario: Admin/User/Staff Validate Disabled delete button
    Given Admin/User/Staff is on Assignments page
    When Admin/User/Staff clicks on delete button on the top left
    Then Admin/User/Staff/ should see a disabled delete button

  @tag42
  Scenario: Staff  validate delete button on the top left
    Given Staff is on Manage Assignment page
    When Staff clicks delete button on the top aftr selecting multiple checkbox
    Then Staff should see a  Delete confirm window

  @tag43
  Scenario: Staff click Yes in Delete confirmation window
    Given Staff is on Delete Confirmation window
    When Staff clicks Yes
    Then All Assignments are deleted Successfully

  @tag44
  Scenario: Staff click No in Delete confirmation window
    Given Staff is on Delete Confirmation window
    When Staff clicks No
    Then Confirmation delete window should be closed successfully

  @tag45
  Scenario: Admin/User/Staff validate check box on the left side to the Assignment Name
    Given Admin/User/Staff is on Manage Assignment page
    When Admin/User/Staff clicks check box on the left side to the Assignment Name
    Then Admin/User/Staff should see a enabled delete button on the top left

  @tag46
  Scenario: Admin validate check box on the left side to the Assignment Name
    Given Admin is on Manage Assignment page
    When Admin clicks check box on the left side to the Assignment Name
    Then Admin should see a warning message "Admin dont have access  "

  @tag47
  Scenario: User/Staff validate individual checkbox
    Given Admin/User/Staff is on Assignments page
    When Admin/User/Staff clicks individual checkbox button
    Then Admin/User/Staff should see a delete button on the top left

  @tag48
  Scenario: Admin validate individual checkbox
    Given Admin is on Manage Assignment page
    When Admin clicks individual checkbox button
    Then Admin should see a warning message "Admin dont have access "
