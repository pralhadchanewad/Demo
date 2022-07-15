package com.qa.pages;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import com.qa.base.FrameWorkBase2;

public class WindowsHandlePage1 extends FrameWorkBase2 {

	public void handleWindow() {

		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		String parentWindow = driver.getWindowHandle();

		driver.findElement(By.xpath("//button[text()='    click   ']")).click();

		Set<String> s1 = driver.getWindowHandles();

		Iterator<String> iter = s1.iterator();

		while (iter.hasNext()) {

			String childWindow = iter.next();

			if (!parentWindow.equalsIgnoreCase(childWindow)) {

				driver.switchTo().window(childWindow);

//****************child window task perform**********************		

				String getTestOfChildWindow = driver.findElement(By.xpath("//div[@class='text-center']//child::h1"))
						.getText();
				System.out.println("Text Of Child Window:" + getTestOfChildWindow);

				// child window is close
				driver.close();

			}

		}

		driver.switchTo().window(parentWindow);
		driver.findElement(By.xpath("//a[text()='Open New Seperate Windows']")).click();

	}

	public void seperateWindow() {

		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		String parentWindow = driver.getWindowHandle();

		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();

		Set<String> s1 = driver.getWindowHandles();

		Iterator<String> iter = s1.iterator();

		while (iter.hasNext()) {

			String childWindow = iter.next();

			if (!parentWindow.equalsIgnoreCase(childWindow)) {

				driver.switchTo().window(childWindow);

//****************child window task perform**********************		

				String getTestOfChildWindow = driver
						.findElement(By.xpath("//div[@class='mx-auto']//child::p[@class='lead pt-3 mb-0']")).getText();
				System.out.println("Text Of seperate Window:" + getTestOfChildWindow);

				// child window is close
				driver.close();

			}

		}

		driver.switchTo().window(parentWindow);
		driver.findElement(By.xpath("//a[text()='Open Seperate Multiple Windows']")).click();

	}

//	public void seperateMultipleWindow() {
//
//		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
//
//		String parentWindow = driver.getWindowHandle();
//
//		driver.findElement(By.xpath("//button[text()='click ']")).click();
//
//		Set<String> s1 = driver.getWindowHandles();
//		Iterator<String> iter = s1.iterator();
//
//	}

}