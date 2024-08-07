package Sunitapkg;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorFilePgm1 {

	public static void main(String[] args) throws Exception {
		File src = new File("C:\\Users\\sunit\\eclipse-workspace\\Javaproject1\\Locators.properties");
		FileInputStream fis = new FileInputStream(src);
		Properties pro = new Properties();
		pro.load(fis);
		
		
		File src1 = new File("C:\\Users\\sunit\\eclipse-workspace\\Javaproject1\\Testdata.properties");
		FileInputStream fis1 = new FileInputStream(src1);
		Properties pro1 = new Properties();
		pro1.load(fis1);
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\sunit\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath(pro.getProperty("email"))).sendKeys(pro1.getProperty("emailvalue"));
		
		
		
		
	}
}
