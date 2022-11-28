
package Assignmentutilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class readconfig {
	public static Properties prop;

	public readconfig() {

		File source = new File(
				"Users\\Owner\\eclipse-workspace\\BDD_LMS_Cucumber_V001\\src\\test\\java\\Assignmentutilities\\loginData.xlsx");

		try {
			FileInputStream readconfig = new FileInputStream(source);
			prop = new Properties();
			prop.load(readconfig);
		} catch (Exception e) {
			// Loggerclass.error(e.getMessage());
			System.out.println("Exception is : " + e.getMessage());
		}
	}

	public String getApplicationURL() {
		return prop.getProperty("baseURL");
	}

	public String loginURL() {
		return prop.getProperty("loginURL");
	}

	public String getUsername() {
		return prop.getProperty("username");
	}

	public String getPassword() {
		return prop.getProperty("password");
	}

	public String getnewPassword() {
		return prop.getProperty("newpassword");
	}

	public String retypePassword() {
		return prop.getProperty("retyperpassword");
	}

	public String getcode() {
		return prop.getProperty("code");
	}

	public String getsource() {
		return prop.getProperty("sourcedata");
	}

	public String getChromepath() {
		return prop.getProperty("chromepath");
	}

	public String getFirefoxpath() {
		return prop.getProperty("firefoxpath");
	}

}
