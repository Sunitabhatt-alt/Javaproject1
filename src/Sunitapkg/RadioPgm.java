package Sunitapkg;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioPgm {
	public static void main(String[] args) throws InterruptedException {
     System.setProperty("webdriver.chrome.driver", "C:\\Users\\sunit\\chromedriver-win64\\chromedriver.exe");
     WebDriver driver=new ChromeDriver();
     driver.get("https://facebook.com/");
     Thread.sleep(2000);
     driver.manage().window().maximize();
     
     driver.findElement(By.xpath("//a[contains(@id,'u_0')]")).click();
     
     Thread.sleep(2000);
		List<WebElement> radioButtons = driver.findElements(By.xpath("//label[@class='_58mt']"));
		System.out.println(radioButtons.size());
		String Radiotext ="Custom";
		for(int i=0; i<radioButtons.size(); i++) {
			if(radioButtons.get(i).getText().equalsIgnoreCase(Radiotext)) {
				radioButtons.get(i).click();
				System.out.println(Radiotext + "clicked");
			}			
		}        
	}
}
