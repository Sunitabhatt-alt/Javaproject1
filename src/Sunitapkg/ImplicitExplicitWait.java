package Sunitapkg;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitExplicitWait {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sunit\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.google.com/");
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("How stuff works");
		
		List<WebElement> autosuggestion= driver.findElements(By.xpath("//ul[contains(@role,'listbox')]/li"));
		System.out.println("Total no of suggestions," +autosuggestion.size());
		String str="How stuff works";
		
		for(int i =0; i<autosuggestion.size();i++) {
			if(autosuggestion.get(i).getText().equalsIgnoreCase(str));
			autosuggestion.get(i).click();
			System.out.println(autosuggestion.get(i).getText());
			break;
		}
		
		
		
	}

}
