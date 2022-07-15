package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.base.FrameWorkBase1;

public class Guru99LogOut extends FrameWorkBase1 {

	@FindBy(linkText = "Log out")
	public WebElement logOutBtn;

	public Guru99LogOut() {
		PageFactory.initElements(driver, this);
	}

	public void logout() {

		logOutBtn.click();
		String str = driver.switchTo().alert().getText();

		driver.switchTo().alert().accept();

		Assert.assertEquals(str, "You Have Succesfully Logged Out!!");
		
		
		

	}

}
