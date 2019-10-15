package appiumTest;

import org.testng.annotations.Test;

import efund.Action;
import io.appium.java_client.android.AndroidDriver;
import util.AndroidDriverInstance;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest3 extends Action {
	public static boolean Result = false;
	@Test
	public void f() {
		
		try {
	
			Thread.sleep(5000);}
			catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			findElementClick(null, null, "", "500,2100");
//			findElementClick(null, null, "//*[@text='8%", "");// "//*[@text='我也试试看']"
			System.out.print("第3");
			Result =true;
		} 
	
	

	@BeforeClass
	public void setup() throws Exception {

	}

	@BeforeMethod
	public void beforeMethod() {
	}

	@AfterMethod
	public void afterMethod() {
	}

	@BeforeTest
	public void beforeTest() {
	}

	@AfterTest
	public void afterTest() {
	}

}
