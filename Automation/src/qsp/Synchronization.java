package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Synchronization {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://online.actitime.com/sandeep");
		
		driver.findElement(By.id("username")).sendKeys("admin");
		
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
	    driver.findElement(By.xpath("//div[.='Login']")).click();
		
		Thread.sleep(9000);
		
		driver.findElement(By.id("logoutLink")).click();
		
		

	}

}
