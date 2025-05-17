package unitTest;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import base.Base;

public class TestListener extends Base implements ITestListener{

	@Override
	public void onTestFailure(ITestResult result) {
		
		String date = new SimpleDateFormat("dd MM/HH mm ss").format(new Date());
		
		TakesScreenshot screenShot = (TakesScreenshot) driver;
		
		File scrFile = screenShot.getScreenshotAs(OutputType.FILE);
		
		File descFile = new File("C:\\Users\\Ramya Dilip kumar\\eclipse-workspace\\SeleniumFrameworkTest\\src\\main\\resources\\ScreenShots\\"+date+"_sampleShots.png");
		
		try {
			FileUtils.copyFile(scrFile, descFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		Reporter.log("<a target='_blank' href='C:\\Users\\Ramya Dilip kumar\\eclipse-workspace\\SeleniumFrameworkTest\\src\\main\\resources\\ScreenShots\\"+date+"_sampleShots.png'>Failed screenshot</a>");
		Reporter.log(result.getThrowable().getMessage());
	}
	
}
