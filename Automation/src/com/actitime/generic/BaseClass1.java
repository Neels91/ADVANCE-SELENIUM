package com.actitime.generic;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass1 {
	
	
   WebDriver driver;
	
	@BeforeClass
	public void openBrowser() {
		
		 driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.get("http://localhost/login.do");
		
		Reporter.log("OpenBrowser" , true);
	}
	
	@AfterClass
	public void closeBrowser() {
		
	
		driver.quit();
		
		Reporter.log("Close Browser", true);
	}


	
	@BeforeMethod
	public void login() throws InterruptedException {
		
	Thread.sleep(3000);	
	driver.findElement(By.id("username")).sendKeys("admin");
	
	Thread.sleep(3000);
	
	driver.findElement(By.name("pwd")).sendKeys("manager");
	
	driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
	Reporter.log("Login", true);
	}
	
	@AfterMethod
	public void logout() {
		
		driver.findElement(By.id("logoutLink")).click();
		
		Reporter.log("Logout" , true);
	}
}
	
	