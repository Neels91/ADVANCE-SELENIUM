package AutoSuggestions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAllAutoSuggestionsOfSelenium {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.className("gLFyf")).sendKeys("selenium");
		
		List<WebElement> allAutoSugg = driver.findElements(By.xpath("//span[contains(text(),'selenium')]"));
		
		int count = allAutoSugg.size();
		
		System.out.println(count);
		
		for(int i=0;i<count;i++)
		{
			String text = allAutoSugg.get(i).getText();
			
			System.out.println(text);
		}
		
		allAutoSugg.get(9).click();
		
		//driver.quit();
		
	}

}
