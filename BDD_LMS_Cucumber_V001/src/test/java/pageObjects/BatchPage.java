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
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BatchPage {
	WebDriver driver;

	public void MngBatchPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(xpath = "//span[@class='Batch']")
	@CacheLookup
	public WebElement Batchmenubutton;

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

	@FindBy(xpath = "//div[normalize-space()='Manage Batch']")
	@CacheLookup
	WebElement Heading;

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

	@FindBy(xpath = "//button[@class='button-trash-all']")
	@CacheLookup
	public WebElement MultipleDelete;

	@FindBy(xpath = "//input[@id='filterGlobal']")
	@CacheLookup
	public WebElement Search;

	@FindBy(xpath = "//div[@class='checkbox-box']")
	@CacheLookup
	public WebElement MainCheckbox;

	@FindBy(xpath = "//th[normalize-space()='Batch Name']")
	@CacheLookup
	WebElement BName;

	@FindBy(xpath = "//th[normalize-space()='Batch Description']")
	@CacheLookup
	WebElement BDescription;

	@FindBy(xpath = "//th[normalize-space()='Batch Status']")
	@CacheLookup
	WebElement BStatus;

	@FindBy(xpath = "//th[normalize-space()='No Of Classes']")
	@CacheLookup
	WebElement Bno_Class;

	@FindBy(xpath = "//th[normalize-space()='Program Name']")
	@CacheLookup
	WebElement PName;

	@FindBy(xpath = "//th[normalize-space()='Edit']")
	@CacheLookup
	WebElement Edit;

	@FindBy(id = "batchNoOfClasses")
	@CacheLookup
	public WebElement Editnoofclass;

	@FindBy(xpath = "//th[normalize-space()='Delete']")
	@CacheLookup
	WebElement del;

	@FindBy(xpath = "//th[normalize-space()='Batch Name']//i")
	@CacheLookup
	WebElement BNamsort;

	@FindBy(xpath = "//th[normalize-space()='Batch Description']//i")
	@CacheLookup
	WebElement Bdessort;

	@FindBy(xpath = "//th[normalize-space()='Batch Status']//i")
	@CacheLookup
	WebElement Bstussort;

	@FindBy(xpath = "//th[normalize-space()='No Of Classes']//i")
	@CacheLookup
	WebElement Bclasssort;

	@FindBy(xpath = "//th[normalize-space()='Program Name']//i")
	@CacheLookup
	WebElement pNamsort;

	@FindBy(xpath = "//div[@class='p-d-flex p-ai-center p-jc-between ng-star-inserted']")
	@CacheLookup
	WebElement FootText;

	@FindBy(xpath = "//th[normalize-space()='Delete-confirm-window-header']")
	@CacheLookup
	WebElement delwindow;

	@FindBy(xpath = "//th[normalize-space()='Delete-confirm']")
	@CacheLookup
	public WebElement delyes;

	@FindBy(xpath = "//th[normalize-space()='Delete-confirm-cancel']")
	@CacheLookup
	public WebElement delno;

	@FindBy(xpath = " //span[normalize-space()='A New Batch']")
	@CacheLookup
	public WebElement NewBatch;

	@FindBy(id = "BatchDetails")
	@CacheLookup
	WebElement HeadingforNewBatch;

	@FindBy(id = "BatchName")
	@CacheLookup
	public WebElement BatchnameforNew;

	@FindBy(id = "programNameDescription")
	@CacheLookup
	public WebElement Newbatchdesc;

	@FindBy(id = "Batchstatus")
	@CacheLookup
	public WebElement Newbatchtatus;

	@FindBy(id = "batchnewclass")
	@CacheLookup
	public WebElement Newnoof_classes;

	@FindBy(id = "New-proname")
	@CacheLookup
	public WebElement NewProname;

	@FindBy(xpath = "//span[@class='drop-down-button']")
	@CacheLookup
	public WebElement Dropdown_fornewpro;

	@FindBy(id = "saveProgram")
	@CacheLookup
	public WebElement savenewbatch;

	@FindBy(id = "CancelProgram")
	@CacheLookup
	public WebElement Cancelnewbatch;

	@FindBy(xpath = " //label[@class='error-msg-inserted']")
	@CacheLookup
	public WebElement errormsg;

	@FindBy(xpath = "//label[@class='no-right-error-msg-inserted']")
	@CacheLookup
	WebElement Norighterrormsg;

	@FindBy(xpath = " //label[@class='Success-msg-inserted']")
	@CacheLookup
	WebElement Successmsg;

	@FindBy(id = "Delte confirm")
	@CacheLookup
	WebElement HeaderDeleteconfirm;

	@FindBy(xpath = "//div[@class='checkbox-box']")
	@CacheLookup
	WebElement checkbox;

	@FindBy(id = "Delete-confirm")
	@CacheLookup
	WebElement mulDeleteconformheader;

	public void adminlogin() {
		username.sendKeys("admin54");
		password.sendKeys("password");
		login.click();

	}

	public void userlogin() {
		username.sendKeys("user45");
		password.sendKeys("password");
		login.click();

	}

	public void stafflogin() {
		username.sendKeys("staff34");
		password.sendKeys("password");
		login.click();

	}

/////////Header	
	public void HeaderValidation(String ExpectedHeading) {
		String OriginalHeading = Heading.getText();
		ExpectedHeading = "Manage Batch";
		Assert.assertEquals(OriginalHeading, ExpectedHeading);
	}

	public void pageTitle() {
		String currenturl = driver.getCurrentUrl();
		if (currenturl.contains("Batch")) {
			System.out.println("you are in Manage Batch Page");

		}
	}

//////////////Footer	
	public void FooterValidation(String Expectedfooter) {
		String Originalfooter = FooterText.getText();
		Expectedfooter = "In total there are 9 programs.";
		Assert.assertEquals(Originalfooter, Expectedfooter);
	}

//////////////Footer	
	public void BatchFooterValidation(String Expectedfooter) {
		String Originalfooter = FooterText.getText();
		Expectedfooter = "In total there are 21 batches";
		Assert.assertEquals(Originalfooter, Expectedfooter);
	}

////////// Pagination

	public void Paginatordefaulttext(String DefaultText) {
		DefaultText = Paginaror_text.getText();
	}

	public void PaginatortextValidation() {
		String Oripaginator = Paginaror_text.getText();
		String ExpPaginator = "Showing 1 to 5 of 21 batches";
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
		Assert.assertTrue(secondpagetext.contains("Showing 6 to 10 of 21 batches"));
	}

	public void PagipreviousValidation() {
		if (PagisinglePreviousButton.isDisplayed() & PagisinglePreviousButton.isEnabled()) {
			PagisinglePreviousButton.click();
		}
		String firstpagetext = Paginaror_text.getText();
		Assert.assertTrue(firstpagetext.contains("Showing 1 to 5 of 21 batches"));
	}

	public void paginatorlastbutton() {
		if (PagiLastbutton.isDisplayed() & PagiLastbutton.isEnabled()) {
			PagiLastbutton.click();
		}
		String Lastpage = Paginaror_lasttext.getText();
		Assert.assertTrue(Lastpage.contains("Showing 1 to 5 of 21 batches"));
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

	public void Batchnameinsearch() {
		Search.clear();
		Search.sendKeys("Edited/added/mot deleted");
	}

	public void searchBatchvalidation() {
		Batchnameinsearch();
		String bodyText = driver.findElement(By.tagName("body")).getText();
		Assert.assertTrue("Text not found!", bodyText.contains("Edited/added/not deleted"));
	}

	public void BatchdescSearch() {
		Search.clear();
		Search.sendKeys("edited/added");
	}

	public void searchbatch_desc_validation() {

		BatchdescSearch();
		String bodyText1 = driver.findElement(By.tagName("body")).getText();
		Assert.assertTrue("Text not found!", bodyText1.contains("editeddesc"));
	}

	public void search_elpro() {
		String bodyText1 = driver.findElement(By.tagName("body")).getText();
		if (bodyText1.contains("not deletedpro")) {
			System.out.println("Not deleted");
		} else {
			System.out.println("deleted");
		}
	}

	public void searchstatus() {
		Search.clear();
		Search.sendKeys("Active");
	}

	public void batchstatussearch() {
		searchstatus();
		String bodyText2 = driver.findElement(By.tagName("body")).getText();
		Assert.assertTrue("Text not found!", bodyText2.contains("Active"));
	}

	public void noof_classes() {
		String Searchnoofclasses = driver.findElement(By.tagName("body")).getText();
		Assert.assertTrue("Text not found!", Searchnoofclasses.contains("20"));
	}

	public void searchpronamevalidation() {
		String bodyText = driver.findElement(By.tagName("body")).getText();
		Assert.assertTrue("Text not found!", bodyText.contains("Java"));
	}

	public void decendingbatchname() {

		List NewBattemplist = new ArrayList();
		List NewbatOriginalList = new ArrayList();
		int i = 1;
		do {
			List<WebElement> Batchnames = driver.findElements(By.xpath("//tbody[@class='datatable-tbody']//td[2]"));

			for (WebElement e : Batchnames) {
				NewBattemplist.add(e.getText());
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
		templistaftersort.addAll(NewBattemplist);
		Collections.sort(templistaftersort, Collections.reverseOrder());

		BNamsort.click();
		BNamsort.click();
		for (int m = 1; m <= 3; m++) {
			List<WebElement> Programnamesafterdort = driver
					.findElements(By.xpath("//tbody[@class='datatable-tbody']//td[2]"));
			for (WebElement k : Programnamesafterdort) {
				NewbatOriginalList.add(k.getText());

			}
			System.out.println(NewbatOriginalList);
			System.out.println(templistaftersort);
			Assert.assertTrue(NewbatOriginalList.equals(templistaftersort));
		}
	}

	public void decendingbatchDesp() {

		List templist = new ArrayList();
		List OriginalList = new ArrayList();
		int i = 1;
		do {
			List<WebElement> Batchdesc = driver.findElements(By.xpath("//tbody[@class='datatable-tbody']//td[3]"));

			for (WebElement e : Batchdesc) {
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

		Bdessort.click();
		Bdessort.click();
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

	public void decendingbatchStatus() {

		List templist = new ArrayList();
		List OrigiList = new ArrayList();
		int i = 1;
		do {
			List<WebElement> Batchstatus = driver.findElements(By.xpath("//tbody[@class='datatable-tbody']//td[4]"));

			for (WebElement e : Batchstatus) {
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

		Bstussort.click();
		Bstussort.click();
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

	public void decendingbatchclasses() {

		List templist = new ArrayList();
		List OrigiList = new ArrayList();
		int i = 1;
		do {
			List<WebElement> Batchclass = driver.findElements(By.xpath("//tbody[@class='datatable-tbody']//td[5]"));

			for (WebElement e : Batchclass) {
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

		Bclasssort.click();
		Bclasssort.click();
		for (int m = 1; m <= 3; m++) {
			List<WebElement> Programnamesafterdort = driver
					.findElements(By.xpath("//tbody[@class='datatable-tbody']//td[5]"));
			for (WebElement k : Programnamesafterdort) {
				OrigiList.add(k.getText());

			}
			System.out.println(OrigiList);
			System.out.println(telistaftersort);
			Assert.assertTrue(OrigiList.equals(telistaftersort));
		}
	}

	public void decendingpname() {

		List templist = new ArrayList();
		List OrigiList = new ArrayList();
		int i = 1;
		do {
			List<WebElement> Batchclass = driver.findElements(By.xpath("//tbody[@class='datatable-tbody']//td[6]"));

			for (WebElement e : Batchclass) {
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

		pNamsort.click();
		pNamsort.click();
		for (int m = 1; m <= 3; m++) {
			List<WebElement> Programnamesafterdort = driver
					.findElements(By.xpath("//tbody[@class='datatable-tbody']//td[6]"));
			for (WebElement k : Programnamesafterdort) {
				OrigiList.add(k.getText());

			}
			System.out.println(OrigiList);
			System.out.println(telistaftersort);
			Assert.assertTrue(OrigiList.equals(telistaftersort));
		}
	}

	public void ClickAscecding() {
		if (BNamsort.isDisplayed() & BNamsort.isEnabled()) {
			BNamsort.click();
		}
	}

	public void Ascendingbatchname() {
		// ClickAscecding();

		List templist = new ArrayList();
		List OriginalList = new ArrayList();
		int i = 1;
		do {
			List<WebElement> Batchnames = driver.findElements(By.xpath("//tbody[@class='datatable-tbody']//td[2]"));

			for (WebElement e : Batchnames) {
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

		BNamsort.click();
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

	public void batchdescasecding() {
		if (Bdessort.isDisplayed() & Bdessort.isEnabled()) {
			Bdessort.click();
		}
	}

	public void AscendingbatchDesp() {

		List templist = new ArrayList();
		List OriginalList = new ArrayList();
		int i = 1;
		do {
			List<WebElement> Batchdesc = driver.findElements(By.xpath("//tbody[@class='datatable-tbody']//td[3]"));

			for (WebElement e : Batchdesc) {
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

		Bdessort.click();
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
		if (Bstussort.isDisplayed() & Bstussort.isEnabled()) {
			Bstussort.click();
		}
	}

	public void AscendingbatchStatus() {
		// Status_ascending();
		List templist = new ArrayList();
		List OrigiList = new ArrayList();
		int i = 1;
		do {
			List<WebElement> Batchstatus = driver.findElements(By.xpath("//tbody[@class='datatable-tbody']//td[4]"));

			for (WebElement e : Batchstatus) {
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

		Bstussort.click();
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

	public void Noofclasses_ascendingclick() {
		if (Bclasssort.isDisplayed() & Bclasssort.isEnabled()) {
			Bclasssort.click();
		}
	}

	public void Ascendingbatchclasses() {
		// Status_ascending();
		List templist = new ArrayList();
		List OrigiList = new ArrayList();
		int i = 1;
		do {
			List<WebElement> Batchclass = driver.findElements(By.xpath("//tbody[@class='datatable-tbody']//td[5]"));

			for (WebElement e : Batchclass) {
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

		Bclasssort.click();
		for (int m = 1; m <= 3; m++) {
			List<WebElement> Programnamesafterdort = driver
					.findElements(By.xpath("//tbody[@class='datatable-tbody']//td[5]"));
			for (WebElement k : Programnamesafterdort) {
				OrigiList.add(k.getText());

			}
			System.out.println(OrigiList);
			System.out.println(telistaftersort);
			Assert.assertTrue(OrigiList.equals(telistaftersort));
		}
	}

	public void pnamesortclick() {
		if (pNamsort.isDisplayed() & pNamsort.isEnabled()) {
			pNamsort.click();
		}
	}

	public void Ascendingpname() {
		// Status_ascending();
		List templist = new ArrayList();
		List OrigiList = new ArrayList();
		int i = 1;
		do {
			List<WebElement> Batchclass = driver.findElements(By.xpath("//tbody[@class='datatable-tbody']//td[6]"));

			for (WebElement e : Batchclass) {
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

		pNamsort.click();
		for (int m = 1; m <= 3; m++) {
			List<WebElement> Programnamesafterdort = driver
					.findElements(By.xpath("//tbody[@class='datatable-tbody']//td[6]"));
			for (WebElement k : Programnamesafterdort) {
				OrigiList.add(k.getText());

			}
			System.out.println(OrigiList);
			System.out.println(telistaftersort);
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

	/////// Add a New Batch
	public void clicknewbatch(String Button) {
		Button = NewBatch.getText();
		if (NewBatch.isDisplayed() & NewBatch.isEnabled()) {
			NewBatch.click();
		}
	}

	public void newheadindvalidation() {
		String NewHeading = HeadingforNewBatch.getText();
		if (NewHeading == "Batch Details") {
			System.out.println("Still in Batch Details window");
		} else {
			System.out.println("We are in Manage Batch window");
		}
	}

	public void clickingnbatch() {
		if (NewBatch.isDisplayed() & NewBatch.isEnabled()) {
			NewBatch.click();
		}
	}

	public void NewbatchHeading(String Newheading) {

		Newheading = HeadingforNewBatch.getText();
		if (HeadingforNewBatch.isDisplayed()) {
			System.out.println("Newbatch Dialogbox is opened");
		}
	}

	public List<String> dropdown_forpronames() {
		// Dropdown_fornewpro
		List<String> options = new ArrayList<String>();
		for (WebElement option : new Select(Dropdown_fornewpro).getOptions()) {
			options.add(option.getText());
		}
		return options;
	}

	public void clicksave() {
		savenewbatch.click();
	}

	public void clickcancel() {
		Cancelnewbatch.click();
	}

	public void vlidatintheformwithnodetails() {
		if (NewBatch.isDisplayed() & NewBatch.isEnabled()) {
			NewBatch.click();
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

	public void newBatchname() {
		BatchnameforNew.sendKeys("Sdet80");
	}

	public void newbachdesc() {
		Newbatchdesc.sendKeys("Selenium");
	}

	public void newbatcsta() {
		Newbatchtatus.sendKeys("Active");
	}

	public void newclass() {

	}

	public void validatetheformwithdetails() {
		NewBatch.click();
		newBatchname();
		newbachdesc();
		newbatcsta();
		savenewbatch.click();
	}

	public void Successmsg(String Success) {
		Success = Successmsg.getText();
	}

	public void addedBatchsearch() {
		PagiLastbutton.click();
		PagiLastbutton.click();
		Search.sendKeys("newlyadded");
		List<WebElement> Beforepagerecords = driver.findElements(By.xpath("//tbody[@class='table-tbody']//td[2]"));
		for (WebElement e : Beforepagerecords) {
			String Beforrecords = e.getText();
		}

		NewBatch.click();

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

	public void Headerdelte() {
		String Heardel = delwindow.getText();
		System.out.println(Heardel);
	}

	public void delwindowdisplayed() {
		if (delwindow.isDisplayed()) {
			System.out.println("Delete alert window is displayed");
		}
	}

	public void delwindowconfirm() {
		del.click();
		delwindowdisplayed();
		delyes.click();
	}

	public void delwindowcancel() {
		delwindowdisplayed();
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
		if (MultipleDelete.isEnabled()) {
			System.out.println("Delete icon is enabled");
		} else {
			System.out.println("Delete button is not enabled ");
		}
	}

	public void clickmultipledeletebutton() {
		Multipledeleteicon();
		MultipleDelete.click();
	}

	public void multipledeldialogboxheader() {
		System.out.println(mulDeleteconformheader.getText());
	}

	/// noofrows
	public void countrows(Integer rowcount) {
		List<WebElement> rows = driver.findElements(By.xpath("//table[@class='tr-row-inserted]']/tbody/tr"));
		int count = rows.size();
		rowcount = count;

	}

	//// checkboxes
	public void Multpilecheckbox() {
		if (MainCheckbox.isDisplayed() & MainCheckbox.isEnabled()) {
			System.out.println("Multiple selection Checkbox is displayed ");
			MainCheckbox.click();

		} else {
			System.out.println("Multiple selection Checkbox is not displayed");
		}
	}

	public void clickMultiplecheckbox() {
		Multpilecheckbox();
		MainCheckbox.click();
	}

	public void Multiplecheckbox_selectionvalidation() {
		MainCheckbox.click();
		List<WebElement> allCheckboxList = driver
				.findElements(By.xpath("//div[@class='c-checkbox']//following:: input[@type='checkbox']"));
		if (!allCheckboxList.isEmpty()) {
			Assert.fail();
		}

	}

}
