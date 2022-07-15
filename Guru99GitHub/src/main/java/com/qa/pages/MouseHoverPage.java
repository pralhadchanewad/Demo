package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.FrameWorkBase1;

public class MouseHoverPage extends FrameWorkBase1 {

	public Actions act = null;

	@FindBy(linkText = "Interactions")
	public WebElement InterActionTab;

	@FindBy(linkText = "Drag and Drop")
	public WebElement DragDropTab;

	@FindBy(linkText = "Static")
	public WebElement StaticTab;

	@FindBy(xpath = "//div[@class='col-xs-10 col-xs-offset-2']//img[@id='angular']")
	public WebElement dragElementTab;

	@FindBy(xpath = "//div[@id='droparea']")
	public WebElement dropElementTab;

	@FindBy(xpath = "//*[@id=\"gallery\"]/li[1]/img")
	public WebElement imageDrag;

	@FindBy(xpath = "//div[@id='trash']")
	public WebElement imageDrop;

	@FindBy(xpath = "//img[@alt='GlobalSQA']")
	public WebElement button;

	@FindBy(xpath = "//iframe[@class='demo-frame lazyloaded']")
	public WebElement frame;

	public MouseHoverPage() {
		PageFactory.initElements(driver, this);

	}

//	public void mouseHandle() {
//
//		PageFactory.initElements(driver, this);
//
//		Actions act = new Actions(driver);
//
//		act.moveToElement(InterActionTab).build().perform();
//		act.moveToElement(DragDropTab).build().perform();
//		StaticTab.click();
//
//	}

	public void dragDropMethod() {
		PageFactory.initElements(driver, this);
		UtilityPage.waitforsec(3);

//		WebElement ale = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(frame);
		UtilityPage.waitforsec(3);

		act.dragAndDrop(imageDrag, imageDrop).build().perform();

		driver.switchTo().parentFrame();

	}

	public void rightCkickMethod() {

		PageFactory.initElements(driver, this);

		UtilityPage.waitforsec(3);

		act.moveToElement(button).build().perform();
	}

}
