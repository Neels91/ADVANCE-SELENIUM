package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssValueOfFontSizeFontType {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		String fontSize = driver.findElement(By.linkText("Forgotten password?")).getCssValue("font-size");
		
		System.out.println(fontSize);
		
		String fontWeight = driver.findElement(By.linkText("Forgotten password?")).getCssValue("font-weight");
		
		System.out.println(fontWeight);
		
		driver.quit();

	}

}
