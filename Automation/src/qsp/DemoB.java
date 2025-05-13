package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoB {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		DemoA.testA(driver);
		
		WebDriver driver1 = new FirefoxDriver();
		
		DemoA.testA(driver1);
		
		WebDriver Driver2 = new EdgeDriver();
		
		DemoA.testA(Driver2);
	
	}

}
