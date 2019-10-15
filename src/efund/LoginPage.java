package efund;

import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import util.AndroidDriverInstance;

public class LoginPage {
	private AndroidDriver driver ;
	private WebElement countName;
	private WebElement passWord;
	private WebElement toLogin;
	private WebElement one;
	private WebElement two;
	private WebElement three;
	private WebElement four;
	private WebElement five;
	private WebElement six;
	private WebElement seven;
	private WebElement eight;
	private WebElement nine;
	private WebElement zero;

	public LoginPage() {
		super();
		initElement();
	}
	/**
	  *  初始化当前页面元素
	 */
	private void initElement() {
		driver =AndroidDriverInstance.getInstance();
		countName = driver.findElementById("com.efund.jqb:id/userName");
		passWord =driver.findElementById("com.efund.jqb:id/password");
		toLogin =driver.findElementById("com.efund.jqb:id/btn_next_step");
//		one =driver.findElementByName("1");
//		two =driver.findElementByName("2");
//		three =driver.findElementByName("3");
//		four =driver.findElementByName("4");
//		five =driver.findElementByName("5");
//		six =driver.findElementByName("6");
//		seven =driver.findElementByName("7");
//		eight =driver.findElementByName("8");
//		nine =driver.findElementByName("9");
//		zero =driver.findElementByName("0");

	}
	public AndroidDriver getDriver() {
		return driver;
	}
	public void setDriver(AndroidDriver driver) {
		this.driver = driver;
	}
	public WebElement getCountName() {
		return countName;
	}
	public void setCountName(WebElement countName) {
		this.countName = countName;
	}
	public WebElement getPassWord() {
		return passWord;
	}
	public void setPassWord(WebElement passWord) {
		this.passWord = passWord;
	}
	public WebElement getToLogin() {
		return toLogin;
	}
	public void setToLogin(WebElement toLogin) {
		this.toLogin = toLogin;
	}

}
