package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;

public class ReportModule extends BaseClass {

	@Test(groups = "smoke")
	public void createProject() {
		
		Reporter.log("CreateCustomer",true);
		
		
	}
	
	@Test
	public void modifyProject() {
		
		Reporter.log("Modify Project", true);
		
	}
	
	@Test
	public void deleteProject() {
		
		Reporter.log("Delete Project", true);
	}
	
}
