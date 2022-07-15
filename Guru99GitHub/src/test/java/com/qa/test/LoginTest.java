package com.qa.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.pages.Guru99LogOut;
import com.qa.pages.LoginPage;
import com.qa.pages.NewCustomer;

public class LoginTest extends LoginPage {

	@BeforeClass

	public void browserLaunch() {

		browserLaunch("chrome");

	}

	@Test(enabled = false)
	public void LoginTestCase() {

		LoginPage lp = new LoginPage();
		lp.eneterCredentials();
		lp.manuList();
		lp.userData();

	}

	@Test(priority = 0)
	public void LoginTestCase2() {

		NewCustomer sp = new NewCustomer();

		sp.firstHomePageLogin();
		sp.pageOpenFillData();

	}

	@Test(enabled = false)
	public void LogOutTestCase() {

		Guru99LogOut hp = new Guru99LogOut();
		hp.logout();

	}

	@AfterClass
	public void tearDown() {

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
//		driver.close();

	}
}
