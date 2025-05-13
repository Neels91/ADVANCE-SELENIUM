package Annotation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CustomerModule1 {
	
	WebDriver driver;
	
	@BeforeClass
	
	public void openBrowser() {
		
		driver = new ChromeDriver();
		
		driver.get("http://localhost/login.do");
		
		Reporter.log("Open Browser", true);
	}
	
	@AfterClass
	
	public void closeBrowser() {
		
		driver.quit();
		
		Reporter.log("Close Browser", true);
	}
	
	@BeforeMethod
	
	public void login() {
		
		driver.findElement(By.id("username")).sendKeys("admin");
		
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
		Reporter.log("Login" , true);
	}
	
	@AfterMethod
	
	public void logout() {
		
		driver.findElement(By.id("logoutLink")).click();
		
		Reporter.log("Logout" , true);
	}
	
	@Test
	
	public void createCustomer() {
		
		Reporter.log("Create Customer", true);
	}
	
	@Test
	
	public void modifyCustomer() {
		
		Reporter.log("Modify Customer", true);
	}
	
	@Test
	
	public void deleteCustomer() {
		
		Reporter.log("Delete Customer", true);
	}

}
