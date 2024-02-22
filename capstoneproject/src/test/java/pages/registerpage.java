package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import base.TestBase;

public class registerpage extends TestBase {
	
	
	@FindBy(xpath="//*[@id=\"name\"]")
	WebElement name;
	
	@FindBy(xpath="//*[@id=\"email\"]")
	WebElement email;
	@FindBy(xpath="//*[@id=\"password\"]")
	WebElement password;
	@FindBy(xpath="/html/body/div[2]/form/button")
	WebElement submit;
	
	public  registerpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void userregistration()
	{
		name.sendKeys("sadiq ali");
		email.sendKeys("sadiqali302@gmail.com");
		password.sendKeys("admin");
		submit.click();
	}
 public void validateurl()
 {
	 String expectedurl="http://localhost:9010/register-user";
	 String url=driver.getCurrentUrl();
	 Assert.assertEquals(url, expectedurl);
 }

}
