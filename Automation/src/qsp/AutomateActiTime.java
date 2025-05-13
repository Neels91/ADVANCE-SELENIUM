package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateActiTime {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://localhost/login.do");
		
		Thread.sleep(3000);
		
		driver.findElement(By.name("username")).sendKeys("admin");
		
		Thread.sleep(3000);

		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
		Thread.sleep(3000);
		
		driver.quit();
		
	}

}
