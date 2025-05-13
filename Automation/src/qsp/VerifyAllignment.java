package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyAllignment {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://localhost/login.do");
		
		int userxaxis = driver.findElement(By.name("username")).getLocation().getX();
		
		int passxaxis = driver.findElement(By.name("pwd")).getLocation().getX();
		
		System.out.println("The Value of UserName xaxis: "+userxaxis);
		
		System.out.println("The Value of Password xaxis :"+passxaxis);
		
		if(userxaxis == passxaxis)
			
		{
			System.out.println("The Allignment of Username and Password Textfield is done Properly");
			
		}
		
		else
			
		{
			System.out.println("The Allignment of Username and Password Textfield is not done Properly");
		}
		
		driver.quit();

	}

}
