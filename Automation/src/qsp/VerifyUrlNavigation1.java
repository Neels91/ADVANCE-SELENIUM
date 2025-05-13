package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyUrlNavigation1 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.seleniumhq.org/");

	String url = driver.getCurrentUrl();
	
	if(url.equals("https://www.selenium.dev/"))
		
	{
		
		System.out.println("URL is navigating successfully and pass");
	}
	
	else
		
	{
		
		System.out.println("URL navigating unsuccessfully and fail");
	}
	
	driver.quit();

	}

}
