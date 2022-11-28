package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Baseclass;
import pageObjects.ProgramPage;

public class ProgramSD extends Baseclass {
	public ProgramPage proobj;

	@Given("Admin\\/User\\/Staff  Logged on to LMS Website")
	public void admin_user_staff_logged_on_to_lms_website() {
		proobj.adminlogin();
		proobj.userlogin();
		proobj.stafflogin();
	}

	@When("Admin\\/User\\/Staff  is on Manage Program page")
	public void admin_user_staff_is_on_manage_program_page() {
		proobj.pageTitle();
	}

	@Then("Admin\\/User\\/Staff see header text as {string}")
	public void admin_user_staff_see_header_text_as(String ExpectedHeading) {
		proobj.HeaderValidation(ExpectedHeading);
	}

	@Then("Admin\\/User\\/Staff see  Footer text as {string}")
	public void admin_user_staff_see_footer_text_as(String Expectedfooter) {
		proobj.FooterValidation(Expectedfooter);
	}

	@When("Admin\\/User\\/Staff Clicks on Enabled paginator-Previous button")
	public void admin_user_staff_clicks_on_enabled_paginator_Previous_button() {
		proobj.PagisinglePreviousButton.click();
	}

	@Then("Admin\\/User\\/Staff  see the text as {string}")
	public void admin_user_staff_see_the_text_as(String DefaultText) {
		proobj.Paginatordefaulttext(DefaultText);

	}

	@When("Admin\\/User\\/Staff Clicks on Enabled paginator-next button")
	public void admin_user_staff_clicks_on_enabled_paginator_next_button() {
		proobj.Paginatornextclick();
	}

	@Then("Admin\\/User\\/Staff see Paginator text as {string}")
	public void admin_user_staff_see_paginator_text_as(String secondpagetext) {
		proobj.PaginextValidation(secondpagetext);
	}

	@When("Admin\\/User\\/Staff Clicks on Enabled paginator -prev button")
	public void admin_user_staff_clicks_on_enabled_paginator_prev_button() {
		proobj.PagipreviousValidation();
	}

	@When("Admin\\/User\\/Staff Clicks on Enabled paginator-last button")
	public void admin_user_staff_clicks_on_enabled_paginator_last_button() {
		proobj.PagiLastbutton.click();
	}

	@Then("Admin\\/User\\/Staff see Page number navigated to {string}")
	public void admin_user_staff_see_page_number_navigated_to(String lastpage) {
		proobj.entirepaginator(lastpage);
	}

	@When("Admin\\/User\\/Staff Clicks on Enabled paginator -first button")
	public void admin_user_staff_clicks_on_enabled_paginator_first_button() {
		proobj.PagiFirstButton.click();
		String firstpage = "1";
	}

	@Then("Admin\\/User\\/Staff see the Search Text box has text as {string}.")
	public void admin_user_staff_see_the_search_text_box_has_text_as(String search) {
		proobj.visibilitysearch();

	}

	@When("Admin\\/User\\/Staff enters Program Name to be searched")
	public void admin_user_staff_enters_program_name_to_be_searched() {
		proobj.Programnameinsearch();
	}

	@Then("Entries for the searched Program Name are shown.")
	public void entries_for_the_searched_program_name_are_shown() {
		proobj.searchpronamevalidation();
	}

	@When("Admin\\/User\\/Staff enters Program Description to be searched")
	public void admin_user_staff_enters_program_description_to_be_searched() {
		proobj.ProdescSearch();
	}

	@Then("Entries for the searched Program Description are shown.")
	public void entries_for_the_searched_program_description_are_shown() {
		proobj.searchprodescvalidation();
	}

	@When("Admin\\/User\\/Staff enters Program Status to be searched")
	public void admin_user_staff_enters_program_status_to_be_searched() {
		proobj.searchstatus();
	}

	@Then("Entries for the searched Program Status are shown.")
	public void entries_for_the_searched_program_status_are_shown() {
		proobj.Prostatussearch();
	}

	@When("Admin\\/User\\/Staff Clicks on Program Name Ascending Arrow")
	public void admin_user_staff_clicks_on_program_name_ascending_arrow() {
		proobj.ClickAscecding();
	}

	@Then("Admin\\/User\\/Staff see the Program Name displayed in Ascending order")
	public void admin_user_staff_see_the_program_name_displayed_in_ascending_order() {
		proobj.Ascendingproname();
	}

	@When("Admin\\/User\\/Staff Clicks on Program Description Ascending Arrow")
	public void admin_user_staff_clicks_on_program_description_ascending_arrow() {
		proobj.Prodescasecding();
	}

	@Then("Admin\\/User\\/Staff see the Program Description displayed in Ascending order")
	public void admin_user_staff_see_the_program_description_displayed_in_ascending_order() {
		proobj.AscendingProDesp();
	}

	@When("Admin\\/User\\/Staff Clicks on Program Status Ascending Arrow")
	public void admin_user_staff_clicks_on_program_status_ascending_arrow() {
		proobj.Status_ascending();
	}

	@Then("Admin\\/User\\/Staff see the Program Status displayed in Ascending order")
	public void admin_user_staff_see_the_program_status_displayed_in_ascending_order() {
		proobj.AscendingProStatus();
	}

	@When("Admin\\/User\\/Staff Clicks on Program Name Descending Arrow")
	public void admin_user_staff_clicks_on_program_name_descending_arrow() {
		proobj.clickdecending_proname();
	}

	@Then("Admin\\/User\\/Staff see the Program Name displayed in Descending order")
	public void admin_user_staff_see_the_program_name_displayed_in_descending_order() {
		proobj.decenpro_Name();
	}

	@When("Admin\\/User\\/Staff Clicks on Program Description Descending Arrow")
	public void admin_user_staff_clicks_on_program_description_descending_arrow() {
		proobj.Deceding_prodesc();
	}

	@Then("Admin\\/User\\/Staff see the Program Description displayed in Descending order")
	public void admin_user_staff_see_the_program_description_displayed_in_descending_order() {
		proobj.DecenPro_des();
	}

	@When("Admin\\/User\\/Staff Clicks on Program Status Descending Arrow")
	public void admin_user_staff_clicks_on_program_status_descending_arrow() {
		proobj.decen_proStatus();
	}

	@Then("Admin\\/User\\/Staff see the Program Status displayed in Descending order")
	public void admin_user_staff_see_the_program_status_displayed_in_descending_order() {
		proobj.DecenPro_Status();
	}

	@Given("Admin is on Manage Program page")
	public void admin_is_on_manage_program_page() {
		proobj.pageTitle();
	}

	@When("Admin Clicks on  {string} button")
	public void admin_clicks_on_button(String Button) {
		proobj.clicknewpro(Button);
	}

	@Then("Admin see header text as {string}")
	public void admin_see_header_text_as(String Newproheading) {
		proobj.NewproHeading(Newproheading);
	}

	@Given("Admin Clicks on {string} button")
	public void admin_clicks_on_button2(String Button) {
		proobj.clicknewpro(Button);
	}

	@When("Admin Clicks on Save Button with out entering  details")
	public void admin_clicks_on_save_button_with_out_entering_details() {
		proobj.clicksave();
	}

	@Then("Admin see Error message {string}")
	public void admin_see_error_message(String Error) {
		proobj.Errormsg(Error);
	}

	@When("Admin Clicks on Save Button after entering all details")
	public void admin_clicks_on_save_button_after_entering_all_details() {
		proobj.validatetheformwithdetails();
	}

	@Then("Admin see Success message {string}")
	public void admin_see_success_message(String Success) {
		proobj.Successmsg(Success);
	}

	@When("Admin Clicks on Save Button after entering Name alone")
	public void admin_clicks_on_save_button_after_entering_name_alone() {
		proobj.clickingnpro();
		proobj.newproname();
		proobj.clicksave();
		proobj.Emsg();

	}

	@When("Admin Clicks on Save Button after entering Description alone")
	public void admin_clicks_on_save_button_after_entering_description_alone() {
		proobj.clickingnpro();
		proobj.newprodesc();
		proobj.clicksave();
		proobj.Emsg();

	}

	@When("Admin Clicks on Save Button after selecting Status alone")
	public void admin_clicks_on_save_button_after_selecting_status_alone() {
		proobj.clickingnpro();
		proobj.newprosta();
		proobj.clicksave();
		proobj.Emsg();
	}

	@When("Admin Clicks on Cancel button")
	public void admin_clicks_on_cancel_button() {
		proobj.clickingnpro();
		proobj.clickcancel();
	}

	@Then("Admin see a Program Details window getting closed")
	public void admin_see_a_program_details_window_getting_closed() {
		proobj.newheadindvalidation();

	}

	@When("Admin\\/User\\/Staff Enters newly added  Program Name in Search")
	public void admin_user_staff_enters_newly_added_program_name_in_search() {
		proobj.Search.sendKeys("newlyadded");
	}

	@Then("Entry for the newly added Program Name is shown")
	public void entry_for_the_newly_added_program_name_is_shown() {
		proobj.addedprosearch();
	}

	@Given("User\\/Staff is on Manage Program page")
	public void user_staff_is_on_manage_program_page() {
		proobj.pageTitle();
	}

	@When("User\\/Staff Clicks on  {string} button")
	public void user_staff_clicks_on_button(String Button) {
		proobj.clicknewpro(Button);
	}

	@Then("User\\/Staff see a Error message {string}")
	public void user_staff_see_a_error_message(String noright) {
		proobj.Norighterrormsg(noright);

	}

	@Given("Admin\\/User\\/Staff Logged on to LMS Website")
	public void admin_user_staff_logged_on_to_lms_website2() {
		proobj.adminlogin();
		proobj.userlogin();
		proobj.stafflogin();
	}

	@Then("Admin\\/User\\/Staff counts number of rows as {int} in a table")
	public void admin_user_staff_counts_number_of_rows_as_in_a_table(Integer rowcount) {
		proobj.countrows(rowcount);
	}

	@When("Admin Clicks on Edit buttton")
	public void admin_clicks_on_edit_buttton() {
		proobj.clickchEdit();

	}

	@When("Admin Clicks on Save Button after updating Name")
	public void admin_clicks_on_save_button_after_updating_name() {
		proobj.newproname();
		proobj.clicksave();
		proobj.smsg();

	}

	@When("Admin  Clicks on Save Button after updating  Description")
	public void admin_clicks_on_save_button_after_updating_description() {
		proobj.clickchEdit();
		proobj.newprodesc();
		proobj.clicksave();

	}

	@Then("Admin see Success message\"Updated Description\"")
	public void admin_see_success_message_updated_description() {
		proobj.smsg();
	}

	@When("Admin  Clicks on Save Button after Changing  status")
	public void admin_clicks_on_save_button_after_changing_status() {
		proobj.clickchEdit();
		proobj.newprosta();
		proobj.clicksave();
		proobj.smsg();
	}

	@When("Admin\\/User\\/Staff Enters edited Program Name in Search")
	public void admin_user_staff_enters_edited_program_name_in_search() {
		proobj.Search.sendKeys("edited");

	}

	@Then("Entry for the edited  Program Name is shown")
	public void entry_for_the_edited_program_name_is_shown() {
		proobj.lookingeditedresults();
	}

	@When("User\\/Staff Clicks on Edit buttton")
	public void user_staff_clicks_on_edit_buttton() {
		proobj.clickchEdit();

	}

	@Then("User\\/Staff see a Error message  {string}")
	public void user_staff_see_a_error_message2(String noright) {
		proobj.Norighterrormsg(noright);
	}

	@When("Admin Clicks on any Delete button located on the right side")
	public void admin_clicks_on_any_delete_button_located_on_the_right_side() {
		proobj.clickdel();

	}

	@When("Admin Clicks on Yes  button")
	public void admin_clicks_on_yes_button() {
		proobj.delwindowconfirm();
	}

	@Then("Admin see Success message \"Program Deleted Succesfully\"")
	public void Admin_see_Success_message() {
		proobj.smsg();
	}

	@When("Admin Clicks on No button")
	public void admin_clicks_on_no_button() {
		proobj.clickdel();
		proobj.delwindowcancel();
	}

	@Then("Admin can see Program Name not deleted")
	public void admin_can_see_program_name_not_deleted() {
		proobj.Search.sendKeys("proname");
		proobj.looking_deletepro();
	}

	@When("Admin\\/User\\/Staff Enters deleted  Program Name in Search")
	public void admin_user_staff_enters_deleted_program_name_in_search() {
		proobj.Search.sendKeys("proname");
		proobj.looking_deletepro();
	}

	@Then("Admin\\/User\\/Staff finds no results")
	public void admin_user_staff_finds_no_results() {
		proobj.looking_deletepro();
	}

	@When("User\\/Staff Clicks on Delete buttton")
	public void user_staff_clicks_on_delete_buttton() {
		proobj.delwindowconfirm();
	}

	@Then("User/Staff see a Error message \"Only Admin have Access\"")
	public void user_staff_see_a_error_message3(String noright) {
		proobj.Norighterrormsg(noright);
	}

	@Given("Admin\\/User\\/Staff Logged on to LMS Website")
	public void admin_user_staff_logged_on_to_lms_website3() {
		proobj.adminlogin();
		proobj.userlogin();
		proobj.stafflogin();
	}

	@When("Admin\\/User\\/Staff is on Manage Program page")
	public void admin_user_staff_is_on_manage_program_page3() {
		proobj.pageTitle();
	}

	@Then("Admin\\/User\\/Staff see the Delete button on the top left hand side as Disabled")
	public void admin_user_staff_see_the_delete_button_on_the_top_left_hand_side_as_disabled() {
		proobj.Multipledeleteicon();
	}

	@When("Admin\\/User\\/Staff selects more than one Program Name using checkbox")
	public void admin_user_staff_selects_more_than_one_program_name_using_checkbox() {
		proobj.clickMultiplecheckbox();
	}

	@Then("Admin\\/User\\/Staff see the Delete button on the top left hand side as Enabled")
	public void admin_user_staff_see_the_delete_button_on_the_top_left_hand_side_as_enabled() {
		proobj.Multiplecheckboxenable();
	}

	@Given("Admin selects more than one Program Name using checkbox")
	public void admin_selects_more_than_one_program_name_using_checkbox() {
		proobj.clickMultiplecheckbox();
	}

	@When("Admin Clicks on Enabled Delete button on the top left hand side")
	public void admin_clicks_on_enabled_delete_button_on_the_top_left_hand_side() {
		proobj.clickmultipledeletebutton();
		proobj.delwindowconfirm();
	}

	@Then("Admin see header text as \"Delete Confirm\"")
	public void admin_see_header_text_as_delete_confirm() {
		proobj.multipledeldialogboxheader();
	}

	@Given("Admin Clicks on Enabled Delete button after selecting  more than one Program Name")
	public void admin_clicks_on_enabled_delete_button_after_selecting_more_than_one_program_name() {
		proobj.clickMultiplecheckbox();
		proobj.clickmultipledeletebutton();

	}

	@When("Admin Clicks on Yes  button")
	public void admin_clicks_on_yes_button2() {
		proobj.delwindowconfirm();
		proobj.smsg();
	}

	@When("Admin\\/User\\/Staff Enters deleted  Program Names in Search")
	public void admin_user_staff_enters_deleted_program_names_in_search() {
		proobj.Search.sendKeys("program");
	}

	@Then("Admin/User/Staff finds no results")
	public void admin_user_staff_finds_no_results1() {
		proobj.looking_deletepro();
	}

	@Given("User\\/Staff selects more than one Program Name using checkbox after User\\/Staff\\/ Logged on to LMS Website")
	public void user_staff_selects_more_than_one_program_name_using_checkbox_after_user_staff_logged_on_to_lms_website() {
		proobj.userlogin();
		proobj.stafflogin();
		proobj.clickMultiplecheckbox();
	}

	@When("User\\/Staff Clicks on Enabled Delete button on the top left hand side")
	public void user_staff_clicks_on_enabled_delete_button_on_the_top_left_hand_side() {
		proobj.clickmultipledeletebutton();

	}

	@Then("User/Staff see a Error message \"Only Admin have Access\"")
	public void user_staff_see_a_error_message4(String noright) {
		proobj.Norighterrormsg(noright);
	}

	@When("Admin/User/Staff Selects First checkbox left to Program Name")
	public void Admin_user_staff_selects_First_Checkbox_left_to_Program_Name_after_Admin_User_Staff_Logged_on_to_lms_Website() {
		proobj.adminlogin();
		proobj.userlogin();
		proobj.stafflogin();
		proobj.clickMultiplecheckbox();

	}

	@Then("Admin\\/User\\/Staff see all the checkboxes in the Program page get selected")
	public void Admin_user_staff_see_all_the_checkboes_in_the_Program_page_get_selected() {
		proobj.clickMultiplecheckbox();
		proobj.Multiplecheckbox_selectionvalidation();

	}

}
