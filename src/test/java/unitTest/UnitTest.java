package unitTest;

import static org.testng.Assert.assertEquals;

import java.io.IOException;


import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import base.Base;
import pom.GoogleSearchPage;

@Listeners(TestListener.class)
public class UnitTest extends Base{
	
	UnitTest ut;
	
	@BeforeSuite
	public void launchBrowser() throws IOException {
		ut = new UnitTest();
		ut.setBrowser(ut.readProperty("url"));
	}
	
	@Parameters({"searchdata1", "searchdata2"})
	@Test(priority = 1)
	public void test_case_1(String searchdata1, String searchdata2) throws IOException {
		GoogleSearchPage gp = new GoogleSearchPage(driver);
		ut.element(gp.getSearchBox()).sendKeys(searchdata1);
		//Assert.assertEquals("https://www.google.c3434/", ut.readProperty("url"));
		ut.element(gp.getSearchBox()).clear();
		ut.element(gp.getSearchBox()).sendKeys(searchdata2);
		//Assert.assertEquals("https://www.google.c3434/", ut.readProperty("url"));
		System.out.println("priority 1");
	}
	
	@Parameters({"searchdata1", "searchdata2"})
	@Test(priority = 0)
	public void test_case_2(String searchdata1, String searchdata2) throws IOException {
		GoogleSearchPage gp = new GoogleSearchPage(driver);
		ut.element(gp.getSearchBox()).sendKeys(searchdata1);
		//Assert.assertEquals("https://www.google.c3434/", ut.readProperty("url"));
		ut.element(gp.getSearchBox()).clear();
		ut.element(gp.getSearchBox()).sendKeys(searchdata2);
		//Assert.assertEquals("http
		s://www.google.c3434/", ut.readProperty("url"));
		System.out.println("priority 0");
	}
	
	
	@AfterSuite
	public void endBrower() {
		//driver.quit();
	}
}
