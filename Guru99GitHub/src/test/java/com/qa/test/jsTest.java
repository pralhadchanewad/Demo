package com.qa.test;

import org.testng.annotations.BeforeClass;

public class jsTest {
	
	@BeforeClass
	public void browserLaunch() {
		browserLaunch();
	}
	
	@Test
	public void clickTest() {
		
		clickJs();
		
	}

}
