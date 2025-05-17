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

public class ParellelTest1 {
	
	//ParellelTest1 p1;
	
	@BeforeSuite
	public void launchBrowser() throws IOException {
//		p1 = new ParellelTest1();
//		p1.setBrowser(p1.readProperty("url"));
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	}
	
	static WebDriver driver;
	@Test
	public void searchTest2() throws IOException {
//		p1 = new ParellelTest1();
//		p1.setBrowser(p1.readProperty("url"));
//		GoogleSearchPage gp = new GoogleSearchPage(driver);
//		p1.element(gp.getSearchBox()).sendKeys("test1");
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		driver.get("https://www.google.com/");
		driver.findElement(By.id("APjFqb")).sendKeys("test1");
		
	}
	@Test
	public void searchTest3() throws InterruptedException {
//		GoogleSearchPage gp = new GoogleSearchPage(driver);
//		Thread.sleep(2000);
//		p1.element(gp.getSearchBox()).clear();
//		p1.element(gp.getSearchBox()).sendKeys("test2");
		Thread.sleep(2000);
		driver.findElement(By.id("APjFqb")).clear();
		driver.findElement(By.id("APjFqb")).sendKeys("test2");
		driver.quit();
	}

}
