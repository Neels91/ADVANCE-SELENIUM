package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RemoveText {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.opensourcebilling.org/");

		Thread.sleep(3000);

		driver.findElement(By.id("email")).clear();
		
		Thread.sleep(3000);
		
		driver.quit();
	}

}
