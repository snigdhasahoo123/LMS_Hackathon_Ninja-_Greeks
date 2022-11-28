package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Attendance extends Baseclass {

	public Attendance() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//td/div/span/button/span[contains(@class,'p-button-icon pi pi-pencil')")
	WebElement AttendancePage;

	public void clickonAttendancePage() {
		AttendancePage.click();
	}

	@FindBy(xpath = "//td/div/span/button/span[contains(@class,'p-button') ")
	WebElement Disabledbutton;

	public void clickonDisabled() {
		Disabledbutton.click();
	}

	@FindBy(xpath = "//td/div/span/button/span[contains(@class,'p') ")
	WebElement Present;

	public void clickonPresent() {
		Disabledbutton.click();
	}

	@FindBy(xpath = "//td/div/span/button/span[contains(@class,'p-button-icon pi pi-pencil') ")
	WebElement FooterPage;

	public void clickonFooterPage() {
		FooterPage.click();
	}

	@FindBy(xpath = "//div/button/span[contains(@class,'p-button-icon p-button-icon-left ') ")
	WebElement PaginatorPage;

	public void clickonPaginatorPage() {
		PaginatorPage.click();
	}

	@FindBy(xpath = " //div/button/span[contains(@class,'p-button-icon')")
	WebElement paginatorbutton;

	public void clickonpaginatorbutton() {
		paginatorbutton.click();
	}

	@FindBy(xpath = "/html/body/app-root/app-attendance/div/mat-card/mat-card-content/p-table/div/div[1]")
	WebElement EditButton;

	public void clickonEditButton() {
		EditButton.click();
	}

	@FindBy(xpath = "/html/body/app-root/app-attendance/div/mat-card/mat-card-content/p-table/div/div[1]/table/tbody/tr[3]/td[2] ")
	WebElement ProgramName;

	public void enterProgramName() {
		ProgramName.sendKeys("Sdet71");
	}

	@FindBy(xpath = " //div/button/span[contains(@class,'p-button')")
	WebElement Save;

	public void clickonSave() {
		Save.click();
	}

	@FindBy(xpath = "//div/button/span[contains(@class,'attributr') ")
	WebElement AttendanceDetails;

	public void clickonAttendanceDetails() {
		AttendanceDetails.click();
	}

	@FindBy(xpath = "/html/body/app-root/app-attendance/div/mat-card/mat-card-content/p-table/div/div[1]/table/")
	WebElement UserName;

	public void enterUserName() {
		UserName.sendKeys("ABC");
	}

	@FindBy(xpath = "/html/body/app-root/app-attendance/div/mat-card/mat-card-content/p-table/div/div[1]/table/tbody/tr[1]/td[6]/div/span[2]/button/span[1] ")
	WebElement EditPresent;

	public void clickonEditPresent() {
		EditPresent.click();
	}

	@FindBy(xpath = "/html/body/app-root/app-attendance/div/")
	WebElement DropDown;

	public void clickonDropDown() {
		DropDown.click();
	}

	@FindBy(xpath = "/html/body/app-root/app-attendance/div/mat-card/mat-card-title/ ")
	WebElement AllDetails;

	public void clickonAllDetails() {
		AllDetails.click();
	}

	@FindBy(xpath = "/html/body/app-root/app-attendance/div/mat-card/mat-card-title/div[1]")
	WebElement EditAbsent;

	public void clickonEditAbsent() {
		EditAbsent.click();
	}

	@FindBy(xpath = " /html/body/app-root/app-attendance/div/mat-card/")
	WebElement Cancelbutton;

	public void clickonCancelbutton() {
		Cancelbutton.click();
	}

	@FindBy(xpath = "/html/body/app-root/app-attendance/div/mat-card/mat-card-content/p-table/div/div[2] ")
	WebElement Deletebutton;

	public void clickonDeletebutton() {
		Deletebutton.click();
	}

	@FindBy(xpath = "//div[contains(text(),'In total')]")
	WebElement deleted;

	@FindBy(xpath = "/html/body/app-root/app-attendance/div/mat-card/mat-card-content/p-table/div/div[2] ")
	WebElement Yesbutton;

	public void clickonYesbutton() {
		Yesbutton.click();
	}

	@FindBy(xpath = "/html/body/app-root/app-attendance/div/mat-card/mat-card-content/p-table/div/div[2]/div")
	WebElement Nobutton;

	public void clickonNobutton() {
		Nobutton.click();
	}

	@FindBy(xpath = "/html/body/app-root/app-attendance/div/mat-card/mat-card-content/p-table/div/div[1]/table/thead/tr/th[3]")
	WebElement CheckBox;

	public void clickonCheckBox() {
		CheckBox.click();
	}

	@FindBy(xpath = "/html/body/app-root/app-attendance/div/mat-card/mat-card-content/p-table/div/div[1]/table/thead/tr/th[4] ")
	WebElement Presentbutton;

	public void clickonPresentbutton() {
		Presentbutton.click();
	}

	@FindBy(xpath = "/html/body/app-root/app-attendance/div/mat-card/mat-card-content/p-table/div/div[1]/table/tbody/tr[2]/td[2]")
	WebElement Absentbutton;

	public void clickonAbsentbutton() {
		Absentbutton.click();
	}

	public void valsuccessMsgDisplayedasdeleted() {
		if (deleted.isEnabled() == true) {

			org.junit.Assert.assertTrue(true);
		} else {

			org.junit.Assert.assertTrue(false);
		}
	}

}
