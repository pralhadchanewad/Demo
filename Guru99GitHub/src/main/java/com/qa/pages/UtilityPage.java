package com.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import com.qa.base.FrameWorkBase2;

public class UtilityPage extends FrameWorkBase2 {

	public static void waitforsec(int a) {
		try {
			Thread.sleep(1000 * a);
		} catch (InterruptedException e) {

		}

	}

//*********************************implicitlyWait**********************************	

	public void implicitlyWait() {
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		driver.findElement(By.id("email")).sendKeys("p.k.chanewad96@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Pralhad@3833");
		driver.findElement(By.xpath("//span[text()='Login']")).click();
	}

//**********************************ExplicitWait*****************************************	

//	public void ExplicitWait() {
//		
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		
//		WebElement username = wait().Units(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
//		
//		
//		username.sendKeys("");
//		

	public void main(String[]args) {	
		
		waitforsec(3);
	} 
	
}
