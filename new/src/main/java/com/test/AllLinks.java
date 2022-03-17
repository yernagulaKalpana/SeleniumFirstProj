package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AllLinks {
	

	public static void main(String[] args) {
		
		
		 WebDriver driver=null;
		String browser = "chrome";
		
		if(browser.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			
			
		}else if(browser.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
		}else if(browser.equalsIgnoreCase("ie"))
		{
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		}else
		{
			System.out.println("Enter valid browser type");
		}
		driver.get("https://www.wikipedia.org/");
		
		List<WebElement>  list = driver.findElements(By.tagName("a"));
		
		System.out.println("Number of links in this page: " + list.size());
		int i=0;
		for(WebElement e : list)
		{
			
			if(!e.getText().isBlank())
			{
			
				System.out.println(e.getText());
				
				i++;
			}			
		}
		System.out.println("total link texts which are not blank : " + i);
		
	}

	
	
	
}
