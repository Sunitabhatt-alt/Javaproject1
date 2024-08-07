package Sunitapkg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptPgm {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\sunit\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//JavaScriptExecutor
		JavascriptExecutor jse = (JavascriptExecutor) driver; //manual Casting
		
		//Locate find element
		jse.executeScript("document.getElementById('email').value='abc@gmail.com'");
		jse.executeScript("document.getElementById('pass').value='1234'");
		
		//To scroll down the page
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0, 500)");
		
		
		//To scroll up
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0, -500)");
		
		Thread.sleep(2000);
		driver.close();
	}

}
