package com.qa.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.pages.MouseHoverPage;

public class MouseHoverPageTest extends MouseHoverPage {

	@BeforeClass
	public void BrowserLaunch() {

		browserLaunch("chrome");
	}

//	@Test(priority = 0)
//	public void mouseHandleTest() {
//
//		mouseHandle();
//	}

	@Test
	public void dragDrop() {

		dragDropMethod();
		rightCkickMethod();
	}
}
