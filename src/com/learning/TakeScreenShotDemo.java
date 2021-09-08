package com.learning;



import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class TakeScreenShotDemo {
	
	static WebDriver driver;
	
	public static void main  (String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PRAMOD\\eclipse-workspace\\FreeCrmTest\\Driver\\Driver1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");

}
	public static  void takeScreenshot(String FileName) {
	//takes screenshot amd storeit in afile	
		try {
	File file	= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	//copy file into desired location
	//FileHandler.copy()//(file, new File("C:\\Users\\PRAMOD\\eclipse-workspace\\JavaBascics\\Screenshot\\"+FileName+".jpg") );
	//FileHandler.copyFile(file, new File("C:\\Users\\PRAMOD\\eclipse-workspace\\JavaBascics\\Screenshot\\"+FileName+".jpg"));
	 
		Files.copy(file, new File("C:\\Users\\PRAMOD\\eclipse-workspace\\JavaBascics\\Screenshot"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
	
}
