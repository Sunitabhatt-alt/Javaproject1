package Sunitapkg;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
public class AssertionPgm1 {

	@Test
	public void TestAssertion() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sunit\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://facebook.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		//Equal assertion
		String expectedtext ="Facebook helps you connect and share with the people in your life.";
		String ActualTest = driver.findElement(By.xpath("//h2[contains(text(), 'Facebook helps')]")).getText();
		Assert.assertEquals(ActualTest, expectedtext);
		System.out.println("Equal assertion verified");
		
		//False Assertion
		Assert.assertFalse(driver.findElement(By.xpath("//h2[contains(text(), 'Facebook helps')]")).isSelected());
		System.out.println("false Assertion verified");
		
		//True assertion
		Assert.assertTrue(driver.findElement(By.xpath("//h2[contains(text(), 'Facebook helps')]")).isDisplayed());
		System.out.println("True assertion verified");
	}
	
}
