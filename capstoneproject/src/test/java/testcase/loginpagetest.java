package testcase;

import org.testng.annotations.Test;

import base.TestBase;
import pages.loginpage;

public class loginpagetest extends TestBase {
	
	loginpage lp;
 
	public void openbrowser()
	{
		openBrowser();
		lp=new loginpage(driver);
	}
	@Test(priority='1')
	public void entereduser()
	{
		lp.userlogin();
	}
	@Test(priority='2')
	public void validatesuccess()
	{
		lp.validateurl();
	}
	
		
	
		

}
