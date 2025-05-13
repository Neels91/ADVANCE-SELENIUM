package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintXandYAxis {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://localhost/login.do");
		
		int xaxis = driver.findElement(By.name("username")).getLocation().getX();
		
		System.out.println("The value of xaxis is"+xaxis);
		
		int yaxis = driver.findElement(By.name("username")).getLocation().getY();
		
		System.out.println("The value of y axis is:"+yaxis);
		
		driver.quit();

	}

}
