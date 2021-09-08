package com.learning;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Attribute {

	
	public static void main  (String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PRAMOD\\Documents\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		List<WebElement> LinkList =   driver.findElements(By.tagName("a"));
		LinkList.addAll(driver.findElements(By.tagName("img")));
		
		
		//getting links
		List<WebElement> activelinks = new ArrayList<WebElement>();
		
		for(int i =0; i<LinkList.size();i++) {
			if(LinkList.get(i).getAttribute("href")!=null) {
				activelinks.add(LinkList.get(i));
			}
		}
		
		System.out.println(activelinks.size());
		
		
		//Check the url connection 
		
		for(int j=0; j<activelinks.size(); j++) {
		HttpURLConnection connection =	(HttpURLConnection) new  URL(activelinks.get(j).getAttribute("href")).openConnection();
		connection.connect();
	    String response =	connection.getResponseMessage();
		connection.disconnect();
		System.out.println(activelinks.get(j).getAttribute("href")+""+response);
		
		
		
	
}
}}
	
	
	