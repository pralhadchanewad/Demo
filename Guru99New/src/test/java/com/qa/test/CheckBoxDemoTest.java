package com.qa.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.pages.CheckBoxDemo;

public class CheckBoxDemoTest extends CheckBoxDemo {

	@BeforeClass
	public void browserLaunch() {

		browserLaunch("chrome");
	}

	@Test
	public void CheckBoxTestCase() {

		visibleElement();
	}

}
