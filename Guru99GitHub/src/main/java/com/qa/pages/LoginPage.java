package com.qa.pages;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.base.FrameWorkBase1;

public class LoginPage extends FrameWorkBase1 {

	@FindBy(xpath = "//input[@type='text']")
	public WebElement username;

	@FindBy(xpath = "//input[@type='password']")
	public WebElement password;

	@FindBy(name = "btnLogin")
	public WebElement loginBtn;

	@FindBy(xpath = "//a[text()='New Customer']")
	public WebElement NewCustomer;

	@FindBy(xpath = "//ul[@class='menusubnav']//a")
	public List<WebElement> listElement;

	@FindBy(xpath = "//iframe[@aria-label='Advertisement']")
	public WebElement outsideframe;

	@FindBy(xpath = "//iframe[@title='Advertisement']")
	public WebElement frame;

	@FindBy(xpath = "//span[text()='Close']")
	public WebElement flameclose;

	@FindBy(xpath = "//input[@name='name']")
	public WebElement CustomerName;

	public LoginPage() {
		PageFactory.initElements(driver, this);

	}

	public void eneterCredentials() {

		String user = prop.getProperty("username");
		username.sendKeys(user);

		String pwd = prop.getProperty("password");
		password.sendKeys(pwd);

		loginBtn.click();

//		Assert.assertEquals("GTPL Bank Manager HomePage", driver.getTitle());
	}

	public void manuList() {

		List<String> actualList = new ArrayList<String>();

		for (WebElement ele : listElement) {

			actualList.add(ele.getText());

			System.out.println("webelementlist " + ele.getText());

		}
		System.out.println("actualList " + actualList);

		List<String> expectedList = new ArrayList<>();
		expectedList.add("Manager");
		expectedList.add("New Customer");
		expectedList.add("Edit Customer");
		expectedList.add("Delete Customer");
		expectedList.add("New Account");
		expectedList.add("Edit Account");
		expectedList.add("Delete Account");
		expectedList.add("Mini Statement");
		expectedList.add("Customised Statement");
		expectedList.add("Log out");

		System.out.println("expectedList " + expectedList);

		Collections.sort(actualList);
		Collections.sort(expectedList);

		System.out.println("After Sort Actual List " + actualList);
		System.out.println("After Sort expectedList " + expectedList);

		Assert.assertEquals(actualList, expectedList);

	}

	public void userData() {

		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		NewCustomer.click();

		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		driver.switchTo().frame(outsideframe);

		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		driver.switchTo().frame(frame);
		flameclose.click();

//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].click();", closeFrame);

		
		String CName = prop.getProperty("CustomerName");
		CustomerName.sendKeys(CName);
	} 
//
//	public void userInformation() {
//
//		String CName = prop.getProperty("CustomerName");
//		CustomerName.sendKeys(CName);
//
//	}

}
