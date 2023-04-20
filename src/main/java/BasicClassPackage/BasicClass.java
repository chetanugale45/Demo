package BasicClassPackage;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import UtilClassPackage.UtilClass;




public class BasicClass {
	
	public static WebDriver ob;
	public static Properties p;
	
	public BasicClass()
	{
		p=new Properties();
		try {
		FileInputStream pf = new FileInputStream("D:\\Naveen_Selium\\Chetan_Seleniumid\\src\\main\\java\\EnvirmentClassPackage\\Config.properties");
		p.load(pf);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void lounchBrowser()
	{
		String browser = p.getProperty("Browzer");
		if(browser.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\New+Selenium_Naveen\\Driver\\chromedriver_win32\\chromedriver.exe");
			ChromeOptions co = new ChromeOptions();
			ob = new ChromeDriver(co);
		}

	
		ob.manage().window().maximize();
		ob.manage().deleteAllCookies();
		ob.manage().timeouts().pageLoadTimeout(UtilClass.page_load_time, TimeUnit.SECONDS);
		ob.manage().timeouts().implicitlyWait(UtilClass.implicit_Wait, TimeUnit.SECONDS);
		ob.get(p.getProperty("URL"));

	
	}

}
