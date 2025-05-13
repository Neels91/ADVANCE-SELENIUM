package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleElement {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("file:///C:/Users/Neela/OneDrive/Desktop/Demo.html");

		List<WebElement> allLinks = driver.findElements(By.tagName("a"));

		//System.out.println(allLinks);

		int count = allLinks.size();

		System.out.println(count);

		for(int i = 0; i < count; i++)

		{

			String text = allLinks.get(i).getText();

			System.out.println(text);

		}

	}

}

