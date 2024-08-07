package Sunitapkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webDriver.chrome.driver", "C:\\Users\\sunit\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(1000);
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(1000);
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		driver.manage().deleteAllCookies();
		
		Thread.sleep(1000);
		driver.navigate().refresh();
		
		Thread.sleep(1000);
		driver.navigate().to("https://www.google.com/");
		
		Thread.sleep(1000);
		driver.navigate().back();
		
		Thread.sleep(1000);
		driver.navigate().forward();
		
		Thread.sleep(1000);
		System.out.println(driver.getCurrentUrl());
		
		Thread.sleep(1000);
		System.out.println(driver.getTitle());
		
		
		

	}

}
