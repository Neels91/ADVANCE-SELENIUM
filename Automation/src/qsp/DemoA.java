package qsp;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoA {
	
	@Test

	static void testA(WebDriver driver) throws InterruptedException
	{
		driver.get("https://www.google.com/");
		
		Thread.sleep(5);
		
		String title = driver.getTitle();
		
		Reporter.log(title,true);
		
		driver.quit();
	}
}
