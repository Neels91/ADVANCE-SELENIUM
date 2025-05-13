package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowPopup {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://dummysoftware.com/popupdummy_testpage.html");
		
		String pWH = driver.getWindowHandle();
		
		System.out.println(pWH);

	}

}
