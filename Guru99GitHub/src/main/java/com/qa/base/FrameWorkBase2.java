package com.qa.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameWorkBase2 {

	public static WebDriver driver = null;

	public void browserLaunch(String browser) {

		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		} else if (browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();

		}
//		driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
//		driver.get("http://live.techpanda.org/index.php/customer/account/login/");
//		driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
//		driver.get("http://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Frames.html");

	}

}
