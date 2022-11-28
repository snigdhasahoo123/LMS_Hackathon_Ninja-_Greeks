package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Baseclass;
import pageObjects.BatchPage;
import pageObjects.ProgramPage;

public class BatchSD extends Baseclass {

	public ProgramPage proobj;
	public BatchPage batchobj;

	@Given("Admin\\/User\\/Staff Logged on to LMS Website")
	public void admin_user_staff_logged_on_to_lms_website() {
		batchobj.adminlogin();
		batchobj.userlogin();
		batchobj.stafflogin();

	}

	@When("Admin\\/User\\/Staff Clicks on Batch button")
	public void admin_user_staff_clicks_on_batch_button() {
		batchobj.Batchmenubutton.click();
	}

	@Then("Admin\\/User\\/Staff see header text as {string}")
	public void admin_user_staff_see_header_text_as(String ExpectedHeading) {
		batchobj.HeaderValidation(ExpectedHeading);
	}

	@When("Admin\\/User\\/Staff is on Manage Batch page")
	public void admin_user_staff_is_on_manage_batch_page() {
		batchobj.pageTitle();
	}

	@Then("Admin\\/User\\/Staff see  Footer text as {string}")
	public void admin_user_staff_see_footer_text_as(String Expectedfooter) {
		batchobj.FooterValidation(Expectedfooter);
	}

	@Then("Admin\\/User\\/Staff  see the text as {string}")
	public void admin_user_staff_see_the_text_as(String DefaultText) {
		batchobj.Paginatordefaulttext(DefaultText);
		batchobj.PaginatortextValidation();

	}

	@When("Admin\\/User\\/Staff Clicks on Enabled paginator-next button")
	public void admin_user_staff_clicks_on_enabled_paginator_next_button() {
		batchobj.Paginatornextclick();
	}

	@Then("Admin\\/User\\/Staff see Paginator text as {string}")
	public void admin_user_staff_see_paginator_text_as(String secondpagetext) {
		batchobj.PaginextValidation(secondpagetext);
	}

	@When("Admin\\/User\\/Staff Clicks on Enabled paginator -prev button")
	public void admin_user_staff_clicks_on_enabled_paginator_prev_button() {
		batchobj.PagipreviousValidation();
	}

	@When("Admin\\/User\\/Staff Clicks on Enabled paginator-last button")
	public void admin_user_staff_clicks_on_enabled_paginator_last_button() {
		batchobj.PagiLastbutton.click();
	}

	@Then("Admin\\/User\\/Staff see Page number navigated to {string}")
	public void admin_user_staff_see_page_number_navigated_to(String lastpage) {
		batchobj.entirepaginator(lastpage);
	}

	@When("Admin\\/User\\/Staff Clicks on Enabled paginator -first button")
	public void admin_user_staff_clicks_on_enabled_paginator_first_button() {
		batchobj.PagiFirstButton.click();
	}

	@Then("Admin\\/User\\/Staff see the Search Text box has text as {string}.")
	public void admin_user_staff_see_the_search_text_box_has_text_as(String firstpage) {
		firstpage = "1";
	}

	@Given("Admin\\/User\\/Staff is on Manage Batch page after logged on the LMS Website\"")
	public void admin_user_staff_is_on_manage_batch_page_after_logged_on_the_lms_website1() {
		batchobj.adminlogin();
		batchobj.userlogin();
		batchobj.stafflogin();
		batchobj.pageTitle();
	}

	@When("Admin\\/User\\/Staff enters Batch Name to be searched")
	public void admin_user_staff_enters_batch_name_to_be_searched() {
		batchobj.visibilitysearch();
		batchobj.Search.clear();
		batchobj.Search.sendKeys("SDET90");
	}

	@Then("Entries for the searched BatchName are shown.")
	public void entries_for_the_searched_batch_name_are_shown() {
		batchobj.searchBatchvalidation();
	}

	@When("Admin\\/User\\/Staff enters Batch Description to be searched")
	public void admin_user_staff_enters_batch_description_to_be_searched() {
		batchobj.Search.clear();
		batchobj.Search.sendKeys("Selenium programming");
	}

	@Then("Entries for the searched Batch Description are shown.")
	public void entries_for_the_searched_batch_description_are_shown() {
		batchobj.searchbatch_desc_validation();
	}

	@When("Admin\\/User\\/Staff enters Batch Status to be searched")
	public void admin_user_staff_enters_batch_status_to_be_searched() {
		batchobj.Search.clear();
		batchobj.Search.sendKeys("inactive");
	}

	@Then("Entries for the searched Batch status are shown")
	public void entries_for_the_searched_batch_status_are_shown() {
		batchobj.batchstatussearch();
	}

	@When("Admin\\/User\\/Staff enters No Of Classes to be searched")
	public void admin_user_staff_enters_no_of_classes_to_be_searched() {
		batchobj.Search.clear();
		batchobj.Search.sendKeys("20");
	}

	@Then("Entries for the searched No Of Classes are shown.")
	public void entries_for_the_searched_no_of_classes_are_shown() {
		batchobj.noof_classes();
	}

	@When("Admin\\/User\\/Staff enters Program Name to be searched")
	public void admin_user_staff_enters_program_name_to_be_searched() {
		batchobj.Search.clear();
		batchobj.Search.sendKeys("Java");
	}

	@Then("Entries for the searched Program Name are shown.")
	public void entries_for_the_searched_program_name_are_shown() {
		batchobj.searchpronamevalidation();
	}

	@When("Admin\\/User\\/Staff Clicks on Batch Name Ascending Arrow")
	public void admin_user_staff_clicks_on_batch_name_ascending_arrow() {
		batchobj.ClickAscecding();
	}

	@Then("Admin\\/User\\/Staff see the Batch Name displayed in Ascending order")
	public void admin_user_staff_see_the_batch_name_displayed_in_ascending_order() {
		batchobj.Ascendingbatchname();
	}

	@When("Admin\\/User\\/Staff Clicks on Batch Description Ascending Arrow")
	public void admin_user_staff_clicks_on_batch_description_ascending_arrow() {
		batchobj.batchdescasecding();
	}

	@Then("Admin\\/User\\/Staff see the Batch Description displayed in Ascending order")
	public void admin_user_staff_see_the_batch_description_displayed_in_ascending_order() {
		batchobj.AscendingbatchDesp();
	}

	@When("Admin\\/User\\/Staff Clicks on Batch Status Ascending Arrow")
	public void admin_user_staff_clicks_on_batch_status_ascending_arrow() {
		batchobj.Status_ascending();
	}

	@Then("Admin\\/User\\/Staff see the Batch Status displayed in Ascending order")
	public void admin_user_staff_see_the_batch_status_displayed_in_ascending_order() {
		batchobj.AscendingbatchStatus();
	}

	@When("Admin\\/User\\/Staff Clicks on No Of Classess Ascending Arrow")
	public void admin_user_staff_clicks_on_no_of_classess_ascending_arrow() {
		batchobj.Noofclasses_ascendingclick();
	}

	@Then("Admin\\/User\\/Staff see the No Of Classes displayed in Ascending order")
	public void admin_user_staff_see_the_no_of_classes_displayed_in_ascending_order() {
		batchobj.Ascendingbatchclasses();
	}

	@When("Admin\\/User\\/Staff Clicks on Program Name Ascending Arrow")
	public void admin_user_staff_clicks_on_program_name_ascending_arrow() {
		batchobj.pnamesortclick();
	}

	@Then("Admin\\/User\\/Staff see the Program Name displayed in Ascending order")
	public void admin_user_staff_see_the_program_name_displayed_in_ascending_order() {
		batchobj.Ascendingpname();
	}

	@When("Admin\\/User\\/Staff Clicks on Batch Name Descending  Arrow")
	public void admin_user_staff_clicks_on_batch_name_descending_arrow() {
		batchobj.ClickAscecding();
		batchobj.ClickAscecding();
	}

	@Then("Admin\\/User\\/Staff see the Batch Name displayed in Descending  order")
	public void admin_user_staff_see_the_batch_name_displayed_in_descending_order() {
		batchobj.decendingbatchname();
	}

	@When("Admin\\/User\\/Staff Clicks on Batch Description Descending  Arrow")
	public void admin_user_staff_clicks_on_batch_description_descending_arrow() {
		batchobj.batchdescasecding();
		batchobj.batchdescasecding();
	}

	@Then("Admin\\/User\\/Staff see the Batch Description displayed in Descending  order")
	public void admin_user_staff_see_the_batch_description_displayed_in_descending_order() {
		batchobj.decendingbatchDesp();
	}

	@When("Admin\\/User\\/Staff Clicks on Batch Status Descending  Arrow")
	public void admin_user_staff_clicks_on_batch_status_descending_arrow() {
		batchobj.Status_ascending();
		batchobj.Status_ascending();
	}

	@Then("Admin\\/User\\/Staff see the Batch Status displayed in Descending  order")
	public void admin_user_staff_see_the_batch_status_displayed_in_descending_order() {
		batchobj.decendingbatchStatus();
	}

	@When("Admin\\/User\\/Staff Clicks on No Of Classess Descending   Arrow")
	public void admin_user_staff_clicks_on_no_of_classess_descending_arrow() {
		batchobj.Noofclasses_ascendingclick();
		batchobj.Noofclasses_ascendingclick();
	}

	@Then("Admin\\/User\\/Staff see the No Of Classes displayed in Descending  order")
	public void admin_user_staff_see_the_no_of_classes_displayed_in_descending_order() {
		batchobj.decendingbatchclasses();
	}

	@When("Verify Program Name are displayed in Descending order")
	public void verify_program_name_are_displayed_in_descending_order() {
		batchobj.pnamesortclick();
		batchobj.pnamesortclick();
		batchobj.decendingpname();

	}

	@Then("Admin\\/User\\/Staff counts number of rows as {int} in a table")
	public void admin_user_staff_counts_number_of_rows_as_in_a_table(Integer rowcount) {
		batchobj.countrows(rowcount);
	}

	@Given("Admin is on Manage Batch page after Logged on to the LMS Website")
	public void admin_is_on_manage_batch_page_after_logged_on_to_the_lms_website() {
		batchobj.adminlogin();
		batchobj.userlogin();
		batchobj.stafflogin();
		batchobj.pageTitle();
	}

	@When("Admin Clicks on  {string} button")
	public void admin_clicks_on_button(String Button) {
		batchobj.clicknewbatch(Button);
	}

	@Then("Admin see header text as {string}")
	public void admin_see_header_text_as(String Newheading) {
		batchobj.NewbatchHeading(Newheading);
	}

	@Given("Admin Clicks on  {string} button")
	public void admin_clicks_on_button1(String Button) {
		batchobj.clicknewbatch(Button);
	}

	@When("Admin Clicks on Save Button with out entering  details")
	public void admin_clicks_on_save_button_with_out_entering_details() {
		batchobj.clicksave();
	}

	@Then("Admin see Error message {string}")
	public void admin_see_error_message(String Error) {
		batchobj.Errormsg(Error);
		Error = batchobj.errormsg.getText();
	}

	@When("Admin Clicks on Save Button after entering Name alone")
	public void admin_clicks_on_save_button_after_entering_name_alone() {
		batchobj.NewBatch.click();
		batchobj.BatchnameforNew.sendKeys("Sdet85");
		batchobj.savenewbatch.click();
		batchobj.Emsg();
	}

	@When("Admin Clicks on Save Button after entering Description alone")
	public void admin_clicks_on_save_button_after_entering_description_alone() {
		batchobj.NewBatch.click();
		batchobj.Newbatchdesc.sendKeys("seleniumprograming");
		batchobj.savenewbatch.click();
		batchobj.Emsg();
	}

	@When("Admin Clicks on DropDown Menu")
	public void admin_clicks_on_drop_down_menu() {
		batchobj.NewBatch.click();
		batchobj.Dropdown_fornewpro.click();
	}

	@Then("Admin see list of all Program Names")
	public void admin_see_list_of_all_program_names() {
		batchobj.dropdown_forpronames();

	}

	@Given("Admin Clicks on  {string} button And  Clicks on DropDown Menu in Batch Details window")
	public void admin_clicks_on_button_and_clicks_on_drop_down_menu_in_batch_details_window(String Button) {
		batchobj.clicknewbatch(Button);
		batchobj.Dropdown_fornewpro.click();
	}

	@When("Admin Clicks on Save button after selecting a Program Name only from the dropdown")
	public void admin_clicks_on_save_button_after_selecting_a_program_name_only_from_the_dropdown() {
		batchobj.NewBatch.click();
		batchobj.NewProname.sendKeys("Java");
		batchobj.savenewbatch.click();
		batchobj.Emsg();
	}

	@When("Admin Clicks on Save Button after selecting Status alone")
	public void admin_clicks_on_save_button_after_selecting_status_alone() {
		batchobj.NewBatch.click();
		batchobj.Newbatchtatus.sendKeys("inactive");
		batchobj.savenewbatch.click();
		batchobj.Emsg();

	}

	@When("Admin Clicks on Save Button after entering only Number Of Classes")
	public void admin_clicks_on_save_button_after_entering_only_number_of_classes() {
		batchobj.NewBatch.click();
		batchobj.Newnoof_classes.sendKeys("20");
		batchobj.savenewbatch.click();
		batchobj.Emsg();
	}

	@When("Admin Clicks on Save Button after entering all details")
	public void admin_clicks_on_save_button_after_entering_all_details() {
		batchobj.NewBatch.click();
		batchobj.BatchnameforNew.sendKeys("Sdet85");
		batchobj.Newbatchdesc.sendKeys("seleniumprograming");
		batchobj.Newbatchtatus.sendKeys("inactive");
		batchobj.Newnoof_classes.sendKeys("20");
		batchobj.NewProname.sendKeys("Java");
		batchobj.savenewbatch.click();
	}

	@Then("Admin see Success message {string}")
	public void admin_see_success_message(String Success) {
		batchobj.Successmsg(Success);
	}

	@When("Admin Clicks on Cancel button")
	public void admin_clicks_on_cancel_button() {
		batchobj.NewBatch.click();
		batchobj.BatchnameforNew.sendKeys("Sdet85");
		batchobj.Newbatchdesc.sendKeys("seleniumprograming");
		batchobj.Newbatchtatus.sendKeys("inactive");
		batchobj.Newnoof_classes.sendKeys("20");
		batchobj.NewProname.sendKeys("Java");
		batchobj.Cancelnewbatch.click();
	}

	@Then("Admin see a Batch Details window getting closed")
	public void admin_see_a_batch_details_window_getting_closed() {
		batchobj.newheadindvalidation();
	}

	@Given("Admin\\/User\\/Staff is on Manage Program page after they logged on the LMS Website")
	public void admin_user_staff_is_on_manage_program_page_after_they_logged_on_the_lms_website() {
		batchobj.adminlogin();
		batchobj.userlogin();
		batchobj.stafflogin();
		batchobj.pageTitle();
	}

	@When("Admin\\/User\\/Staff Enters newly added  Batch Name in Search")
	public void admin_user_staff_enters_newly_added_batch_name_in_search() {
		batchobj.Search.clear();
		batchobj.Search.sendKeys("Newly added");
	}

	@Then("Entry for the newly added Batch Name is shown")
	public void entry_for_the_newly_added_batch_name_is_shown() {
		batchobj.addedBatchsearch();
	}

	@Given("User\\/Staff is on Manage Batch page after logged on to LMs WebSite")
	public void user_staff_is_on_manage_batch_page_after_logged_on_to_l_ms_web_site() {
		batchobj.userlogin();
		batchobj.stafflogin();
		batchobj.pageTitle();
	}

	@When("User\\/Staff Clicks on  {string} button")
	public void user_staff_clicks_on_button(String Button) {
		batchobj.clicknewbatch(Button);
	}

	@Then("User\\/Staff see a Error message {string}")
	public void user_staff_see_a_error_message(String noright) {
		batchobj.Norighterrormsg(noright);
	}

	@Given("Admin is on Manage Batch page after logged on to the LMS Website")
	public void admin_is_on_manage_batch_page_after_logged_on_to_the_lms_website2() {
		batchobj.adminlogin();
		batchobj.pageTitle();
	}

	@When("Admin Clicks on Edit buttton")
	public void admin_clicks_on_edit_buttton() {
		batchobj.clickchEdit();
		batchobj.newheadindvalidation();
	}

	@When("Admin Clicks on Save Button after updating Name")
	public void admin_clicks_on_save_button_after_updating_name() {
		batchobj.clickchEdit();
		batchobj.BatchnameforNew.sendKeys("DAML2");
		batchobj.savenewbatch.click();
		batchobj.smsg();
	}

	@When("Admin Clicks on Save Button after updating Description")
	public void admin_clicks_on_save_button_after_updating_description() {
		batchobj.clickchEdit();
		batchobj.Newbatchdesc.sendKeys("Tableau");
		batchobj.savenewbatch.click();

	}

	@Then("Admin see Success message\"Updated Description\"")
	public void admin_see_success_message_updated_description() {
		batchobj.smsg();
	}

	@When("Admin Clicks on Save Button after updating Status")
	public void admin_clicks_on_save_button_after_updating_status() {
		batchobj.clickchEdit();
		batchobj.Newbatchtatus.sendKeys("Active");
		batchobj.savenewbatch.click();
		batchobj.smsg();

	}

	@When("Admin Clicks on Save Button after updating No Of Classes")
	public void admin_clicks_on_save_button_after_updating_no_of_classes() {
		batchobj.clickchEdit();
		batchobj.Newnoof_classes.sendKeys("10");
		batchobj.savenewbatch.click();
		batchobj.smsg();

	}

	@When("Admin Clicks on Cancel button")
	public void admin_clicks_on_cancel_button1() {
		batchobj.clickchEdit();
		batchobj.Cancelnewbatch.click();
		batchobj.newheadindvalidation();
	}

	@Given("Admin\\/User\\/Staff is on Manage Batch page after logged on to the LMs Website")
	public void admin_user_staff_is_on_manage_batch_page_after_logged_on_to_the_l_ms_website() {
		batchobj.adminlogin();
		batchobj.userlogin();
		batchobj.stafflogin();
		batchobj.pageTitle();
	}

	@When("Admin\\/User\\/Staff  Enters edited Batch Name\\/Batch Description in Search")
	public void admin_user_staff_enters_edited_batch_name_batch_description_in_search() {
		batchobj.Batchnameinsearch();
		batchobj.BatchdescSearch();
	}

	@Then("Entry for the edited  Batch Name\\/Batch Description is shown")
	public void entry_for_the_edited_batch_name_batch_description_is_shown() {
		batchobj.searchbatch_desc_validation();
		batchobj.searchBatchvalidation();
	}

	@Given("User\\/Staff is on Manage Batch page after logged on the LMS Website")
	public void user_staff_is_on_manage_batch_page_after_logged_on_the_lms_website() {
		batchobj.userlogin();
		batchobj.stafflogin();
		batchobj.pageTitle();
	}

	@When("User\\/Staff Clicks on Edit buttton")
	public void user_staff_clicks_on_edit_buttton() {
		batchobj.clickchEdit();
	}

	@Then("User\\/Staff see a Error message  {string}")
	public void user_staff_see_a_error_message2(String noright) {
		batchobj.Norighterrormsg(noright);
	}

	@Given("Admin is on Manage Batch page after Looged ono the LMs website")
	public void admin_is_on_manage_batch_page_after_looged_ono_the_l_ms_website() {
		batchobj.adminlogin();
		batchobj.pageTitle();

	}

	@When("Admin Clicks on any Delete button located on the right side")
	public void admin_clicks_on_any_delete_button_located_on_the_right_side() {
		batchobj.clickdel();
		batchobj.Headerdelte();
	}

	@Given("Admin Clicks on any Delete button located on the right side after entering in to the ManageBatch Page")
	public void admin_clicks_on_any_delete_button_located_on_the_right_side_after_entering_in_to_the_manage_batch_page() {
		batchobj.clickdel();
		batchobj.Headerdelte();
	}

	@When("Admin Clicks on Yes  button")
	public void admin_clicks_on_yes_button() {
		batchobj.delyes.click();
	}

	@When("Admin Clicks on No button")
	public void admin_clicks_on_no_button() {
		batchobj.clickdel();
		batchobj.delno.click();
	}

	@Then("Admin can see Program Name not deleted")
	public void admin_can_see_program_name_not_deleted() {
		batchobj.Search.sendKeys("not deleted");
		batchobj.search_elpro();
	}

	@Given("Admin\\/User\\/Staff  is on Manage Batch page")
	public void admin_user_staff_is_on_manage_batch_page1() {
		batchobj.adminlogin();
		batchobj.userlogin();
		batchobj.stafflogin();
		batchobj.pageTitle();
	}

	@When("Admin\\/User\\/Staff Enters deleted  Program Name in Search")
	public void admin_user_staff_enters_deleted_program_name_in_search() {
		batchobj.Search.sendKeys("deleted");
	}

	@Then("Admin\\/User\\/Staff finds no results")
	public void admin_user_staff_finds_no_results() {
		batchobj.search_elpro();
	}

	@Given("User\\/Staff is on Manage Batch page afte logged on the LMS Webpage")
	public void user_staff_is_on_manage_batch_page_afte_logged_on_the_lms_webpage() {
		batchobj.userlogin();
		batchobj.stafflogin();
		batchobj.pageTitle();
	}

	@When("User\\/Staff Clicks on Delete buttton")
	public void user_staff_clicks_on_delete_buttton() {
		batchobj.userlogin();
		batchobj.stafflogin();
		batchobj.pageTitle();
		batchobj.clickdel();
		batchobj.Emsg();
	}

	@When("Admin\\/User\\/Staff is on Manage batch page")
	public void admin_user_staff_is_on_manage_batch_page2() {
		batchobj.adminlogin();
		batchobj.userlogin();
		batchobj.stafflogin();
		batchobj.pageTitle();
	}

	@Then("Admin\\/User\\/Staff see the Delete button on the top left hand side as Disabled")
	public void admin_user_staff_see_the_delete_button_on_the_top_left_hand_side_as_disabled() {
		batchobj.Multipledeleteicon();
	}

	@When("Admin\\/User\\/Staff selects more than one Batch Name using checkbox")
	public void admin_user_staff_selects_more_than_one_batch_name_using_checkbox() {
		batchobj.MainCheckbox.click();

	}

	@Then("Admin\\/User\\/Staff see the Delete button on the top left hand side as Enabled")
	public void admin_user_staff_see_the_delete_button_on_the_top_left_hand_side_as_enabled() {
		batchobj.Multipledeleteicon();

	}

	@Given("Admin selects more than one Batch Name using checkbox after entered in to ManageBatch Page")
	public void admin_selects_more_than_one_batch_name_using_checkbox_after_entered_in_to_manage_batch_page() {
		batchobj.adminlogin();
		batchobj.pageTitle();
		batchobj.MainCheckbox.click();
	}

	@When("Admin Clicks on Enabled Delete button on the top left hand side")
	public void admin_clicks_on_enabled_delete_button_on_the_top_left_hand_side() {
		batchobj.clickmultipledeletebutton();
	}

	@Given("Admin Clicks on Enabled Delete button after selecting  more than one Batch Name")
	public void admin_clicks_on_enabled_delete_button_after_selecting_more_than_one_batch_name() {
		batchobj.clickMultiplecheckbox();
		batchobj.clickmultipledeletebutton();
		batchobj.delwindowconfirm();
		batchobj.delwindowcancel();

	}

	@Then("Admin can see Program Names not deleted")
	public void admin_can_see_program_names_not_deleted() {
		batchobj.looking_deletepro();
	}

	@When("dmin\\/User\\/Staff Enters deleted  Program Names in Search")
	public void dmin_user_staff_enters_deleted_program_names_in_search() {
		batchobj.clickMultiplecheckbox();
		batchobj.clickmultipledeletebutton();
		batchobj.delwindowconfirm();
		batchobj.smsg();
		batchobj.Search.sendKeys("program");
		batchobj.looking_deletepro();
	}

	@Given("User\\/Staff selects more than one Batch  Name using checkbox after they entered in to ManageBatch page")
	public void user_staff_selects_more_than_one_batch_name_using_checkbox_after_they_entered_in_to_manage_batch_page() {
		batchobj.userlogin();
		batchobj.stafflogin();
		batchobj.clickMultiplecheckbox();
	}

	@When("User\\/Staff Cicks on Enabled Delete button on the top left hand side")
	public void user_staff_cicks_on_enabled_delete_button_on_the_top_left_hand_side() {
		batchobj.clickmultipledeletebutton();

	}

	@Then("User/Staff see a Error message \"Only Admin have Access\"")
	public void user_staff_see_a_error_message4(String noright) {
		batchobj.Norighterrormsg(noright);
	}

	@Given("Admin\\/User\\/Staff is on Manage batch page after logged on the LMS WebPage")
	public void admin_user_staff_is_on_manage_batch_page_after_logged_on_the_lms_web_page() {
		batchobj.adminlogin();
		batchobj.userlogin();
		batchobj.stafflogin();
		batchobj.pageTitle();
	}

	@When("Admin\\/User\\/Staff Selects First checkbox left to Batch Name")
	public void admin_user_staff_selects_first_checkbox_left_to_batch_name() {
		batchobj.clickMultiplecheckbox();
	}

	@Then("Admin\\/User\\/Staff see all the checkboxes in the Batch page get selected")
	public void admin_user_staff_see_all_the_checkboxes_in_the_batch_page_get_selected() {
		batchobj.Multiplecheckbox_selectionvalidation();
	}

}
