package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Baseclass;
import pageObjects.Login;
import pageObjects.Manageuserclass;

public class Stepdefinitionclass_user extends Baseclass {

	public Manageuserclass manageuser;
	public Login login;

	public Stepdefinitionclass_user() {
		super();
	}

	// background
	@Given("Admin\\/staff is on Login Page")
	public void admin_staff_is_on_login_page() {
		Intialization();

	}

	@When("Admin\\/Staff  clicks login Button after entering  Username,Password,code")
	public void admin_staff_clicks_login_button_after_entering_username_password_code() {
		login = new Login();
		login.Username("LMS");
		login.Password("LMS");
		login.passcode("12345");
		login.Cklogin();
	}

	@Then("Admin\\/Staff see header text as {string}")
	public void admin_staff_see_header_text_as(String string) {
		manageuser.validateheadingprograme();
	}

//page validation
	@Given("Admin\\/User\\/Staff is on any page after Login")
	public void admin_user_staff_is_on_any_page_after_login() {
		manageuser = new Manageuserclass();
		manageuser.validateheadingprograme();
	}

	@When("Admin\\/User\\/Staff clicks the Tab {string}")
	public void admin_user_staff_clicks_the_tab(String string) {
		manageuser = new Manageuserclass();
		manageuser.clicktab();

	}

	@Then("Admin\\/User\\/Staff should see the Manage user page")
	public void admin_user_staff_should_see_the_manage_user_page() {
		manageuser.validateheadinguser();
	}

//Header validation
	/*
	 * @When("Admin\\/User\\/Staff is on the Manage user page after clicking User Tab"
	 * ) public void
	 * admin_user_staff_is_on_the_manage_user_page_after_clicking_user_tab() {
	 * 
	 * }
	 */

	@Then("Admin\\/User\\/Staff should see the page heading as {string}")
	public void admin_user_staff_should_see_the_page_heading_as(String string) {
		manageuser.validateheadinguser();
	}

//pagination
	@Then("Admin\\/User\\/Staff should see the pagination controls below data table")
	public void admin_user_staff_should_see_the_pagination_controls_below_data_table() {
		manageuser = new Manageuserclass();
		String displayed1 = manageuser.paginationisdisplayed();
		if (displayed1 == "true") {
			org.junit.Assert.assertTrue(true);
		} else if (displayed1 == "false") {
			org.junit.Assert.assertTrue(false);
		}
	}

	@When("Manage user table has less than or equal to {int} rows")
	public void manage_user_table_has_less_than_or_equal_to_rows(Integer int1) {
		manageuser = new Manageuserclass();
		manageuser.countOfrows();
	}

	@Then("Pagination control should be disabled")
	public void pagination_control_should_be_disabled() {
		manageuser = new Manageuserclass();
		manageuser.Dsabledpaginationcontrolled();
	}

	@Given("Admin\\/User\\/Staff is on Manage user page")
	public void admin_user_staff_is_on_manage_user_page() {
		manageuser = new Manageuserclass();
		manageuser.validateheadinguser();
	}

	@When("Manage user table has more than {int} rows")
	public void manage_user_table_has_more_than_rows(Integer int1) {
		manageuser = new Manageuserclass();
		manageuser.countOfrows();
	}

	@Then("Pagination control should be enabled")
	public void pagination_control_should_be_enabled() {
		manageuser = new Manageuserclass();
		manageuser.enabledpaginationicon();
	}

	@Given("Admin\\/User\\/Staff table is displayed in manage user page")
	public void admin_user_staff_table_is_displayed_in_manage_user_page() {
		manageuser = new Manageuserclass();
		String displayed = manageuser.usertableisdisplayed();
		if (displayed == "true") {
			org.junit.Assert.assertTrue(true);
		} else if (displayed == "false") {
			org.junit.Assert.assertTrue(false);
		}

	}

	@When("Admin\\/User\\/Staff clicks next link of pagination")
	public void admin_user_staff_clicks_next_link_of_pagination() {
		manageuser = new Manageuserclass();
		manageuser.enabledpaginationicon();
	}

	@Then("Next page should be displayed")
	public void next_page_should_be_displayed() {
		manageuser = new Manageuserclass();
		manageuser.nextpagepagination();
	}

	@Given("last page of Admin\\/User\\/Staff records are displayed")
	public void last_page_of_admin_user_staff_records_are_displayed() {
		manageuser = new Manageuserclass();
		manageuser.clickLastPageButton();
	}

	@Then("Next link of pagination should be disabled")
	public void next_link_of_pagination_should_be_disabled() {
		manageuser = new Manageuserclass();
		manageuser.nextPageDisabled();
	}

	@When("Admin\\/User\\/Staff clicks previous link of pagination")
	public void admin_user_staff_clicks_previous_link_of_pagination() {
		manageuser = new Manageuserclass();
		manageuser.clickpreviouslinkButton();
	}

	@Then("previous page should be displayed")
	public void previous_page_should_be_displayed() {
		manageuser = new Manageuserclass();
		String displayed2 = manageuser.previouspaginationisdisplayed();
		if (displayed2 == "true") {
			org.junit.Assert.assertTrue(true);
		} else if (displayed2 == "false") {
			org.junit.Assert.assertTrue(false);
		}

	}

	@Given("First page of user table is displayed")
	public void first_page_of_user_table_is_displayed() {
		manageuser = new Manageuserclass();
		manageuser.validateheadinguser();
	}

	@Then("Previous link of pagination should be disabled")
	public void previous_link_of_pagination_should_be_disabled() {
		manageuser = new Manageuserclass();
		manageuser.previouslinkPaginationDisabled();
	}

	/*
	 * @When("Admin\\/User\\/Staff clicks << icon in pagination") public void
	 * admin_user_staff_clicks_icon_in_pagination() { // Write code here that turns
	 * the phrase above into concrete actions throw new
	 * io.cucumber.java.PendingException(); }
	 */

	@Then("Admin\\/User\\/Staff clicks should see the First page of the table")
	public void admin_user_staff_clicks_should_see_the_first_page_of_the_table() {
		manageuser = new Manageuserclass();
		manageuser.valPageNumber();

	}

	@When("Admin\\/User\\/Staff clicks >> icon in pagination")
	public void admin_user_staff_clicks_icon_in_pagination() {
		manageuser = new Manageuserclass();
		manageuser.click2greaterthanicon();
	}

	@Then("Admin\\/User\\/Staff clicks should see the Last page of the table")
	public void admin_user_staff_clicks_should_see_the_last_page_of_the_table() {
		manageuser = new Manageuserclass();
		manageuser.lastpageisdisplayed();
		String displayed3 = manageuser.lastpageisdisplayed();
		if (displayed3 == "true") {
			org.junit.Assert.assertTrue(true);
		} else if (displayed3 == "false") {
			org.junit.Assert.assertTrue(false);
		}
	}

	@When("Admin\\/User\\/Staff lands on Manage User page")
	public void admin_user_staff_lands_on_manage_user_page() {
		manageuser = new Manageuserclass();
		manageuser.validateheadinguser();
	}

//**********************************************88
	/*
	 * @Then("Admin\\/User\\/Staff should see the text {string} beow the user table."
	 * ) public void admin_user_staff_should_see_the_text_beow_the_user_table(String
	 * string) { // Write code here that turns the phrase above into concrete
	 * actions throw new io.cucumber.java.PendingException(); }
	 */

//Footer Validation

//add new user functionlaity
	@Then("Admin\\/User\\/Staff should see the button with text {string}")
	public void admin_user_staff_should_see_the_button_with_text(String string) {

	}

	@When("Admin\\/User\\/Staff clicks Add New User")
	public void admin_user_staff_clicks_add_new_user() {
		manageuser = new Manageuserclass();
		manageuser.clickaddnewuser();
	}

	@Then("Admin\\/User\\/Staff should see the {string} dialog box")
	public void admin_user_staff_should_see_the_dialog_box(String string) {
		manageuser = new Manageuserclass();
		manageuser.gettextvalueafterclickedonadduser();

	}
	// tableheader

	@When("Admin\\/User\\/Staff is on the Manage user page after clicking User")
	public void admin_user_staff_is_on_the_manage_user_page_after_clicking_user() {
		manageuser = new Manageuserclass();
		manageuser.validateheadinguser();

	}

	@Then("Admin\\/User\\/Staff should see the table header as \"Empty checkbox-icon,ID with sort icon, Name with Sort icon, Email Address with sort icon,Contact Number with sort icon, Batch with sort icon, Skill with Sort icon, Edit\\/Delete as column names")
	public void admin_user_staff_should_see_the_table_header_as_empty_checkbox_icon_id_with_sort_icon_name_with_sort_icon_email_address_with_sort_icon_contact_number_with_sort_icon_batch_with_sort_icon_skill_with_sort_icon_edit_delete_as_column_names() {
		manageuser = new Manageuserclass();
		manageuser.validateemptycheckbox();
	}

	@When("Admin\\/User\\/Staff clicks sort icon in table header")
	public void admin_user_staff_clicks_sort_icon_in_table_header() {
		manageuser = new Manageuserclass();
		manageuser.clickssorticon();
	}

	@Then("Table rows should be sorted")
	public void table_rows_should_be_sorted() {
		manageuser = new Manageuserclass();
		manageuser.tablesorted();
	}

	@When("Admin\\/User\\/Staff checks empty checkbox in header")
	public void admin_user_staff_checks_empty_checkbox_in_header() {
		manageuser = new Manageuserclass();
		manageuser.validateemptycheckbox();
	}

	@Then("Check box in all the rows of user table should be checked")
	public void check_box_in_all_the_rows_of_user_table_should_be_checked() {
		manageuser = new Manageuserclass();
		manageuser.validateemptycheckbox();
		manageuser.allcheckboxchecked();

	}

	@When("Admin\\/User\\/Staff unchecks checkbox in header")
	public void admin_user_staff_unchecks_checkbox_in_header() {
		manageuser = new Manageuserclass();
		manageuser.allcheckboxunchecked();
	}

	@Then("Check box in all the rows of user table should be unchecked")
	public void check_box_in_all_the_rows_of_user_table_should_be_unchecked() {
		manageuser = new Manageuserclass();
		manageuser.allcheckboxunchecked();
	}

	// delete icon

	@When("Admin\\/User\\/Staffis on the Manage user page after clicking User Tab")
	public void admin_user_staffis_on_the_manage_user_page_after_clicking_user_tab() {
		manageuser = new Manageuserclass();
		manageuser.clickuser();
	}

	@Then("Admin\\/User\\/Staff should see the delete icon at the top left corner of the user table")
	public void admin_user_staff_should_see_the_delete_icon_at_the_top_left_corner_of_the_user_table() {
		manageuser = new Manageuserclass();
		manageuser.delteiconatleftisdisplayeded();
	}

	@When("No rows is checked")
	public void no_rows_is_checked() {
		manageuser = new Manageuserclass();
		manageuser.checkednorowsdisplayeded();

	}

	@Then("Delete icon at the top left corner of the user table disabled")
	public void delete_icon_at_the_top_left_corner_of_the_user_table_disabled() {
		manageuser = new Manageuserclass();
		manageuser.DeleteiconDisabled();

	}

	/*
	 * @When("Admin\\/User\\/Staff checks the rows in user table") public void
	 * admin_user_staff_checks_the_rows_in_user_table() { // Write code here that
	 * turns the phrase above into concrete actions throw new
	 * io.cucumber.java.PendingException(); }
	 */

	@Then("Delete icon at the top left corner of the user table enabled")
	public void delete_icon_at_the_top_left_corner_of_the_user_table_enabled() {
		manageuser = new Manageuserclass();
		manageuser.DeleteiconEnaabled();

	}

	@Given("Admin\\/User\\/Staff checks the rows in user table")
	public void admin_user_staff_checks_the_rows_in_user_table() {
		manageuser = new Manageuserclass();
		manageuser.clickonrow();
	}

	@When("Admin\\/User\\/Staff clicks the delete icon at the top left corner of user table")
	public void admin_user_staff_clicks_the_delete_icon_at_the_top_left_corner_of_user_table() {
		manageuser = new Manageuserclass();
		manageuser.clickdeleteicon();

	}

	@Given("Admin\\/User\\/Staff is in confirm dialog box after clicking delete icon")
	public void admin_user_staff_is_in_confirm_dialog_box_after_clicking_delete_icon() {
		manageuser = new Manageuserclass();
		manageuser.clickdeleteicon();

	}

	@When("Admin\\/User\\/Staff clicks button with text {string}")
	public void admin_user_staff_clicks_button_with_text(String string) {
		manageuser = new Manageuserclass();
		manageuser.gettextvalueafterclickedonadduser();
	}

	@Then("Selected rows should not be deleted and dialog box should be closed")
	public void selected_rows_should_not_be_deleted_and_dialog_box_should_be_closed() {
		manageuser = new Manageuserclass();
		manageuser.dialogbox();
	}

	@Then("Selected rows should be deleted and popup should be shown with success message {string}")
	public void selected_rows_should_be_deleted_and_popup_should_be_shown_with_success_message(String string) {
		manageuser = new Manageuserclass();
		manageuser.valDeleteSuccessMessage();
	}

	@When("Admin\\/User\\/Staff clicks the close\\(x) icon")
	public void admin_user_staff_clicks_the_close_x_icon() {
		manageuser = new Manageuserclass();
		manageuser.clickclosexicon();
	}

	@Then("Confirm dialog box should be closed")
	public void confirm_dialog_box_should_be_closed() {
		System.out.println("Dilog box is closed");
	}

	// Edit/Delete icon

	@Then("Admin\\/User\\/Staff should see the buttons with edit\\/delete icon in each row of Edit\\/Delete coulmn")
	public void admin_user_staff_should_see_the_buttons_with_edit_delete_icon_in_each_row_of_edit_delete_coulmn() {
		manageuser = new Manageuserclass();
		manageuser.editdeleteisplayeded();
	}

	@When("Admin\\/User\\/Staff clicks delete button")
	public void admin_user_staff_clicks_delete_button() {
		manageuser = new Manageuserclass();
		manageuser.clickdeleteicon();
	}

	@Then("Confirm dialog box should be displayed with Text {string} , button with text {string} , the button with text {string} and close\\(X) icon")
	public void confirm_dialog_box_should_be_displayed_with_text_button_with_text_the_button_with_text_and_close_x_icon(
			String string, String string2, String string3) {

	}

	@When("Admin\\/User\\/Staff clicks Edit button")
	public void admin_user_staff_clicks_edit_button() {
		manageuser = new Manageuserclass();
		manageuser.clickedit();
	}

	@Then("{string} dialog box should be displayed for editing")
	public void dialog_box_should_be_displayed_for_editing(String string) {
		manageuser = new Manageuserclass();
		manageuser.textforedit();

	}

	// search
	@Then("Admin\\/User\\/Staff see the Search Text box has text as {string}.")
	public void admin_user_staff_see_the_search_text_box_has_text_as(String string) {
		manageuser = new Manageuserclass();
		manageuser.Searchbar();
	}

	@When("Admin\\/User\\/Staff is on the Manage user page after clicking UserTab")
	public void admin_user_staff_is_on_the_manage_user_page_after_clicking_user_tab() {

		manageuser = new Manageuserclass();
		manageuser.clickuser();

	}

	@Then("Admin\\/User\\/Staff should see the search input field with search icon and text as\" Search…\"")
	public void admin_user_staff_should_see_the_search_input_field_with_search_icon_and_text_as_search() {
		manageuser = new Manageuserclass();
		manageuser.Searchbar();

	}

	@When("Admin\\/User\\/Staff types Name to search")
	public void admin_user_staff_types_name_to_search() {
		manageuser = new Manageuserclass();
		manageuser.SendNamePharse("NamePharse");

	}

	@Then("Rows with the name should be displayed")
	public void rows_with_the_name_should_be_displayed() throws InterruptedException {

		manageuser = new Manageuserclass();
		manageuser.EntriesRow();

	}

	@When("Admin\\/User\\/Staff types random text in search field which has no matching entry")
	public void admin_user_staff_types_random_text_in_search_field_which_has_no_matching_entry() {
		System.out.println("No match found");
	}

	@Then("No rows is displayed")
	public void no_rows_is_displayed() {
		manageuser = new Manageuserclass();
		manageuser.norowvaluefoundtext();

	}
	// SEARCH

	/*
	 * @When("Admin\\/User\\/Staff clicks ID in any row") public void
	 * admin_user_staff_clicks_id_in_any_row() { // Write code here that turns the
	 * phrase above into concrete actions throw new
	 * io.cucumber.java.PendingException(); }
	 */

	/*
	 * @Then("Admin\\/User\\/Staff  see dialog box displayed with user information")
	 * public void admin_user_staff_see_dialog_box_displayed_with_user_information()
	 * { // Write code here that turns the phrase above into concrete actions throw
	 * new io.cucumber.java.PendingException(); }
	 */

	// id
	@When("Admin\\/User\\/Staff clicks ID in any row")
	public void admin_user_staff_clicks_id_in_any_row() {
		manageuser = new Manageuserclass();
		manageuser.clickID();

	}

	@Then("Admin\\/User\\/Staff  see dialog box displayed with user information")
	public void admin_user_staff_see_dialog_box_displayed_with_user_information() {
		manageuser = new Manageuserclass();
		manageuser.userinformationisdisplayed();

	}

	// user deatils window
	@When("Admin\\/User\\/Staff clicks Add new user button")
	public void admin_user_staff_clicks_add_new_user_button() {
		manageuser = new Manageuserclass();
		manageuser.clickaddnewuser();

	}

	@Then("Admin\\/User\\/Staff should see User Details window with text as {string}")
	public void admin_user_staff_should_see_user_details_window_with_text_as(String string) {
		manageuser = new Manageuserclass();
		manageuser.gettextvalueafterclickedonadduser();
	}

	// cancel button

	@Then("Admin\\/User\\/Staff should see a button with text as Cancel  in User Details window")
	public void admin_user_staff_should_see_a_button_with_text_as_cancel_in_user_details_window() {
		manageuser = new Manageuserclass();
		manageuser.cancelbtnviewddisplayed();

	}

	/*
	 * @Given("Admin\\/User\\/Staff is on User Details window") public void
	 * admin_user_staff_is_on_user_details_window() { // Write code here that turns
	 * the phrase above into concrete actions throw new
	 * io.cucumber.java.PendingException(); }
	 */

	@When("Admin\\/User\\/Staff clicks cancel button")
	public void admin_user_staff_clicks_cancel_button() {
		manageuser = new Manageuserclass();
		manageuser.clickcancel();

	}

	@Then("Admin\\/User\\/Staff  see User Details window getting  closed")
	public void admin_user_staff_see_user_details_window_getting_closed() {
		manageuser = new Manageuserclass();
		manageuser.clickclosexicon();
	}
	// Cancel(x) icon

	@Then("Admin\\/User\\/Staff should see a cancel\\(x) icon")
	public void admin_user_staff_should_see_a_cancel_x_icon() {
		manageuser = new Manageuserclass();
		manageuser.cancelxiconisplayeded();
	}

	@Given("Admin\\/User\\/Staff is on User details window")
	public void admin_user_staff_is_on_user_details_details_window() {
		manageuser = new Manageuserclass();
		manageuser.validateuserdeatilswindow();
	}

	@When("Admin\\/User\\/Staff clicks cancel\\(X) icon")
	public void admin_user_staff_clicks_cancel_x_icon() {
		manageuser = new Manageuserclass();
		manageuser.clickclosexicon();
	}

	@Then("User Details window should be closed")
	public void user_details_window_should_be_closed() {
		manageuser = new Manageuserclass();
		manageuser.clickclosexicon();
	}
	// Submit button

	@Then("Admin\\/User\\/Staff should see a button with text as Submit in user details window")
	public void admin_user_staff_should_see_a_button_with_text_as_submit_in_user_details_window() {
		manageuser = new Manageuserclass();
		manageuser.validatesubmitbtn();

	}
	// Label Text

	@Then("Admin\\/User\\/Staff should see the placeholders with Text As {string},{string}, Last name\",\"Email adress\",\"Phone no\", \"Address\",\"City\", \"State\",\"Postal Code\".\"Program\",\"UG Program\",\"PG Program\",\"Skill\",\"Experience\",\"Admin\\/User\\/Staff Role\",Visa status\",{string},{string}")
	public void admin_user_staff_should_see_the_placeholders_with_text_as_last_name_email_adress_phone_no_address_city_state_postal_code_program_ug_program_pg_program_skill_experience_admin_user_staff_role_visa_status(
			String string, String string2, String string3, String string4) {

	}

//input fields

	@Then("Admin\\/User\\/Staff should see the input fields for {string},{string}, Last name\",\"Email adress\",\"Phone no\", \"Address\",\"City\", \"State\",\"Postal Code\".\"Program\",\"UG Program\",\"PG Program\",\"Skill\",\"Experience\",\"Admin\\/User\\/Staff Role\",Visa status\",{string},{string} corresponding to their labels")
	public void admin_user_staff_should_see_the_input_fields_for_last_name_email_adress_phone_no_address_city_state_postal_code_program_ug_program_pg_program_skill_experience_admin_user_staff_role_visa_status_corresponding_to_their_labels(
			String string, String string2, String string3, String string4) {

	}
	// drop down

	@Given("Admin\\/User\\/Staff is on {string} window")
	public void admin_user_staff_is_on_window(String string) {
		manageuser = new Manageuserclass();
		manageuser.userinformationisdisplayed();

	}

	@When("Admin\\/User\\/Staff clicks the drop down icon for state")
	public void admin_user_staff_clicks_the_drop_down_icon_for_state() {

	}

	@Then("Admin\\/User\\/Staff should select from the drop down menu for state")
	public void admin_user_staff_should_select_from_the_drop_down_menu_for_state() {

	}

	@When("Admin\\/User\\/Staff clicks the drop down icon for User Role")
	public void admin_user_staff_clicks_the_drop_down_icon_for_user_role() {
		manageuser = new Manageuserclass();
		manageuser.clickdropdownuser();
	}

	@Then("Admin\\/User\\/Staff should select from the drop down menu for user role")
	public void admin_user_staff_should_select_from_the_drop_down_menu_for_user_role() {
		manageuser = new Manageuserclass();
		manageuser.valselecttatus();
	}

	// Submit button functionality
	/*
	 * @Given("Admin\\/User\\/Staff is on \"User Details\"window") public void
	 * admin_user_staff_is_on_user_details_window() { // Write code here that turns
	 * the phrase above into concrete actions throw new
	 * io.cucumber.java.PendingException(); }
	 */

	@When("Admin\\/User\\/Staff clicks submit button with all details empty")
	public void admin_user_staff_clicks_submit_button_with_all_details_empty() {

	}

	@Then("Admin\\/User\\/Staff should see a Error message {string}")
	public void admin_user_staff_should_see_a_error_message(String string) {
		manageuser = new Manageuserclass();
		manageuser.valErrMsgDisplayed();

	}

	@When("Admin\\/User\\/Staff clicks Submit button by entering all valid values in required fields")
	public void admin_user_staff_clicks_submit_button_by_entering_all_valid_values_in_required_fields() {

	}

	@Then("Admin\\/User\\/Staff  see Success message  {string}  is  Should be Saved.")
	public void admin_user_staff_see_success_message_is_should_be_saved(String string) {
		manageuser = new Manageuserclass();
		manageuser.valsuccessMsgDisplayedassaved();
	}

//name field
	@Given("Admin\\/User\\/Staff is on \"User Details\"window")
	public void admin_user_staff_is_on_user_details_window() {

	}

	@When("Admin\\/User\\/Staff clicks on Submit button after entering  Few Field details")
	public void admin_user_staff_clicks_on_submit_button_after_entering_few_field_details() {

	}

	@Then("Admin\\/User\\/Staff see error message {string}")
	public void admin_user_staff_see_error_message(String string) {

	}
	// eMAILID

	/*
	 * @Given("Admin\\/User\\/Staff is on \"User Details\"window") public void
	 * admin_user_staff_is_on_user_details_window() { // Write code here that turns
	 * the phrase above into concrete actions throw new
	 * io.cucumber.java.PendingException(); }
	 */

	@When("Admin\\/User\\/Staff clicks on Submit button after entering wrong email address")
	public void admin_user_staff_clicks_on_submit_button_after_entering_wrong_email_address() {

	}
	// Address2 button

	// PhoneNumber
	@When("Admin\\/User\\/Staff Enters more than {int} digits")
	public void admin_user_staff_enters_more_than_digits(Integer int1) {

	}
	// POSTAL CODE

	// State

	@When("Admin\\/User\\/Staff clicks on state dropdown")
	public void admin_user_staff_clicks_on_state_dropdown() {
		manageuser = new Manageuserclass();
		manageuser.clickdropdownstate();

	}

	@Then("Admin\\/User\\/Staff see list of states in Alphabetical Order")
	public void admin_user_staff_see_list_of_states_in_alphabetical_order() {

	}

	// UG Program
	@When("Admin\\/User\\/Staff clicks on UG Program dropdown")
	public void admin_user_staff_clicks_on_ug_program_dropdown() {
		manageuser = new Manageuserclass();
		manageuser.clickUGProg();

	}

	@Then("Admin\\/User\\/Staff see list of UG Program")
	public void admin_user_staff_see_list_of_ug_program() {
		manageuser = new Manageuserclass();
		manageuser.listofUGProg();
	}
	// Validating Address line

	/*
	 * @Given("Admin\\/User\\/Staff is on \"User Details\"window") public void
	 * admin_user_staff_is_on_user_details_window() { // Write code here that turns
	 * the phrase above into concrete actions throw new
	 * io.cucumber.java.PendingException(); }
	 */

	@When("Admin\\/User\\/Staff clicks the button {string}")
	public void admin_user_staff_clicks_the_button(String string) {
		manageuser = new Manageuserclass();
		manageuser.clickaddnewuser();

	}

	@Then("Admin\\/User\\/Staff should see the input field with Label {string}")
	public void admin_user_staff_should_see_the_input_field_with_label(String string) {
		manageuser = new Manageuserclass();
		manageuser.gettextvalueafterclickedonadduser();
	}

}
