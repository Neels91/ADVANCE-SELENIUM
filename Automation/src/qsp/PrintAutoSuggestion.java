package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAutoSuggestion {

	public static void main(String[] args) throws InterruptedException  {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");

		driver.findElement(By.id("APjFqb")).sendKeys("suma");
		
		Thread.sleep(2000);

		List<WebElement> allSugg = driver.findElements(By.xpath("//span[contains(text(),'suma')]"));

		int count = allSugg.size();

		System.out.println(count);

		for(int i = 0; i<count; i++)

		{
			String text = allSugg.get(i).getText();

			System.out.println(text);

		}

		allSugg.get(0).click();

		//driver.quit();
	}

}
