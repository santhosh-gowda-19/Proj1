package framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class GenericScripts 
{
	public WebDriver driver;
	@BeforeMethod
	public void OpenApplication() throws Exception
	{
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Properties pro = new Properties();
		FileInputStream fis = new FileInputStream("./Property/Credentials.properties");
		pro.load(fis);
		String url = pro.getProperty("test_url");
		driver.get(url);
	
	
	
	}
	@AfterMethod
	public void CloseApplication() throws Exception
	{
		driver.quit();
	}

}
