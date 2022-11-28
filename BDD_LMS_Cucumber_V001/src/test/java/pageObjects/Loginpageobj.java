package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.AssertJUnit;

public class Loginpageobj extends Baseclass {

	public WebDriver ldriver;

	public Loginpageobj(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "//div/mat-card/mat-card-title/div[contains(text(),'Manage program')]")
	WebElement Manageprogram;
	@FindBy(xpath = "//div/mat-card/mat-card-title/div[contains(text(),'verfication page')]")
	WebElement verficationpagetext;
	@FindBy(className = "mat-focus-indicator mat-button mat-button-base")
	WebElement code;
	@FindBy(name = "username")
	WebElement txtname;

	@FindBy(name = "password")
	WebElement txtpassword;

	@FindBy(xpath = "//div//input[@value='Login']")
	WebElement Login;
	@FindBy(xpath = "//div//input[@value='forgot pass']")
	WebElement forgotpassword;

	@FindBy(xpath = "//div//input[@value='Email']")
	WebElement Email;
	@FindBy(xpath = "//div//input[@value='resetpassword']")
	WebElement resetpassword;
	@FindBy(xpath = "//div//input[@value='continue button']")
	WebElement continuebutton;
	@FindBy(xpath = "//div//input[@value='click here button']")
	WebElement clickherebutton;
	@FindBy(xpath = "//div//input[@value='submit']")
	WebElement submit;
	@FindBy(xpath = "//div//input[@value='new pass']")
	WebElement newpassword;
	@FindBy(xpath = "//div//input[@value='retype pass']")
	WebElement retypepassword;
	@FindBy(xpath = "//div//input[@value='cancel button']")
	WebElement cancelbutton;

//Action methods

	public void adminuserstaffclicklogin() {
		Login.click();

		ldriver.navigate().to(" ");

	}

	public void enteringusenameapass(String uname, String password) {

		txtname.sendKeys(uname);

		txtpassword.sendKeys(password);

	}

	public void headervalidation()

	{
		String text = Manageprogram.getText();

		String requiredText = "Manage Program";
		Assert.assertEquals(text, requiredText);
		Assert.assertNull(text);
	}

	public void enteringusenameapasscode(String uname, String password, String codenum) {

		txtname.sendKeys(uname);

		txtpassword.sendKeys(password);

		code.sendKeys(codenum);
	}

	public void usererrormessage() {

		if (ldriver.getPageSource().contains(" User Entered invalid password")) {

			AssertJUnit.assertTrue(true);
		} else {
			System.out.println("User entered valid password");
		}
	}

	public void forgotpassword() {

		forgotpassword.click();
	}

	public void emailverfication(String vercode) {

		String emailverification = Email.getText();

	}

	public void forgotpasswordpage() {

		ldriver.getWindowHandle();
	}

	public void EnteringEmailcontinue() {

		Email.sendKeys("abc@gmail.com");
		continuebutton.click();
	}

	public void verificationcodepage() {
		String verifcationpage = verficationpagetext.getText();
		String requiredText = "Verification page";
		Assert.assertEquals(verifcationpage, requiredText);
		Assert.assertNull(verifcationpage);

	}

	/*
	 * public void verificationcode(String vericode) {
	 * 
	 * ldriver.getWindowHandle(); code.sendKeys(vericode);
	 * 
	 * }
	 */
	public void clickcontinueafterenteringverificationcode(String vercode) {
		continuebutton.click();
		code.sendKeys(vercode);

	}

	public void resetpasswordpage() {
		ldriver.getWindowHandle();

	}

	public void clickhetetoresenpassword() {

		clickherebutton.click();

	}

	public void submitresetpassword(String newpass, String retypepass) {

		newpassword.sendKeys(newpass);
		retypepassword.sendKeys(retypepass);
		submit.click();
	}

	public void navigatelogin(String text) {
		ldriver.navigate().back();
		String loginpage = Login.getText();

		String requiredText = "Login";
		Assert.assertEquals(loginpage, requiredText);
		Assert.assertNull(loginpage);

	}

	public void passwordresetmismatcherror() {

		if (ldriver.getPageSource().contains("password and retype password are mismatched")) {

			AssertJUnit.assertTrue(true);
		} else {
			System.out.println("not showing any mismatch error");
		}
	}

	public void passwordlessthaneightcharac() {
		if (ldriver.getPageSource().contains("The password must contain 8 characters")) {

			AssertJUnit.assertTrue(true);
		} else {
			System.out.println("not showing any less than 8 character error");
		}
	}

	public void resetoptioncancel() {
		cancelbutton.click();
	}

	public void passwordmustnum() {

		if (ldriver.getPageSource().contains("The password must contain one  number")) {

			AssertJUnit.assertTrue(true);
		} else {
			System.out.println("not showing any error");
		}
	}

	public void passwordmustcontainspecialcharac() {

		if (ldriver.getPageSource().contains("The password must contain special character ")) {

			AssertJUnit.assertTrue(true);
		} else {
			System.out.println("not showing any error");
		}
	}

	public void passwordmustcapital() {

		if (ldriver.getPageSource().contains("The password must contain one Capital letter")) {

			AssertJUnit.assertTrue(true);
		} else {
			System.out.println("not showing any error");
		}
	}

	public void sourcedata() {
		// TODO Auto-generated method stub

	}

}
