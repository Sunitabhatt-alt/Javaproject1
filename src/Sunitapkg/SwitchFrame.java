package Sunitapkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SwitchFrame {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\sunit\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		
		//Switch to frame
		driver.switchTo().frame(0);
		System.out.println("Switch to frame");
		
		//To find webelement dragable
		WebElement drag= driver.findElement(By.xpath("//*[@id='draggable']"));
		
		//To find WebElement dropable
		WebElement drop= driver.findElement(By.xpath("//*[@id='droppable']"));
		
		Thread.sleep(2000);
		Actions act= new Actions(driver);
		act.dragAndDrop(drag, drop).build().perform();
		
		Thread.sleep(5000);
		driver.close();

	}

}
