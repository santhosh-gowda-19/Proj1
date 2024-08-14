package verification;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Verification01 
{
	@Test
	public void Testcase1()//to verify partially dynamic title
	{
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.shoppersstack.com");
		String ExpectedTitle = "ShoppersStackApplication";//customer requirement
		String ActualTitle = driver.getTitle();
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(ActualTitle, ExpectedTitle);
		System.out.println("Execution is completed");
		sa.assertAll();//it is used to throw an exception
	}

}
