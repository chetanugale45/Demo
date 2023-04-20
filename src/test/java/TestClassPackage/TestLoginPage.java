package TestClassPackage;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import AllPagesClassPackage.HomePage;
import AllPagesClassPackage.LoginPage;
import BasicClassPackage.BasicClass;

public class TestLoginPage extends BasicClass{
	
	
	
	public LoginPage lp;
	HomePage hp;
	
	
	@BeforeTest()
	public void testlounchBrowser()
	{
		lounchBrowser();
		lp = new LoginPage();
	}
	
	@Test(priority=1)
	public void testValidateTitle()
	{
		String title =lp.validateTitle();
		Assert.assertEquals(title, "Log in to Facebook");
	}
	
	
	
	@AfterMethod()
	public void closeBrowser()
	{
		ob.quit();
	}
	

}
