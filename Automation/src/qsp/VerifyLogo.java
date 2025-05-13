package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyLogo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		boolean logo = driver.findElement(By.xpath("//img[@alt='Facebook']")).isDisplayed();
		
		if(logo == true)
			
		{
			System.out.println("The Logo is Displayed and Pass");
		}
		
		else
			
		{
			
			System.out.println("The Logo is not Displayed and Fail");
		}
		
		driver.quit();
		
		
			
	}

}
