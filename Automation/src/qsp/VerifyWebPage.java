package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyWebPage {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://google.com/");
		
		String actualTitle = driver.getTitle();
		
		String expectedTitle = "GOOGLE";
		
		String actualUrl = driver.getCurrentUrl();
		
		String expectedUrl = "google.com";
		
		if(actualTitle.equalsIgnoreCase(expectedTitle)&&actualUrl.contains(expectedUrl))
			
		{
			System.out.println("Pass : Both expected title and URL are Matching");
			
		}
		
		else
		{
			System.out.println("Fail : Both expected title and url are not matching");
			
		}
		
		driver.close();
			
		}

	}

