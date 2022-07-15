package com.qa.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;

import com.qa.base.FrameWorkBase2;

public class AlertHandle extends FrameWorkBase2 {

	public void handleAlert() {

//***********************************accept/OK*******************************

		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		String strtext = driver.switchTo().alert().getText();
		System.out.println("text of alert: " + strtext);

		driver.switchTo().alert().accept(); 
		
//		Alert ale=driver.switchTo().alert();    //or option
//		ale.accept();

//***********************************dismiss/Cancel*******************************

		driver.findElement(By.partialLinkText("Alert with OK & Cancel")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();

		driver.switchTo().alert().dismiss();

		String str = driver.findElement(By.xpath("//p[@id='demo']")).getText();

		System.out.println("get text" + str);
		Assert.assertEquals("You Pressed Cancel", str);

		driver.findElement(By.partialLinkText("Alert with Textbox")).click();

		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();

		Alert ale = driver.switchTo().alert();
		ale.sendKeys("selenium");

		String str1 = driver.switchTo().alert().getText();
		System.out.println("get text" + str1);
		ale.accept();
	//	Assert.assertEquals("Please enter your name", "Alert not matching expeted result");

	}

}