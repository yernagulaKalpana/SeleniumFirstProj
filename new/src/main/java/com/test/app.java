package com.test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class app {

public static void main(String args[])

{
	WebDriverManager.chromedriver().setup();
	WebDriver driver  = new ChromeDriver();
	
	driver.get("https://www.way2automation.com/way2auto_jquery/index.php");
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.name("name")).sendKeys("Nyshita");
	
	driver.findElement(By.xpath("//*[@type='tel']")).sendKeys("7829999840");
	driver.findElement(By.xpath("//*[@type='email']")).sendKeys("abc@gmail.com");
	
	Select sel = new Select(driver.findElement(By.xpath("//*[@name='country']")));
	sel.selectByValue("United Kingdom");
//	List<WebElement> list = sel.getOptions();
//	for (WebElement e:list)
//	{
//		System.out.println(e.getText());
//	}

	
	driver.findElement(By.xpath("//*[@name='city']")).sendKeys("Horsham");

	driver.findElement(By.xpath("//form[@id='load_form']/fieldset[6]/input[@name='username']")).sendKeys("username");
	
	driver.findElement(By.xpath("//form[@id='load_form']/fieldset[7]/input[@name='password']")).sendKeys("password");
	
	driver.findElement(By.xpath("//form[@class='ajaxsubmit']/div/div[@class='span_1_of_4']/input[@type='submit']")).click();
	
	WebElement verifyMsg = driver.findElement(By.xpath("//p[@id='alert']"));
	driver.close();
	
	
}
	
}
