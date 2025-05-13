package com.actitime.generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

public class BaseClass2 {
	
	WebDriver driver;
	
	public void openBrowser() {
		
		driver = new ChromeDriver();
		
		driver.get("http://localhost/login.do");
		
		Reporter.log("Open Browser" , true);
	}
	
	public void closeBrowser() {
		
		driver.quit();
	}
	
	public void login() {
		
		driver.findElement(By.id("username")).sendKeys("admin");
		
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
		Reporter.log("Login" , true);
	}

	public void logout() {
		
		driver.findElement(By.id("logoutLink")).click();
		
		Reporter.log("Logout", true);
	}
}


