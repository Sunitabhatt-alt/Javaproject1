package Sunitapkg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframesPgm1 {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\sunit\\chromedriver-win64\\chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.get("https://paytm.com/");
		 driver.manage().window().maximize();
		 
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//*[text()='Sign In']")).click();
		 
		 //To find total numbers of frame
		 Thread.sleep(2000);
		 int allFrames = driver.findElements(By.tagName("iframe")).size();
		 System.out.println("Total no of frame" + allFrames);
		 
		 //to check element is present or not
		 for(int i=0; i<allFrames; i++) {
			 driver.switchTo().frame(i);
			 driver.switchTo().frame(i);
			 String Text1= "Open Paytm App";
			 String abc = driver.findElement(By.xpath("//*[text()='Open Paytm App']")).getText();
			 
			 if(abc.equalsIgnoreCase(Text1)) {
				 
				 
				 System.out.println("Element found");
			 }else
			 System.out.println("Element not found");
		 }
	}
}
