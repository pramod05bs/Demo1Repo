package com.learning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class assertTest {
	
	
	
	WebDriver driver;
	
	@BeforeMethod
	
	public void setup() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\PRAMOD\\Documents\\chrome\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.google.com/");
	}
	
	@Test(priority=1,groups="test1")
	public void googleTitleTest()
	{
		String Title = driver.getTitle();
	System.out.println(Title);
	
	Assert.assertEquals(Title, "Google", "title not matched");
	}
	
	@Test(priority=2,groups = "test1")
	public void googleLogoTest()
	{
	boolean b  =driver.findElement(By.xpath("//*[@id='logo']")).isDisplayed();
	Assert.assertTrue(b);
	
	
	}
	
	
	}


