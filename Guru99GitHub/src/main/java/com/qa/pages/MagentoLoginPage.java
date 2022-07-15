package com.qa.pages;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.FrameWorkBase1;

public class MagentoLoginPage extends FrameWorkBase1 {

//****************************************List*****************************

	@FindBy(xpath = "//div[@class='fieldset']")
	public List<WebElement> listelement;

//*******************************************Create Account*******************************************************
	@FindBy(xpath = "//span[text()='Create an Account']")
	public WebElement accountcreate;

	@FindBy(xpath = "//input[@name='firstname']")
	public WebElement firstname;

	@FindBy(xpath = "//input[@class='input-text ']")
	public WebElement middlename;

	@FindBy(xpath = "//input[@id='lastname']")
	public WebElement lastname;

	@FindBy(xpath = "//input[@id='email_address']")
	public WebElement emailaddress;

	@FindBy(xpath = "//input[@id='password']")
	public WebElement password12;

	@FindBy(xpath = "//input[@id='confirmation']")
	public WebElement confirmpassword13;

	@FindBy(xpath = "//label[text()='Sign Up for Newsletter']")
	public WebElement signup;

	@FindBy(xpath = "//button[@title='Register']//span//span[text()='Register']")
	public WebElement register;

//**********************************************Login**********************************************************	

	@FindBy(xpath = "//input[@id='email']")
	public WebElement username1;

	@FindBy(xpath = "//input[@id='pass']")
	public WebElement password1;

	public MagentoLoginPage() {
		PageFactory.initElements(driver, this);

	}

	// ********************************CreateAccount*****************************************

	public void CreateAccount() {

		accountcreate.click();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		String firstn = prop.getProperty("firstname");
		firstname.sendKeys(firstn);

		String middlen = prop.getProperty("middlename");
		middlename.sendKeys(middlen);

		String lastn = prop.getProperty("lastname");
		lastname.sendKeys(lastn);

		String emailadd = prop.getProperty("emailaddress");
		emailaddress.sendKeys(emailadd);

		String pass12 = prop.getProperty("password12");
		password12.sendKeys(pass12);

		String confirmpass13 = prop.getProperty("confirmpassword13");
		confirmpassword13.sendKeys(confirmpass13);

		signup.click();
		register.click();
	}

//*************************************Login****************************************	

	public void loginMethod() {
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		String user1 = prop.getProperty("username1");
		username1.sendKeys(user1);

		String passw1 = prop.getProperty("password1");
		password1.sendKeys(passw1);

	}

	public void allListFill() {

		accountcreate.click();

		List<String> keyList = new ArrayList<String>();

		keyList.add("firstname");
		keyList.add("middlename");
		keyList.add("lastname");
		keyList.add("emailaddress");
		keyList.add("password12");
		keyList.add("confirmpassword13");

		List<WebElement> webList = new ArrayList<WebElement>();

		webList.add(firstname);
		webList.add(middlename);
		webList.add(lastname);
		webList.add(emailaddress);
		webList.add(password12);
		webList.add(confirmpassword13);

		for (int i = 0; i < 6; i++) {

			webList.get(i).sendKeys(prop.getProperty(keyList.get(i)));
		}

	}

}
