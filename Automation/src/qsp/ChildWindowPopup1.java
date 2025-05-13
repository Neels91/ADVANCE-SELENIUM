package qsp;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowPopup1 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://dummysoftware.com/popupdummy_testpage.html");
		
		Set<String> allWH = driver.getWindowHandles();
		
		int count = allWH.size();
		
		System.out.println(count);
		
		for(String wh:allWH)
			
		{
			System.out.println(wh);
		}

	}

}
