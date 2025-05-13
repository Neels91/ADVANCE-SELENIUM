package qsp;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfPartialLinkText {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.partialLinkText("Gm")).click();
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		
		
		
		
		

	}

}
