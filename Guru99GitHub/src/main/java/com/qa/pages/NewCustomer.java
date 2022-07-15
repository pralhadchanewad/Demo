package com.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.FrameWorkBase1;

public class NewCustomer extends FrameWorkBase1 {

	@FindBy(xpath = "//input[@type='text']")
	public WebElement username;

	@FindBy(xpath = "//input[@type='password']")
	public WebElement password;

	@FindBy(name = "btnLogin")
	public WebElement loginBtn;

	@FindBy(xpath = "//a[text()='New Customer']")
	public WebElement NewCustomer;
	
	
	@FindBy(xpath = "//iframe[@aria-label='Advertisement']")
	public WebElement outsideframe;

	@FindBy(xpath = "//iframe[@title='Advertisement']")
	public WebElement frame;

	@FindBy(xpath = "//div[@id='dismiss-button']")
	public WebElement flameclose;

	@FindBy(xpath = "//input[@name='name']")
	public WebElement customerName;

	public NewCustomer() {
		PageFactory.initElements(driver, this);
	}

	public void firstHomePageLogin() {

		String user = prop.getProperty("username"); 
		username.sendKeys(user);

		String pwd = prop.getProperty("password");
		password.sendKeys(pwd);

		loginBtn.click();
	}
	
	public void pageOpenFillData() {

		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		NewCustomer.click();

		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		driver.switchTo().frame(outsideframe);

		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		driver.switchTo().frame(frame);
		flameclose.click();

//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].click();", closeFrame);

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		String cName = prop.getProperty("CustomerName");
		customerName.sendKeys(cName);
	}
}
