package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnableLoginButton {

	public static void main(String[] args) {


		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.instagram.com/");
		
	boolean logoEnable = driver.findElement(By.xpath("//button[@type='submit']")).isEnabled();
	
	if(logoEnable == false)
		
	{
		
		System.out.println("Logo is disabled and Pass");
	}
	
	else
	{
		System.out.println("Logo is enabled and Fail");
	}

	driver.quit();
	
	}

}
