package framework;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class runnerclass1 extends GenericScripts
{
	@Test
	public void Testcase1() throws InterruptedException
	{
		
		POM_LoginPage Lp = new POM_LoginPage(driver);
		Thread.sleep(1000);
		Lp.enterUsn();
		Thread.sleep(1000);
		Lp.enterPsw();
		Thread.sleep(1000);
		Lp.clickLogin();
	}

}
