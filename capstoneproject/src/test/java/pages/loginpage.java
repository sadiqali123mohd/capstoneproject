package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import base.TestBase;

public class loginpage extends TestBase {
	
	
	@FindBy(xpath="//*[@id=\"email\"]")
	WebElement email;
	
	@FindBy(xpath="//*[@id=\"password\"]")
	WebElement psw;
	@FindBy(xpath="/html/body/div[2]/form/button")
	WebElement submit;
	public  loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void userlogin()
	{
		 
		email.sendKeys("sadiqali302@gmail.com");
		psw.sendKeys("admin");
		submit.click();
	}
 public void validateurl()
 {
	 String expectedurl="http://localhost:9010/login";
	 String url=driver.getCurrentUrl();
	 Assert.assertEquals(url, expectedurl);
 }

}
