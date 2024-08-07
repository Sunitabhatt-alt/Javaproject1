package Sunitapkg;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
public class Takescreenshot2 {

	
	TakeScreenshot1 t1= new TakeScreenshot1();
		
		@Test
		public void login() {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\sunit\\chromedriver-win64\\chromedriver.exe");
			t1.driver = new ChromeDriver();
			t1.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			t1.driver.get("https://facebook.com/");
			t1.driver.manage().window().maximize();
			t1.driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
			t1.driver.findElement(By.id("password")).sendKeys("1234");
		}

		@AfterMethod
		public void takeScreenshot(ITestResult result2) throws Exception {
			t1.captureScreenshot(result2);
		}
	

}
