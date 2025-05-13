package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CheckBoxSelected {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://localhost/login.do");
	
		
		boolean selected = driver.findElement(By.name("remember")).isSelected();
		
		
		if(selected == false)
			
		{
			
			System.out.println("The Checkbox is not Selected and Pass");
			
		}
		
		else
			
		{
			System.out.println("The Checkbox is Selected and Fail");
		}
		
		driver.quit();

	}

}
