package com.actitime.generic;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerImplimentation extends BaseClass implements ITestListener {

	@Override
	public void onTestFailure(ITestResult result) {
		
		String name = result.getName();
		

		TakesScreenshot t = (TakesScreenshot)driver;
		
		File src = t.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("./ScreenShot/"+name+"ss.png");
		
		try {
			
			FileUtils.copyFile(src, dest);
			
		} catch (IOException e) {
			
		
		
	}
	}

	
	
	
}
