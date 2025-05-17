package utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import base.Base;
import io.cucumber.java.Scenario;

public class Utils extends Base{
	
	public void screenShot(Scenario scenario) {
		if(scenario.isFailed()) {
			TakesScreenshot screnShot = (TakesScreenshot)driver;
			byte[] scr = screnShot.getScreenshotAs(OutputType.BYTES);
			scenario.attach(scr, "image/png", "Failed Test Screen Shot");
		}
	}
	
}
