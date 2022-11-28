package pageObjects;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProgramPage {
	WebDriver driver;

	public void PragramPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(id = "username")
	@CacheLookup
	public WebElement username;

	@FindBy(id = "password")
	@CacheLookup
	public WebElement password;

	@FindBy(id = "login")
	@CacheLookup
	public WebElement login;

	@FindBy(xpath = "//div[@class='nav-title']")
	@CacheLookup
	public WebElement currentPageTitle;

	@FindBy(xpath = "//div[normalize-space()='Manage Program']")
	@CacheLookup
	public WebElement Heading;

	@FindBy(xpath = "//div[@class='Footer']")
	@CacheLookup
	WebElement FooterText;

	@FindBy(xpath = "//span[@class='a-carousel-page-count-text']")
	@CacheLookup
	WebElement Paginaror_text;

	@FindBy(xpath = "//span[@class='a-carousel-page-count-last-text']")
	@CacheLookup
	WebElement Paginaror_lasttext;

	@FindBy(xpath = "//span[@class='a-carousel-page-current']")
	@CacheLookup
	WebElement CurrentPage;

	@FindBy(xpath = "//span[@class='a-carousel-page -last']")
	@CacheLookup
	public WebElement PagiLastbutton;

	@FindBy(xpath = "//span[@class='a-carousel-page -first']")
	@CacheLookup
	public WebElement PagiFirstButton;

	@FindBy(xpath = "//span[@class='a-carousel-page -next']")
	@CacheLookup
	WebElement PagisinglenextButton;

	@FindBy(xpath = "//span[@class='a-carousel-page -Previous']")
	@CacheLookup
	public WebElement PagisinglePreviousButton;

	@FindBy(xpath = "//button[@id='new']")
	@CacheLookup
	WebElement NewPro;

	@FindBy(xpath = "//input[@id='filter-all']")
	@CacheLookup
	public WebElement Search;

	@FindBy(xpath = "//button[@class='button-trash-all']")
	@CacheLookup
	WebElement MultipleDelete;

	@FindBy(xpath = "//div[@class='p-button-checkbox']")
	@CacheLookup
	WebElement MultipleCheckbox;

	@FindBy(xpath = "//th[normalize-space()='Program Name']//i")
	@CacheLookup
	WebElement pronamesort;

	@FindBy(xpath = "//th[normalize-space()='Program Description']//i")
	@CacheLookup
	WebElement Prodescsort;

	@FindBy(xpath = "//th[normalize-space()='Program Status']//i")
	@CacheLookup
	WebElement Prostatus_sort;

	@FindBy(xpath = "//th[normalize-space()='Program Name']")
	@CacheLookup
	WebElement PName;

	@FindBy(xpath = "//th[normalize-space()='Program Description']")
	@CacheLookup
	WebElement PDescription;

	@FindBy(xpath = "//th[normalize-space()='Program Status']")
	@CacheLookup
	WebElement PStatus;

	@FindBy(xpath = "//th[normalize-space()='Edit']")
	@CacheLookup
	public WebElement Edit;

	@FindBy(xpath = "//th[normalize-space()='Delete']")
	@CacheLookup
	WebElement del;

	@FindBy(xpath = "//th[normalize-space()='Delete-confirm-window-header']")
	@CacheLookup
	WebElement delwindow;

	@FindBy(xpath = "//th[normalize-space()='Delete-confirm']")
	@CacheLookup
	WebElement delyes;

	@FindBy(xpath = "//th[normalize-space()='Delete-confirm-cancel']")
	@CacheLookup
	WebElement delno;

	@FindBy(id = "programDetails")
	@CacheLookup
	WebElement HeadingforNewpro;

	@FindBy(id = "programName")
	@CacheLookup
	WebElement PronameforNewpro;

	@FindBy(id = "saveProgram")
	@CacheLookup
	WebElement savenewPro;

	@FindBy(id = "CancelProgram")
	@CacheLookup
	WebElement Cancelnewpro;

	@FindBy(xpath = " //label[@class='error-msg-inserted']")
	@CacheLookup
	WebElement errormsg;

	@FindBy(xpath = "//label[@class='no-right-error-msg-inserted']")
	@CacheLookup
	WebElement Norighterrormsg;

	@FindBy(xpath = " //label@class='Success-msg-inserted']")
	@CacheLookup
	WebElement Successmsg;

	@FindBy(id = "programNameDescription")
	@CacheLookup
	WebElement Newprodesc;

	@FindBy(id = "Programstatus")
	@CacheLookup
	WebElement Newprostatus;

	@FindBy(xpath = "//div[@class='p-checkbox-box p-component']")
	@CacheLookup
	WebElement checkbox;

	@FindBy(id = "Delete-confirm")
	@CacheLookup
	WebElement mulDeleteconfirmheader;

///login by user/admin/staff
	public void adminlogin() {
		username.sendKeys("admin");
		password.sendKeys("password");
		login.click();

	}

	public void userlogin() {
		username.sendKeys("user");
		password.sendKeys("password");
		login.click();

	}

	public void stafflogin() {
		username.sendKeys("Staff");
		password.sendKeys("password");
		login.click();
	}

/////////Header	
	public void HeaderValidation(String ExpectedHeading) {
		String OriginalHeading = Heading.getText();
		ExpectedHeading = "Manage Program";
		Assert.assertEquals(OriginalHeading, ExpectedHeading);
	}

	public void pageTitle() {
		String currenturl = driver.getCurrentUrl();
		if (currenturl.contains("Program")) {
			System.out.println("you are in Manage Program Page");

		}
	}

//////////////Footer	
	public void FooterValidation(String Expectedfooter) {
		String Originalfooter = FooterText.getText();
		Expectedfooter = "In total there are 9 programs.";
		Assert.assertEquals(Originalfooter, Expectedfooter);
	}

	////////// Pagination

	public void Paginatordefaulttext(String DefaultText) {
		DefaultText = Paginaror_text.getText();
	}

	public void PaginatortextValidation() {
		String Oripaginator = Paginaror_text.getText();
		String ExpPaginator = "Showing 1 to 5 of 9 entries";
		Assert.assertEquals(Oripaginator, ExpPaginator);
	}

	public void Paginatornextclick() {
		if (PagisinglenextButton.isDisplayed() & PagisinglenextButton.isEnabled()) {
			PagisinglenextButton.click();
		}
	}

	public void PaginextValidation(String secondpagetext) {
		Paginatornextclick();
		secondpagetext = Paginaror_text.getText();
		Assert.assertTrue(secondpagetext.contains("6 to 10 of 9 entries"));
	}

	public void PagipreviousValidation() {
		if (PagisinglePreviousButton.isDisplayed() & PagisinglePreviousButton.isEnabled()) {
			PagisinglePreviousButton.click();
		}
		String firstpagetext = Paginaror_text.getText();
		Assert.assertTrue(firstpagetext.contains("1 to 5 of 9 entries"));
	}

	public void paginatorlastbutton() {
		if (PagiLastbutton.isDisplayed() & PagiLastbutton.isEnabled()) {
			PagiLastbutton.click();
		}
		String Lastpage = Paginaror_lasttext.getText();
		Assert.assertTrue(Lastpage.contains("1 to 5 of 9 entries"));
	}

	public void entirepaginator(String lastpage) {
		List<WebElement> totalpages = driver.findElements(By.xpath("//span[@class='paginator-element-inserted']"));
		int Totalpagesinpaginator = totalpages.size();
		lastpage = String.valueOf(Totalpagesinpaginator + 1);

	}

////////////////////////////search	
	public void visibilitysearch() {
		Boolean Visibilityofsearch = Search.isDisplayed();
		Assert.assertTrue(Visibilityofsearch);
	}

	public void Programnameinsearch() {
		Search.sendKeys("SDET80");
	}

	public void searchpronamevalidation() {
		Programnameinsearch();
		String bodyText = driver.findElement(By.tagName("body")).getText();
		Assert.assertTrue("Text not found!", bodyText.contains("SDET80"));
	}

	public void ProdescSearch() {
		Search.sendKeys("Selenium");
	}

	public void searchprodescvalidation() {

		ProdescSearch();
		String bodyText1 = driver.findElement(By.tagName("body")).getText();
		Assert.assertTrue("Text not found!", bodyText1.contains("Selenium"));
	}

	public void searchstatus() {
		Search.sendKeys("Active");
	}

	public void Prostatussearch() {
		searchstatus();
		String bodyText2 = driver.findElement(By.tagName("body")).getText();
		Assert.assertTrue("Text not found!", bodyText2.contains("Active"));

	};

//////////Ascending
	public void ClickAscecding() {
		if (pronamesort.isDisplayed() & pronamesort.isEnabled()) {
			pronamesort.click();
		}
	}

	public void Ascendingproname() {

		List templist = new ArrayList();
		List OriginalList = new ArrayList();
		int i = 1;
		do {
			List<WebElement> Programnames = driver.findElements(By.xpath("//tbody[@class='datatable-tbody']//td[2]"));

			for (WebElement e : Programnames) {
				templist.add(e.getText());
			}

			if (PagisinglenextButton.isDisplayed() && PagisinglenextButton.isEnabled()) {
				try {
					PagisinglenextButton.click();
					Thread.sleep(2000);
				} catch (Exception e) {
					System.out.println("Catched the exception");
					break;
				}
			} else {
				System.out.println("Not Clickable" + i);
			}

		} while (i <= 2);

		List templistaftersort = new ArrayList();
		templistaftersort.addAll(templist);
		Collections.sort(templistaftersort);

		pronamesort.click();
		for (int m = 1; m <= 3; m++) {
			List<WebElement> Programnamesafterdort = driver
					.findElements(By.xpath("//tbody[@class='datatable-tbody']//td[2]"));
			for (WebElement k : Programnamesafterdort) {
				OriginalList.add(k.getText());

			}
			System.out.println(OriginalList);
			System.out.println(templistaftersort);
			Assert.assertTrue(OriginalList.equals(templistaftersort));
		}

	}

	public void Prodescasecding() {
		if (Prodescsort.isDisplayed() & Prodescsort.isEnabled()) {
			Prodescsort.click();
		}
	}

	public void AscendingProDesp() {
		// Prodescasecding();
		List templist = new ArrayList();
		List OriginalList = new ArrayList();
		int i = 1;
		do {
			List<WebElement> Programdesc = driver.findElements(By.xpath("//tbody[@class='datatable-tbody']//td[3]"));

			for (WebElement e : Programdesc) {
				templist.add(e.getText());
			}

			if (PagisinglenextButton.isDisplayed() && PagisinglenextButton.isEnabled()) {
				try {
					PagisinglenextButton.click();
					Thread.sleep(2000);
				} catch (Exception e) {
					System.out.println("Catched the exception");
					break;
				}
			} else {
				System.out.println("Not Clickable" + i);
			}

		} while (i <= 2);

		List temprarytaftersort = new ArrayList();
		temprarytaftersort.addAll(templist);
		Collections.sort(temprarytaftersort);

		Prodescsort.click();
		for (int m = 1; m <= 3; m++) {
			List<WebElement> Programdescafterdort = driver
					.findElements(By.xpath("//tbody[@class='datatable-tbody']//td[3]"));
			for (WebElement k : Programdescafterdort) {
				OriginalList.add(k.getText());

			}
			System.out.println(OriginalList);
			System.out.println(temprarytaftersort);
			Assert.assertTrue(OriginalList.equals(temprarytaftersort));
		}

	}

	public void Status_ascending() {
		if (PStatus.isDisplayed() & PStatus.isEnabled()) {
			PStatus.click();
		}
	}

	public void AscendingProStatus() {

		// Status_ascending();
		List templist = new ArrayList();
		List OrigiList = new ArrayList();
		int i = 1;
		do {
			List<WebElement> Programstatus = driver.findElements(By.xpath("//tbody[@class='datatable-tbody']//td[4]"));

			for (WebElement e : Programstatus) {
				templist.add(e.getText());
			}
			if (PagisinglenextButton.isDisplayed() && PagisinglenextButton.isEnabled()) {
				try {
					PagisinglenextButton.click();
					Thread.sleep(2000);
				} catch (Exception e) {
					System.out.println("Catched the exception");
					break;
				}
			} else {
				System.out.println("Not Clickable" + i);
			}

		} while (i <= 2);

		List telistaftersort = new ArrayList();
		telistaftersort.addAll(templist);
		Collections.sort(telistaftersort);

		PStatus.click();
		for (int m = 1; m <= 3; m++) {
			List<WebElement> Programnamesafterdort = driver
					.findElements(By.xpath("//tbody[@class='datatable-tbody']//td[4]"));
			for (WebElement k : Programnamesafterdort) {
				OrigiList.add(k.getText());

			}
			System.out.println(OrigiList);
			System.out.println(telistaftersort);
			Assert.assertTrue(OrigiList.equals(telistaftersort));
		}

	}

////Descending	
	public void clickdecending_proname() {
		if (pronamesort.isDisplayed() & pronamesort.isEnabled()) {
			pronamesort.click();
		}
		pronamesort.click();
	}

	public void decenpro_Name() {
		// clickdecending_proname();

		List templist = new ArrayList();
		List OriList = new ArrayList();
		int i = 1;
		do {
			List<WebElement> Programstatus = driver.findElements(By.xpath("//tbody[@class='datatable-tbody']//td[4]"));

			for (WebElement e : Programstatus) {
				templist.add(e.getText());
			}
			if (PagisinglenextButton.isDisplayed() && PagisinglenextButton.isEnabled()) {
				try {
					PagisinglenextButton.click();
					Thread.sleep(2000);
				} catch (Exception e) {
					System.out.println("Catched the exception");
					break;
				}
			} else {
				System.out.println("Not Clickable" + i);
			}

		} while (i <= 2);

		List telistaftersort = new ArrayList();
		telistaftersort.addAll(templist);
		Collections.sort(telistaftersort, Collections.reverseOrder());

		pronamesort.click();
		pronamesort.click();
		for (int m = 1; m <= 3; m++) {
			List<WebElement> Programnamesafterdort = driver
					.findElements(By.xpath("//tbody[@class='datatable-tbody']//td[4]"));
			for (WebElement k : Programnamesafterdort) {
				OriList.add(k.getText());

			}
			System.out.println(OriList);
			System.out.println(telistaftersort);
			Assert.assertTrue(OriList.equals(telistaftersort));
		}
		Assert.assertTrue(OriList.equals(telistaftersort));
	}

	public void Deceding_prodesc() {
		if (Prodescsort.isDisplayed() & Prodescsort.isEnabled()) {
			Prodescsort.click();
		}
		Prodescsort.click();
	}

	public void DecenPro_des() {
		// Deceding_prodesc();

		List templist = new ArrayList();
		List OriginalList = new ArrayList();
		int i = 1;
		do {
			List<WebElement> Programdesc = driver.findElements(By.xpath("//tbody[@class='datatable-tbody']//td[3]"));

			for (WebElement e : Programdesc) {
				templist.add(e.getText());
			}
			if (PagisinglenextButton.isDisplayed() && PagisinglenextButton.isEnabled()) {
				try {
					PagisinglenextButton.click();
					Thread.sleep(2000);
				} catch (Exception e) {
					System.out.println("Catched the exception");
					break;
				}
			} else {
				System.out.println("Not Clickable" + i);
			}

		} while (i <= 2);

		List temprarytaftersort = new ArrayList();
		temprarytaftersort.addAll(templist);
		Collections.sort(temprarytaftersort, Collections.reverseOrder());

		Prodescsort.click();
		Prodescsort.click();

		for (int m = 1; m <= 3; m++) {
			List<WebElement> Programdescafterdort = driver
					.findElements(By.xpath("//tbody[@class='datatable-tbody']//td[3]"));
			for (WebElement k : Programdescafterdort) {
				OriginalList.add(k.getText());

			}
			System.out.println(OriginalList);
			System.out.println(temprarytaftersort);
			Assert.assertTrue(OriginalList.equals(temprarytaftersort));
		}
	}

	public void decen_proStatus() {

		if (PStatus.isDisplayed() & PStatus.isEnabled()) {
			PStatus.click();
		}
		PStatus.click();
	}

	public void DecenPro_Status() {
		// decen_proStatus();
		List templist = new ArrayList();
		List OrigiList = new ArrayList();
		int i = 1;
		do {
			List<WebElement> Programstatus = driver.findElements(By.xpath("//tbody[@class='datatable-tbody']//td[4]"));

			for (WebElement e : Programstatus) {
				templist.add(e.getText());
			}

			if (PagisinglenextButton.isDisplayed() && PagisinglenextButton.isEnabled()) {
				try {
					PagisinglenextButton.click();
					Thread.sleep(2000);
				} catch (Exception e) {
					System.out.println("No more pages");
					break;
				}
			} else {
				System.out.println("Not Clickable" + i);
			}

		} while (i <= 2);

		List telistaftersort = new ArrayList();
		telistaftersort.addAll(templist);
		Collections.sort(telistaftersort, Collections.reverseOrder());

		PStatus.click();
		PStatus.click();
		for (int m = 1; m <= 3; m++) {
			List<WebElement> Programnamesafterdort = driver
					.findElements(By.xpath("//tbody[@class='datatable-tbody']//td[4]"));
			for (WebElement k : Programnamesafterdort) {
				OrigiList.add(k.getText());

			}
			System.out.println(OrigiList);
			System.out.println(telistaftersort);
			if (OrigiList == telistaftersort) {
				System.out.println("Sorted");
			} else {
				System.out.println("not sorted");
			}

			Assert.assertTrue(OrigiList.equals(telistaftersort));
		}

	}

	public void Emsg() {
		if (errormsg.isDisplayed()) {
			System.out.println(errormsg.getText());
		}
	}

	public void Norighterrormsg(String noright) {
		noright = Norighterrormsg.getText();
		System.out.println(noright);
	}

	/////// Add a New Program
	public void clicknewpro(String Button) {
		Button = NewPro.getText();
		if (NewPro.isDisplayed() & NewPro.isEnabled()) {
			NewPro.click();
		}
	}

	public void newheadindvalidation() {
		String NewHeading = HeadingforNewpro.getText();
		if (NewHeading == "Program Details") {
			System.out.println("Still in Program Details window");
		} else {
			System.out.println("We are in ManageProgram window");
		}
	}

	public void clickingnpro() {
		if (NewPro.isDisplayed() & NewPro.isEnabled()) {
			NewPro.click();
		}
	}

	public void NewproHeading(String Newproheading) {
		/*
		 * if (NewPro.isDisplayed() & NewPro.isEnabled()) { NewPro.click(); }
		 */
		Newproheading = HeadingforNewpro.getText();
		if (HeadingforNewpro.isDisplayed()) {
			System.out.println("Newpro Dialogbox is opened");
		}

	}

	public void clicksave() {
		savenewPro.click();
	}

	public void clickcancel() {
		Cancelnewpro.click();
	}

	public void vlidatintheformwithnodetails() {
		if (NewPro.isDisplayed() & NewPro.isEnabled()) {
			NewPro.click();
		}
		clicksave();
	}

	public void smsg() {
		System.out.println(Successmsg.getText());
	}

	public void Errormsg(String Error) {
		if (errormsg.isDisplayed()) {
			Error = errormsg.getText();
		}
	}

	public void newproname() {
		PronameforNewpro.sendKeys("Sdet80");
	}

	public void newprodesc() {
		Newprodesc.sendKeys("Selenium");
	}

	public void newprosta() {
		Newprostatus.sendKeys("Active");
	}

	public void validatetheformwithdetails() {
		NewPro.click();
		newproname();
		newprodesc();
		newprosta();
		savenewPro.click();
	}

	public void Successmsg(String Success) {
		Success = Successmsg.getText();
	}

	public void addedprosearch() {
		PagiLastbutton.click();
		Search.sendKeys("newlyadded");

		List<WebElement> Beforepagerecords = driver.findElements(By.xpath("//tbody[@class='table-tbody']//td[2]"));
		for (WebElement e : Beforepagerecords) {
			String Beforrecords = e.getText();
		}

		NewPro.click();

		driver.findElement(By.xpath("//input[@id='programName']")).sendKeys("newproname");
		driver.findElement(By.xpath("//span[normalize-space()='Save']")).click();

		List<WebElement> Lastpagerecords = driver.findElements(By.xpath("//tbody[@class='table-tbody']//td[2]"));
		for (WebElement e : Lastpagerecords) {
			String name = e.getText();
			if (name.contains("newproname")) {
				System.out.println("search showed newlyadded pro");
			}
		}

	}

	//////////// Edit
	public void ClickEdit() {
		List<WebElement> editlist = driver.findElements(By.xpath("//span[@class='Edit-rows-selected']"));
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(20));
		w.until(ExpectedConditions.visibilityOfAllElements(editlist));
		System.out.println("Element Located");
	}

	public void ValidatingallEditicons() {
		List<WebElement> editlist = driver.findElements(By.xpath("//span[@class='Edit-rows-selected']"));
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(20));
		w.until(ExpectedConditions.visibilityOfAllElements(editlist));
		System.out.println("Element Located");

		int editnumber = editlist.size();
		for (int i = 0; i <= editnumber; i++) {
			for (WebElement button : editlist) {
				if (button.isDisplayed()) {
					button.click();
					driver.findElement(By.xpath("//span[@class='close']")).click();
				}
			}
			WebElement Pagination = PagisinglenextButton;
			if (Pagination.isEnabled()) {
				Pagination.click();
			}
		}
	}

	public void clickchEdit() {
		Edit.click();
	}

	public void lookingeditedresults() {
		List<WebElement> Beforeeditedrecord = driver.findElements(By.xpath("//tbody[@class='table-tbody']//td[2]"));
		for (WebElement e : Beforeeditedrecord) {
			String Beforenames = e.getText();
		}
		Edit.click();
		List<WebElement> Aftereditedrecord = driver.findElements(By.xpath("//tbody[@class='table-tbody']//td[2]"));
		for (WebElement e : Aftereditedrecord) {
			String Afternames = e.getText();

			if (Afternames.contains("editedpro")) {
				System.out.println("search showed edited pro");
			}
		}
	}

	//// del
	public void clickdel() {
		del.click();
	}

	public void delwindow() {
		if (delwindow.isDisplayed()) {
			System.out.println("Delete alert window is displayed");
		}
	}

	public void delwindowconfirm() {
		delwindow();
		delyes.click();
	}

	public void delwindowcancel() {
		delwindow();
		delno.click();
	}

	public void looking_deletepro() {
		List<WebElement> Beforedelterecord = driver.findElements(By.xpath("//tbody[@class='table-tbody']//td[2]"));
		for (WebElement e : Beforedelterecord) {
			String Beforerecords = e.getText();
		}
		Edit.click();

		List<WebElement> Afterdeleterecord = driver.findElements(By.xpath("//tbody[@class='table-tbody']//td[2]"));
		for (WebElement e : Afterdeleterecord) {
			String Afterrecords = e.getText();

			if (Afterrecords.contains("editedpro")) {
				System.out.println("search showed notdeleted pro");
			} else {
				System.out.println("search not showed deleted pro");
			}
		}
	}

	public void Multipledeleteicon() {
		if (MultipleDelete.isDisplayed() & MultipleDelete.isEnabled()) {
			System.out.println("Delete icon is displayed and enabled");
		}
	}

	public void clickmultipledeletebutton() {
		Multipledeleteicon();
		MultipleDelete.click();
	}

	public void multipledeldialogboxheader() {
		System.out.println(mulDeleteconfirmheader.getText());
	}

	public void countrows(Integer rowcount) {
		List<WebElement> rows = driver.findElements(By.xpath("//table[@class='tr-row-inserted]']/tbody/tr"));
		int count = rows.size();
		rowcount = count;

	}

////check boxes
	public void Multiplecheckboxenable() {
		if (MultipleCheckbox.isDisplayed() && MultipleCheckbox.isEnabled()) {
			System.out.println("Multiple selection Checkbox is Enabled ");

		} else {
			System.out.println("Multiple selection Checkbox is not Enabled");
		}
	}

	public void clickMultiplecheckbox() {
		MultipleCheckbox.click();

	}

	public void Multiplecheckbox_selectionvalidation() {
		MultipleCheckbox.click();
		List<WebElement> allCheckboxList = driver
				.findElements(By.xpath("//div[@class='c-checkbox']//following:: input[@type='checkbox']"));
		if (!allCheckboxList.isEmpty()) {
			Assert.fail();
		}

	}
}
