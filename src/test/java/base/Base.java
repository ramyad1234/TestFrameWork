package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
	public static WebDriver driver;
	
	public void setBrowser(String url) {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		driver.get(url);
		
		//driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	public String readProperty(String key) throws IOException {
		FileInputStream fileinput = new FileInputStream("C:\\Users\\Ramya Dilip kumar\\eclipse-workspace\\SeleniumFrameworkTest\\src\\test\\resources\\testdata.properties");
		Properties props = new Properties();
		props.load(fileinput);
		return props.getProperty(key);
	}
	
	public WebElement element(WebElement element) {
		return element;
	}
	
	public static void main(String[] args) {
		
		System.out.println("test git");
		System.out.println("test git 2");
	}
	
	
	
}
