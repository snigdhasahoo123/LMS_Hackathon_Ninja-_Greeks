package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Baseclass;
import pageObjects.Logoutpageobj;

public class Logoutstepdef extends Baseclass {

	public Logoutpageobj lo = new Logoutpageobj(driver);

	@Given("Admin\\/User\\/Staff Logged on to LMS website")
	public void admin_user_staff_logged_on_to_lms_website() {
		driver.get(baseUrl);
	}

	@When("Admin\\/User\\/Staff  Clicks on LogOut button")
	public void admin_user_staff_clicks_on_log_out_button() {
		lo.logout();
	}

	@Then("Admin\\/User\\/Staff should be navigated to Login Screen")
	public void admin_user_staff_should_be_navigated_to_login_screen() {
		lo.navigatetologin();
		driver.get(loginurl);
	}

}
