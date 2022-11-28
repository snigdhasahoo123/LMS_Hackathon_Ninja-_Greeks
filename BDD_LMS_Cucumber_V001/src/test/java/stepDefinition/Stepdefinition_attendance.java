package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Attendance;
import pageObjects.Baseclass;
import pageObjects.Login;

public class Stepdefinition_attendance extends Baseclass {

	public Attendance attendance;
	public Login login;

	public Stepdefinition_attendance() {
		super();
	}

	/*
	 * @Given("Admin\\/staff is on Login Page") public void
	 * admin_staff_is_on_login_page() { Intialization(); // driver.get(baseUrl); }
	 */

	@When("Admin\\/User\\/Staff Clicks on Attendance button")
	public void admin_user_staff_clicks_on_attendance_button() {
		attendance.clickonAttendancePage();
	}

	@When("Admin\\/User\\/Staff is on Manage Attandance page")
	public void admin_user_staff_is_on_manage_attandance_page() {
		attendance.clickonFooterPage();
	}

	@Then("Admin\\/User\\/Staff see Footer text as In total there are {int} entries.")
	public void admin_user_staff_see_footer_text_as_in_total_there_are_entries(Integer int1) {
		System.out.println("User can see Footer text as In total there are  5 entries");
	}

	@When("Admin\\/User\\/Staff is on Manage Attendance page")
	public void admin_user_staff_is_on_manage_attendance_page() {
		attendance.clickonPaginatorPage();
	}

	@Then("Admin\\/User\\/Staff see the text as Showing {int} to {int} of {int} entries.")
	public void admin_user_staff_see_the_text_as_showing_to_of_entries(Integer int1, Integer int2, Integer int3) {
		System.out.println("User can see Footer text as In total there are  1 to 5 of 5  entries");
	}

	@Then("Admin\\/User\\/Staff see all paginator buttons are Disabled")
	public void admin_user_staff_see_all_paginator_buttons_are_disabled() {

		attendance.clickonDeletebutton();
		System.out.println("User can see  all paginator buttons are Disabled");
	}

	@When("User\\/Staff Clicks on Edit Button")
	public void user_staff_clicks_on_edit_button() {
		attendance.clickonEditButton();
	}

	@Then("Admin see header text as Attendance Details")
	public void admin_see_header_text_as_attendance_details() {
		System.out.println("User can see  header text as Attendance Details");
	}

	@When("User\\/Staff clicks on Save button after changing Program Name")
	public void user_staff_clicks_on_save_button_after_changing_program_name() {
		attendance.clickonSave();
	}

	@Then("User\\/Staff see the success message Updated Successfully")
	public void user_staff_see_the_success_message_updated_successfully() {
		System.out.println("User can see  success message Updated Successfully");
	}

	@When("User\\/Staff clicks on Save button after changing")
	public void user_staff_clicks_on_save_button_after_changing() {
		attendance.clickonSave();
	}

	@Then("User name	User\\/Staff see the success message Updated Successfully")
	public void user_name_user_staff_see_the_success_message_updated_successfully() {
		System.out.println("User can see  success message Updated Successfully");
	}

	@When("User\\/Staff clicks on Save button after disabling Present details")
	public void user_staff_clicks_on_save_button_after_disabling_present_details() {
		attendance.clickonDisabled();
	}

	@When("User\\/Staff clicks on Save button after enabling Absent details")
	public void user_staff_clicks_on_save_button_after_enabling_absent_details() {
		attendance.clickonAbsentbutton();

	}

	@When("User\\/Staff clicks on Cancel button after entering details")
	public void user_staff_clicks_on_cancel_button_after_entering_details() {
		attendance.clickonCancelbutton();
	}

	@Then("User\\/Staff see a Attendance Details window getting closed")
	public void user_staff_see_a_attendance_details_window_getting_closed() {
		System.out.println("User can see  Attendance Details window getting closed");
	}

	@Given("Admin is on Manage Attendance page")
	public void admin_is_on_manage_attendance_page() {

	}

	@When("Admin Clicks on Edit Button")
	public void admin_clicks_on_edit_button() {
		attendance.clickonEditButton();
	}

	@Then("Admin see Error Message Admin Has View Only Permission")
	public void admin_see_error_message_admin_has_view_only_permission() {
		System.out.println("User can see  Error Message Admin Has View Only Permission");
	}

	@When("User\\/Staff Clicks on Delete Button")
	public void user_staff_clicks_on_delete_button() {
		attendance.clickonDeletebutton();
	}

	@Then("Admin see header text as Delete Confirm")
	public void admin_see_header_text_as_delete_confirm() {
		System.out.println("User can  see header text as Delete Confirm");
	}

	@When("User\\/Staff  Clicks on Yes button")
	public void user_staff_clicks_on_yes_button() {
		attendance.clickonYesbutton();
	}

	@Then("User\\/Staff  see Success message Program Deleted Succesfully")
	public void user_staff_see_success_message_program_deleted_succesfully() {
		attendance.valsuccessMsgDisplayedasdeleted();
		System.out.println("User can  see Success message Program Deleted Succesfully");
	}

	@When("User\\/Staff  Clicks on No button")
	public void user_staff_clicks_on_no_button() {
		attendance.clickonNobutton();
	}

	@Then("User\\/Staff can see Program Name not deleted")
	public void user_staff_can_see_program_name_not_deleted() {
		System.out.println("User can   see Program Name not deleted");
	}

	@When("Admin Clicks on Delete Button")
	public void admin_clicks_on_delete_button() {
		attendance.clickonDeletebutton();

	}

	@When("Admin\\/User\\/Staff Clicks on Checkbox")
	public void admin_user_staff_clicks_on_checkbox() {
		attendance.clickonCheckBox();
	}

	@Then("Admin\\/User\\/Staff  see list of Users in that Program")
	public void admin_user_staff_see_list_of_users_in_that_program() {
		System.out.println("User can see list of Users in that Program");
	}

	@When("page	Admin\\/User\\/Staff  Clicks on Present")
	public void page_admin_user_staff_clicks_on_present() {
		attendance.clickonPresent();
	}

	@Then("Admin\\/User\\/Staff  see the list of  User Name who are Present")
	public void admin_user_staff_see_the_list_of_user_name_who_are_present() {
		attendance.enterProgramName();
	}

	@When("Admin\\/User\\/Staff  Clicks on Absent")
	public void admin_user_staff_clicks_on_absent() {
		attendance.clickonEditAbsent();
	}

	@Then("Admin\\/User\\/Staff  see the list of  User Name who are Absent")
	public void admin_user_staff_see_the_list_of_user_name_who_are_absent() {
		System.out.println("User can see the list of  User Name who are Absent");
	}

}
