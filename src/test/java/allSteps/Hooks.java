package allSteps;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import base.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.Utils;

public class Hooks extends Base{
	@Before
	public void launchApplication() throws IOException {
		Hooks hook = new Hooks();
		hook.setBrowser(hook.readProperty("url_swag_labs"));
	}
	
	@After
	public void whenFailed(Scenario scenario) {
		if(scenario.isFailed()) {
			TakesScreenshot screnShot = (TakesScreenshot)driver;
			final byte[] scr = screnShot.getScreenshotAs(OutputType.BYTES);
			scenario.attach(scr, "image/jpg", "Failed Test Screen Shot");
		}
	}
}
