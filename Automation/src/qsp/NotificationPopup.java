package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopup {

	public static void main(String[] args) {


		ChromeOptions option = new ChromeOptions();
		
		option.addArguments("__disable-notification");
		
		WebDriver driver = new ChromeDriver(option);
		
		driver.get("https://www.easemytrip.com/");

	}

}
