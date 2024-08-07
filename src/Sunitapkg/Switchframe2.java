package Sunitapkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Switchframe2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\sunit\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://jqueryui.com/draggable/");
		driver.manage().window().maximize();
		
		//switch to frame
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		
		//to locate webelemet
		Thread.sleep(2000);
		WebElement drag= driver.findElement(By.xpath("//*[@id='draggable']"));
		
		//To drag and drop the element
		Thread.sleep(2000);
		Actions act=new Actions(driver);
		act.dragAndDropBy(drag, 100, 200).build().perform();
		
		Thread.sleep(2000);
		driver.close();

	}

}
