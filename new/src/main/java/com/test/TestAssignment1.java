package com.test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestAssignment1 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Way2Automation");
		
//		Wait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[5]/center/input[1]")));
		
		driver.findElement(By.xpath("//div[5]/center/input[1]")).click();
		
	driver.findElement(By.xpath("//*[@id='rso']/div[1]/div/div/div/div/div/div[1]/a/h3")).click();
		
		List<WebElement> listofLinks = driver.findElements(By.tagName("a"));
		for(WebElement we:listofLinks)
		{
			System.out.println(we.getText());
			
		}
		System.out.println(listofLinks.size());
		

	}

}
