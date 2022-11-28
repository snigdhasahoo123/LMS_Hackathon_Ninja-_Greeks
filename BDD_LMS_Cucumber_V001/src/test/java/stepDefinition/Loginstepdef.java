package stepDefinition;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Baseclass;
import pageObjects.Loginpageobj;

public class Loginstepdef extends Baseclass {

	public WebDriver driver;

	public Loginpageobj ln = new Loginpageobj(driver);

	@Given("Admin\\/User\\/Staff is on Browser")
	public void admin_user_staff_is_on_browser() {
		rc.getApplicationURL();
	}

	@When("Admin\\/User\\/Staff opens the LMS website")
	public void admin_user_staff_opens_the_lms_website() {
		driver.get(baseUrl);
	}

	@Then("Admin\\/user\\/Staff should be navigated to login page")
	public void admin_user_staff_should_be_navigated_to_login_page() {
		ln.adminuserstaffclicklogin();
	}

	@Given("User is on Login Page")
	public void user_is_on_login_page1() {
		ln.adminuserstaffclicklogin();
	}

	@When("User clicks login button after entering name and Password")
	public void user_clicks_login_button_after_entering_name_and_password() {
		rc.getsource();
		ln.enteringusenameapass(Username, Password);
	}

	@Then("User see header text as {string}")
	public void user_see_header_text_as(String string) {
		ln.headervalidation();
	}

	@When("Admin\\/Staff  clicks login Button after entering Username,Password ,code")
	public void admin_staff_clicks_login_button_after_entering_username_password_code() {
		rc.getsource();
		ln.enteringusenameapasscode(Username, Password, code);

	}

	@Then("Admin\\/Staff see header text as {string}")
	public void admin_staff_see_header_text_as(String string) {
		ln.headervalidation();
	}

	@Given("User  is on Login Page")
	public void user_is_on_login_page() {
		ln.adminuserstaffclicklogin();
	}

	@When("User clicks login button after entering valid Username and invalid Password")
	public void user_clicks_login_button_after_entering_valid_username_and_invalid_password() {
		rc.getsource();
		ln.enteringusenameapass(Username, Password);
	}

	@Then("User should see a error message {string}")
	public void user_should_see_a_error_message(String string) {
		ln.usererrormessage();
	}

	@When("User clicks login button after entering  Invalid username and valid Password")
	public void user_clicks_login_button_after_entering_invalid_username_and_valid_password() {
		rc.getsource();
		ln.enteringusenameapass(Username, Password);
	}

	@When("User clicks login button after entering Invalid username and invalid Password")
	public void user_clicks_login_button_after_entering_invalid_username_and_invalid_password() {
		rc.getsource();
		ln.enteringusenameapass(Username, Password);
	}

	@When("User clicks login button after entering valid username and leaves Password field empty")
	public void user_clicks_login_button_after_entering_valid_username_and_leaves_password_field_empty() {
		rc.getsource();
		ln.enteringusenameapass(Username, null);
	}

	@Then("It should show error message {string}")
	public void it_should_show_error_message(String string) {
		ln.usererrormessage();
	}

	@Given("Admin\\/Staff is on Login Page")
	public void admin_staff_is_on_login_page() {
		ln.adminuserstaffclicklogin();
	}

	@When("Admin\\/Staff  clicks login button after entering  valid username invalid Password and code")
	public void admin_staff_clicks_login_button_after_entering_valid_username_invalid_password_and_code() {
		rc.getsource();
		ln.enteringusenameapasscode(Username, Password, code);
	}

	@Then("Admin\\/Staff should see a error message {string}")
	public void admin_staff_should_see_a_error_message(String string) {
		ln.usererrormessage();
	}

	@When("Admin\\/Staff  clicks login button after entering invalid username,valid Password and code")
	public void admin_staff_clicks_login_button_after_entering_invalid_username_valid_password_and_code() {
		rc.getsource();
		ln.enteringusenameapasscode(Username, Password, code);
	}

	@When("Admin\\/Staff  clicks login button after entering invalid username,valid Password  and without code")
	public void admin_staff_clicks_login_button_after_entering_invalid_username_valid_password_and_without_code() {
		rc.getsource();
		ln.enteringusenameapasscode(Username, Password, null);
	}

	@Given("Admin\\/User\\/Staff is on Login Page")
	public void admin_user_staff_is_on_login_page() {

		ln.adminuserstaffclicklogin();
	}

	@When("Admin\\/User\\/Staff clicks Forgot password link")
	public void admin_user_staff_clicks_forgot_password_link() {
		ln.forgotpassword();
	}

	@Then("It should redirected to forgot Password page")
	public void it_should_redirected_to_forgot_password_page() {
		ln.forgotpasswordpage();
	}

	@Given("Admin\\/User\\/Staff is on Forgot Password Page")
	public void admin_user_staff_is_on_forgot_password_page() {
		ln.forgotpasswordpage();
	}

	@When("Admin\\/User\\/Staff  clicks continue after entering valid email address")
	public void admin_user_staff_clicks_continue_after_entering_valid_email_address() {
		ln.EnteringEmailcontinue();
	}

	@Then("Admin\\/User\\/Staff should be redirected to enter verification code page and verification code will be sent to email")
	public void admin_user_staff_should_be_redirected_to_enter_verification_code_page_and_verification_code_will_be_sent_to_email() {

		ln.verificationcodepage();
	}

	@Given("Admin\\/User\\/Staff is on Enter verification code Page")
	public void admin_user_staff_is_on_enter_verification_code_page1() {
		ln.verificationcodepage();
	}

	@When("Admin\\/User\\/Staff  clicks continue after entering verification code")
	public void admin_user_staff_clicks_continue_after_entering_verification_code() {
		ln.clickcontinueafterenteringverificationcode(code);
	}

	@Then("Admin\\/User\\/Staff should be redirected reset password page")
	public void admin_user_staff_should_be_redirected_reset_password_page() {
		ln.resetpasswordpage();
	}

	@Given("Admin\\/User\\/Staff is on enter verification code Page")
	public void admin_user_staff_is_on_enter_verification_code_page() {
		ln.verificationcodepage();
	}

	@When("Admin\\/User\\/Staff clicks Click here link to resend")
	public void admin_user_staff_clicks_click_here_link_to_resend() {
		ln.clickhetetoresenpassword();
	}

	@Then("The verification code should be resend to email")
	public void the_verification_code_should_be_resend_to_email() {

		ln.emailverfication(code);
	}

	@Given("Admin\\/User\\/Staff is on Reset Password Page")
	public void admin_user_staff_is_on_reset_password_page() {
		ln.resetpasswordpage();
	}

	@When("Admin\\/User\\/Staff clicks submit button after entering new password and retype password")
	public void admin_user_staff_clicks_submit_button_after_entering_new_password_and_retype_password1() {
		rc.getsource();
		ln.submitresetpassword(newpassword, retypepassword);

	}

	@Then("Admin\\/User\\/Staff  should be redirected to login page")
	public void admin_user_staff_should_be_redirected_to_login_page() {
		driver.get(loginurl);
		// ln.navigatelogin(Password);

	}

	@When("Admin\\/User\\/Staff  clicks submit button after entering new password and retype password")
	public void admin_user_staff_clicks_submit_button_after_entering_new_password_and_retype_password() {
		rc.getsource();
		ln.submitresetpassword(newpassword, retypepassword);
	}

	@Then("Admin\\/User\\/Staff  should see an error message {string}")
	public void admin_user_staff_should_see_an_error_message(String string) {
		ln.passwordresetmismatcherror();
	}

	@When("Admin\\/User\\/Staff clicks submit button after entering password  with less than {int} characters")
	public void admin_user_staff_clicks_submit_button_after_entering_password_with_less_than_characters(Integer int1) {
		rc.getsource();
		ln.submitresetpassword(newpassword, retypepassword);
	}

	@Then("It should display an error message {string}")
	public void it_should_display_an_error_message(String string) {
		ln.passwordlessthaneightcharac();
	}

	@When("Admin\\/User\\/Staff clicks submit button after entering password without Capital letter")
	public void admin_user_staff_clicks_submit_button_after_entering_password_without_capital_letter() {
		rc.getsource();
		ln.submitresetpassword(newpassword, retypepassword);
	}

//then
	@Then("It should display an error message <The password must contain one Capital letter>")
	public void it_should_display_an_error_message_the_password_must_contain_one_capital_letter() {
		ln.passwordmustcapital();
	}

	@When("Admin\\/User\\/Staff clicks submit button after entering  password without Number")
	public void admin_user_staff_clicks_submit_button_after_entering_password_without_number() {
		rc.getsource();
		ln.submitresetpassword(newpassword, retypepassword);
	}

	@Then("It should display an error message <The password must contain one Number>")
	public void it_should_display_an_error_message_the_password_must_contain_one_number() {
		ln.passwordmustnum();
	}

	@When("Admin\\/User\\/Staff clicks submit button after entering password without Special character")
	public void admin_user_staff_clicks_submit_button_after_entering_password_without_special_character() {
		rc.getsource();
		ln.submitresetpassword(newpassword, retypepassword);
	}

	@Then("It should display an error message <The password must contain one Special character>")
	public void it_should_display_an_error_message_the_password_must_contain_one_special_character() {
		ln.passwordmustcontainspecialcharac();
	}

	@When("Admin\\/User\\/Staff clicks cancel button after entering new password and retype password")
	public void admin_user_staff_clicks_cancel_button_after_entering_new_password_and_retype_password() {
		ln.resetoptioncancel();
	}

	@Then("Admin\\/User\\/Staff  should see a refreshed reset password page with empty fields")
	public void admin_user_staff_should_see_a_refreshed_reset_password_page_with_empty_fields() {
		ln.resetpasswordpage();
	}

}
