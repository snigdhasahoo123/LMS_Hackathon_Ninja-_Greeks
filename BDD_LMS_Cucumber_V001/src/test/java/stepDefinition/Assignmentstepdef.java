package stepDefinition;

import org.openqa.selenium.WebDriver;

import Assignmentutilities.readconfig;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Assignmentpageobj;
import pageObjects.Baseclass;

public class Assignmentstepdef extends Baseclass {

	public WebDriver driver;

	public Assignmentpageobj ma = new Assignmentpageobj(driver);
	readconfig rc = new readconfig();

	@Given("Admin\\/User\\/Staff Logged on to LMS Website")
	public void admin_user_staff_logged_on_to_lms_websiteSC1() {
		rc.getsource();
		driver.get(baseUrl);

	}

	@When("Admin\\/User\\/Staff Clicks on Admin\\/User\\/Staff clicks on Assignment Page")
	public void admin_user_staff_clicks_on_admin_user_staff_clicks_on_assignment_page() {
		ma.Assignmentlink();

	}

	@Then("Admin\\/User\\/Staff Should see a Header {string}")
	public void admin_user_staff_should_see_a_header(String Manageassignment) {
		ma.headervalidation();
	}

	@When("Admin\\/User\\/Staff clicks on Assignment Page")
	public void admin_user_staff_clicks_on_assignment_page() {
		ma.Assignmentlink();

	}

	@Then("Admin\\/User\\/Staff Should see a Footer text {string}")
	public void admin_user_staff_should_see_a_footer_text(String footertext) {
		ma.footervalidation();

	}

	@Then("Admin\\/User\\/Staff Should see a Paginator text {string}")
	public void admin_user_staff_should_see_a_paginator_text(String paginatorentries) {
		ma.paginatorentries();

	}

	@Given("Admin\\/User\\/Staff is on Assignment Page")
	public void admin_user_staff_is_on_assignment_paginator() {
		driver.get(baseUrl);
		ma.paginatoridentify();

	}

	@When("Admin\\/User\\/Staff Clicks on Enabled paginator-next button")
	public void admin_user_staff_clicks_on_enabled_paginator_next_button() {
		ma.nextpagebutton();
	}

	@Then("Admin\\/User\\/Staff Should be navigated to next page")
	public void admin_user_staff_should_be_navigated_to_next_page() {
		ma.nextpage();

	}

	@Then("Admin\\/User\\/Staff Should be navigated to previous page")
	public void admin_user_staff_should_be_navigated_to_previous_page() {
		ma.previouspage();
	}

	@Then("Admin\\/User\\/Staff Should be navigated to Last page")
	public void admin_user_staff_should_be_navigated_to_last_page() {
		ma.lastpage();
	}

	@Then("Admin\\/User\\/Staff Should be navigated to First  page")
	public void admin_user_staff_should_be_navigated_to_first_page() {
		ma.firstpage();
	}

	@When("Admin\\/User\\/Staff clicks Search bar after entering Assignment name")
	public void admin_user_staff_clicks_search_bar_after_entering_assignment_name() {
		ma.searchassignmentname();
	}

	@Then("The requested assignment details should be displayed")
	public void the_requested_assignment_details_should_be_displayed() {

		ma.searchassignmentnamevalidation();
	}

	@When("Admin\\/User\\/Staff Clicks on Assignment Name Ascending Arrow")
	public void admin_user_staff_clicks_on_assignment_name_ascending_arrow() {

		ma.Assignnameascarrow();
	}

	@Then("Admin\\/User\\/Staff should see the Assignment Name displayed in Ascending order")
	public void admin_user_staff_should_see_the_assignment_name_displayed_in_ascending_order() {
		ma.assinmentnameascvalidation();
	}

	@When("Admin\\/User\\/Staff Clicks on Assignment Description Ascending Arrow")
	public void admin_user_staff_clicks_on_assignment_description_ascending_arrow() {
		ma.Assigndescriptionascarrow();
	}

	@Then("Admin\\/User\\/Staff should see the Assignment Description displayed in Ascending order")
	public void admin_user_staff_should_see_the_assignment_description_displayed_in_ascending_order() {
		ma.Assigndescriptionascarrow();
	}

	@When("Admin\\/User\\/Staff Clicks on Assignment Due Date Ascending Arrow")
	public void admin_user_staff_clicks_on_assignment_due_date_ascending_arrow() {
		ma.Assignduedateascarrow();
	}

	@Then("Admin\\/User\\/Staff should see the Assignment Due Date displayed in Ascending order")
	public void admin_user_staff_should_see_the_assignment_due_date_displayed_in_ascending_order() {
		// Write code here that turns the phrase above into concrete actions
		ma.assinmentduedatecascvalidation();
	}

	@When("Admin\\/User\\/Staff Clicks on Assignment Grade Ascending Arrow")
	public void admin_user_staff_clicks_on_assignment_grade_ascending_arrow() {
		ma.Assigngradearrow();
	}

	@Then("Admin\\/User\\/Staff should see the Assignment Grade displayed in Ascending order")
	public void admin_user_staff_should_see_the_assignment_grade_displayed_in_ascending_order() {
		ma.assinmentnameascvalidation();
	}

	@When("Admin\\/User\\/Staff Clicks on Assignment Name Descending Arrow")
	public void admin_user_staff_clicks_on_assignment_name_descending_arrow() {
		ma.Assignnamedescarrow();
	}

	@Then("Admin\\/User\\/Staff should see the Assignment Name displayed in Descending order")
	public void admin_user_staff_should_see_the_assignment_name_displayed_in_descending_order() {
		ma.assinmentnamedescvalidation();
	}

	@When("Admin\\/User\\/Staff Clicks on Assignment Description Descending Arrow")
	public void admin_user_staff_clicks_on_assignment_description_descending_arrow() {
		ma.Assigndescriptiondescarrow();
	}

	@Then("Admin\\/User\\/Staff should see the Assignment Description displayed in Descending order")
	public void admin_user_staff_should_see_the_assignment_description_displayed_in_descending_order() {
		ma.assinmentdescdescvalidation();
	}

	@When("Admin\\/User\\/Staff Clicks on Assignment Due Date Descending Arrow")
	public void admin_user_staff_clicks_on_assignment_due_date_descending_arrow() {
		ma.Assignduedatedescarrow();
	}

	@Then("Admin\\/User\\/Staff should see the Assignment Due Date displayed in Descending order")
	public void admin_user_staff_should_see_the_assignment_due_date_displayed_in_descending_order() {
		ma.assinmentduedatedescvalidation();
	}

	@When("Admin\\/User\\/Staff Clicks on Assignment Grade Descending Arrow")
	public void admin_user_staff_clicks_on_assignment_grade_descending_arrow() {
		ma.Assigngradedescarrow();
	}

	@Then("Admin\\/User\\/Staff should see the Assignment Grade displayed in Descending order")
	public void admin_user_staff_should_see_the_assignment_grade_displayed_in_descending_order() {
		ma.assinmentduedatedescvalidation();
	}

	@Given("Staff is on Manage Assignment page")
	public void staff_is_on_manage_assignment_page() {
		ma.staffmanageassignmentpage();
	}

	@When("Staff clicks a Add new assignment button")
	public void staff_clicks_a_add_new_assignment_button() {
		ma.Addnewassignment();
	}

	@Then("Staff should see Assignment details window")
	public void staff_should_see_assignment_details_window() {
		ma.Addnewassignmentnewpopup();
	}

	@Given("Admin\\/User\\/Staff is on Manage Assignment page")
	public void admin_user_staff_is_on_manage_assignment_page() {
		ma.manageassignmenttitle();
	}

	@When("Admin\\/User\\/Staff clicks a Add New Assignment button")
	public void admin_user_staff_clicks_a_add_new_assignment_button() {

		ma.Addnewassignment();
	}

	@Then("Admin\\/User\\/Staff should see a message {string}")
	public void admin_user_staff_should_see_a_message(String string) {

		ma.addnewassignmentforuser(Username);
	}

	@Given("Staff is on  Assignment Details page")
	public void staff_is_on_assignment_details_pagestaff() {

		ma.Addnewassignmentnewpopup();
	}

	@When("Staff  clicks on Save after leaving all the fields empty")
	public void staff_clicks_on_save_after_leaving_all_the_fields_empty() {
		ma.staffclicksaveallfieldempty();
	}

	@Then("Staff should see an error message {string}")
	public void staff_should_see_an_error_message(String string) {

		ma.staffclicksaveerrormessage();
	}

	@Given("Staff is on Assignment Details page")
	public void staff_is_on_assignment_details_page() {
		ma.Addnewassignment();
	}

	@When("Staff clicks  Save button after entering assignment name,assignment description,assignment Grade and Duedate")
	public void staff_clicks_save_button_after_entering_assignment_name_assignment_description_assignment_grade_and_duedate() {
		ma.staffclickssaveafterenteringdetails();
	}

	@Then("Staff should see a message {string}")
	public void staff_should_see_a_message(String string) {
		ma.newassinmentsuccessadded();
	}

	@When("Staff clicks cancel button with entering all fields")
	public void staff_clicks_cancel_button_with_entering_all_fields() {
		ma.clickcancelafterenteringallfields();
	}

	@Then("Staff should see a Assignment details window is closed")
	public void staff_should_see_a_assignment_details_window_is_closed() {
		ma.manageassignmenttitle();
	}

	@Given("Admin\\/User\\/Staff is on Assignments page")
	public void admin_user_staff_is_on_assignments_page() {
		ma.manageassignmenttitle();
	}

	@When("Admin\\/User\\/Staff clicks on Assignment")
	public void admin_user_staff_clicks_on_assignment() {
		ma.Assignmentlink();
	}

	@Then("Admin\\/User\\/Staff should see a newly added Assignment")
	public void admin_user_staff_should_see_a_newly_added_assignment() {

		ma.newlyaddedassignvalidation();
	}

	@Given("Staff is on Assignment  page")
	public void staff_is_on_assignment_page() {

		ma.manageassignmenttitle();
	}

	@When("Staff clicks manage button under Assignment Grade")
	public void staff_clicks_manage_button_under_assignment_grade() {
		ma.managebuttonunderassignmentgrade();
	}

	@Then("Staff should be navigated to Grade Window")
	public void staff_should_be_navigated_to_grade_window() {
		ma.navigatetogradewindow();
	}

	@When("Staff clicks an edit Assignment button")
	public void staff_clicks_an_edit_assignment_button() {
		ma.Editbutton();
	}

	@Then("Staff should see a Assignment details window")
	public void staff_should_see_a_assignment_details_window() {
		ma.Editclickassignmentdetailswindow();
	}

	@When("Staff clicks Save button  after edits Assignment Name")
	public void staff_clicks_save_button_after_edits_assignment_name() {
		ma.Editassigndetailsthensave();
	}

	@When("Staff clicks Save button  after edits Assignment Description")
	public void staff_clicks_save_button_after_edits_assignment_description() {
		ma.Editassigndescriptionthensave();
	}

	@When("Staff clicks Save button After edits Assignment Grade")
	public void staff_clicks_save_button_after_edits_assignment_grade() {
		ma.Editassigngradethensave();
	}

	@When("Staff clicks Save button After edits Assignment DueDate")
	public void staff_clicks_save_button_after_edits_assignment_due_date() {
		ma.Editassignduedatethensave();
	}

	@When("Staff clicks cancel button")
	public void staff_clicks_cancel_button() {
		ma.cancelclick();
	}

	@Then("Staff Should see a Assignment Details Page is closed")
	public void staff_should_see_a_assignment_details_page_is_closed() {
		ma.manageassignmenttitle();
	}

	@When("Admin\\/User\\/Staff clicks Edit button")
	public void admin_user_staff_clicks_edit_button() {
		ma.Editbutton();
	}

	@Given("Admin\\/User\\/Staff is on Assignment page")
	public void admin_user_staff_is_on_assignment_page() {
		ma.manageassignmenttitle();
	}

	@When("Admin\\/User\\/Staff clicks on Assignment Name")
	public void admin_user_staff_clicks_on_assignment_name() {
		ma.Assignmentnameclick();
	}

	@Then("Admin\\/User\\/Staff should be navigated to Assignment Google form page")
	public void admin_user_staff_should_be_navigated_to_assignment_google_form_page() {
		ma.clickassigngoogleform();
	}

	@Given("Admin is on Assignment page")
	public void admin_is_on_assignment_page() {
		ma.manageassignmenttitle();
	}

	@When("Admin clicks on Assignment Name")
	public void admin_clicks_on_assignment_name() {
		ma.Assignmentnameclick();
	}

	@Given("Admin\\/User\\/Staff is on Assignment  Google form page")
	public void admin_user_staff_is_on_assignment_google_form_page() {
		ma.googleformopen();

	}

	@When("Admin\\/User\\/Staff clicks on submit button after entering all questions and mail id")
	public void admin_user_staff_clicks_on_submit_button_after_entering_all_questions_and_mail_id() {
		ma.googleformfield();
	}

	@Then("Admin\\/User\\/Staff entered google forms successfully")
	public void admin_user_staff_entered_google_forms_successfully() {
		ma.manageassignmenttitle();
	}

	@When("Admin\\/User\\/Staff clicks on submit button after leaving all questions and mail id")
	public void admin_user_staff_clicks_on_submit_button_after_leaving_all_questions_and_mail_id() {
		ma.googleformfieldempty();
	}

	@Then("Admin\\/User\\/Staff should get a warning message {string}")
	public void admin_user_staff_should_get_a_warning_message(String string) {
		ma.googleformwarningmsg();
	}

	@When("Admin\\/User\\/Staff clicks clear form button after entering all questions and mail id")
	public void admin_user_staff_clicks_clear_form_button_after_entering_all_questions_and_mail_id() {
		ma.googleformfieldclear();
	}

	@Then("The Assignment Google form cleared successfully")
	public void the_assignment_google_form_cleared_successfully() {
		ma.googleformfieldemptyvalidation();
	}

	@When("Admin\\/User\\/Staff clicks Switch account link")
	public void admin_user_staff_clicks_switch_account_link() {
		ma.switchaccount();
	}

	@Then("Admin\\/User\\/Staff should be switched over the account Successfully")
	public void admin_user_staff_should_be_switched_over_the_account_successfully() {
		ma.switchaccountaccept();
	}

	@When("Staff clicks on delete button on the righr side")
	public void staff_clicks_on_delete_button_on_the_righr_side() {
		ma.deleteforeachrow();
	}

	@Then("Staff should see a Delete Confirmation window")
	public void staff_should_see_a_delete_confirmation_window() {

		ma.deleteconfirmationwindow();
	}

	@Given("Staff is on Delete Confirmation window")
	public void staff_is_on_delete_confirmation_window() {

		ma.deleteconfirmationwindow();
	}

	@When("Staff clicks Yes")
	public void staff_clicks_yes() {

		ma.deleteconfirmationwindowselectyes();
	}

	@Then("Staff Should see \"Assignment Deleted Successfully")
	public void staff_should_see_assignment_deleted_successfully() {

		ma.deleteconfrmationmessagestaff();
	}

	@When("Staff clicks No")
	public void staff_clicks_no() {
		ma.deleteconfirmationwindowselectno();

	}

	@Then("Confirmation delete window should be closed successfully")
	public void confirmation_delete_window_should_be_closed_successfully() {
		ma.deleteconfirmationwindowdismiss();
	}

	@Given("Admin is on Manage Assignment page")
	public void admin_is_on_manage_assignment_page() {
		ma.addnewassignmentforuser(Username);
	}

	@When("Admin clicks on delete button")
	public void admin_clicks_on_delete_button() {
		ma.deleteforeachrow();
	}

	@Then("Admin should see a message {string}")
	public void admin_should_see_a_message(String string) {
		ma.deleteconfrmationmessagesadmin();
	}

	@When("Admin\\/User\\/Staff clicks on delete button")
	public void admin_user_staff_clicks_on_delete_button() {
		ma.deleteforeachrow();
	}

	@Then("Admin\\/User\\/Staff should see a message\"Staff only have access\"")
	public void admin_user_staff_should_see_a_message_staff_only_have_access() {
		ma.deleteconfrmationmessagesadmin();
	}

	@When("Admin\\/User\\/Staff clicks on delete button on the top left")
	public void admin_user_staff_clicks_on_delete_button_on_the_top_left() {
		ma.deleteall();
	}

	@Then("Admin\\/User\\/Staff\\/ should see a disabled delete button")
	public void admin_user_staff_should_see_a_disabled_delete_button() {
		ma.deletealldisablevalidation();
	}

	@When("Staff clicks delete button on the top aftr selecting multiple checkbox")
	public void staff_clicks_delete_button_on_the_top_aftr_selecting_multiple_checkbox() {

		ma.staffdeleteallandmutiplecheckbox();
	}

	@Then("Staff should see a  Delete confirm window")
	public void a_staff_should_see_a_delete_confirm_window() {
		ma.deleteconfirmationwindow();
	}

	@Then("All Assignments are deleted Successfully")
	public void all_assignments_are_deleted_successfully() {
		ma.deleteconfrmationmessagestaff();
	}

	@When("Admin\\/User\\/Staff clicks check box on the left side to the Assignment Name")
	public void admin_user_staff_clicks_check_box_on_the_left_side_to_the_assignment_name() {
		ma.mutiplecheckboxselection();
	}

	@Then("Admin\\/User\\/Staff should see a enabled delete button on the top left")
	public void admin_user_staff_should_see_a_enabled_delete_button_on_the_top_left() {
		ma.mutipleselectioncheckboxenabled();
	}

	@When("Admin clicks check box on the left side to the Assignment Name")
	public void admin_clicks_check_box_on_the_left_side_to_the_assignment_name() {
		ma.mutiplecheckboxselection();
	}

	@When("Admin\\/User\\/Staff clicks individual checkbox button")
	public void admin_user_staff_clicks_individual_checkbox_button() {
		ma.individaulcheckboxselection();
	}

	@Then("Admin\\/User\\/Staff should see a delete button on the top left")
	public void admin_user_staff_should_see_a_delete_button_on_the_top_left() {

		ma.deleteall();
	}

	@When("Admin clicks individual checkbox button")
	public void admin_clicks_individual_checkbox_button() {
		ma.individaulcheckboxselection();
	}

	@Then("Admin should see a warning message {string}")
	public void admin_should_see_a_warning_message_indivualcheckbox(String text) {
		ma.admingetalertmessage();
	}

}
