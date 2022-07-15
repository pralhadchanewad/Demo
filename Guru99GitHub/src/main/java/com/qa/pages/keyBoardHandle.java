package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.FrameWorkBase1;

public class keyBoardHandle extends FrameWorkBase1 {
	
	
	
	@FindBy(xpath="//*[@id=\"gallery\"]/li[1]/img")
	public WebElement imageDrag;
	
	@FindBy(xpath="//div[@id='trash']")
	public WebElement imageDrop;
	
	@FindBy(xpath="//iframe[@class='demo-frame lazyloaded']")
	public WebElement frame;
	
	public keyBoardHandle() {
		
		PageFactory.initElements(driver, this);
	}
	
	public void mouseHandle() {
		
		PageFactory.initElements(driver, this);
		driver.switchTo().frame(frame);
		
		Actions act=new Actions(driver);
		act.clickAndHold(imageDrag).release(imageDrop).build().perform();
		
		//act.moveToElement(imageDrag).clickAndHold().moveToElement(imageDrop).release().build().perform();
	//	act.dragAndDrop(imageDrag, imageDrop).build().perform();
	}
	
	
	
	
	
	
	
	
	
	
	

}
