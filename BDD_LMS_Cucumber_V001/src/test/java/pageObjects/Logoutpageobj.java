package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logoutpageobj {

	public WebDriver ldriver;

	public Logoutpageobj(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "//button/span[contains(@class,'mat-button-wrapper')]")
	WebElement logoutbutton;

//action methods

	public void logout() {
		logoutbutton.click();

	}

	public void navigatetologin() {

		ldriver.navigate().back();

	}

}