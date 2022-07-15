package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.qa.base.FrameWorkBase2;

public class CheckBoxDemo extends FrameWorkBase2 {

	public void visibleElement() {

		boolean flag;
		
//*************************************isDisplayed**********************
		WebElement isdisp = driver.findElement(By.linkText("Demo"));
		flag = isdisp.isDisplayed();
		System.out.println("Element should be present on page or not:" + flag);
		
//*************************************isEnabled**********************
		
		WebElement isenab=driver.findElement(By.xpath("//input[@id='checkbox-3']"));
		flag=isenab.isEnabled();
		System.out.print("Element should be present on page or not:"+flag);
		
//***************************************isSelected**********************
		
		WebElement sele=driver.findElement(By.xpath("//input[@id='radio-1']"));
		flag=sele.isSelected();
		System.out.println("Element should be present on page or not:"+flag);
		
		
		WebElement secondsel=driver.findElement(By.xpath("//input[@id='radio-plain-2']"));
		flag=secondsel.isSelected();
		System.out.println("Element should be present on page or not:"+flag);
		driver.findElement(By.xpath("//input[@id='radio-plain-2']"));

	}
//*********************There are three type of method ***********
	//isDisplayed();
	//isEnabled();
	//isSelected()
	
//**********************************************************************************
//	public static void main(String[] args) {
//
//		browserLaunch("chrome");
//		visibleElement();
//
//	}

}
