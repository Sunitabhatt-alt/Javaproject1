package Sunitapkg;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingRadioButton {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sunit\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://facebook.com/");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(@id,'u_0')]")).click();
		
		//1st way
 		Thread.sleep(2000);
 		driver.findElement(By.xpath("//input[@value='1']")).click();
 		
 		Thread.sleep(2000);
 		driver.findElement(By.xpath("//input[@value='2']")).click();
 		
 		Thread.sleep(2000);
 		driver.findElement(By.xpath("//input[@value='-1']")).click();
 		
 		//2nd way
 		List<WebElement> radio= driver.findElements(By.xpath("//input[@type='radio']"));
 		System.out.println("Total no of radio button:-"+radio.size());
 		System.out.println(radio.get(0).isSelected());
 		System.out.println(radio.get(1).isEnabled());
 		System.out.println(radio.get(2).isDisplayed());
 				
 		Thread.sleep(2000);
 		radio.get(1).click();
 		System.out.println(radio.get(2).isSelected());
 		System.out.println(radio.get(1).isSelected()); 
 		
		//3rd way
		Thread.sleep(2000);
		List<WebElement> radiobutton= driver.findElements(By.xpath("//label[@class='_58mt']"));
		System.out.println("Total no of radio buttons:-" +radiobutton.size());
		Thread.sleep(2000);
		String Radiobuttontext = "Female";
		for(int i=0; i<radiobutton.size(); i++) {
			if(radiobutton.get(i).getText().equalsIgnoreCase(Radiobuttontext)) {
				radiobutton.get(i).click();	
			System.out.println(Radiobuttontext + "clicked");	
			}
}		                                                                                           
		Thread.sleep(5000);
		driver.close();
	}
}
