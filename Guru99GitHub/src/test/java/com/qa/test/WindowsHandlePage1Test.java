package com.qa.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.pages.WindowsHandlePage1;
 
public class WindowsHandlePage1Test extends WindowsHandlePage1 {

	@BeforeClass

	public void browserLunach() {

		browserLaunch("chrome");

	}
	
	@Test
	
	public void handlewindowscase1() {
		
		handleWindow();
		seperateWindow();
	}

}
