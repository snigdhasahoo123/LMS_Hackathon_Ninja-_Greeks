   @browser 
   Feature: Login scenarios
   Background: Admin/User/Staff opens the LMS website  

 
  @tag1
   
  Scenario: Validates the login url
    Given Admin/User/Staff is on Browser
    When Admin/User/Staff opens the LMS website  
    Then Admin/user/Staff should be navigated to login page
    
 @tag2
  
   Scenario: Login with valid credentials
    Given User is on Login Page 
    When User clicks login button after entering name and Password
    Then User see header text as "Manage Program"

    
 @tag3
  
   Scenario: Admin/Staff login with valid credentials
    Given Admin/staff is on Login Page
    When Admin/Staff  clicks login Button after entering Username,Password,code 
    Then Admin/Staff see header text as "Manage Program"

      
  @tag4
   
  Scenario: User login with valid username and invalid password
    Given User  is on Login Page
    When User clicks login button after entering valid Username and invalid Password 
    Then User should see a error message "Entered invalid password"
      
     
      
   @tag5
   
  Scenario: User login with invalid username and valid password
    Given User is on Login Page
    When User clicks login button after entering  Invalid username and valid Password  
    Then User should see a error message "Entered invalid username"
    
  @tag6
   
    Scenario: User login with invalid username and invalid password
    Given User is on Login Page
    When User clicks login button after entering Invalid username and invalid Password   
    Then User should see a error message "The username and password  are incorrect"
    
  @tag7
   
  Scenario: User login with valid username and leaves password empty
    Given User is on Login Page
    When User clicks login button after entering valid username and leaves Password field empty  
    Then It should show error message "enter valid password"
    
   @tag8
   
    Scenario: Admin/Staff with valid username,invalid password,code
    Given Admin/Staff is on Login Page
    When Admin/Staff  clicks login button after entering  valid username invalid Password and code  
    Then Admin/Staff should see a error message "Entered invalid password"
    
    @tag9
   
    Scenario: Admin/Staff with invalid username,valid password,code
    Given Admin/Staff is on Login Page
    When Admin/Staff  clicks login button after entering invalid username,valid Password and code  
    Then Admin/Staff should see a error message "Entered invalid username"
    
    
    @tag10
   
    Scenario: Admin/Staff with valid username,valid password without code
    Given Admin/Staff is on Login Page
    When Admin/Staff  clicks login button after entering invalid username,valid Password  and without code  
    Then Admin/Staff should see a error message "The code is required"
    
    
    @tag11
   
    Scenario: Validate forgot password link
    Given Admin/User/Staff is on Login Page
    When Admin/User/Staff clicks Forgot password link  
    Then It should redirected to forgot Password page
    
    @tag12
    
    Scenario: Validate forgot password with  email id
    Given Admin/User/Staff is on Forgot Password Page
    When Admin/User/Staff  clicks continue after entering valid email address   
    Then Admin/User/Staff should be redirected to enter verification code page and verification code will be sent to email
    
     @tag13
    
    Scenario: Validate verifiction code
    Given Admin/User/Staff is on Enter verification code Page
    When Admin/User/Staff  clicks continue after entering verification code   
    Then Admin/User/Staff should be redirected reset password page
    
     @tag14
    
    Scenario: Validate click here link in verification code page
    Given Admin/User/Staff is on enter verification code Page
    When Admin/User/Staff clicks Click here link to resend   
    Then The verification code should be resend to email 
    
    @tag15
    
    Scenario: Validate Reset password
    Given Admin/User/Staff is on Reset Password Page
    When Admin/User/Staff clicks submit button after entering new password and retype password   
    Then Admin/User/Staff  should be redirected to login page
    
    @tag16
    
    Scenario: Validate Reset password on mismatch
    Given Admin/User/Staff is on Reset Password Page
    When Admin/User/Staff  clicks submit button after entering new password and retype password  
    Then Admin/User/Staff  should see an error message <password and retype password are mismatched>
    
    @tag17
    
    Scenario: Validate Reset password with lessthan 8 characters
    Given Admin/User/Staff is on Reset Password Page
    When Admin/User/Staff clicks submit button after entering password  with less than 8 characters 
    Then It should display an error message <The password must contain 8 characters>
    
    @tag18
    
    Scenario: Validate Reset password without capital letter
    Given Admin/User/Staff is on Reset Password Page
    When Admin/User/Staff clicks submit button after entering password without Capital letter  
    Then It should display an error message <The password must contain one Capital letter>
    
    @tag19
    
    Scenario:  Validate Reset password without number
    Given Admin/User/Staff is on Reset Password Page
    When Admin/User/Staff clicks submit button after entering  password without Number 
    Then It should display an error message <The password must contain one Number>
    
   @tag20
    
    Scenario:  Validate Reset password without special character
    Given Admin/User/Staff is on Reset Password Page
    When Admin/User/Staff clicks submit button after entering password without Special character
    Then It should display an error message <The password must contain one Special character>
    
  @tag21
    
    Scenario:  Validate Reset password with cancel button
    Given Admin/User/Staff is on Reset Password Page
    When Admin/User/Staff clicks cancel button after entering new password and retype password 
    Then Admin/User/Staff  should see a refreshed reset password page with empty fields
    
   