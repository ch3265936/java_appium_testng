package efund;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.gargoylesoftware.htmlunit.javascript.host.Set;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import util.AndroidDriverInstance;
import util.AppiumElement;

public class Action {
	public static AndroidDriver driver;
	static Duration duration = Duration.ofSeconds(1);
	private final int xWindow = 1080;
	private final int yWindow = 2160;

	private boolean hasParam(String str) {
		if (null != str && str.length() > 0) {
			return true;

		} else {
			return false;
		}
	}

	@AfterClass
	public void testend() {

	}

	@BeforeSuite
	public void beforeSuite() throws Exception {
		driver = AndroidDriverInstance.getInstance();
	}

	@AfterSuite
	public void afterSuite() {
		driver.quit();
	}

	/**
	 * 
	 * @param id
	 * @param name
	 * @param Xpath
	 * @param points
	 * @throws Exception
	 */
	public void findElementClick(String id, String name, String Xpath, String points) {
		if (hasParam(id)) {
			driver.findElementById(id).click();
		} else if (hasParam(name)) {
			driver.findElementByName(name).click();
		} else if (hasParam(Xpath)) {
			driver.findElementByXPath(Xpath).click();
		} else if (hasParam(points)) {
			String[] point = points.split(",");
			int x = Integer.parseInt(point[0]);
			int y = Integer.parseInt(point[1]);
			int click_x_0 = driver.manage().window().getSize().width;
			int click_y_0 = driver.manage().window().getSize().height;
			int x_click0 = x * click_x_0 / xWindow;
			int y_click0 = y * click_y_0 / yWindow;
			driver.tap(1, x_click0, y_click0, 50);

		} else {
		}
	}

	/**
	 * 
	 * @param id
	 * @param name
	 * @param Xpath
	 * @param points
	 * @throws Exception
	 */
	public void findElementLongClick(String id, String name, String Xpath, String points) {

		if (hasParam(id)) {
			driver.findElementById(id).click();
		} else if (hasParam(name)) {
			driver.findElementByName(name).click();
		} else if (hasParam(Xpath)) {
			driver.findElementByXPath(Xpath).click();
		} else if (hasParam(points)) {
			String[] point = points.split(",");
			int x = Integer.parseInt(point[0]);
			int y = Integer.parseInt(point[1]);
			int click_x_0 = driver.manage().window().getSize().width;
			int click_y_0 = driver.manage().window().getSize().height;
			int x_click0 = x * click_x_0 / xWindow;
			int y_click0 = y * click_y_0 / yWindow;
			driver.tap(1, x_click0, y_click0, 1);

		} else {
		}
	}

	/**
	 * 
	 * @param 手势滑动
	 */
	public void touchPsd(List<AppiumElement> elements) {
		int num = elements.size();
		TouchAction action = new TouchAction(driver);

		for (int i = 0; i < num; i++) {
			if (i == 0) {
				action.press(elements.get(i).getX(), elements.get(i).getY());
			} else {
				action.moveTo(elements.get(i).getX(), elements.get(i).getY());
			}
		}
		action.release().perform();
	}
	/**
	 * 
	 * @param psd 密碼输入
	 */
	public  void inputPsd(String psd) {
		String[] psds = psd.split(",");
		for (int i = 0; i < psds.length; i++) {
              driver.findElementByAndroidUIAutomator("text(\"psds[i]\")").click();
              
              try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	/**
	 * 根据文字找到对应位置（配合滑动实现滑动点击某个位置）
	 * 
	 * @param pageSource
	 * @param name
	 * @return
	 */
	public static String getBoundsFromName(String pageSource, String name) {

		byte[] words = pageSource.getBytes();
		try {
			
	        OutputStreamWriter fos=new OutputStreamWriter(new FileOutputStream("C:\\Users\\chihai\\eclipse-workspace\\appiumTest\\src\\resources\\resource.xml"),"UTF-8");
			fos.write(pageSource);
			System.out.println("Text文件已更新!");
			fos.close();

		} catch (IOException e) {
			// TODO: handle exception
		}
		try {
			SAXReader reader = new SAXReader();
			Document document = reader.read(new File("C:\\Users\\chihai\\eclipse-workspace\\appiumTest\\src\\resources\\resource.xml"));
			Element rootElement = document.getRootElement();
			Iterator it = rootElement.attributeIterator();
			while (it.hasNext()) {
				Attribute attribute = (Attribute) it.next();
				System.out.println(attribute.getQName().getName() + ":" + attribute.getValue());
			}
			Iterator iterator = rootElement.elementIterator();
			tag(document, iterator, name);
		} catch (Exception e) {
			// TODO: handle exception
		}
		int a = 0, b = 0;
		if (boundString.length() > 0) {
			String[] poiStrings = boundString.split("]");
			if (poiStrings[0] != null && poiStrings[1] != null) {
				String A[] = poiStrings[0].replace("[", "").replace("]", "").split(",");
				String B[] = poiStrings[1].replace("[", "").replace("]", "").split(",");
				a = Math.round((Integer.parseInt(A[0]) + Integer.parseInt(B[0])) / 2);
				b = Math.round((Integer.parseInt(A[1]) + Integer.parseInt(B[1])) / 2);
			}

		}
		return a + "," + b;
	}

	static String boundString = "";

	private static void tag(Document document, Iterator iterator, String name) {
		try {
			while (iterator.hasNext()) {
				Element stu = (Element) iterator.next();
				List<Attribute> attributes = stu.attributes();
				System.out.println("======属性======");
				if (boundString.length() > 0) {
					System.out.println("boundString" + boundString);
					return;
				}
				for (Attribute attribute : attributes) {
					if (boundString.length() > 0) {
						break;
					}
					System.out.println(attribute.getQName().getName() + ":" + attribute.getValue());
					if (attribute.getValue().contains(name)) {
						for (Attribute attr : attributes) {
							if (attr.getQName().getName().equals("bounds")) {
								boundString = attr.getValue();
								break;
							}
						}
					}

				}

				tag(document, stu.elementIterator(), name);

			}
		} catch (Exception e) {
			System.out.println("error" + e.getMessage());
		}

	}
}
