package com.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.qa.base.FrameWorkBase2;

public class DropDownPage1 extends FrameWorkBase2 {

	public void waitforsec(int a) {
		try {
			Thread.sleep(1000 * a);
		} catch (InterruptedException e) {

		}

	}

	public void selectTheDropDown() {
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		driver.findElement(By.id("email")).sendKeys("p.k.chanewad96@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Pralhad@3833");
		driver.findElement(By.xpath("//span[text()='Login']")).click();

//		waitforsec(3);

		driver.findElement(By.xpath("//a[text()='Address Book']")).click();

		WebElement dropDown = driver.findElement(By.xpath("//select[@id='region_id']"));
//		waitforsec(3);

		Select sel = new Select(dropDown);

		sel.selectByValue("2");

//****************************************XYZ Bank Website/*****************************
//		waitforsec(4);
//		driver.findElement(By.xpath("//button[text()='Customer Login']")).click();
//
//		waitforsec(3);
//
//		WebElement nameDropDownList = driver.findElement(By.xpath("//select[@id='userSelect']"));
//
//		Select objsel = new Select(nameDropDownList);
//
//		objsel.selectByVisibleText("Harry Potter");

//		objsel.selectByIndex(0);

//		objsel.selectByValue(2);

	}
//12
}
