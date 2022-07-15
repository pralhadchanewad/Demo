package com.qa.base;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameWorkBase1 {

	public static WebDriver driver = null;

	public static Properties prop = null;

	public static String path = System.getProperty("user.dir");

// **********************************************Type1**************************************************************

	public FrameWorkBase1() {
		prop = new Properties();

		try {
			FileInputStream fis = new FileInputStream(
					"C:\\Users\\pchan\\eclipse-workspace\\Guru99New\\src\\main\\java\\com\\qa\\config\\UserData.properties");
			prop.load(fis);
		} catch (Exception e) {

		}
	}

//**********************************************Type2**************************************************************
//	public String getValueFromPropertiesFile(String key) {
//		String value = null;
//		Properties prop1 = new Properties();
//		System.out.println("Location of file" + path);
//
//		try {
//			FileInputStream fis = new FileInputStream(path + "/src/main/java/com/qa/config/UserData.properties");
//			prop1.load(fis);
//		} catch (Exception e) {
//
//		}
//		value = prop.getProperty(key);
//		System.out.println("get vale from file" + value);
//		return value;
//
//	}

	public static void browserLaunch(String browser) {

		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}

		
		driver.get(prop.getProperty("URLdemo"));
//		driver.get("https://demo.guru99.com/V1/index.php");
//		driver.get("https://demo.guru99.com/V1/index.php");

		driver.manage().window().maximize();

	}

}
