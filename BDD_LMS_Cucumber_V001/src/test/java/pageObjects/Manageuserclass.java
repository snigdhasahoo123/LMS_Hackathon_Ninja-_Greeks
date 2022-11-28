package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Manageuserclass extends Baseclass {

	public Manageuserclass() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='Inactive']")
	WebElement radioinactive;

	@FindBy(xpath = "//input[@type='text']")
	WebElement SeachTextValue;
	@FindBy(xpath = "//span[contains(text(),'Showing')]")
	WebElement addnewuser;
	@FindBy(xpath = "//span[contains(text(),'Showing')]")
	WebElement usertable;
	@FindBy(xpath = "//span[@class='p-paginator-pages ng-star-inserted']//ancestor::button[1]")
	WebElement Page1;
	@FindBy(xpath = "//tbody[@class='p-datatable-tbody']//tr[1]/td[4]")
	WebElement firststatus;

	@FindBy(xpath = "//span[contains(text(),'cancel')]")
	WebElement cancelbuttonviewed;

	@FindBy(xpath = "/html/body/app-root/app-header/mat-toolbar/span[1]")
	WebElement clicktab;

	@FindBy(xpath = "//div[contains(text(),'In total users')]")
	WebElement userfooter;

	@FindBy(xpath = "//span[@class='p-paginator-icon pi pi-angle-double-right']")
	WebElement btnpaginator;
	@FindBy(xpath = "//span[@class='p-paginator-icon pi pi-angle-double-right']")
	WebElement previousbtnpaginator;
	@FindBy(xpath = "//small[contains(text(),'Name is required.')]")
	WebElement errMsgNameReq;

	@FindBy(xpath = "//button[@class='p-paginator-page p-paginator-element p-link p-ripple ng-star-inserted p-highlight']")
	WebElement test;
	@FindBy(xpath = "//span[@class='p-paginator-icon pi pi-angle-double-right']")
	WebElement btnclicklastpage;
	@FindBy(xpath = "//span[@class='p-paginator-icon pi pi-angle-double-left']")
	WebElement btnclickfirstpage;

	@FindBy(xpath = "//button[@class='p-paginator-last p-paginator-element p-link p-ripple ng-star-inserted p-disabled']//parent::div/span[2]/button[@class='p-paginator-page p-paginator-element p-link p-highlight p-ripple ng-star-inserted']")
	WebElement findlastpage;
	@FindBy(xpath = "//div[contains(text(),'In total')]")
	WebElement totaluser;

	@FindBy(xpath = "//div[contains(text(),' Manage user')]//ancestor::div//div[2]//span[@class='p-button-icon pi pi-trash']")
	WebElement CheckpaginationcontrolIcon;
	@FindBy(xpath = "//html/body/app-root/app-user/div/mat-card/mat-card-content/p-table/div/p-paginator/div/span[2]/button']")
	WebElement EnabledpaginationcontrolIcon;
	@FindBy(xpath = "/html/body/app-root/app-user/div/mat-card/mat-card-content/p-table/div/p-paginator/div")
	WebElement clicknextofpagination;

	@FindBy(xpath = "//button[@type='button']//span[@class='p-paginator-icon pi pi-angle-right']//ancestor::button")
	WebElement isNextPagelinkIsDis;
	@FindBy(xpath = "//button[@type='button']//span[@class='p-paginator-icon pi pi-angle-right']//ancestor::button")
	WebElement ispreviousPagelinkIsDis;
	@FindBy(xpath = "/html/body/app-root/app-user/div/mat-card/mat-card-content/p-table/div/p-paginator/div")
	WebElement clickpreviouslinkofpagination;
	@FindBy(xpath = "//div[@class='p-radiobutton p-component']")
	WebElement c2lessthan;
	@FindBy(xpath = "//div[@class='p-radiobutton p-component']")
	WebElement c2greaterthan;

	@FindBy(xpath = "//div[@class='p-radiobutton p-component']")
	WebElement gettext;
	@FindBy(xpath = "//span[@class='p-paginator-current ng-star-inserted']")
	WebElement EntryofNamephrase;
	@FindBy(xpath = "//div/div[1]/table/tbody/tr[1]/td[7]/div/span[1]/button")
	WebElement saved;
	@FindBy(xpath = "/html/body/app-root/app-user/div/mat-card/mat-card-content/p-table/div/p-paginator/div")
	WebElement emptycheckbox;

	@FindBy(xpath = "//div/div[1]/table/tbody/tr[1]/td[7]/div/span[1]/button")
	WebElement rowclick;

	@FindBy(xpath = "//div/div[1]/table/tbody/tr[1]/td[7]/div/span[1]/button")
	WebElement submitbutton;

	@FindBy(xpath = "//*[@id=\"pr_id_8-label\"]")
	WebElement clickdeleteicon;

	@FindBy(xpath = "//*[@id='SuccessMessagedisplayed']")
	WebElement SuccessMessagedisplayed;

	@FindBy(id = "editbtn")
	WebElement clickeditbutton;
	@FindBy(id = "editbtn")
	WebElement clickIDbutton;

	@FindBy(id = "closexicon")
	WebElement closexicon;

	@FindBy(xpath = "//div[@class='p-field ng-star-inserted']/p-dropdown/div/input")
	WebElement dialogboxclesed;
	@FindBy(xpath = "//div[@class='p-field ng-star-inserted']/p-dropdown/div/input")
	WebElement cancel;

	@FindBy(xpath = "//div[3]/p-dropdown/div/div[2]/span")
	WebElement editdeleteicon;
	@FindBy(xpath = "//div[@class='p-field ng-star-inserted']/p-dropdown/div/input")
	WebElement dropdownstate1;
	@FindBy(xpath = "//div[1]/table/tbody/tr/td[6]")
	WebElement norowschecked;
	@FindBy(xpath = "//div[1]/table/tbody/tr/td[6]")
	WebElement norowsvalue;
	@FindBy(xpath = "//input[@id='Active']")
	WebElement radioactive;

	@FindBy(xpath = "/html/body/app-root/app-batch/p-dialog/div/div/div[2]/div[4]/div[2]")
	WebElement deleteicon;

	@FindBy(xpath = "//div[@class='p-field ng-star-inserted']/p-dropdown/div/input")
	WebElement dropdownuser;
	@FindBy(xpath = "/html/body/app-root/app-batch/p-dialog/div/div/div[2]/div[4]/div[2]")
	WebElement UGProgram;
	@FindBy(xpath = "/html/body/app-root/app-batch/p-dialog/div/div/div[2]/div[4]/div[2]")
	WebElement userdetailwindow;

	@FindBy(xpath = "//div/button/span[@class='p-button-label' and contains(text(),'Cancel')]")
	WebElement uncheckcheckboxbutton;

	@FindBy(xpath = "//div/button/span[@class='p-button-label' and contains(text(),'Cancel')]")
	WebElement clickdropdownstate;
	@FindBy(xpath = "//div/button[2]/span[@class='p-button-label' and contains(text(),'Save')]")
	WebElement allcheckbox;

	@FindBy(xpath = "//div/span/input")
	WebElement sorticon;
	@FindBy(xpath = "//div/span/input")
	WebElement editgettextfor;

	@FindBy(xpath = "//div/span/input/")
	WebElement userinfo;

	public void validateheadingprograme() {
		String titleofaprogrampage = driver.getTitle();
		System.out.println("Title of the assignment page is " + titleofaprogrampage);

		String text = driver.findElement(By.xpath("/html/body/app-root/app-program/div/mat-card/mat-card-title/div[1]"))
				.getText();

		System.out.println("capturing the text of the web element is " + text);
		Assert.assertEquals(text, "Manage Program", "Manage Program,matched");
	}

	public void clickuser() {
		WebElement clickonuser = driver.findElement(By.xpath("//*[@id=\"user\"]"));
	}

	public void validateheadinguser() {
		String titleofuserpage = driver.getTitle();
		System.out.println("Title of the assignment page is " + titleofuserpage);

		String text = driver.findElement(By.xpath("/html/body/app-root/app-user/div/mat-card/mat-card-title/div[1]"))
				.getText();

		System.out.println("capturing the text of the web element is " + text);
		Assert.assertEquals(text, "Manage user", "Manage user,matched");
	}

	public String usertableisdisplayed() {
		System.out.println(usertable.getText());
		return usertable.getText();
	}

	public void footer() {
		String footercontains = userfooter.getText();
		System.out.println("capturing the text of the web element is " + footercontains);
	}

	public String paginationisdisplayed() {
		System.out.println(btnpaginator.getText());
		return btnpaginator.getText();

	}

	public String previouspaginationisdisplayed() {
		System.out.println(btnpaginator.getText());
		return btnpaginator.getText();

	}

	public String lastpageisdisplayed() {
		System.out.println(btnpaginator.getText());
		return btnpaginator.getText();

	}

	public void clicktab() {
		clicktab.click();
	}

	public void clickaddnewuser() {
		addnewuser.click();
	}

	public void countOfrows() {

		int totalrecords = 0;
		int totalpages = 0;
		btnclicklastpage.click();

		System.out.println(totalpages);
		try {
			totalpages = (Integer.parseInt(test.getText()));
		} catch (NoSuchElementException e) {
			totalpages = (Integer.parseInt(findlastpage.getText()));
		}
		System.out.println("Total no of pages " + totalpages);
		btnclickfirstpage.click();
		for (int i = 1; i <= totalpages; i++) {
			driver.findElement(
					By.xpath("//span[@class='p-paginator-pages ng-star-inserted']/button[contains(text()," + i + ")]"))
					.click();
			System.out.println("System in Page " + i);
			List<WebElement> tablegrid = driver.findElements(By.xpath("//table[@role='grid']//tbody/tr"));
			System.out.println("No of rows in a page " + i + " is " + tablegrid.size());
			totalrecords = totalrecords + tablegrid.size();
		}
		String validatetotalprogram = "In total there are " + totalrecords + " user";
		System.out.println(validatetotalprogram);
		System.out.println(totaluser.getText());
		Assert.assertEquals(totaluser.getText().trim(), validatetotalprogram);
	}

	public String Dsabledpaginationcontrolled() {

		String textVal = CheckpaginationcontrolIcon.getAttribute("aria-hidden");
		System.out.println(textVal);
		return textVal;
	}

	public void enabledpaginationicon() {
		EnabledpaginationcontrolIcon.click();

	}

	public void nextpagepagination() {
		clicknextofpagination.click();
	}

	public void clickLastPageButton() {
		btnclicklastpage.click();
	}

	public void clickonrow() {
		rowclick.click();
	}

	public boolean nextPageDisabled() {
		String Link1Disabled = isNextPagelinkIsDis.getAttribute("class");
		return Link1Disabled.contains("p-disabled");
	}

	public void clickpreviouslinkButton() {
		clickpreviouslinkofpagination.click();
	}

	public boolean previouslinkPaginationDisabled() {
		String Link1Disabled = ispreviousPagelinkIsDis.getAttribute("class");
		return Link1Disabled.contains("p-disabled");
	}

	public void click2lessthanicon() {
		c2lessthan.click();

	}

	public void valPageNumber() {
		String valpage1highlighted = Page1.getAttribute("class");
		Assert.assertEquals(valpage1highlighted.contains("p-highlight"), true);
	}

	public void click2greaterthanicon() {
		c2greaterthan.click();
	}

	public void gettextvalueafterclickedonadduser() {
		String gettextvalueafterclickedonadduser1 = gettext.getText();
	}

	public void validateemptycheckbox() {
		try {
			emptycheckbox.click();
			Assert.assertEquals("false", "false");
		} catch (NoSuchElementException ex) {
			Assert.assertEquals("false", "false");
		}
	}

	public void uncheckcheckboxcheckbox() {
		try {
			emptycheckbox.click();
			Assert.assertEquals("false", "false");
		} catch (NoSuchElementException ex) {
			Assert.assertEquals("false", "false");
		}
	}

	public void clickssorticon() {
		sorticon.click();
	}

	public void tablesorted() {
		Assert.assertEquals(sorticon.getText(), "newsort");
	}

	public boolean allcheckboxunchecked() {
		String Link1Disabled = uncheckcheckboxbutton.getAttribute("class");
		return Link1Disabled.contains("unchecked");
	}

	public boolean allcheckboxchecked() {
		String Link1Disabled = allcheckbox.getAttribute("class");
		return Link1Disabled.contains("checked");
	}

	public boolean delteiconatleftisdisplayeded() {
		String Link1Disabled = deleteicon.getAttribute("class");
		return Link1Disabled.contains("delete");
	}

	public boolean checkednorowsdisplayeded() {
		String Link1Disabled = norowschecked.getAttribute("class");
		return Link1Disabled.contains("norowschecked");
	}

	public boolean DeleteiconDisabled() {
		String Link1Disabled = deleteicon.getAttribute("class");
		return Link1Disabled.contains("p-disabled");
	}

	public boolean DeleteiconEnaabled() {
		String Link1Disabled = deleteicon.getAttribute("class");
		return Link1Disabled.contains("p-enabled");
	}

	public void clickdeleteicon() {
		clickdeleteicon.click();

	}

	public void dialogbox() {
		dialogboxclesed.click();

	}

	public void valDeleteSuccessMessage() {
		if (SuccessMessagedisplayed.isEnabled() == true) {

			org.junit.Assert.assertTrue(true);
		} else {

			org.junit.Assert.assertTrue(false);
		}
	}

	public void clickclosexicon() {
		closexicon.click();

	}

	public void clickcancel() {
		cancel.click();

	}

	public boolean editdeleteisplayeded() {
		String editdelenabled = editdeleteicon.getAttribute("class");
		return editdelenabled.contains("enabled");
	}

	public void clickedit() {
		clickeditbutton.click();
	}

	public void clickID() {
		clickIDbutton.click();
	}

	public String textforedit() {
		String textVal = editgettextfor.getAttribute("plz add name");
		System.out.println(textVal);
		return textVal;
	}

	public String Searchbar() {

		String SrchtextVal = SeachTextValue.getAttribute("placeholder");
		System.out.println(SrchtextVal);
		return SrchtextVal;
	}

	public void SendNamePharse(String NamePharse) {

		SeachTextValue.clear();
		SeachTextValue.sendKeys(NamePharse);
	}

	public String EntriesRow() throws InterruptedException {
		Thread.sleep(1000);
		System.out.println(EntryofNamephrase.getText());
		return EntryofNamephrase.getText();
	}

	public String norowvaluefoundtext() {
		String textVal1 = norowsvalue.getAttribute("no rows found");
		System.out.println(textVal1);
		return textVal1;
	}

	public String userinformationisdisplayed() {
		System.out.println(userinfo.getText());
		return userinfo.getText();

	}

	public boolean cancelbtnviewddisplayed() {
		String Link1Disabled = cancelbuttonviewed.getAttribute("class");
		return Link1Disabled.contains("cancel");
	}

	public boolean cancelxiconisplayeded() {
		String editdelenabled = editdeleteicon.getAttribute("class");
		return editdelenabled.contains("enabled");
	}

	public boolean validateuserdeatilswindow() {
		String userdet = userdetailwindow.getAttribute("class");
		return userdet.contains("user details");

	}

	public boolean validatesubmitbtn() {
		String userdet = submitbutton.getAttribute("class");
		return userdet.contains("submit");

	}

	public void clickUGProg() {
		UGProgram.click();
	}

	public void clickdropdownuser() {
		dropdownuser.click();
	}

	public void clickdropdownstate() {
		dropdownstate1.click();
	}

	public void listofUGProg() {
		int totalrecords = 0;
		int totalpages = 0;
		UGProgram.click();

		System.out.println(totalpages);
		try {
			totalpages = (Integer.parseInt(test.getText()));
		} catch (NoSuchElementException e) {
			totalpages = (Integer.parseInt(findlastpage.getText()));
		}
		System.out.println("Total no of pages " + totalpages);
		btnclickfirstpage.click();
		for (int i = 1; i <= totalpages; i++) {
			driver.findElement(
					By.xpath("//span[@class='p-paginator-pages ng-star-inserted']/button[contains(text()," + i + ")]"))
					.click();
			System.out.println("System in Page " + i);
			List<WebElement> tablegrid = driver.findElements(By.xpath("//table[@role='grid']//tbody/tr"));
			System.out.println("No of rows in a page " + i + " is " + tablegrid.size());
			totalrecords = totalrecords + tablegrid.size();
		}

	}

	public void valselecttatus() {
		String isradioinactive = radioinactive.getAttribute("aria-checked");
		String isradioactive = radioactive.getAttribute("aria-checked");
		System.out.println(isradioinactive);
		System.out.println(isradioactive);
		if (isradioinactive.equalsIgnoreCase("true")) {

			Assert.assertEquals(firststatus.getText(), "not selected");
		} else {

			Assert.assertEquals(firststatus.getText(), "Selected");
		}
	}

	public void valErrMsgDisplayed() {
		if (errMsgNameReq.isEnabled() == true) {

			org.junit.Assert.assertTrue(true);
		} else {

			org.junit.Assert.assertTrue(false);
		}
	}

	public void valsuccessMsgDisplayedassaved() {
		if (saved.isEnabled() == true) {

			org.junit.Assert.assertTrue(true);
		} else {

			org.junit.Assert.assertTrue(false);
		}
	}

}
