package Assertion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {
	
	@Test
	
	public void verifyTitle() {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		String eTitle = "Google";
		
		String aTitle = driver.getTitle();
		
		Assert.assertEquals(aTitle, eTitle);
		
		
		driver.close();
		
		
		
		
	}
	

}
