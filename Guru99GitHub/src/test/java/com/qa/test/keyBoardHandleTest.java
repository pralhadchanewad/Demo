package com.qa.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.pages.keyBoardHandle;

public class keyBoardHandleTest extends keyBoardHandle {
	
	@BeforeClass
	public void browserLaunch() {
		
	
		browserLaunch("chrome");
	}
	
	@Test
	public void keyBorad() {
		
		mouseHandle();
		
		
	}

}
