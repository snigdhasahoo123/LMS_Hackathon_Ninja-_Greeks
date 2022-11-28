Feature: Validating the text fields on the Registration page
Scenario: Enter the First Name field
Given Admin/User/Staff is on the Registeration Page
When Admin/User/Staff Enters the "First Name" in Alphabets only
Then The First Name will be displayed 

Scenario: Enter the Last Name Field
When Admin/User/Staff Enters the "Last Name" in Alphabets only
Then The Last Name will be displayed

Scenario: Enter the Address Field
When Admin/User/Staff Enters the "Address Field" using Alpha Numerics and /or Symbols
Then The Address will be displayed

Scenario: Enter the Street Name Field
When Admin/User/Staff Enters the "Street name" Field using Alpha Numerics and or Symbols
Then The Street Name will be displayed

Scenario: Enters the Zip field
When Admin/User/Staff Enters the "5 digit Zip code" using Numbers only
Then The Zip code will be displayed

Scenario: Enters the City field
When Admin/User/Staff Enters the "City Name" in Alphabets only
Then The City will be displayed

Scenario: Selects the State field
When Admin/User/Staff selects the respective State Name from the DropBox
Then The State Name will be displayed

Scenario: Enter the Phone Number
When Admin/User/Staff Enters the valid 10 digit Mobile number in Numerics
Then The Mobile Number will be displayed

Scenario: Selects the Birth Date
When Admin/User/Staff Selects the Date of Birth from the Calender
Then Birth Date will be Displayed

Scenario: Enter valid Password
When Admin/User/Staff  Enters the "valid Password" with one Upper case one Numeric  one special charecter eight characters
Then Admin/User/Staff Password will be displayed

Scenario: Enter Valid UserName
When Admin/User/Staff Enters the valid UserName 
Then Admin/User/Staff UsesrName will be displayed

Scenario: Enter Valid Email
When Admin/User/Staff Enters the valid Email
Then Admin/User/Staff Email will be displayed 

Scenario: Validating the Sign Up form with all fields empty
When Admin/User/Staff enters submit button with all fields empty
Then Admin/User/Staff should get a message "Enters all fields"

Scenario: Validating the First Name field on Registeration Page
When Admin/User/Staff clicks Sign Up button with invalid First Name
Then Admin/User/Staff should get a message "Enter valid First Name "

Scenario: Validating the Last Name field on Registeration Page
When Admin/User/Staff clicks Sign Up button with invalid Last Name
Then Admin/User/Staff should get a message "Enter valid Last Name"

Scenario: Validating the Address field on Registeration Page
When Admin/User/Staff clicks Sign Up button with invalid Address by not Providing House Number 
Then Admin/User/Staff should get a message "Enter valid Address"

Scenario: Validating the Street Name field on Registeration Page
When Admin/User/Staff clicks Sign Up button with invalid Street Name
Then Admin/User/Staff should get a message "Enter valid Street Name"

Scenario: Validating the Zip field on Registeration Page
When Admin/User/Staff clicks Sign Up button with invalid Zip
Then  Admin/User/Staff should get a message "Enter valid Zip"

Scenario: Validating the City field on Registeration Page
When Admin/User/Staff clicks Sign Up button with invalid City
Then Admin/User/Staff should get a message "Enter valid City"

Scenario: Validating the State field on Registeration Page
When Admin/User/Staff clicks Sign Up button without selecting State
Then Admin/User/Staff should get a message "State is required"

Scenario: Validating the Phone Number field on Registeration Page
When Admin/User/Staff clicks Sign Up button with invalid Phone Number
Then Admin/User/Staff should get a message "Enter valid Phone Number"

Scenario: Validating the BirthDate field on Registeration Page
When Admin/User/Staff clicks Sign Up button without selecting BirthDate
Then Admin/User/Staff should get a message "BirthDate is required"

Scenario: Validating the UserName field on Registeration Page
When Admin/User/Staff clicks Sign Up button with invalid Admin/User/Staff Name
Then Admin/User/Staff should get a message"Please Enter valid Admin/User/Staff Name "

Scenario: Validating the Password field on Registeration Page
When Admin/User/Staff clicks Sign Up button with invalid Password
Then Admin/User/Staff should get a message "Enter valid Password"

Scenario: Validating the signup form with existing name
When User clicks Sign Up button with existing Admin/User/Staff name
Then Admin/User/Staff should see the message "Admin/User/Staff name already exist"
           

Scenario: Validating Sign Up form with valid data
When Admin/User/Staff Clicks on "Sign Up" button after entering all valid details.
Then Admin/User/Staff should get a message"Registeration successful"


