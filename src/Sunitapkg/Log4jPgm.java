package Sunitapkg;

import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Log4jPgm {

	public static void main(String[] args) throws InterruptedException{
		// Create logger instance
		Logger logger = Logger.getLogger("Log4jPgm");
		
		//Configure log4j properties file
		PropertyConfigurator.configure("C:\\Users\\sunit\\eclipse-workspace\\Javaproject1\\log4j.properties");

		//Open the Browser instance
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sunit\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		//Open facebook Url
		driver.get("https://www.facebook.com/");
		logger.info("Open browser instance successfully");
		//To maximize the window
		driver.manage().window().maximize();
		logger.info("maximize the browser window");
		
		
	}

}
