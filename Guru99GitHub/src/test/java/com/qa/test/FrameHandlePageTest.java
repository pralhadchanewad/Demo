package com.qa.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.pages.FrameHandlePage;

public class FrameHandlePageTest extends FrameHandlePage{
	
	
	
	@BeforeClass
	public void browserLaunch1() {
		
		browserLaunch("chrome");
	}
	
	@Test
	public void iframeHandletestCase() {
		
		iframeHandle();
		
		
	}

}
