package unitTest;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import base.Base;
import io.github.bonigarcia.wdm.WebDriverManager;
import pom.GoogleSearchPage;

public class ParellelTest2 {
	
	//ParellelTest2 p2;
	
	@BeforeSuite
	public void launchBrowser() throws IOException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	}
	
	static WebDriver driver;
	@Test
	public void searchTest2() throws IOException {
//		p2 = new ParellelTest2();
//		p2.setBrowser(p2.readProperty("url"));
//		GoogleSearchPage gp = new GoogleSearchPage(driver);
//		p2.element(gp.getSearchBox()).sendKeys("test3");
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		driver.get("https://www.google.com/");
		driver.findElement(By.id("APjFqb")).sendKeys("test3");
		
	}
	@Test
	public void searchTest3() throws InterruptedException {
//		GoogleSearchPage gp = new GoogleSearchPage(driver);
//		Thread.sleep(2000);
//		p2.element(gp.getSearchBox()).clear();
//		p2.element(gp.getSearchBox()).sendKeys("test4");
		Thread.sleep(2000);
		driver.findElement(By.id("APjFqb")).clear();
		driver.findElement(By.id("APjFqb")).sendKeys("test4");
		driver.quit();
		
	}
	
	//parallel="classes" thread-count="2"

}
