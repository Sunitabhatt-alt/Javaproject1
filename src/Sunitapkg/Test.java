package Sunitapkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		//setting the property of Chrome browser and passing the chromedriver path
		System.setProperty("webDriver.chrome.driver", "C:\\Users\\sunit\\chromedriver-win64\\chromedriver.exe");
		//Launching chrome browser instance
		WebDriver driver = new ChromeDriver();
		//wait for given time
		Thread.sleep(1000);
		//Open Url using get() method
		driver.get("https://facebook.com");
		
		// To maximize the window
		Thread.sleep(1000);
		driver.manage().window().maximize();
		
		// To delete all cookies
		Thread.sleep(1000);
		driver.manage().deleteAllCookies();
		
		//Open url using navigate() method
	   Thread.sleep(1000);
	   driver.navigate().to("https://google.com/");
	   
	   //To refresh the page
	   Thread.sleep(1000);
	   driver.navigate().refresh();
	   
	   //Navigate to back url
	   Thread.sleep(1000);
	   driver.navigate().back();
	   
	   //Navigate to forward url
	   Thread.sleep(1000);
	   driver.navigate().forward();
	   
	   //fetch current Url
	   Thread.sleep(2000);
	   System.out.println(driver.getCurrentUrl());
	   
	   
	   //fetch Title of the Webpage
	   Thread.sleep(2000);
	   System.out.println(driver.getTitle());
	   
	   //Close the browser
	   Thread.sleep(1000);
	   driver.close();
	   
		
		
	}

}
