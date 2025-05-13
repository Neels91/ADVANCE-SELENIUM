package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfManage {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.google.com/");

		String actualTitle = driver.getTitle();

		String expectedTitle = "GOOGLE";

		String actualUrl = driver.getCurrentUrl();

		String expectedUrl = "google.com";

		//if(actualTitle.equals(expectedTitle)&&actualUrl.equals(expectedUrl))
		
		if(actualTitle.equalsIgnoreCase(expectedTitle)&&actualUrl.contains(expectedUrl))
		{
			System.out.println("Pass : Both expected TITLE and URL are Matching");
		}
		else
		{
			System.out.println("Fail : Both expected TITLE and URL are NOT Matching");

		}

		driver.close();

	}
}

