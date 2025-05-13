package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CampareHeightAndWidth {

	public static void main(String[] args) {


		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		 WebElement email = driver.findElement(By.id("email"));
		
		int eheight = email.getSize().getHeight();
		
		System.out.println("EmailHeight"+eheight);
		
	    int ewidth = email.getSize().getWidth();
	    
	    System.out.println("EmailWidth"+ewidth);
	    
	    WebElement password = driver.findElement(By.id("passContainer"));
	    
	    int pheight = password.getSize().getHeight();
	    
	    System.out.println("PasswordHeight"+pheight);
	    
	    int pwidth = password.getSize().getWidth();
	    
	    System.out.println("PasswordWidth"+pwidth);
	    
	    if(eheight == pheight && pwidth == ewidth)
	    	
	    {
	    	
	    	System.out.println("same");
	    	
	    }
	    
	    else
	    	
	    {
	    	System.out.println("Notsame");
	    }
	    
	    driver.quit();

	}

}
