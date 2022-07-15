package com.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.FrameWorkBase1;

import jdk.nashorn.internal.runtime.regexp.joni.constants.internal.Arguments;

public class javaScriptExcutor extends FrameWorkBase1 {
	
	@FindBy(linkText="Mobile")
	public WebElement jsClick;
	
	public javaScriptExcutor() {
		
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickJs() {
		
		PageFactory.initElements(driver, this);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", "");
		
		
		
		
		
		
		
		
		
	}


	
		
	}
	
	
	

}
