package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoLocator {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///C:/Users/Neela/OneDrive/Desktop/Demo.html");
		
		WebElement e = driver.findElement(By.tagName("a"));
		
		e.click();
	}

}
