package Sunitapkg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownPgm {

	public static void main(String[] args) throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\sunit\\chromedriver-win64\\chromedriver.exe");
	  WebDriver driver =new ChromeDriver();	 
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
	  driver.get("https://facebook.com/");
	  
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//a[contains(@id,'u_0')]")).click();
	  
	  //1st way
	  Thread.sleep(2000);
	  List<WebElement> MonthList=driver.findElements(By.xpath("//select[@id='month']/option"));
	  System.out.println("Total no of months," +MonthList.size());
	  MonthList.get(7).click();
	  
	  //2nd way
	  Thread.sleep(2000);
	  WebElement selectmonth = driver.findElement(By.xpath("//select[@id='month']"));
	  Select month = new Select(selectmonth);
	  Thread.sleep(2000);
	  month.selectByIndex(5);
	  
	  Thread.sleep(2000);
	  month.selectByVisibleText("Feb");
	  System.out.println(month.getFirstSelectedOption().getText()); ///Feb
	  
	  
	  //3rd Way
	  Thread.sleep(2000);
	List<WebElement> dropdown = month.getOptions();
	 System.out.println("Total items" + dropdown.size());
	 String monthname ="Dec";
	 for(int i=0; i<dropdown.size(); i++) {
		 if(dropdown.get(i).getText().equalsIgnoreCase(monthname)) {
			 dropdown.get(i).click();
			 System.out.println(dropdown.get(i).getText());
			 
		 }
}
	 
			 //4th way
			 Thread.sleep(2000);
			 WebElement bm1 = driver.findElement(By.xpath("//select[@id='month']"));
			 bm1.sendKeys("jan");
			 
			 //5thway
			 Thread.sleep(2000);
			 driver.findElement(By.id("month")).sendKeys("Mar");
			 
			 
			 //To check multiple selection is support by dropdown or not
			 Thread.sleep(2000);
			 System.out.println(month.isMultiple()); //return boolean value true/false
			  month.selectByIndex(5);
			  month.selectByVisibleText("Feb");
			  
			  //deselect the selected value
			  month.deselectByIndex(5);
			  month.deselectByVisibleText("Feb");
			  month.deselectAll();
			  
			  //To select the date
			 Thread.sleep(2000);
			 WebElement day = driver.findElement(By.xpath("//Select[@id='day']"));
			  Select day1 = new Select(day);
			  List<WebElement> wb1= day1.getOptions();
			  System.out.println("Total no of days" +wb1.size());
			  String str3="21";
			  for(int i =0; i<wb1.size(); i++){
				  if(wb1.get(i).getText().equalsIgnoreCase(str3)) {
					   wb1.get(i).click();
				  }
			  }
		
			//To select year
					   Thread.sleep(2000);
					   WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
						  Select year1 = new Select(year);
						  List<WebElement> WE2= year1.getOptions();  
						  System.out.println("Total no of years," +WE2.size());
						  for(int i =0; i<WE2.size(); i++) {
							 if( WE2.get(i).getText().equalsIgnoreCase("2021")) {
								 WE2.get(i).click();
								 System.out.println(WE2.get(i).getText());
							 }						 						  
			  
	 }
}
		 
	 
	
	}


