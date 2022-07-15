package com.qa.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.pages.AlertHandle;

public class AlertHandleTest extends AlertHandle{
	
	
	@BeforeClass
	public void BrowserLaunch() {
		
		browserLaunch("chrome");
	}
	
	@Test
	public void alertHandleTestCase1() {
		
		handleAlert();
	}

	
	}


