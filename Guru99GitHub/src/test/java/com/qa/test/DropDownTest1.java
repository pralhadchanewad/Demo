package com.qa.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.pages.DropDownPage1;

public class DropDownTest1 extends DropDownPage1 {

	@BeforeClass

	public void launchBrowser() {

		browserLaunch("chrome");
	}

	@Test

	public void dropDownPageTestCase1() {

		selectTheDropDown();

	//	kp.selectTheDropDown();
	}

}
