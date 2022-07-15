package com.qa.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.pages.MagentoLoginPage;

public class MagentoSiteTest extends MagentoLoginPage {

	@BeforeClass

	public void browserLaunch() {

		browserLaunch("chrome");

	}
	
	@Test(priority = 0)
	
	public void loginTestCase() {
		
		MagentoLoginPage dp = new MagentoLoginPage();
//		dp.loginMethod();
		dp.allListFill();
		
	}

}
