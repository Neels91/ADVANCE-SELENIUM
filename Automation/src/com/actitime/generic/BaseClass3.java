package com.actitime.generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseClass3 {
	
	WebDriver driver;
	
	@BeforeTest
	
	public void openBrowser() {
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://localhost/login.do");
		
		Reporter.log("Open Browser", true);
		
	}
	
	@BeforeMethod
	
	public void login() {
		
		driver.findElement(By.id("username")).sendKeys("admin");
		
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		driver.findElement(By.id("loginButton")).click();
		
		Reporter.log("Login" , true);
	}
	
	@AfterMethod
	
	public void logout() {
		
		driver.findElement(By.id("logoutLink")).click();
		
		Reporter.log("Logout", true);
		
	}
	
	@AfterTest
	
	public void closeBrowser() {
		
		driver.quit();
		
		Reporter.log("CloseBrowser", true);
	}

}
