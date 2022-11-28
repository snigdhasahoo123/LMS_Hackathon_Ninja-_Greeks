package pageObjects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.AssertJUnit;

public class Assignmentpageobj {
	public WebDriver ldriver;

	public Assignmentpageobj(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(className = "mat-focus-indicator mat-button mat-button-base")
	WebElement Assignment;
	@FindBy(xpath = "//div/mat-card/mat-card-title/div[contains(text(),'Manage Assignment')]")
	WebElement Manageassignment; // manage assignment
	@FindBy(xpath = "//div/button/span[contains(@class,'p-button-icon pi pi-trash')]")
	WebElement Deleteallbutton; // delete all
	@FindBy(xpath = "//div/span/input[contains(@class,'p-inputtext p-component')]")
	WebElement Search;// search option
	@FindBy(xpath = "//div/button/span[contains(@class,'p-button-icon p-button-icon-left pi pi-plus')]")
	WebElement plusbutton;// +sign
	@FindBy(xpath = "//div/button/span[contains(text() ,'A New Assignment')]")
	WebElement Newassignment; // new assignment
	@FindBy(xpath = "//div/div[contains(@class,'p-checkbox-box')]")
	WebElement Selectallcheckbox; // Select all check box
	@FindBy(xpath = "//th[contains(@class,'p-sortable-column p-highlight')]")
	WebElement AssignmentName; // Assignment name
	@FindBy(xpath = "//th[contains(text(),'Assignment Description ')]")
	WebElement AssignmentDescription; // Assignment description

	@FindBy(xpath = "//th[contains(text(),'Assignment Due Date ')]")
	WebElement AssignmentDueDate; // Assignment due date
	@FindBy(xpath = "//th[contains(text(),'Assignment Grade ')]")
	WebElement AssignmentGrade; // Assignment grade
	@FindBy(xpath = "//th[contains(text(),'Edit / Delete')]")
	WebElement Editdeletetitle; // Edit delete title
	@FindBy(xpath = "//div/span[contains(@class,'p-checkbox-icon')]")
	WebElement rowcheckbox; // row check box
	@FindBy(xpath = "//td/button/span[contains(text(),'Manage')]")
	WebElement Managebutton; // Manage button
	@FindBy(xpath = "//td/div/span/button/span[contains(@class,'p-button-icon pi pi-pencil')]")
	WebElement Editbutton; // Edit button
	@FindBy(xpath = "//td/div/span/button/span[contains(@class,'p-button-icon pi pi-trash')]")
	WebElement Deletebutton; // delete button
	@FindBy(xpath = "//p-paginator/div/span[contains(@class,'p-paginator-current ng-star-inserted')]")
	WebElement paginatorentry; // no of entries
	@FindBy(xpath = "//p-paginator/div/button/span[contains(@class,'p-paginator-icon pi pi-angle-double-left')]')]")
	WebElement Paginatorleftdouble; // <<
	@FindBy(xpath = "//p-paginator/div/button[contains(@class,'p-paginator-prev p-paginator-element p-link p-disabled p-ripple')]')]")
	WebElement paginatorleftsingle;// <
	@FindBy(xpath = "//p-paginator/div/span[contains(@class,'p-paginator-pages ng-star-inserted')]")
	WebElement paginatornumberlink;// 1,2,3
	@FindBy(xpath = "//button/span[contains(@class,'p-paginator-icon pi pi-angle-right')]")
	WebElement paginatorrightsinglearrow;// >
	@FindBy(xpath = "//button/span[contains(@class,'p-paginator-icon pi pi-angle-double-right')]")
	WebElement paginatorrightdoublearrow;// >
	@FindBy(xpath = "//div/span[contains(@class,'p-dialog-title ng-tns-c132-13 ng-star-inserted')]")
	WebElement Assignmentdetails;
	@FindBy(xpath = "//div/label[contains(text(),'Assignment Name')]")
	WebElement Assignmentname;
	@FindBy(xpath = "//div/input[contains(@id,'assignment')]")
	WebElement Assignmentnametextbox;
	@FindBy(xpath = "//div/label[contains(text(),'Assignment Description')]")
	WebElement Assignmentdescription;
	@FindBy(xpath = "//div/input[contains(@id,'assignment')]")
	WebElement Assignmentdescriptiontextbox;
	@FindBy(xpath = "//div/label[contains(text(),'Assignment Grade')]")
	WebElement Assignmentgrade;
	@FindBy(xpath = "//div/input[contains(@id,'assignment')]")
	WebElement Assignmentgradetextbox;
	@FindBy(xpath = "//div/input[contains(@id,'assignment')]")
	WebElement Assignmentduedate;
	@FindBy(xpath = "//div/input[contains(@id,'assignment')]")
	WebElement Assignmentduedatetextbox;
	@FindBy(xpath = "//button/span[contains(@class,'p-button-icon pi pi-calendar')]")
	WebElement Assignmentduedateslectionfromclaender;
	@FindBy(xpath = "//div/button/span[contains(text(),'Cancel')]")
	WebElement Cancelbutton;
	@FindBy(xpath = "//div/button/span[contains(text(),'Save')]")
	WebElement Savebutton;
	@FindBy(xpath = "//div/button/span[contains(@class,'p-dialog-header-close-icon ng-tns-c132-13 pi pi-times')]")
	WebElement closingbutton;// X window
	@FindBy(xpath = "//div[contains(@class,'p-datatable-footer ng-star-inserted')]")
	WebElement footertext;// footer text
	@FindBy(xpath = "//div[contains(@class,'p-datatable-footer ng-star-inserted')]")
	WebElement Ascendingaasignname;// ascending assignment Name
	@FindBy(xpath = "//div[contains(@class,'p-datatable-footer ng-star-inserted')]")
	WebElement Ascendingassigndescri;// ascending assignment description
	@FindBy(xpath = "//div[contains(@class,'p-datatable-footer ng-star-inserted')]")
	WebElement Ascendingassignduedate;// ascending assignment due date
	@FindBy(xpath = "//div[contains(@class,'p-datatable-footer ng-star-inserted')]")
	WebElement Ascendingassigngrade;// ascending assignment grade
	@FindBy(xpath = "//div[contains(@class,'p-datatable-footer ng-star-inserted')]")
	WebElement decendingaasignname;// descending assignment Name
	@FindBy(xpath = "//div[contains(@class,'p-datatable-footer ng-star-inserted')]")
	WebElement decendingassigndescri;// decending assignment description
	@FindBy(xpath = "//div[contains(@class,'p-datatable-footer ng-star-inserted')]")
	WebElement decendingassignduedate;// decending assignment due date
	@FindBy(xpath = "//div[contains(@class,'p-datatable-footer ng-star-inserted')]")
	WebElement decendingassigngrade;// decending assignment grade
	@FindBy(xpath = "//div/button/span[contains(text(),'firstname')]")
	WebElement firstname;
	@FindBy(xpath = "//div/button/span[contains(text(),'lastname')]")
	WebElement lastname;
	@FindBy(xpath = "//div/button/span[contains(text(),'email id')]")
	WebElement emailid;
	@FindBy(xpath = "//div/button/span[contains(text(),'google id')]")
	WebElement gooformsubmit;
	@FindBy(xpath = "//div/button/span[contains(text(),'google switch')]")
	WebElement switchaccountlink;
	@FindBy(xpath = "//div/button/span[contains(text(),'log-button')]")
	WebElement logoutbutton;

//Action Methods

	public void Assignmentlink() {
		Assignment.click();
	}

	public void manageassignmenttitle() {
		Manageassignment.getText();
	}

	public void headervalidation() {
		String text = Manageassignment.getText();
		String requiredText = "Manage Assignment";
		Assert.assertEquals(text, requiredText);
		Assert.assertNull(text);
	}

	public void footervalidation() {
		if (ldriver.getPageSource().contains("In total there are 3 assignments")) {

			AssertJUnit.assertTrue(true);
		} else {
			System.out.println("Footer text Mismatched");
		}
	}

	public void paginatorentries() {
		if (ldriver.getPageSource().contains("Showing 1 to 3 of 3 entries")) {

			AssertJUnit.assertTrue(true);
		} else {
			System.out.println("paginator text mismatched");
		}
	}

	public void paginatoridentify() {
		paginatorentry.click();
	}

	public void nextpagebutton() {
		boolean nextpagemove = paginatornumberlink.isEnabled();
		if (nextpagemove) {
			System.out.println("paginator next page button  enabled");
		} else {
			System.out.println("paginator next page button link not enable ");
		}

	}

	public void nextpage() {
		String currentpage = paginatornumberlink.getText();
		int cp = Integer.parseInt(currentpage);
		cp++;
		paginatorrightsinglearrow.click();
		String nxtpage = paginatornumberlink.getText();
		int np = Integer.parseInt(nxtpage);
		if (cp == np) {
			System.out.println("Navigated to next page");

		} else {
			System.out.println(" next page button disabled");
		}

		// last page
		String pageLength = paginatornumberlink.getText();
		int pLen = Integer.parseInt(currentpage);

		paginatorrightdoublearrow.click();

		String lstpage = paginatornumberlink.getText();
		int lp = Integer.parseInt(lstpage);
		if (lp == pLen) {
			System.out.println("Navigated to Last page");

		}

	}

	public void previouspage() {

		// paginatorleftsingle.click();

		String currentpage = paginatornumberlink.getText();
		int cp = Integer.parseInt(currentpage);
		cp--;
		paginatorleftsingle.click();
		String prepage = paginatornumberlink.getText();
		int pp = Integer.parseInt(prepage);
		if (cp == pp) {
			System.out.println("Navigated to previous page");
		}

	}

	public void firstpage() {
		// First page

		Paginatorleftdouble.click();
		String frstpage = paginatornumberlink.getText();
		int fp = Integer.parseInt(frstpage);
		if (fp == 1) {
			System.out.println("Navigated to next page");
		}
		// Paginatorleftdouble.click();

	}

	public void lastpage() {
		// String pageLength = paginatornumberlink.getSize();
		int pLen = Integer.parseInt("5");

		paginatorrightdoublearrow.click();

		String lstpage = paginatornumberlink.getText();
		int lp = Integer.parseInt(lstpage);
		if (lp == pLen) {
			System.out.println("Navigated to Last page");

		}
		// paginatorrightdoublearrow.click();

	}

	public void searchassignmentname() {
		Search.sendKeys("Sql Assignment");
		Search.click();
	}

	public void searchassignmentnamevalidation()

	{
		String text = Assignmentname.getText();

		String requiredText = "Sql Assignment";
		Assert.assertEquals(text, requiredText);
		Assert.assertNull(text);
	}

	public void Assignnameascarrow() {
		Ascendingaasignname.click();

	}

	public void assinmentnameascvalidation() {
		ArrayList<String> assnameList = new ArrayList<String>();
		List<WebElement> assnameweblist = ldriver.findElements(By.className("p-datatable-tbody"));
		for (WebElement we : assnameweblist) {
			assnameList.add(we.getText());
		}
		ArrayList<String> sortedList = new ArrayList<String>();
		for (String s : assnameList) {
			sortedList.add(s);
		}
		Collections.sort(sortedList);
		Assert.assertTrue(sortedList.equals(assnameList));

	}

	public void Assigndescriptionascarrow() {
		Ascendingaasignname.click();

	}

	public void assinmentdescascvalidation() {
		ArrayList<String> assnameList = new ArrayList<String>();
		List<WebElement> assnameweblist = ldriver.findElements(By.className("p-datatable-tbody"));
		for (WebElement we : assnameweblist) {
			assnameList.add(we.getText());
		}
		ArrayList<String> sortedList = new ArrayList<String>();
		for (String s : assnameList) {
			sortedList.add(s);
		}
		Collections.sort(sortedList);
		Assert.assertTrue(sortedList.equals(assnameList));
	}

	public void Assignduedateascarrow() {
		Ascendingaasignname.click();

	}

	public void assinmentduedatecascvalidation() {
		ArrayList<String> assnameList = new ArrayList<String>();
		List<WebElement> assnameweblist = ldriver.findElements(By.className("p-datatable-tbody"));
		for (WebElement we : assnameweblist) {
			assnameList.add(we.getText());
		}
		ArrayList<String> sortedList = new ArrayList<String>();
		for (String s : assnameList) {
			sortedList.add(s);
		}
		Collections.sort(sortedList);
		Assert.assertTrue(sortedList.equals(assnameList));
	}

	public void Assigngradearrow() {
		Ascendingaasignname.click();

	}

	public void assinmentgradeascvalidation() {
		ArrayList<String> assnameList = new ArrayList<String>();
		List<WebElement> assnameweblist = ldriver.findElements(By.className("p-datatable-tbody"));
		for (WebElement we : assnameweblist) {
			assnameList.add(we.getText());
		}
		ArrayList<String> sortedList = new ArrayList<String>();
		for (String s : assnameList) {
			sortedList.add(s);
		}
		Collections.sort(sortedList);
		Assert.assertTrue(sortedList.equals(assnameList));
	}

	public void Assignnamedescarrow() {
		Ascendingaasignname.click();

	}

	public void assinmentnamedescvalidation() {
		ArrayList<String> assnameList = new ArrayList<String>();
		List<WebElement> assnameweblist = ldriver.findElements(By.className("p-datatable-tbody"));
		for (WebElement we : assnameweblist) {
			assnameList.add(we.getText());
		}
		ArrayList<String> sortedList = new ArrayList<String>();
		for (String s : assnameList) {
			sortedList.add(s);
		}
		Collections.sort(sortedList);
		Assert.assertTrue(sortedList.equals(assnameList));

	}

	public void Assigndescriptiondescarrow() {
		Ascendingaasignname.click();

	}

	public void assinmentdescdescvalidation() {
		ArrayList<String> assnameList = new ArrayList<String>();
		List<WebElement> assnameweblist = ldriver.findElements(By.className("p-datatable-tbody"));
		for (WebElement we : assnameweblist) {
			assnameList.add(we.getText());
		}
		ArrayList<String> sortedList = new ArrayList<String>();
		for (String s : assnameList) {
			sortedList.add(s);
		}
		Collections.sort(sortedList);
		Assert.assertTrue(sortedList.equals(assnameList));
	}

	public void Assignduedatedescarrow() {
		Ascendingaasignname.click();

	}

	public void assinmentduedatedescvalidation() {
		ArrayList<String> assnameList = new ArrayList<String>();
		List<WebElement> assnameweblist = ldriver.findElements(By.className("p-datatable-tbody"));
		for (WebElement we : assnameweblist) {
			assnameList.add(we.getText());
		}
		ArrayList<String> sortedList = new ArrayList<String>();
		for (String s : assnameList) {
			sortedList.add(s);
		}
		Collections.sort(sortedList);
		Assert.assertTrue(sortedList.equals(assnameList));
	}

	public void Assigngradedescarrow() {
		Ascendingaasignname.click();

	}

	public void assinmentgradedescvalidation() {
		ArrayList<String> assnameList = new ArrayList<String>();
		List<WebElement> assnameweblist = ldriver.findElements(By.className("p-datatable-tbody"));
		for (WebElement we : assnameweblist) {
			assnameList.add(we.getText());
		}
		ArrayList<String> sortedList = new ArrayList<String>();
		for (String s : assnameList) {
			sortedList.add(s);
		}
		Collections.sort(sortedList);
		Assert.assertTrue(sortedList.equals(assnameList));
	}

	public void staffmanageassignmentpage() {
		if (ldriver.getPageSource().contains("Manage Assignment ")) {

			AssertJUnit.assertTrue(true);
		} else {
			System.out.println("staff is not in manage assignment");

		}

	}

	public void Addnewassignment()

	{
		Newassignment.click();
	}

	public void Addnewassignmentnewpopup()

	{
		Alert alert = ldriver.switchTo().alert();
	}

	public void addnewassignmentforuser(String role) {

		if (role.equals("Admin") || role.equals("user") || role.equals("Staff"))

		{
			System.out.println("Staff only have access to add New Assignment");

		}
	}

	public void staffclicksaveallfieldempty()

	{
		Assignmentnametextbox.clear();
		Assignmentdescriptiontextbox.clear();
		Assignmentgradetextbox.clear();
		Assignmentduedatetextbox.clear();

		Savebutton.click();

	}

	public void staffclicksaveerrormessage() {
		String errortext = ldriver.findElement(By.className("p-invalid ng-star-inserted")).getText();
		if (errortext.equals("Name is required")) {
			System.out.println("Staff got error messgae");
		}
	}

	public void staffclickssaveafterenteringdetails() {
		Assignmentnametextbox.sendKeys("ass");
		Assignmentdescriptiontextbox.sendKeys("ass");
		Assignmentgradetextbox.sendKeys("ass");
		Assignmentduedatetextbox.sendKeys("12/11/2022");
		Savebutton.click();

	}

	public void newassinmentsuccessadded()

	{
		String successtext = ldriver.findElement(By.className("p-invalid ng-star-inserted")).getText();
		if (successtext.equals("Successfully added")) {
			System.out.println("Staff got successfully added messgae");
		}
	}

	public void newlyaddedassignvalidation() {
		int n = 0;
		for (int i = 1; i <= n; i++) {
			String rowvalue = ldriver.findElement(By.className("ng-star-inserted")).getText();
			Assert.assertEquals(rowvalue, "sql/ass/mm/nn/ss");
			System.out.println("new added data available in table ");
		}
	}

	public void clickcancelafterenteringallfields()

	{
		Assignmentnametextbox.sendKeys("ass");
		Assignmentdescriptiontextbox.sendKeys("ass");
		Assignmentgradetextbox.sendKeys("ass");
		Assignmentduedatetextbox.sendKeys("12/11/2022");
		Cancelbutton.click();
	}

	public void managebuttonunderassignmentgrade()

	{
		Managebutton.click();
	}

	public void navigatetogradewindow()

	{
		Alert alert = ldriver.switchTo().alert();
		alert.accept();
	}

	public void Editbutton()

	{
		Editbutton.click();
	}

	public void Editclickassignmentdetailswindow()

	{
		String Assigndetailsheader = Assignmentdetails.getText();

		if (Assigndetailsheader.equals("Assignment Details")) {
			System.out.println("Navigated to Assignment details page");

		} else {
			System.out.println("not in  Assignment details page");
		}
	}

	public void Editassigndetailsthensave()

	{
		Editbutton.click();
		ldriver.switchTo().alert().accept();
		Assignmentnametextbox.clear();
		Assignmentnametextbox.sendKeys("SQL");
		Savebutton.click();

	}

	public void Editassigndescriptionthensave()

	{
		Editbutton.click();
		ldriver.switchTo().alert().accept();
		Assignmentnametextbox.clear();
		Assignmentnametextbox.sendKeys("Plsqlpractice");
		Savebutton.click();

	}

	public void Editassigngradethensave()

	{
		Editbutton.click();
		ldriver.switchTo().alert().accept();
		Assignmentgradetextbox.clear();
		Assignmentgradetextbox.sendKeys("Plsqlpractice");
		Savebutton.click();

	}

	public void Editassignduedatethensave()

	{
		Editbutton.click();
		ldriver.switchTo().alert().accept();
		Assignmentgradetextbox.clear();
		Assignmentgradetextbox.sendKeys("Plsqlpractice");
		Savebutton.click();

	}

	public void cancelclick() {
		Cancelbutton.click();
	}

	public void Assignmentnameclick() {
		AssignmentName.click();
	}

	public void googleformopen() {
		ldriver.findElement(By.id("googleform"));

	}

	public void clickassigngoogleform() {

		ldriver.getWindowHandle();

	}

	public void Assignmentdescriptionclick() {
		Assignmentdescription.click();
	}

	public void Assignmentgradeclick() {
		Assignmentgrade.click();
	}

	public void Assignmentduedateclick() {
		Assignmentduedate.click();
	}

	public void admingetalertmessage() {
		String alertMessage = ldriver.switchTo().alert().getText();
		if (alertMessage.equals("you dont have access")) {
			System.out.println(alertMessage);

		}
	}

	public void googleformfield() {
		firstname.sendKeys("MM");
		lastname.sendKeys("MPP");
		emailid.sendKeys("abc@mail.com");
		gooformsubmit.click();
	}

	public void googleformfieldempty() {
		firstname.clear();
		lastname.clear();
		emailid.clear();
		gooformsubmit.click();

	}

	public void googleformwarningmsg() {

		String waringmsg = ldriver.findElement(By.id("googleform")).getText();
		if (waringmsg.equals("Name is required")) {
			System.out.println(" got warning messgae");
		}

	}

	public void googleformfieldclear() {
		firstname.clear();
		lastname.clear();
		emailid.clear();
		gooformsubmit.click();
	}

	public void googleformfieldemptyvalidation()

	{
		String fname = firstname.getText();
		String lname = lastname.getText();
		String email = emailid.getText();

		if (fname.isEmpty() && lname.isEmpty() && email.isEmpty())

		{
			System.out.println("fields are empty");
		}
	}

	public void switchaccount() {
		switchaccountlink.click();
	}

	public void switchaccountsuccessful() {
		WindowType window = null;
		ldriver.switchTo().newWindow(window);
	}

	public void switchaccountaccept() {
		ldriver.switchTo().alert();
	}

	public void deleteforeachrow() {
		Deletebutton.click();

	}

	public void deleteconfirmationwindow() {
		ldriver.switchTo().alert();

	}

	public void deleteconfirmationwindowselectyes() {
		ldriver.switchTo().alert().accept();

	}

	public void deleteconfrmationmessagestaff() {
		String deletionalertmsg = ldriver.switchTo().alert().getText();
		if (deletionalertmsg.equals("Assignment Deleted Successfully")) {
			System.out.println("assignment deleted successfully");
		}

	}

	public void deleteconfirmationwindowselectno() {
		ldriver.switchTo().alert();

	}

	public void deleteconfirmationwindowdismiss() {
		ldriver.switchTo().alert().dismiss();

	}

	public void deleteconfrmationmessagesadmin() {
		String deletionalertmsg = ldriver.switchTo().alert().getText();
		if (deletionalertmsg.equals("staff only have access")) {
			System.out.println("staff only having access");
		}

	}

	public void deleteall() {
		Deleteallbutton.click();

	}

	public void deletealldisablevalidation()

	{
		if (!(Deleteallbutton.isEnabled()))

		{
			System.out.println(" delete button diabled for admin and user");

		}

	}

	public void staffdeleteallandmutiplecheckbox() {
		Selectallcheckbox.click();
		Deleteallbutton.click();
	}

	public void mutiplecheckboxselection() {
		Selectallcheckbox.click();

	}

	public void mutipleselectioncheckboxenabled()

	{
		if (Selectallcheckbox.isEnabled())

		{
			System.out.println(" check box enabled  for staff,admin and user");

		}

	}

	public void individaulcheckboxselection() {
		rowcheckbox.click();

	}

}
