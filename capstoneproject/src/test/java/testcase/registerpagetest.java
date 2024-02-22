package testcase;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.TestBase;
import pages.HomePage;
import pages.registerpage;

public class registerpagetest extends TestBase {

	HomePage hp;
	registerpage rp; 
	@BeforeClass
	public void openbrowser()
	{
		openBrowser();
		hp=new HomePage(driver);
		rp=new registerpage(driver);
		
	}
	@Test(priority='1')
	 
		public void  clickregisterlink() throws InterruptedException
		{
			Thread.sleep(1000);
			hp.Click_registerlink();
			
			
		}
	@Test(priority='2')
	public void test_registeruser()
	{
	rp.userregistration();	
	}
	@Test(priority='3')
	public void testurl()
	{
	rp.validateurl();	
	}
	
	
	 		
	
	
}
