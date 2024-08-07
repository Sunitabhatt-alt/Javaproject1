package Sunitapkg;

import java.io.File;
import java.io.IOException;

import org.apache.logging.log4j.core.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;

public class TakeScreenshot1 {

	WebDriver driver;
	//public Object driver;
	
	//ITestResult provide the status of testcase execution and test name
	public void captureScreenshot(ITestResult result) throws Exception{
		if(ITestResult.FAILURE == result.getStatus()) {
			
		//Create reference of Takescreenshot interface and typecasting
			TakesScreenshot ts =(TakesScreenshot) driver;
			
			//Use getScreenshotAs() to capture screenshot in file format
			//getScreenshotAs() method  return type = file
			File sourceFile = ts.getScreenshotAs(OutputType.FILE);
			
			//Copying file to specific location
			File destFile = new File("./screeshot" + result.getName() + ".png");
			FileUtils.
			//FileUtils.copyfile(sourceFile,destFile);
			System.out.println(result.getName()+ "method() faiuled screenshot captured");
			
		}
	}
	
}
