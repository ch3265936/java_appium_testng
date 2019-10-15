package appiumTest;

import org.testng.annotations.Test;

import efund.Action;
import io.appium.java_client.android.AndroidDriver;
import util.AndroidDriverInstance;
import util.AppiumElement;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.naming.spi.DirStateFactory.Result;

import org.apache.xalan.templates.ElemElement;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

/**
 * 关于手势的操作
 * 
 * @author chihai
 *
 */
public class TouchTest extends Action {
	// 用于判断用例的执行成功与否
	public static boolean Result = false;
	AppiumElement one = new AppiumElement(200, 400);
	AppiumElement two = new AppiumElement(200, 800);
	AppiumElement three = new AppiumElement(800, 800);
	AppiumElement four = new AppiumElement(800, 400);
	String pageSource = "";
              
	@Test
	public void f() {
		try {
			Thread.sleep(15000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.print("PAGESOURCE" + driver.getPageSource());
		String str = getBoundsFromName( driver.getPageSource(), "重要提示");
		if (str.length() > 0) {
		String[] poiStrings =str.split(",");
		System.out.print("pointPAGESOURCE" + poiStrings[0]+","+poiStrings[1]);
		 
	 driver.tap(1, Integer.parseInt(poiStrings[0]),Integer.parseInt( poiStrings[1]), 300);
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		}
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
		Result = true;
		System.out.print("该用例执行结果" + TouchTest.Result);
	}

}
