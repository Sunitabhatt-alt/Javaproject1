package Sunitapkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumPgm {

	public static void main(String[] args) throws InterruptedException {
		//Setting the property of chrome browser and passing chromedriver path
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sunit\\chromedriver-win64\\chromedriver.exe");
	
	//Launching chrome browser instance
	WebDriver driver= new ChromeDriver();
	
	//Wait for given time
	Thread.sleep(2000);
	
	//open Url using get method
	driver.get("https://facebook.com/");
	
	//To maximize the browser window 
	Thread.sleep(2000);
	driver.manage().window().maximize();
	
	//Delete all cookies
	Thread.sleep(2000);
	driver.manage().deleteAllCookies();

	//navigate to another Url
	Thread.sleep(2000);
	driver.navigate().to("https://google.com/");
	
	//Navigate back
	Thread.sleep(2000);
	driver.navigate().back();
	
	//Refresh the page
	Thread.sleep(2000);
	driver.navigate().refresh();
	
	//navigate forward
	Thread.sleep(2000);
	driver.navigate().forward();
	
	//fetch current Url
	Thread.sleep(2000);
	System.out.println(driver.getCurrentUrl());
	
	//Fetch the title
	
	Thread.sleep(2000);
	System.out.println(driver.getTitle());
	
	//Close the browser
		Thread.sleep(2000);
		driver.close();
	}

}
