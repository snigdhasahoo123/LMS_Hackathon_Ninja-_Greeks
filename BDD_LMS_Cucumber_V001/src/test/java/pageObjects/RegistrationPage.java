package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class RegistrationPage extends Baseclass {
	WebDriver driver;

	public void RegistrationPage() {
		this.driver = driver;
	}

	@FindBy(id = "firtname")
	@CacheLookup
	public WebElement FirstName;

	@FindBy(id = "Lastname")
	@CacheLookup
	public WebElement Lastname;

	@FindBy(id = "address")
	@CacheLookup
	public WebElement Address;

	@FindBy(id = "Phone-number")
	@CacheLookup
	public WebElement Phonenumber;

	@FindBy(id = "Email")
	@CacheLookup
	public WebElement Email;

	@FindBy(id = "Street-address")
	@CacheLookup
	public WebElement Streetaddress;

	@FindBy(id = "City")
	@CacheLookup
	public WebElement city;

	@FindBy(id = "postal-code")
	@CacheLookup
	public WebElement Zipcode;

	@FindBy(id = "date-of-birth")
	@CacheLookup
	public WebElement Dateofbirth;

	@FindBy(xpath = "//select[@class='ui-datepicker-year']")
	@CacheLookup
	public WebElement yeardropdown;

	@FindBy(xpath = "//select[@class='ui-datepicker-month']")
	@CacheLookup
	public WebElement monthDropDown;

	@FindBy(xpath = "//table[@class='ui-datepicker-calendar']")
	@CacheLookup
	public WebElement Date;

	@FindBy(id = "State")
	@CacheLookup
	public WebElement State;

	@FindBy(id = "username")
	@CacheLookup
	public WebElement Username;

	@FindBy(id = "password1")
	@CacheLookup
	public WebElement Password;

	@FindBy(id = "Signup")
	@CacheLookup
	public WebElement Signup;

	@FindBy(id = "submit")
	@CacheLookup
	public WebElement Submit;

	@FindBy(id = "sucess-msg")
	@CacheLookup
	public WebElement smsg;

	@FindBy(id = "Error-msg")
	@CacheLookup
	public WebElement emsg;

	@FindBy(id = "existed-msg")
	@CacheLookup
	public WebElement existed;

	public Select drpstate = new Select(State);
	public Select drpdateofBirth = new Select(Dateofbirth);
	public Select selectYear = new Select(yeardropdown);
	public Select selectMonth = new Select(monthDropDown);

	@FindBy(xpath = "//input[@value='Register']")
	WebElement Register;
	@FindBy(linkText = "Login")
	public WebElement Login;
	@FindBy(linkText = "Sign up")
	public WebElement signup;
	@FindBy(xpath = "//div[contains(text(),'password_mismatch:The two password fields didn�t match.')]")
	public WebElement Passwordmismatcherror;

	public String gettitle() {
		return driver.getTitle();
	}

	public void getRegisterpageTitle(String Heading) {
		Heading = driver.getTitle();
		String expectedheading = "Registration Form";
		Assert.assertEquals(Heading, expectedheading);

	}

	public void Clickregisterbutton() {
		Register.click();
	}

	public void Clickloginbutton() {
		Login.click();
		System.out.println("You are in log in page");
		// return new Loginpage();
	}

	public String Geterrormessage() {
		return Passwordmismatcherror.getText();
	}

	public void Signupvisibility() {
		if (Signup.isDisplayed()) {
			System.out.println("Signup button is diaplayed");
		}
	}

	public void ClickSignuplick() {
		Signup.click();
	}

	public void Emsg(String errormsg) {
		errormsg = emsg.getText();
		System.out.println(errormsg);
	}

	public void FirstNameFieldBlank() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Boolean is_valid = (Boolean) js.executeScript("return arguments[0].checkValidity();", FirstName);
		Assert.assertFalse(is_valid);
		String message = (String) js.executeScript("return arguments[0].validationMessage;", FirstName);
		Assert.assertEquals(message, "Please fill out this field.");
	}

	public void LastNameFieldBlank() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Boolean is_valid = (Boolean) js.executeScript("return arguments[0].checkValidity();", Lastname);
		Assert.assertFalse(is_valid);
		String message = (String) js.executeScript("return arguments[0].validationMessage;", Lastname);
		Assert.assertEquals(message, "Please fill out this field.");
	}

	public void AddressFieldBlank() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Boolean is_valid = (Boolean) js.executeScript("return arguments[0].checkValidity();", Address);
		Assert.assertFalse(is_valid);
		String message = (String) js.executeScript("return arguments[0].validationMessage;", Address);
		Assert.assertEquals(message, "Please fill out this field.");
	}

	public void PhonenumberFieldBlank() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Boolean is_valid = (Boolean) js.executeScript("return arguments[0].checkValidity();", Phonenumber);
		Assert.assertFalse(is_valid);
		String message = (String) js.executeScript("return arguments[0].validationMessage;", Phonenumber);
		Assert.assertEquals(message, "Please fill out this field.");
	}

	public void EmailFieldBlank() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Boolean is_valid = (Boolean) js.executeScript("return arguments[0].checkValidity();", Email);
		Assert.assertFalse(is_valid);
		String message = (String) js.executeScript("return arguments[0].validationMessage;", Email);
		Assert.assertEquals(message, "Please fill out this field.");
	}

	public void UserFieldBlank() throws InterruptedException {
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Boolean is_valid = (Boolean) js.executeScript("return arguments[0].checkValidity();", Username);
		Assert.assertFalse(is_valid);
		String message = (String) js.executeScript("return arguments[0].validationMessage;", Username);
		Assert.assertEquals(message, "Please fill out this field.");
	}

	public void PasswordFieldBlank() throws InterruptedException {
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Boolean is_valid = (Boolean) js.executeScript("return arguments[0].checkValidity();", Password);
		Assert.assertFalse(is_valid);
		String message = (String) js.executeScript("return arguments[0].validationMessage;", Password);
		Assert.assertEquals(message, "Please fill out this field.");
	}

	public void getFirstname(String firstname) {

		FirstName.clear();
		firstname = "Anupama";
		FirstName.sendKeys(firstname);

	}

	public void getinvalidfirstname(String invalidfirstname) {
		FirstName.clear();
		invalidfirstname = "123456";
		FirstName.sendKeys(invalidfirstname);

	}

	public void getlastname(String lastname) {
		Lastname.clear();
		lastname = "Ganguly";
		Lastname.sendKeys(lastname);

	}

	public void invalidlastname(String invalidlastname) {
		Lastname.clear();
		invalidlastname = "&%$Ganguly";
		Lastname.sendKeys(invalidlastname);

	}

	public void getAddress(String address) {
		Address.clear();
		address = "1346 hogans";
		Address.sendKeys(address);

	}

	public void getinvalidaddress(String invalidaddress) {
		Address.clear();
		invalidaddress = "hogansgaterd";
		Address.sendKeys(invalidaddress);

	}

	public void EnterUserName(String username) {
		if (Username.isEnabled()) {
			Username.clear();
			Username.sendKeys(username);
		}
	}

	public void invalidUsername(String invalidusername) {
		if (Username.isEnabled()) {
			Username.clear();
			invalidusername = "worker";
			Username.sendKeys(invalidusername);
		}
	}

	public void Existedmsg(String message) {
		message = existed.getText();
		System.out.println(message);
	}

	public void getpassword(String password) {
		if (Password.isEnabled()) {
			Password.clear();
			Password.sendKeys(password);
		}
	}

	public void invalidpassword(String invalidpassword) {
		if (Password.isEnabled()) {
			Password.clear();
			invalidpassword = "ty6789%";
			Password.sendKeys(invalidpassword);
		}
	}

	public void getstreetname(String streetaddress) {
		if (Streetaddress.isDisplayed() && Streetaddress.isEnabled()) {
			Streetaddress.clear();
			streetaddress = "wsehvilleroad";
		}
		Streetaddress.sendKeys(streetaddress);

	}

	public void getinvalidStreetname(String invalidstreetaddress) {
		if (Streetaddress.isDisplayed() && Streetaddress.isEnabled()) {
			Streetaddress.clear();
			invalidstreetaddress = "2345678@1";
		}
		Streetaddress.sendKeys(invalidstreetaddress);

	}

	public void getphonenumber(Integer phono) {
		if (Phonenumber.isDisplayed() && Phonenumber.isEnabled()) {
			Phonenumber.clear();
			phono = 1234567890;
		}
		Phonenumber.sendKeys("1234567890");

	}

	public void invalidphone(String invalidphono) {
		if (Phonenumber.isDisplayed() && Phonenumber.isEnabled()) {
			Phonenumber.clear();
			invalidphono = "3456780";
		}
		Phonenumber.sendKeys("3456780");

	}

	public void getState() {
		if (State.isDisplayed() && State.isEnabled()) {
			State.click();
		}
	}

	public void getdateofbirth() {
		if (Dateofbirth.isDisplayed() && Dateofbirth.isEnabled()) {
			Dateofbirth.click();
		}
	}

	public void getZipcode(String Zcode) {
		if (Zipcode.isDisplayed() && Zipcode.isEnabled()) {
			Zipcode.clear();

		}
		Zipcode.sendKeys(Zcode);
		Zcode = "12345";
	}

	public void invalidZipcode(String invalidZcode) {
		if (Zipcode.isDisplayed() && Zipcode.isEnabled()) {
			Zipcode.clear();

		}
		Zipcode.sendKeys(invalidZcode);
		invalidZcode = "1234587659";

	}

	public void getcity(String City) {
		if (city.isDisplayed() && city.isEnabled()) {
			city.clear();

		}
		city.sendKeys(City);
		City = "Gandhi City";
	}

	public void invalidcity(String invalidCity) {
		if (city.isDisplayed() && city.isEnabled()) {
			city.clear();

		}
		city.sendKeys(invalidCity);
		invalidCity = "9876nuyh56";
	}

	public void getUsername(String User) {
		if (Username.isDisplayed() && Username.isEnabled()) {
			Username.clear();

		}
		Username.sendKeys(User);
		User = "Anuganguly";
	}

	public void getpassWord(String pwd) {
		if (Password.isDisplayed() && Password.isEnabled()) {
			Password.clear();

		}
		Password.sendKeys(pwd);
		pwd = "Anug123#";
	}

	public void Getemail(String mail) {
		if (Email.isDisplayed() && Email.isEnabled()) {
			Email.clear();

		}
		Email.sendKeys(mail);
		mail = "testing@test.com";
	}

	public void smsg() {
		String Successmsg = smsg.getText();
		System.out.println(Successmsg);
	}

	public void passwordverification(String password) {
		int NUM_Alphabets = 4;
		int NUM_DIGITS = 3;
		int NUM_Special_Character = 1;

		int digitcount = 0;
		int specialcharacterscount = 0;
		int lettercount = 0;
		int alphabetscount = 0;

		int passlength = 8;
		int inputlength = passlength;

		for (int i = 0; i <= inputlength; i++) {
			char c = password.charAt(i);
			if (Character.isAlphabetic(c)) {
				alphabetscount++;
			} else if (Character.isDigit(c)) {
				digitcount++;
			} else if (Character.isSpaceChar(c)) {
				specialcharacterscount++;
			}
			if (alphabetscount >= NUM_Alphabets && digitcount >= NUM_DIGITS
					&& specialcharacterscount >= NUM_Special_Character) {
				System.out.println("Valid Password");
			} else {
				System.out.println("The password did not have anough of following");
				if (alphabetscount < NUM_Alphabets) {
					System.out.println("Alphabets");
					if (digitcount < NUM_DIGITS) {
						System.out.println("Digits");
					}
					if (specialcharacterscount < NUM_Special_Character) {
						System.out.println("SpecialCharaters");
					}
				}
			}
		}
	}

	public void openedlmswebsite() {
		driver.get("lmsurl");
	}

}
