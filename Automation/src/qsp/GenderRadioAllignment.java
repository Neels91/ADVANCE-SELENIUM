package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GenderRadioAllignment {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		
		int maley = driver.findElement(By.name("sex")).getLocation().getY();
		
		System.out.println("Value of Male Y axis Radio Button : "+maley);
		
		int femaley = driver.findElement(By.id("sex")).getLocation().getY();
		
		System.out.println("Value of Female Y axis Radio Button : "+femaley);
		
		if(maley == femaley)
			
		{
			System.out.println("The Allignment of Male and Female radio button is done properly ");
		}
		
		else
			
		{
			System.out.println("The Allignment is not done properly");
		}
	}

}
