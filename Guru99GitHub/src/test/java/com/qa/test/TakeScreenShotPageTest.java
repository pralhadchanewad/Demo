package com.qa.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.pages.TakeScreenShotPage;

public class TakeScreenShotPageTest extends TakeScreenShotPage {

	@BeforeClass

	public void browserLaunch() {

		browserLaunch("chrome");
	}

	@Test

	public void TakeScreenTestCase1() {

		TakeScreenShotPage gP = new TakeScreenShotPage();

		gP.takeScreenShotMethod();
	}

}
