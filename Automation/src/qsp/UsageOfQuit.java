package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfQuit {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://in.indeed.com/");
		
		driver.findElement(By.tagName("a")).click();
		
		
		driver.findElement(By.id("login-google-button")).click();
		
		driver.findElement(By.id("apple-signin-button")).click();
		
		driver.quit();

	}

}
