package com.learning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Demo {
	
	public static void main(String [] args) throws InterruptedException  {
		WebDriver driver;
		
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PRAMOD\\eclipse-workspace\\JavaBascics\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://classic.crmpro.com/index.html");
		driver.findElement(By.name("username")).sendKeys("groupautomation");
		driver.findElement(By.name("password")).sendKeys("Test@12345");
		driver.findElement(By.xpath("//input[@type ='submit']")).click();
		Thread.sleep(5000);
		driver.switchTo().frame(1);
	    WebElement	contactsLink = driver.findElement( By.xpath("//a[@title ='Contacts']"));
	
	//Thread.sleep(5000);
	//driver.switchTo().frame(1);
	  Actions action = new Actions(driver);
	  action.moveToElement(contactsLink).build().perform(); 
	  driver.findElement(By.xpath("//a[@title ='New Contact']")).click();
	  
	  
	  Thread.sleep(5000);
		Select select = new Select(driver.findElement(By.name("title")));
		select.selectByVisibleText("Mr.");
		
		driver.findElement(By.id ("first_name")).sendKeys("Tom");
		driver.findElement(By.id ("surname")).sendKeys("Peter");
		driver.findElement(By.name ("client_lookup")).sendKeys("Google");
	  
	  
	  
	 
		
		
		
		
		
		}
		
		
		}
		
		
		
		
		
		



      

		
		
		
		
		
		
		

