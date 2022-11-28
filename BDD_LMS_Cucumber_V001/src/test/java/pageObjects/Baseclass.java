package pageObjects;

import java.io.File;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.BeforeClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

import Assignmentutilities.readconfig;
import stepDefinition.Logoutstepdef;

public class Baseclass {

	public static WebDriver driver;
	public Assignmentpageobj ap;
	public Logoutstepdef lo;
	public Loginpageobj ln;
	public readconfig rc;
	Assignmentutilities.readconfig readconfig = new Assignmentutilities.readconfig();
	public String baseUrl = readconfig.getApplicationURL();
	public String loginurl = readconfig.loginURL();
	public String Username = readconfig.getUsername();
	public String Password = readconfig.getPassword();
	public String code = readconfig.getcode();
	public String sourcedata = readconfig.getsource();
	public String newpassword = readconfig.getnewPassword();
	public String retypepassword = readconfig.retypePassword();

	@BeforeClass
	public void Intialization() {

		System.setProperty("webdriver.chrome.driver",
				"/Users/Owner/eclipse-workspace/BDD_LMS_Cucumber_V001/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(" ");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	@AfterClass
	public void teardown() {
		driver.quit();
	}

	private void captureScreen(WebDriver driver, String methodname) {
		try {
			DateTimeFormatter timeStampPattern = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
			System.out.println(timeStampPattern.format(java.time.LocalDateTime.now()));
			String number = (timeStampPattern.format(java.time.LocalDateTime.now()));

			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			File target = new File(".//screenshots//image_" + number + "/" + methodname + ".png");
			FileUtils.copyFile(source, target);
			System.out.println("Screenshot taken");
		} catch (Exception e) {

			System.out.println("Exception is : " + e.getMessage());
			// throw new Exception();
		}

	}

	public void waitforseconds(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
