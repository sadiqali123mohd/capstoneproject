package testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestBase;
import pages.HomePage;

public class HomePagetest extends TestBase {
	
	HomePage hp;
	
	@Test(priority='1')
	public void start_browser()
	{
		openBrowser();
		hp = new HomePage(driver);
	}
	
	
	
	@Test(priority='2')
	public void test_getURL_method()
	{
		hp.getURL_page();
	}
	
	
	@Test(priority='2')
	public void test_registerlink_method()
	{
		hp.Click_registerlink();
		String expectedURL = "http://localhost:9010/register";
		String RegisterPageURL = driver.getCurrentUrl();
		Assert.assertEquals(RegisterPageURL, expectedURL);
	}
	
	
	
	
	
}
