package appiumTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import efund.Action;

public class NewTest extends Action{
  @Test
  public void f() {
	  try {
		Thread.sleep(20000);
				driver.getContextHandles().forEach((handle) -> {
            if (handle.contains("WEBVIEW")) {
            	System.out.print(handle);
                driver.context(handle);
            }
        });
		
		System.out.print(driver.getPageSource());
//		driver.findElementById("com.tencent.mm:id/jz").click();;
		Thread.sleep(20000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }
}
