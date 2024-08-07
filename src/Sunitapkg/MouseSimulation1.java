package Sunitapkg;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseSimulation1{

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\sunit\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://www.flipkart.com/plus");
		driver.manage().window().maximize();
		
		//To create webelement reference
		WebElement electro = driver.findElement(By.xpath("//*[text()='Electronics']"));
		
		
		//To mouse simulation use Actions class
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		act.moveToElement(electro).build().perform();
		
		//keyboard opertaion
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		WebElement men =  driver.findElement(By.xpath("//*[text()='Men']"));
		act.sendKeys(men, Keys.ENTER).build().perform();
		System.out.println("Men option clicked");
		
		
		
		
	}
}
