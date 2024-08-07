package Sunitapkg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlretHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sunit\\chromedriver-win64\\chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.get("https://demoqa.com/alerts");
		 driver.manage().window().maximize();
		 
		 //To scroll the page
		 JavascriptExecutor jse=(JavascriptExecutor)driver;
		 Thread.sleep(2000);
		 jse.executeScript("window.scrollBy(0, 500)");	 
		 
		 //To click on the popup
		 Thread.sleep(2000);	 
		 driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
		 Thread.sleep(2000);

		 
		 //To accept the Alert
		 driver.switchTo().alert().accept();
		 System.out.println("Alert accepted");
		 
		 //to dismiss the alert
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
		 Thread.sleep(2000);
		 driver.switchTo().alert().dismiss();
		 System.out.println("Alert dismissed");

	}

}
