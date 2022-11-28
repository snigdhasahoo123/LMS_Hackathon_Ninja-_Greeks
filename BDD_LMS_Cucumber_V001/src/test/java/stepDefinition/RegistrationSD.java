package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Baseclass;
import pageObjects.RegistrationPage;

public class RegistrationSD extends Baseclass {
	RegistrationPage Registrationobj;

	@Given("Admin\\/User\\/Staff Navigated to LMS website")
	public void admin_user_staff_navigated_to_lms_website() {
		Registrationobj.openedlmswebsite();
	}

	@When("Admin\\/User\\/Staff lands on Registration page")
	public void admin_user_staff_lands_on_registration_page() {
		Registrationobj.gettitle();
	}

	@Then("Admin\\/User\\/Staff sees the heading on the form as {string}")
	public void admin_user_staff_sees_the_heading_on_the_form_as(String Heading) {
		Registrationobj.getRegisterpageTitle(Heading);
	}

	@Given("Admin\\/User\\/Staff is on the Registeration Page")
	public void admin_user_staff_is_on_the_registeration_page() {
		Registrationobj.gettitle();
	}

	@When("Admin\\/User\\/Staff selects the Log in button")
	public void admin_user_staff_selects_the_log_in_button() {
		Registrationobj.Clickloginbutton();

	}

	@Then("Admin\\/User\\/Staff lands on Log in page")
	public void admin_user_staff_lands_on_log_in_page() {
		// Loginonj.gettitle();
	}

	@Then("Admin\\/User\\/Staff sees a Signupbutton")
	public void admin_user_staff_sees_a_signup_button() {
		Registrationobj.openedlmswebsite();
		Registrationobj.Signupvisibility();
	}

	@When("Admin\\/User\\/Staff Enters the First Name in Alphabets only")
	public void admin_user_staff_enters_the_first_name_in_alphabets_only(String firstname) {
		Registrationobj.getFirstname(firstname);
	}

	@Then("The First Name will be displayed")
	public void the_first_name_will_be_displayed() {
		String Firstname = Registrationobj.Lastname.getAttribute("value");
		System.out.println(Firstname);
	}

	@When("Admin\\/User\\/Staff Enters the Last Name in Alphabets only")
	public void admin_user_staff_enters_the_last_name_in_alphabets_only(String lastname) {
		Registrationobj.getlastname(lastname);

	}

	@Then("The Last Name will be displayed")
	public void the_last_name_will_be_displayed() {
		String Lastname = Registrationobj.Lastname.getAttribute("value");
		System.out.println(Lastname);
	}

	@When("Admin\\/User\\/Staff Enters the {string} using Alpha Numerics and \\/or Symbols")
	public void admin_user_staff_enters_the_using_alpha_numerics_and_or_symbols(String address) {
		Registrationobj.getAddress(address);
	}

	@Then("The Address will be displayed")
	public void the_address_will_be_displayed() {
		String Address = Registrationobj.Address.getAttribute("value");
		System.out.println(Address);
	}

	@When("Admin\\/User\\/Staff Enters the {string} Field using Alpha Numerics and or Symbols")
	public void admin_user_staff_enters_the_field_using_alpha_numerics_and_or_symbols(String streetaddress) {
		Registrationobj.getstreetname(streetaddress);
	}

	@Then("The Street Name will be displayed")
	public void the_street_name_will_be_displayed() {
		String streetaddress = Registrationobj.Streetaddress.getAttribute("value");
		System.out.println(streetaddress);
	}

	@When("Admin\\/User\\/Staff Enters the {string} using Numbers only")
	public void admin_user_staff_enters_the_using_numbers_only(String Zcode) {
		Registrationobj.getZipcode(Zcode);
	}

	@Then("The Zip code will be displayed")
	public void the_zip_code_will_be_displayed() {
		String Zcode = Registrationobj.Streetaddress.getAttribute("value");
		System.out.println(Zcode);

	}

	@When("Admin\\/User\\/Staff Enters the {string} in Alphabets only")
	public void admin_user_staff_enters_the_in_alphabets_only(String City) {
		Registrationobj.getcity(City);
	}

	@Then("The City will be displayed")
	public void the_city_will_be_displayed() {
		String City = Registrationobj.city.getAttribute("value");
		System.out.println(City);
	}

	@When("Admin\\/User\\/Staff selects the respective State Name from the DropBox")
	public void admin_user_staff_selects_the_respective_state_name_from_the_drop_box() {
		Registrationobj.getState();
		Registrationobj.drpstate.selectByVisibleText("United States");
	}

	@Then("The State Name will be displayed")
	public void the_state_name_will_be_displayed() {
		String currentstate = Registrationobj.State.getAttribute("value");
		System.out.println(currentstate);
	}

	@When("Admin\\/User\\/Staff Enters the valid {int} digit Mobile number in Numerics")
	public void admin_user_staff_enters_the_valid_digit_mobile_number_in_numerics(Integer phono) {
		Registrationobj.getphonenumber(phono);
	}

	@Then("The Mobile Number will be displayed")
	public void the_mobile_number_will_be_displayed() {
		String phono = Registrationobj.Phonenumber.getAttribute("value");
		System.out.println(phono);
	}

	@When("Admin\\/User\\/Staff Selects the Date of Birth from the Calender")
	public void admin_user_staff_selects_the_date_of_birth_from_the_calender() {
		Registrationobj.Dateofbirth.click();
		Registrationobj.selectYear.selectByVisibleText("1989");
		Registrationobj.selectMonth.selectByVisibleText("August");
		Registrationobj.Date.click();

	}

	@Then("Birth Date will be Displayed")
	public void birth_date_will_be_displayed() {
		String selectedDate = Registrationobj.Dateofbirth.getAttribute("value");
		System.out.println(selectedDate);
	}

	@When("Admin\\/User\\/Staff  Enters the {string} with one Upper case one Numeric  one special charecter eight characters")
	public void admin_user_staff_enters_the_with_one_upper_case_one_numeric_one_special_charecter_eight_characters(
			String pwd) {
		Registrationobj.getpassword(pwd);
	}

	@Then("Admin\\/User\\/Staff Password will be displayed")
	public void admin_user_staff_password_will_be_displayed() {
		String pwd = Registrationobj.Password.getAttribute("value");
		System.out.println(pwd);
	}

	@When("Admin\\/User\\/Staff Enters the valid UserName")
	public void admin_user_staff_enters_the_valid_user_name(String User) {
		Registrationobj.getUsername(User);
	}

	@Then("Admin\\/User\\/Staff UsesrName will be displayed")
	public void admin_user_staff_usesr_name_will_be_displayed() {
		String User = Registrationobj.Username.getAttribute("value");
		System.out.println(User);
	}

	@When("Admin\\/User\\/Staff Enters the valid Email")
	public void admin_user_staff_enters_the_valid_email(String mail) {
		Registrationobj.Getemail(mail);
	}

	@Then("Admin\\/User\\/Staff Email will be displayed")
	public void admin_user_staff_email_will_be_displayed() {
		String mail = Registrationobj.Email.getAttribute("value");
		System.out.println(mail);

	}

	@When("Admin\\/User\\/Staff enters submit button with all fields empty")
	public void admin_user_staff_enters_submit_button_with_all_fields_empty() {
		Registrationobj.openedlmswebsite();
		Registrationobj.Signupvisibility();
		Registrationobj.Submit.click();
	}

	@Then("Admin\\/User\\/Staff should get a message {string}")
	public void admin_user_staff_should_get_a_message(String errormsg) {
		Registrationobj.Emsg(errormsg);
	}

	@When("Admin\\/User\\/Staff clicks Sign Up button with invalid First Name")
	public void admin_user_staff_clicks_sign_up_button_with_invalid_first_name(String invalidfirstname) {
		Registrationobj.openedlmswebsite();
		Registrationobj.ClickSignuplick();
		Registrationobj.getinvalidfirstname(invalidfirstname);
		Registrationobj.Lastname.sendKeys("gunsunvi");
		Registrationobj.Address.sendKeys("9613 gdngndf");
		Registrationobj.Dateofbirth.click();
		Registrationobj.selectYear.selectByVisibleText("1992");
		Registrationobj.selectMonth.selectByVisibleText("November");
		Registrationobj.Date.click();
		Registrationobj.Streetaddress.sendKeys("dsuhguh");
		Registrationobj.city.sendKeys("jukoins ville rd");
		Registrationobj.drpstate.selectByVisibleText("United States");
		Registrationobj.Zipcode.sendKeys("67543");
		Registrationobj.Username.sendKeys("user345");
		Registrationobj.Password.sendKeys("ioju&896");
		Registrationobj.Phonenumber.sendKeys("3456745367");
		Registrationobj.Email.sendKeys("JavaSdet@Test.com");
		Registrationobj.ClickSignuplick();
	}

	@Then("Admin\\/User\\/Staff should get a message {string}")
	public void admin_user_staff_should_get_a_message1(String errormsg) {
		Registrationobj.Emsg(errormsg);
	}

	@When("Admin\\/User\\/Staff clicks Sign Up button with invalid Last Name")
	public void admin_user_staff_clicks_sign_up_button_with_invalid_last_name(String invalidlastname) {
		Registrationobj.openedlmswebsite();
		Registrationobj.ClickSignuplick();
		Registrationobj.FirstName.sendKeys("Gunranvi");
		Registrationobj.invalidlastname(invalidlastname);
		Registrationobj.Address.sendKeys("9613 gdngndf");
		Registrationobj.Dateofbirth.click();
		Registrationobj.selectYear.selectByVisibleText("1995");
		Registrationobj.selectMonth.selectByVisibleText("March");
		Registrationobj.Date.click();
		Registrationobj.Address.sendKeys("9613 gdngndf");
		Registrationobj.Streetaddress.sendKeys("dsuhguh");
		Registrationobj.city.sendKeys("jukoins ville rd");
		Registrationobj.drpstate.selectByVisibleText("United States");
		Registrationobj.Zipcode.sendKeys("67543");
		Registrationobj.Username.sendKeys("user");
		Registrationobj.Password.sendKeys("ioju&896");
		Registrationobj.Phonenumber.sendKeys("3456745367");
		Registrationobj.Email.sendKeys("JavaSdet@Test.com");
		Registrationobj.ClickSignuplick();
		Registrationobj.Geterrormessage();
	}

	@When("Admin\\/User\\/Staff clicks Sign Up button with invalid Address by not Providing House Number")
	public void admin_user_staff_clicks_sign_up_button_with_invalid_address_by_not_providing_house_number(
			String invalidaddress) {
		Registrationobj.openedlmswebsite();
		Registrationobj.ClickSignuplick();
		Registrationobj.FirstName.sendKeys("Gunguly");
		Registrationobj.Lastname.sendKeys("gunsunvi");
		Registrationobj.getinvalidaddress(invalidaddress);
		Registrationobj.Dateofbirth.click();
		Registrationobj.selectYear.selectByVisibleText("1987");
		Registrationobj.selectMonth.selectByVisibleText("March");
		Registrationobj.Date.click();
		Registrationobj.Address.sendKeys("9613 gdngndf");
		Registrationobj.Streetaddress.sendKeys("dsuhguh");
		Registrationobj.city.sendKeys("jukoins ville rd");
		Registrationobj.drpstate.selectByVisibleText("United States");
		Registrationobj.Zipcode.sendKeys("67543");
		Registrationobj.Username.sendKeys("user");
		Registrationobj.Password.sendKeys("ioju&896");
		Registrationobj.Phonenumber.sendKeys("3456745367");
		Registrationobj.Email.sendKeys("JavaSdet@Test.com");
		Registrationobj.ClickSignuplick();
		Registrationobj.Geterrormessage();
	}

	@When("Admin\\/User\\/Staff clicks Sign Up button with invalid Street Name")
	public void admin_user_staff_clicks_sign_up_button_with_invalid_street_name(String invalidstreetaddress) {
		Registrationobj.openedlmswebsite();
		Registrationobj.ClickSignuplick();
		Registrationobj.FirstName.sendKeys("Gunranvi");
		Registrationobj.Lastname.sendKeys("gunsunvi");
		Registrationobj.Dateofbirth.click();
		Registrationobj.selectYear.selectByVisibleText("1987");
		Registrationobj.selectMonth.selectByVisibleText("March");
		Registrationobj.Date.click();
		Registrationobj.Address.sendKeys("9613 gdngndf");
		Registrationobj.getinvalidStreetname(invalidstreetaddress);
		Registrationobj.city.sendKeys("jukoins ville rd");
		Registrationobj.drpstate.selectByVisibleText("United States");
		Registrationobj.Zipcode.sendKeys("67543");
		Registrationobj.Username.sendKeys("user879");
		Registrationobj.Password.sendKeys("ioju&896");
		Registrationobj.Phonenumber.sendKeys("3456745367");
		Registrationobj.Email.sendKeys("JavaSdet@Test.com");
		Registrationobj.ClickSignuplick();
		Registrationobj.Geterrormessage();
	}

	@When("Admin\\/User\\/Staff clicks Sign Up button with invalid Zip")
	public void admin_user_staff_clicks_sign_up_button_with_invalid_zip(String invalidZcode) {
		Registrationobj.openedlmswebsite();
		Registrationobj.ClickSignuplick();
		Registrationobj.FirstName.sendKeys("vasantha");
		Registrationobj.Lastname.sendKeys("Daggupatti");
		Registrationobj.Dateofbirth.click();
		Registrationobj.selectYear.selectByVisibleText("1987");
		Registrationobj.selectMonth.selectByVisibleText("March");
		Registrationobj.Date.click();
		Registrationobj.Address.sendKeys("8973 gdngndf");
		Registrationobj.invalidZipcode(invalidZcode);
		Registrationobj.Username.sendKeys("USer098");
		Registrationobj.Password.sendKeys("ioju&896");
		Registrationobj.Phonenumber.sendKeys("3456768767");
		Registrationobj.Email.sendKeys("JavaSdet45@Test.com");
		Registrationobj.ClickSignuplick();
		Registrationobj.Geterrormessage();
	}

	@When("Admin\\/User\\/Staff clicks Sign Up button with invalid City")
	public void admin_user_staff_clicks_sign_up_button_with_invalid_city(String invalidCity) {
		Registrationobj.openedlmswebsite();
		Registrationobj.ClickSignuplick();
		Registrationobj.FirstName.sendKeys("vasantha");
		Registrationobj.Lastname.sendKeys("Daggupatti");
		Registrationobj.Dateofbirth.click();
		Registrationobj.selectYear.selectByVisibleText("1987");
		Registrationobj.selectMonth.selectByVisibleText("March");
		Registrationobj.Date.click();
		Registrationobj.Address.sendKeys("8973 gdngndf");
		Registrationobj.Streetaddress.sendKeys("jackson rd");
		Registrationobj.invalidcity(invalidCity);
		Registrationobj.Zipcode.sendKeys("90876");
		Registrationobj.Username.sendKeys("staff");
		Registrationobj.Password.sendKeys("oiku$980");
		Registrationobj.Phonenumber.sendKeys("98076876589");
		Registrationobj.Email.sendKeys("APISdet87@Test.com");
		Registrationobj.ClickSignuplick();
		Registrationobj.Geterrormessage();
	}

	@When("Admin\\/User\\/Staff clicks Sign Up button without selecting State")
	public void admin_user_staff_clicks_sign_up_button_without_selecting_state() {
		Registrationobj.openedlmswebsite();
		Registrationobj.ClickSignuplick();
		Registrationobj.FirstName.sendKeys("Sachi");
		Registrationobj.Lastname.sendKeys("harris");
		Registrationobj.Dateofbirth.click();
		Registrationobj.selectYear.selectByVisibleText("1991");
		Registrationobj.selectMonth.selectByVisibleText("January");
		Registrationobj.Date.click();
		Registrationobj.Address.sendKeys("9870 hgdhdgj");
		Registrationobj.Streetaddress.sendKeys("jackson rd");
		Registrationobj.city.sendKeys("bremen city");
		Registrationobj.Zipcode.sendKeys("90876");
		Registrationobj.Username.sendKeys("staff");
		Registrationobj.Password.sendKeys("oiku$980");
		Registrationobj.Phonenumber.sendKeys("98076876589");
		Registrationobj.Email.sendKeys("Sdet87@Test.com");
		Registrationobj.ClickSignuplick();
		Registrationobj.smsg();
	}

	@When("Admin\\/User\\/Staff clicks Sign Up button with invalid Phone Number")
	public void admin_user_staff_clicks_sign_up_button_with_invalid_phone_number(String invalidphono) {
		Registrationobj.openedlmswebsite();
		Registrationobj.ClickSignuplick();
		Registrationobj.FirstName.sendKeys("Sachi");
		Registrationobj.Lastname.sendKeys("harris");
		Registrationobj.invalidphone(invalidphono);
		Registrationobj.Dateofbirth.click();
		Registrationobj.selectYear.selectByVisibleText("1991");
		Registrationobj.selectMonth.selectByVisibleText("January");
		Registrationobj.Date.click();
		Registrationobj.Address.sendKeys("9870 hgdhdgj");
		Registrationobj.Streetaddress.sendKeys("jackson rd");
		Registrationobj.city.sendKeys("bremen city");
		Registrationobj.Zipcode.sendKeys("90876");
		Registrationobj.Username.sendKeys("staff");
		Registrationobj.Password.sendKeys("oiku$980");
		Registrationobj.Phonenumber.sendKeys("98076876589");
		Registrationobj.Email.sendKeys("Sdet87@Test.com");
		Registrationobj.Geterrormessage();

	}

	@When("Admin\\/User\\/Staff clicks Sign Up button without selecting BirthDate")
	public void admin_user_staff_clicks_sign_up_button_without_selecting_birth_date() {
		Registrationobj.openedlmswebsite();
		Registrationobj.ClickSignuplick();
		Registrationobj.FirstName.sendKeys("Vanshika");
		Registrationobj.Lastname.sendKeys("Maganti");
		Registrationobj.selectYear.selectByVisibleText("1992");
		Registrationobj.selectMonth.selectByVisibleText("November");
		Registrationobj.Date.click();
		Registrationobj.Address.sendKeys("6784 ffjigj");
		Registrationobj.Streetaddress.sendKeys("villes rd");
		Registrationobj.city.sendKeys("iconic city");
		Registrationobj.drpstate.selectByVisibleText("United States");
		Registrationobj.Zipcode.sendKeys("98760");
		Registrationobj.Username.sendKeys("Admin");
		Registrationobj.Password.sendKeys("oilk$879");
		Registrationobj.Phonenumber.sendKeys("8769675478");
		Registrationobj.Email.sendKeys("Qaautomatin@Test.com");
		Registrationobj.ClickSignuplick();
		Registrationobj.smsg();

	}

	@When("Admin\\/User\\/Staff clicks Sign Up button with invalid Admin\\/User\\/Staff Name")
	public void admin_user_staff_clicks_sign_up_button_with_invalid_admin_user_staff_name(String invalidusername) {
		Registrationobj.openedlmswebsite();
		Registrationobj.ClickSignuplick();
		Registrationobj.FirstName.sendKeys("Vanshika");
		Registrationobj.Lastname.sendKeys("Maganti");
		Registrationobj.selectYear.selectByVisibleText("1992");
		Registrationobj.selectMonth.selectByVisibleText("November");
		Registrationobj.Date.click();
		Registrationobj.Address.sendKeys("6784 ffjigj");
		Registrationobj.Streetaddress.sendKeys("villes rd");
		Registrationobj.city.sendKeys("iconic city");
		Registrationobj.drpstate.selectByVisibleText("United States");
		Registrationobj.Zipcode.sendKeys("98760");
		Registrationobj.invalidUsername(invalidusername);
		Registrationobj.Password.sendKeys("oilk$879");
		Registrationobj.Phonenumber.sendKeys("8769675478");
		Registrationobj.Email.sendKeys("Qaautomatin@Test.com");
		Registrationobj.ClickSignuplick();
		Registrationobj.ClickSignuplick();
		Registrationobj.Geterrormessage();
	}

	@Then("Admin\\/User\\/Staff should get a message\"Please Enter valid Admin\\/User\\/Staff Name \"")
	public void admin_user_staff_should_get_a_message_please_enter_valid_admin_user_staff_name() {
		Registrationobj.Geterrormessage();
	}

	@When("Admin\\/User\\/Staff clicks Sign Up button with invalid Password")
	public void admin_user_staff_clicks_sign_up_button_with_invalid_password(String invalidpassword) {
		Registrationobj.openedlmswebsite();
		Registrationobj.ClickSignuplick();
		Registrationobj.FirstName.sendKeys("Vanshika");
		Registrationobj.Lastname.sendKeys("Maganti");
		Registrationobj.selectYear.selectByVisibleText("1992");
		Registrationobj.selectMonth.selectByVisibleText("November");
		Registrationobj.Date.click();
		Registrationobj.Address.sendKeys("6784 ffjigj");
		Registrationobj.Streetaddress.sendKeys("villes rd");
		Registrationobj.city.sendKeys("iconic city");
		Registrationobj.drpstate.selectByVisibleText("United States");
		Registrationobj.Zipcode.sendKeys("98760");
		Registrationobj.Username.sendKeys("Admin23");
		Registrationobj.invalidpassword(invalidpassword);
		Registrationobj.Geterrormessage();
	}

	@When("User clicks Sign Up button with existing Admin\\/User\\/Staff name")
	public void user_clicks_sign_up_button_with_existing_admin_user_staff_name(String username) {
		Registrationobj.openedlmswebsite();
		Registrationobj.ClickSignuplick();
		Registrationobj.FirstName.sendKeys("lokesh");
		Registrationobj.Lastname.sendKeys("Janjitha");
		Registrationobj.Dateofbirth.click();
		Registrationobj.selectYear.selectByVisibleText("1991");
		Registrationobj.selectMonth.selectByVisibleText("January");
		Registrationobj.Date.click();
		Registrationobj.Address.sendKeys("9879 gdgsdjd");
		Registrationobj.Streetaddress.sendKeys("jonesville rd");
		Registrationobj.city.sendKeys("goyal");
		Registrationobj.drpstate.selectByVisibleText("United States");
		Registrationobj.Zipcode.sendKeys("78654");
		Registrationobj.EnterUserName(username);
		Registrationobj.Password.sendKeys("ihuj098&");
		Registrationobj.Phonenumber.sendKeys("9898743210");
		Registrationobj.Email.sendKeys("Tester123@Test.com");
		Registrationobj.ClickSignuplick();

	}

	@Then("Admin\\/User\\/Staff should see the message {string}")
	public void admin_user_staff_should_see_the_message(String message) {
		Registrationobj.Existedmsg(message);
	}

	@When("Admin\\/User\\/Staff Clicks on {string} button after entering all valid details.")
	public void admin_user_staff_clicks_on_button_after_entering_all_valid_details(String string) {
		Registrationobj.openedlmswebsite();
		Registrationobj.ClickSignuplick();
		Registrationobj.FirstName.sendKeys("Gandhi");
		Registrationobj.Lastname.sendKeys("Mahatma");
		Registrationobj.Dateofbirth.click();
		Registrationobj.selectYear.selectByVisibleText("1991");
		Registrationobj.selectMonth.selectByVisibleText("January");
		Registrationobj.Date.click();
		Registrationobj.Address.sendKeys("9879 ijgisjg");
		Registrationobj.Streetaddress.sendKeys("jonesville rd");
		Registrationobj.city.sendKeys("beach");
		Registrationobj.drpstate.selectByVisibleText("United States");
		Registrationobj.Zipcode.sendKeys("12345");
		Registrationobj.Username.sendKeys("User123");
		Registrationobj.Password.sendKeys("ihuj098&");
		Registrationobj.Phonenumber.sendKeys("9876543210");
		Registrationobj.Email.sendKeys("Testing123@Test.com");
		Registrationobj.ClickSignuplick();
	}

	@Then("Admin\\/User\\/Staff should get a message\"Registeration successful\"")
	public void admin_user_staff_should_get_a_message_registeration_successful() {
		Registrationobj.smsg();
	}

}
