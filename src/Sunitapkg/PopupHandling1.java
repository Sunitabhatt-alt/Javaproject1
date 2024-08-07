package Sunitapkg;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupHandling1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sunit\\chromedriver-win64\\chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.get("https://demoqa.com/browser-windows");
		 driver.manage().window().maximize();
		 
		 //To open a new window
		 Thread.sleep(2000);
		 JavascriptExecutor jse = (JavascriptExecutor) driver;
		 driver.findElement(By.id("tabButton")).click();
		 
		 //To get the total number of tabs/windows
		 Thread.sleep(2000);
		 Set<String> allwindow = driver.getWindowHandles();
		 System.out.println(allwindow);
		 Iterator<String> abc= allwindow.iterator();
		 String win1=abc.next();
		 String win2 = abc.next();
		 
		 //To print title of parent class
		 driver.switchTo().window(win1);
		 System.out.println("parent window ID:" +win1);
		 System.out.println(driver.getTitle());
		 
		 //Child class
		 Thread.sleep(2000);
		 driver.switchTo().window(win2);
		 System.out.println("Child window ID:" +win2);
		 System.out.println(driver.getCurrentUrl());
		 driver.close();
	 
		 Thread.sleep(2000);
		 driver.switchTo().window(win1);
		 Thread.sleep(2000);
		 jse.executeScript("window.scrollBy(0,500)");
		 jse.executeScript("document.getElementById('windowButton').click()");
		 Thread.sleep(2000);
		 
		 //Print the title of child window
		 Set<String> allwindowhandle = driver.getWindowHandles();
		 System.out.println("all window handle" +allwindowhandle);
		 Iterator<String> itr = allwindowhandle.iterator();
		 String childwin1 = itr.next();
		 String childwin2 = itr.next();
		 
		 // to switch cghild window
		 Thread.sleep(2000);
		 driver.switchTo().window(childwin2);
		 System.out.println("child window ID " +childwin2);
		 System.out.println("Child win2 Url:" +driver.getCurrentUrl());
		 System.out.println("child win title" + driver.getTitle());
		 
		 driver.quit();
	}

}
