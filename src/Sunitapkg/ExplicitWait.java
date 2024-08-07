package Sunitapkg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ExplicitWait {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sunit\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();	 
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		
		//to fetch the value
		System.out.println(driver.findElement(By.id("email")).getAttribute("value"));
		
		//explicit wait
		//WebDriverWait wt = new WebDriverWait(driver, 30);
		//wt.until(ExpectedConditions.invisibilityOfElementLocated(By.id("pass"))).sendKeys("abcd");
		
		
		
		
		

	}

}
