package AutoSuggestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAllAutoSuggestions {
	
	 	public static void main(String [] args) {
			
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.className("gLFyf")).sendKeys("java");
		
		List<WebElement> allSugg = driver.findElements(By.xpath("//span[contains(text(),'java')]"));
		
		int count = allSugg.size();
		
		System.out.println(count);
		
		for(int i =0 ; i<count; i++)
			
		{
			String text=allSugg.get(i).getText();
			
			System.out.println(text);
			
		}
		
		allSugg.get(0).click();
		
		}
	}


