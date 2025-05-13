package Assertion;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoAssertion {
	
	@Test
	public void verifyTitle() {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		String eTitle = "Soogle";
		
		String aTitle = driver.getTitle();
		
		if(aTitle.equals(eTitle)) {
			
			Reporter.log("Title is Matching", true);
			
		}else {
			
			Reporter.log("Title is not Matching", true);
			
		}
		
		driver.quit();
	}


	}


