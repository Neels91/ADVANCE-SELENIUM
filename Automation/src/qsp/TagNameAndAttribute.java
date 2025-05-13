package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameAndAttribute {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://localhost/login.do");
		
		String tagname = driver.findElement(By.tagName("a")).getAttribute("id");
		
		System.out.println(tagname);
		
		driver.quit();

	}

}
