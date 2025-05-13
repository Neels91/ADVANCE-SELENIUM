package com.actitime.generic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
		
		WebDriver driver;
		@BeforeClass(groups = "smoke")
		public void openBrowser()
		
		{
		    driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.get("http://localhost/login.do");
			Reporter.log("OpenBrowser", true);
			
		}
		
	
		@AfterClass(groups = "smoke")
		
		public void closeBrowser()
		
		{
			driver.quit();
			Reporter.log("CloseBrowser", true);
		}
		@BeforeMethod(groups = "smoke")
		
		public void login() {
			
			driver.findElement(By.id("username")).sendKeys("admin");
			
			driver.findElement(By.name("pwd")).sendKeys("manager");
			
			driver.findElement(By.xpath("//div[text()='Login '] ")).click();
			
			
			Reporter.log("Login", true);
			
		}
		
		@AfterMethod(groups = "smoke")
		
		public void logout() {
			
			driver.findElement(By.linkText("Logout")).click();
			
			Reporter.log("Logout", true);
			
			
		}
		
	}



