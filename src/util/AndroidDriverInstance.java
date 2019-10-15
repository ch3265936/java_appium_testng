package util;

import java.net.MalformedURLException;
import java.net.URL;

import org.apache.jasper.tagplugins.jstl.core.Url;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class AndroidDriverInstance {
	private static String name = "http://127.0.0.1:4723/wd/hub";

	private static DesiredCapabilities capabilities = new DesiredCapabilities();

	private AndroidDriverInstance() {
	}

	public static AndroidDriver driver = null;

	public static AndroidDriver getInstance() {
		if (driver == null) {
			synchronized (AndroidDriverInstance.class) {
				if (driver == null) {
					capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
					capabilities.setCapability("platformName", "Android");
					capabilities.setCapability("noReset", "true");
					capabilities.setCapability("deviceName", "b2e8c425");//
					capabilities.setCapability("platformVersion", "9");
					capabilities.setCapability("unicodekeyboard", "true");
					capabilities.setCapability("automationName", "uiautomator2");
					capabilities.setCapability("appPackage", "com.tencent.mm");
					capabilities.setCapability("appActivity", "com.tencent.mm.ui.LauncherUI");
					System.out.print("Capability初始化");
					try {
						driver = new AndroidDriver(new URL(name), capabilities);
					} catch (MalformedURLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}
			}
		}
		return driver;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void printInfo() {
		System.out.println("the name is " + name);
	}

}