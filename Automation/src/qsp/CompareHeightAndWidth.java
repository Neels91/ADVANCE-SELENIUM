package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CompareHeightAndWidth {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement email = driver.findElement(By.id("email"));
		
		int eHeight = email.getSize().getHeight();
		
		System.out.println(eHeight);
		
		int eWidth = email.getSize().getWidth();
		
		System.out.println(eWidth);
		
		WebElement password = driver.findElement(By.id("passContainer"));
		
		int pHeight = password.getSize().getHeight();
		
		System.out.println(pHeight);
		
		int pWidth = password.getSize().getWidth();
		
		System.out.println(pWidth);
		
		if(eHeight == pHeight && eWidth == pWidth)
			
		{
			System.out.println("Height and Width are same");
		}
		
		else
			
		{
			System.out.println("Height and Width are Not Same");
		}

		driver.quit();
	}

}
