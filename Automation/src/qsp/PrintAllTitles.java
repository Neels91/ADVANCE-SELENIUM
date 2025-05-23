package qsp;

import java.util.Set;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAllTitles {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://dummysoftware.com/popupdummy_testpage.html");
		
		Set<String> allWH = driver.getWindowHandles();
		
		for(String wh:allWH)
			
		{
			driver.switchTo().window(wh);
			
			String title = driver.getTitle();
			
			System.out.println(title);
		}

		driver.quit();
	}

}
