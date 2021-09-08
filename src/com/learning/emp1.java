package com.learning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class emp1 {
	
	
	public static void main(String [] args) {
	
	WebDriver	driver = new ChromeDriver();
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\PRAMOD\\eclipse-workspace\\JavaBascics\\driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://classic.crmpro.com/index.html");
	driver.findElement(By.name("username")).sendKeys("groupautomation");
	driver.findElement(By.name("password")).sendKeys("password");
	driver.findElement(By.xpath("//input[@type ='submit']"));
	
	
	

}}
