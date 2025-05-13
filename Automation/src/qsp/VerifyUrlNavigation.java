package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyUrlNavigation {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		 driver.get("https://workspace.google.com/intl/en-US/gmail/");
		 
		String url1 = driver.getCurrentUrl();
		
		//System.out.println(url1);
		
		driver.navigate().to("https://www.google.com/");
		
		String url2 = driver.getCurrentUrl();
		
		//System.out.println(url2);
		
		if(url1.equals("https://workspace.google.com/intl/en-US/gmail/")&&url2.equals("https://www.google.com/"))
			
		{
			System.out.println("Pass : Gmail is successfully navigating to Google ");
			
		}
		
		else
			
		{
			
			System.out.println("Fail : Gmail is not navigating to Google");
			
		}
		
		driver.quit();

	}
}
