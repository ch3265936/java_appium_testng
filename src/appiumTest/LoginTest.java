package appiumTest;

import org.testng.annotations.Test;

import efund.Action;
import efund.LoginPage;
import io.appium.java_client.android.AndroidDriver;
import util.AndroidDriverInstance;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class LoginTest extends Action {
	private LoginPage loginPage;

	String psd = "2,2,2,2,2,2,2,3";

	@Test
	public void f() {
		try {
		try {
				beforeSuite();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Thread.sleep(20000);
	
			LoginPage loginPage = new LoginPage();
			loginPage.getCountName().click();
			loginPage.getPassWord().click();
			Thread.sleep(1000);

			inputPsd(psd);
			Thread.sleep(10000);

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}




}
