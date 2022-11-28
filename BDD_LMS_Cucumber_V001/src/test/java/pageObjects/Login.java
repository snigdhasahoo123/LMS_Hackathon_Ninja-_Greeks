package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login extends Baseclass {

	public Login() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username")
	WebElement txtUsername;
	@FindBy(id = "password")
	WebElement txtPswd;
	@FindBy(id = "code")
	WebElement code;

	@FindBy(id = "login")
	WebElement Login;

	public void Username(String stepUsername) {
		txtUsername.clear();
		txtUsername.sendKeys(stepUsername);
	}

	public void Password(String stepPassword) {
		txtPswd.clear();
		txtPswd.sendKeys(stepPassword);
	}

	public void passcode(String stepcode) {
		code.clear();
		code.sendKeys(stepcode);
	}

	public void Cklogin() {
		Login.click();
	}
}
