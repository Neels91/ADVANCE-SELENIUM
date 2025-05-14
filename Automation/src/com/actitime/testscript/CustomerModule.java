package com.actitime.testscript;



import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;

@Listeners(com.actitime.generic.ListenerImplimentation.class)

public class CustomerModule extends BaseClass{
	
	@Test(groups = "smoke")

	public void createCustomer() {
		Reporter.log("CreateCustomer",true);
		
	}
	
	@Test
	
	public void modifyCustomer() {
		Reporter.log("ModifyCustomer",true);
	
}
	
	@Test
	public void deleteCustomer() {
		Reporter.log("DeleteCustomer",true);
		
	}
}
		
