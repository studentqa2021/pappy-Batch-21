package com.Practice;

import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
	

	}
	
		
		
	}

