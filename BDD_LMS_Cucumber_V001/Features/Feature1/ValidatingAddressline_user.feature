
Feature: Validating Address line
Scenario: Validating Address line  in User Details window
Given Admin/User/Staff is on "User Details"window		
When Admin/User/Staff clicks the button "+ Add C/O, Apt, Suite, Unit"
Then Admin/User/Staff should see the input field with Label "New Address2"