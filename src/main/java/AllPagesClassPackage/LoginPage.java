package AllPagesClassPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasicClassPackage.BasicClass;


public class LoginPage extends BasicClass{
	//chetan
	@FindBy(className = "_97vu img")
	WebElement facebookimage;
	
	@FindBy(className = "_9axz")
	WebElement loginformimg;
	
	@FindBy(id = "email")
	WebElement username;

	@FindBy(id ="pass")
	WebElement password;
	
	@FindBy(xpath = "//button[@name='login']")
	WebElement login;
	
	@FindBy(partialLinkText = "Forgotten account?")
	WebElement forgotaccount;
	
	@FindBy(linkText = "Create new account")
	WebElement singon;
	
	
	public LoginPage()
	{
		PageFactory.initElements(ob, this);
	}
	
	public String validateTitle()
	{
		String title=ob.getTitle();
		return title;
	}
	
	public boolean validateImage()
	{
		boolean b =facebookimage.isDisplayed();
		return b;
	}
	
	public boolean validateImage1()
	{
		boolean b =facebookimage.isDisplayed();
		return b;
	}
	public HomePage login(String us, String pass)
	{
		username.sendKeys(us);
		password.sendKeys(pass);
		login.click();
		return new HomePage();
		
	}

}
