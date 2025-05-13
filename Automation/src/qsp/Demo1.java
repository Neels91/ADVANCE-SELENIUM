package qsp;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo1 {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver(); //for Chrome driver

		driver.get("https://www.google.com");

		String title = driver.getTitle();

		System.out.println(title);

		driver.close();

		FirefoxDriver driver1 = new FirefoxDriver(); //for Mozilla

		driver1.get("https://www.firefox.com");

		String title1 = driver1.getTitle();

		System.out.println(title1);

		driver1.close();

		EdgeDriver driver2 = new EdgeDriver(); // for Edge Driver

		driver2.get("https://www.microsoftedge.com");

		String title2 = driver2.getTitle();

		System.out.println(title2);

		driver2.close();


	}

}
