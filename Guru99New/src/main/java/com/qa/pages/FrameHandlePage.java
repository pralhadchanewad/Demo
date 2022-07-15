package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.qa.base.FrameWorkBase2;

public class FrameHandlePage extends FrameWorkBase2{
	
	
	public void iframeHandle() {
			
		driver.findElement(By.linkText("Iframe with in an Iframe")).click();
		
		UtilityPage.waitforsec(3);
		
		driver.findElement(By.xpath("//a[@href='#Single']")).click();	
		
		WebElement str=driver.findElement(By.xpath("//iframe[@name='SingleFrame']"));
		driver.switchTo().frame(str);
		
		////iframe[@name='SingleFrame']
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("selenium");
		
		
	}
	

	}


//we can handle three wave to iframe handle
//index __like__1,2,3
//id or name
//webelement__ex-xpath