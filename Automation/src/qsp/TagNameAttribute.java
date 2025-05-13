package qsp;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameAttribute {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://localhost/login.do");
		
		String text = driver.findElement(By.id("licenseLink")).getTagName();
		
		System.out.println(text);
		
			String text1  = driver.findElement(By.xpath("//a[@href ='javascript:void(0)']")).getAttribute("href");
			
			System.out.println(text1);
		
		driver.quit();

	}

}
