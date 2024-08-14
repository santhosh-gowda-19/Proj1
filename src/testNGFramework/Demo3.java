package testNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Demo3 
{
	@Test(dataProvider = "TestData")
	public void Application(String usern,String pswd)
	{
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		WebElement usn = driver.findElement(By.id("email"));
		WebElement psw = driver.findElement(By.id("pass"));
		usn.sendKeys(usern);
		psw.sendKeys(pswd);
	}
	@DataProvider(name = "TestData")
	public Object[][] TestData()
	{
		Object [][] arr = new Object[2][2];
		arr[0][0]= "admin1";
		arr[0][1]= "admin1@123";
		arr[1][0]="admin2";
		arr[1][1]="admin2@123";	
		return arr;
	}
	
	
	
	
	
	
}
